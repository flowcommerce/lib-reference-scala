pipeline {
  agent {
    kubernetes {
      inheritFrom 'default'
      containerTemplates([
        containerTemplate(name: 'play', image: 'flowdocker/play_builder:latest-java17-jammy', command: 'cat', ttyEnabled: true),
      ])
    }
  }
  
  options { 
    disableConcurrentBuilds() 
  }

  stages {
    stage('Checkout') {
      steps {
        checkoutWithTags scm
      }
    }

    stage('SBT Test') {
      when {
          not { branch 'main' }
          changeRequest()
      }
      steps {
        container('play') {
          script {
            try {
              sh '''
                sbt clean compile flowLintLib test scalafmtSbtCheck scalafmtCheck doc
              '''
            } finally {
                junit allowEmptyResults: true, testResults: '**/target/test-reports/*.xml'
            }
          }
        }
      }
    }

    stage('Commit auto-generated code') {
        when { branch 'main' }
        steps {
            container('play') {
                withCredentials([
                    usernamePassword(
                        credentialsId: 'jenkins-x-github',
                        usernameVariable: 'GIT_USERNAME',
                        passwordVariable: 'GIT_PASSWORD'
                    ),
                    usernamePassword(
                        credentialsId: 'jenkins-x-jfrog',
                        usernameVariable: 'ARTIFACTORY_USERNAME',
                        passwordVariable: 'ARTIFACTORY_PASSWORD'
                    )
                ]) {
                    script {
                        sh '''
                            git config --global credential.helper "store --file=/tmp/git-credentials"
                            echo "https://$GIT_USERNAME:$GIT_PASSWORD@github.com" > /tmp/git-credentials
                            git config --global --add safe.directory $(pwd)
                            mkdir -p /root/.ssh
                            touch /root/.ssh/known_hosts
                            ssh-keyscan -t rsa github.com >> ~/.ssh/known_hosts
                            go run script/generate.go
                            sbt clean compile flowLintLib test scalafmtSbtCheck scalafmtCheck doc
                        '''
                        HAS_CHANGES = sh(script:'git commit -a -m "Update generated code"', returnStatus:true) == 0
                        println("Push to upstream? " + HAS_CHANGES)
                        if (HAS_CHANGES) {
                            sh '''
                                git push --set-upstream origin main
                                git push
                            '''
                        }
                    }
                }
            }
        }
    }

    stage('Release') {
        when { branch 'main' }
        steps {
            script {
                VERSION = new flowSemver().calculateSemver()
                new flowSemver().commitSemver(VERSION)
                sh 'sbt clean +publish'
                syncDependencyLibrary()
            }
        }
    }
  }
}

// Comment to get more information during initialization
logLevel := Level.Warn

// Artifactory credentials
credentials += Credentials(Path.userHome / ".ivy2" / ".artifactory")

resolvers += "Artifactory" at "https://flow.artifactoryonline.com/flow/libs-release-local/"

addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.1.4")

addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.2")

resolvers += "Flow Plugins" at "https://flow.jfrog.io/flow/plugins-release/"

addSbtPlugin("io.flow" % "sbt-flow-linter" % "0.0.9")

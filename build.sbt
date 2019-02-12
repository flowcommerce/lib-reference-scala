name := "lib-reference-scala"

organization := "io.flow"

scalaVersion in ThisBuild := "2.12.8"

crossScalaVersions := Seq("2.12.8")

lazy val root = project
  .in(file("."))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.5" % Test,
      compilerPlugin("com.github.ghik" %% "silencer-plugin" % "1.3.0"),
      "com.github.ghik" %% "silencer-lib" % "1.3.0" % Provided,
    ),
    credentials += Credentials(
      "Artifactory Realm",
      "flow.jfrog.io",
      System.getenv("ARTIFACTORY_USERNAME"),
      System.getenv("ARTIFACTORY_PASSWORD")
    )
  )

publishTo := {
  val host = "https://flow.jfrog.io/flow"
  if (isSnapshot.value) {
    Some("Artifactory Realm" at s"$host/libs-snapshot-local;build.timestamp=" + new java.util.Date().getTime)
  } else {
    Some("Artifactory Realm" at s"$host/libs-release-local")
  }
}

// silence all warnings on autogenerated files
scalacOptions += "-P:silencer:pathFilters=src/main/scala/io/flow/generated/.*"

// Make sure you only exclude warnings for the project directories, i.e. make builds reproducible
scalacOptions += s"-P:silencer:sourceRoots=${baseDirectory.value.getCanonicalPath}"

version := "0.2.27"
version := "0.2.27"

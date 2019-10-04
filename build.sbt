import Dependencies._

lazy val currentVersion = "0.1.0-SNAPSHOT"

lazy val commonSettings = Seq(
  scalaVersion := "2.12.10",
  organization := "com.example",
  version := currentVersion,
  scalacOptions in (Compile, compile) ++= Seq(
    "-deprecation",
    "-encoding", "UTF-8",
    "-feature",
    "-unchecked",
    // "-Xfatal-warnings",
    "-Xlint"
  ),

  javacOptions ++= Seq("-encoding", "UTF-8")
)

lazy val root = (project in file("."))
  .settings(commonSettings)
  .settings(
    name := "karate-kata",
    description := "chrome automation with karate example",
    libraryDependencies ++= Seq(
      karateApache,
      karateCore,
      scalaTest % "test"
    )
  )

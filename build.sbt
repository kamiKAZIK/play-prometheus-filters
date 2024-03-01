Global / onChangedBuildSource := ReloadOnSourceChanges

name := "play-prometheus-filters"
organization := "io.github.kamiKAZIK"

version := "0.7.0-SNAPSHOT"

lazy val root = (project in file("."))

// All publishing configuration resides in sonatype.sbt
publishTo := sonatypePublishToBundle.value
credentials += Credentials(Path.userHome / ".sbt" / ".credentials.sonatype")

scalaVersion := "2.13.13"
crossScalaVersions := Seq(scalaVersion.value, "2.12.15")

val playVersion = "3.0.1"
val prometheusClientVersion = "0.9.0"

libraryDependencies ++= Seq(
  "io.prometheus" % "simpleclient" % prometheusClientVersion,
  "io.prometheus" % "simpleclient_hotspot" % prometheusClientVersion,
  "io.prometheus" % "simpleclient_servlet" % prometheusClientVersion,

  // Play libs. Are provided not to enforce a specific version.
  "org.playframework" %% "play" % playVersion % Provided,
  "org.playframework" %% "play-guice" % playVersion % Provided,

  // This library makes some Scala 2.13 APIs available on Scala 2.11 and 2.12.
  "org.scala-lang.modules" %% "scala-collection-compat" % "2.11.0"
)

libraryDependencies ++= Seq(
  "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.1" % Test,
  "org.scalatestplus" %% "mockito-4-2" % "3.2.11.0" % Test,
  "org.mockito" % "mockito-core" % "4.2.0" % Test
)

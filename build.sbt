Global / onChangedBuildSource := ReloadOnSourceChanges

name := "play-prometheus-filters"
organization := "io.github.kamikazik"

version := "0.7.0"

lazy val root = project in file(".")

scalaVersion := "2.13.13"

val playVersion = "3.0.1"
val prometheusClientVersion = "0.9.0"

libraryDependencies ++= Seq(
  "io.prometheus" % "simpleclient" % prometheusClientVersion,
  "io.prometheus" % "simpleclient_hotspot" % prometheusClientVersion,
  "io.prometheus" % "simpleclient_servlet" % prometheusClientVersion,

  // Play libs. Are provided not to enforce a specific version.
  "org.playframework" %% "play" % playVersion % Provided,
  "org.playframework" %% "play-guice" % playVersion % Provided,
)

libraryDependencies ++= Seq(
  "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.1" % Test,
  "org.scalatestplus" %% "mockito-4-2" % "3.2.11.0" % Test,
  "org.mockito" % "mockito-core" % "4.2.0" % Test
)

sonatypeCredentialHost := "s01.oss.sonatype.org"

publishTo := sonatypePublishToBundle.value

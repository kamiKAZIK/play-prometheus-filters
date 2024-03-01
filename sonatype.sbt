publishMavenStyle := true

licenses := Seq("MIT License" -> url("http://www.opensource.org/licenses/mit-license.php"))

homepage := Some(url("https://github.com/kamiKAZIK/play-prometheus-filters"))
scmInfo := Some(
  ScmInfo(
    url("https://github.com/kamiKAZIK/play-prometheus-filters.git"),
    "scm:git:git@github.com:kamiKAZIK/play-prometheus-filters.git"
  )
)
sonatypeCredentialHost := "s01.oss.sonatype.org"

developers := List(
  Developer(id="SoerenSilkjaer", name="Søren Valentin Silkjær", email="soren.hansen@jp.dk", url=url("https://github.com/SoerenSilkjaer")),
  Developer(id="renevangsgaardjp", name="René Vangsgaard", email="rene.vangsgaard@jp.dk", url=url("https://github.com/renevangsgaardjp")),
  Developer(id="kamiKAZIK", name="Eduardas Kazakas", email="eduardas.kazakas@gmail.com", url=url("https://github.com/kamiKAZIK"))
)

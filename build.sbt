ThisBuild / scalaVersion := "3.3.1"

enablePlugins(JavaAppPackaging, DockerPlugin)

lazy val root = project
  .in(file("."))
  .settings(
    libraryDependencies ++= Seq(
      "org.tpolecat"  %% "doobie-core"                   % "1.0.0-RC7",
      "org.tpolecat"  %% "doobie-hikari"                 % "1.0.0-RC7",
      "org.postgresql" % "postgresql"                    % "42.7.1",
      "org.scalatest" %% "scalatest"                     % "3.2.9"     % Test,
      "org.typelevel" %% "cats-effect-testing-scalatest" % "1.6.0"     % Test,
      "org.tpolecat"  %% "doobie-scalatest"              % "1.0.0-RC7" % Test
    )
  )

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "$package$",
      version := "0.1",
      scalaVersion := "2.11.12",
      libraryDependencies += "org.apache.spark" %% "spark-core" % "2.3.1" % Provided,
      libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.3.1"  % Provided,
      libraryDependencies += "com.amazonaws" % "services" % "1.0" % Provided from "file:///./lib/glue-lib.jar"
    )),
    name := "$name$"
  )

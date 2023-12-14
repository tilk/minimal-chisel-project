scalaVersion := "2.13.8"

scalacOptions ++= Seq(
  "-deprecation",
  "-feature",
  "-unchecked",
  "-language:reflectiveCalls",
)

addCompilerPlugin("org.chipsalliance" % "chisel-plugin" % "5.1.0" cross CrossVersion.full)
libraryDependencies += "org.chipsalliance" %% "chisel" % "5.1.0"
libraryDependencies += "edu.berkeley.cs" %% "chiseltest" % "5.0.2"


name := "scalajs-tutorial"

version := "1.0"

scalaVersion := "2.11.7"

enablePlugins(ScalaJSPlugin)

scalaJSStage in Global := FastOptStage

libraryDependencies += "be.doeraene" %%% "scalajs-jquery" % "0.8.0"

skip in packageJSDependencies := false
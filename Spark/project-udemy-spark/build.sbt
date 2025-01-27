name := "project-udemy-spark"

version := "1.1"

scalaVersion := "2.11.4"

val sparkVersion = "2.1.0"

//conflict
libraryDependencies += "commons-net" % "commons-net" % "3.6"
libraryDependencies += "com.google.guava" % "guava" % "14.0.1"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.spark" %% "spark-mllib" % sparkVersion,
  "org.apache.spark" %% "spark-streaming" % sparkVersion,
  "org.apache.spark" %% "spark-hive" % sparkVersion
)

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"
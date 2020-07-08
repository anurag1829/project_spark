name := "spark_wip"

version := "0.1"

scalaVersion := "2.13.3"


// https://mvnrepository.com/artifact/org.apache.spark/spark-core
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.6"


// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
//libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.6"


// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming
//libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.4.6" % "provided"

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.4.6" % "provided"

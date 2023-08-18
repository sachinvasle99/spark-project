name := "My_Spark_Project"

version := "0.1"

scalaVersion := "2.11.10"

lazy val Versions = new {

    val spark = "2.2.0"
    val hadoop = "2.7.3"
}

libraryDependencies += "org.apache.spark" %% "spark-core" % Versions.spark
libraryDependencies += "org.apache.spark" %% "spark-sql" % Versions.spark
libraryDependencies += "org.apache.hadoop" % "hadoop-client" % Versions.spark

assemblyMergeStrategy in assembly := {
    case PathList("META-INF", xs @ _*) => MergeStrategy.discard
    case x => MergeStrategy.first
}
package com.alterway.Main

import org.apache.spark.sql.SparkSession

object Main {
    def main(args: Array[String]): Unit = {
        val session = SparkSession.builder().master("yarn").getOrCreate()
        val sequence = Seq("One", "Two", "Three")
        val rdd = session.sparkContext.parallelize(sequence)
        rdd.saveAsTextFile("s3://bucket_name/folder_name")
    }
}
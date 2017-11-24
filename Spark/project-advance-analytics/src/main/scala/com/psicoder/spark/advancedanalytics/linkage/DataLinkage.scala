package com.psicoder.spark.advancedanalytics.linkage

import com.psicoder.spark.advancedanalytics.util.{ContextLoader, FileLoader}

object DataLinkage {
  def main(args: Array[String]): Unit = {
    val spark = ContextLoader.sparkSession(args, "DataLinkage")

    val blocks = spark.read
      .option("header", "true")
      .csv(FileLoader.resolveFile(args, "donation/block_*.csv"))

    blocks.show()
    println(s"Size: ${blocks.count}")
  }
}

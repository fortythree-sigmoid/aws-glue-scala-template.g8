package br.com.yandeh.glue.job

import com.amazonaws.services.glue.GlueContext
import org.apache.spark.SparkContext

trait ETLJob {
  def sparkContext: SparkContext
  def glueContext: GlueContext

  def execute: Unit

  lazy val spark = glueContext.getSparkSession
}

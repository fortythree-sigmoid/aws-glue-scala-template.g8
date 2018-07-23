package br.com.yandeh.glue.job

import br.com.yandeh.glue.implicits._
import com.amazonaws.services.glue.util.JsonOptions
import com.amazonaws.services.glue.{ChoiceOption, GlueContext}
import org.apache.spark.SparkContext
import org.apache.spark.sql.functions._

case class JobImpl(sparkContext: SparkContext, glueContext: GlueContext) extends ETLJob {

  import spark.implicits._

  override def execute: Unit = {
    //code your extraction here
  }
}
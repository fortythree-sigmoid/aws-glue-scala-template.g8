package br.com.yandeh.glue

import com.amazonaws.services.glue.{DynamicFrame, GlueContext}
import org.apache.spark.sql.DataFrame

package object implicits {

  implicit class DataFrameOps(df: DataFrame){

    def toDynamicFrame(glueContext: GlueContext): DynamicFrame = {
      DynamicFrame(df = df, glueContext = glueContext)
    }
  }

}

package org.apache.spark.ml.util;
/**
 * Function to write the provided pipeline stage out.
 * <p>
 * param:  path  The path to write the result out to.
 * param:  session  SparkSession associated with the write request.
 * param:  optionMap  User provided options stored as strings.
 * param:  stage  The pipeline stage to be saved.
 */
public  interface MLWriterFormat {
  // not preceding
  public  void write (java.lang.String path, org.apache.spark.sql.SparkSession session, scala.collection.mutable.Map<java.lang.String, java.lang.String> optionMap, org.apache.spark.ml.PipelineStage stage)  ;
}

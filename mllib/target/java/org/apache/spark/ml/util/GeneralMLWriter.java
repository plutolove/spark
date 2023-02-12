package org.apache.spark.ml.util;
/**
 * Specifies the format of ML export (e.g. "pmml", "internal", or
 * the fully qualified class name for export).
 */
public  class GeneralMLWriter extends org.apache.spark.ml.util.MLWriter implements org.apache.spark.internal.Logging {
  // not preceding
  public   GeneralMLWriter (org.apache.spark.ml.PipelineStage stage)  { throw new RuntimeException(); }
  /**
   * Specifies the format of ML export (e.g. "pmml", "internal", or
   * the fully qualified class name for export).
   * @param source (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.util.GeneralMLWriter format (java.lang.String source)  { throw new RuntimeException(); }
  /**
   * Dispatches the save to the correct MLFormat.
   * @param path (undocumented)
   */
  protected  void saveImpl (java.lang.String path) throws java.io.IOException, org.apache.spark.SparkException { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.GeneralMLWriter session (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
}

package org.apache.spark.ml.util;
/**
 * Default <code>MLWriter</code> implementation for transformers and estimators that contain basic
 * (json4s-serializable) params and no data. This will not handle more complex params or types with
 * data (e.g., models with coefficients).
 * <p>
 * param:  instance object to save
 */
  class DefaultParamsWriter extends org.apache.spark.ml.util.MLWriter {
  // not preceding
  static public  void saveMetadata (org.apache.spark.ml.param.Params instance, java.lang.String path, org.apache.spark.SparkContext sc, scala.Option<org.json4s.JsonAST.JObject> extraMetadata, scala.Option<org.json4s.JsonAST.JValue> paramMap)  { throw new RuntimeException(); }
  /**
   * Helper for {@link saveMetadata()} which extracts the JSON to save.
   * This is useful for ensemble models which need to save metadata for many sub-models.
   * <p>
   * @see {@link saveMetadata()} for details on what this includes.
   * @param instance (undocumented)
   * @param sc (undocumented)
   * @param extraMetadata (undocumented)
   * @param paramMap (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String getMetadataToSave (org.apache.spark.ml.param.Params instance, org.apache.spark.SparkContext sc, scala.Option<org.json4s.JsonAST.JObject> extraMetadata, scala.Option<org.json4s.JsonAST.JValue> paramMap)  { throw new RuntimeException(); }
  // not preceding
  public   DefaultParamsWriter (org.apache.spark.ml.param.Params instance)  { throw new RuntimeException(); }
  // not preceding
  protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
}

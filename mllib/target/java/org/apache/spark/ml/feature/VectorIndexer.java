package org.apache.spark.ml.feature;
/** @group setParam */
public  class VectorIndexer extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.VectorIndexerModel> implements org.apache.spark.ml.feature.VectorIndexerParams, org.apache.spark.ml.util.DefaultParamsWritable {
  // not preceding
  static   java.lang.String SKIP_INVALID ()  { throw new RuntimeException(); }
  static   java.lang.String ERROR_INVALID ()  { throw new RuntimeException(); }
  static   java.lang.String KEEP_INVALID ()  { throw new RuntimeException(); }
  static   java.lang.String[] supportedHandleInvalids ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.VectorIndexer load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.Param<java.lang.String> handleInvalid ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.IntParam maxCategories ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   VectorIndexer (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public   VectorIndexer ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorIndexer setMaxCategories (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorIndexer setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorIndexer setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorIndexer setHandleInvalid (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.VectorIndexerModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.VectorIndexer copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}

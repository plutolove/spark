package org.apache.spark.ml.feature;
/** @group setParam */
public  class BucketedRandomProjectionLSH extends org.apache.spark.ml.feature.LSH<org.apache.spark.ml.feature.BucketedRandomProjectionLSHModel> implements org.apache.spark.ml.feature.BucketedRandomProjectionLSHParams, org.apache.spark.ml.param.shared.HasSeed {
  // not preceding
  static public  org.apache.spark.ml.feature.BucketedRandomProjectionLSH load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.DoubleParam bucketLength ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   BucketedRandomProjectionLSH (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.feature.BucketedRandomProjectionLSH setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.BucketedRandomProjectionLSH setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.BucketedRandomProjectionLSH setNumHashTables (int value)  { throw new RuntimeException(); }
  public   BucketedRandomProjectionLSH ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.BucketedRandomProjectionLSH setBucketLength (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.BucketedRandomProjectionLSH setSeed (long value)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.feature.BucketedRandomProjectionLSHModel createRawLSHModel (int inputDim)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.BucketedRandomProjectionLSH copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}

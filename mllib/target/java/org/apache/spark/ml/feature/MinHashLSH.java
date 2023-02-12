package org.apache.spark.ml.feature;
/** @group setParam */
public  class MinHashLSH extends org.apache.spark.ml.feature.LSH<org.apache.spark.ml.feature.MinHashLSHModel> implements org.apache.spark.ml.param.shared.HasSeed {
  // not preceding
  static   int HASH_PRIME ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.MinHashLSH load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   MinHashLSH (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.feature.MinHashLSH setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.MinHashLSH setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.MinHashLSH setNumHashTables (int value)  { throw new RuntimeException(); }
  public   MinHashLSH ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.MinHashLSH setSeed (long value)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.feature.MinHashLSHModel createRawLSHModel (int inputDim)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.MinHashLSH copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}

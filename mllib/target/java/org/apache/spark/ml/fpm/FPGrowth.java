package org.apache.spark.ml.fpm;
/** @group setParam */
public  class FPGrowth extends org.apache.spark.ml.Estimator<org.apache.spark.ml.fpm.FPGrowthModel> implements org.apache.spark.ml.fpm.FPGrowthParams, org.apache.spark.ml.util.DefaultParamsWritable {
  // not preceding
  static public  org.apache.spark.ml.fpm.FPGrowth load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.Param<java.lang.String> itemsCol ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.DoubleParam minSupport ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.IntParam numPartitions ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.DoubleParam minConfidence ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   FPGrowth (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public   FPGrowth ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.fpm.FPGrowth setMinSupport (double value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.fpm.FPGrowth setNumPartitions (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.fpm.FPGrowth setMinConfidence (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.fpm.FPGrowth setItemsCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.fpm.FPGrowth setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.fpm.FPGrowthModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.fpm.FPGrowth copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}

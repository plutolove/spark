package org.apache.spark.ml.feature;
/** @group setParam */
public  class MinMaxScaler extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.MinMaxScalerModel> implements org.apache.spark.ml.feature.MinMaxScalerParams, org.apache.spark.ml.util.DefaultParamsWritable {
  // not preceding
  static public  org.apache.spark.ml.feature.MinMaxScaler load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.DoubleParam min ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.DoubleParam max ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   MinMaxScaler (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public   MinMaxScaler ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.MinMaxScaler setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.MinMaxScaler setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.MinMaxScaler setMin (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.MinMaxScaler setMax (double value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.MinMaxScalerModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.MinMaxScaler copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}

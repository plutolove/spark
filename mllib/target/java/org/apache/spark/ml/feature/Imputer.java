package org.apache.spark.ml.feature;
/** @group setParam */
public  class Imputer extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.ImputerModel> implements org.apache.spark.ml.feature.ImputerParams, org.apache.spark.ml.util.DefaultParamsWritable {
  // not preceding
  static   java.lang.String mean ()  { throw new RuntimeException(); }
  static   java.lang.String median ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.Imputer load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> strategy ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam missingValue ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam relativeError ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.StringArrayParam outputCols ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.StringArrayParam inputCols ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   Imputer (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public   Imputer ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Imputer setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Imputer setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Imputer setInputCols (java.lang.String[] value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Imputer setOutputCols (java.lang.String[] value)  { throw new RuntimeException(); }
  /**
   * Imputation strategy. Available options are ["mean", "median"].
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.feature.Imputer setStrategy (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Imputer setMissingValue (double value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.feature.Imputer setRelativeError (double value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.ImputerModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.Imputer copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}

package org.apache.spark.ml.feature;
/** @group setParam */
public  class RobustScaler extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.RobustScalerModel> implements org.apache.spark.ml.feature.RobustScalerParams, org.apache.spark.ml.util.DefaultParamsWritable {
  // not preceding
  static   org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.sql.catalyst.util.QuantileSummaries>> computeSummaries (org.apache.spark.rdd.RDD<org.apache.spark.ml.linalg.Vector> vectors, int numFeatures, double relativeError)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.RobustScaler load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.DoubleParam lower ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.DoubleParam upper ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.BooleanParam withCentering ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.BooleanParam withScaling ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam relativeError ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   RobustScaler (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public   RobustScaler ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RobustScaler setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RobustScaler setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RobustScaler setLower (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RobustScaler setUpper (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RobustScaler setWithCentering (boolean value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RobustScaler setWithScaling (boolean value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.feature.RobustScaler setRelativeError (double value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.RobustScalerModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.RobustScaler copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}

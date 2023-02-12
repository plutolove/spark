package org.apache.spark.ml.feature;
/** @group setParam */
public  class RobustScalerModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.RobustScalerModel> implements org.apache.spark.ml.feature.RobustScalerParams, org.apache.spark.ml.util.MLWritable {
  // not preceding
  static   class RobustScalerModelWriter extends org.apache.spark.ml.util.MLWriter {
    // not preceding
    public   RobustScalerModelWriter (org.apache.spark.ml.feature.RobustScalerModel instance)  { throw new RuntimeException(); }
    // not preceding
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.RobustScalerModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.RobustScalerModel load (java.lang.String path)  { throw new RuntimeException(); }
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
  public  org.apache.spark.ml.linalg.Vector range ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector median ()  { throw new RuntimeException(); }
  // not preceding
     RobustScalerModel (java.lang.String uid, org.apache.spark.ml.linalg.Vector range, org.apache.spark.ml.linalg.Vector median)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.feature.RobustScalerModel setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RobustScalerModel setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.RobustScalerModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}

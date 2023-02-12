package org.apache.spark.ml.feature;
/** @group setParam */
public  class ImputerModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.ImputerModel> implements org.apache.spark.ml.feature.ImputerParams, org.apache.spark.ml.util.MLWritable {
  // not preceding
  static   class ImputerModelWriter extends org.apache.spark.ml.util.MLWriter {
    // not preceding
    public   ImputerModelWriter (org.apache.spark.ml.feature.ImputerModel instance)  { throw new RuntimeException(); }
    // not preceding
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.ImputerModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.ImputerModel load (java.lang.String path)  { throw new RuntimeException(); }
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
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> surrogateDF ()  { throw new RuntimeException(); }
  // not preceding
     ImputerModel (java.lang.String uid, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> surrogateDF)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.feature.ImputerModel setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.ImputerModel setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.ImputerModel setInputCols (java.lang.String[] value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.ImputerModel setOutputCols (java.lang.String[] value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.ImputerModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}

package org.apache.spark.ml.feature;
/** @group setParam */
public  class StringIndexerModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.StringIndexerModel> implements org.apache.spark.ml.feature.StringIndexerBase, org.apache.spark.ml.util.MLWritable {
  // not preceding
  static   class StringIndexModelWriter extends org.apache.spark.ml.util.MLWriter {
    // not preceding
    public   StringIndexModelWriter (org.apache.spark.ml.feature.StringIndexerModel instance)  { throw new RuntimeException(); }
    // not preceding
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.StringIndexerModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.StringIndexerModel load (java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.Param<java.lang.String> handleInvalid ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> stringOrderType ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.StringArrayParam outputCols ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.StringArrayParam inputCols ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  java.lang.String[][] labelsArray ()  { throw new RuntimeException(); }
  // not preceding
  public   StringIndexerModel (java.lang.String uid, java.lang.String[][] labelsArray)  { throw new RuntimeException(); }
  // not preceding
  public   StringIndexerModel (java.lang.String uid, java.lang.String[] labels)  { throw new RuntimeException(); }
  public   StringIndexerModel (java.lang.String[] labels)  { throw new RuntimeException(); }
  public   StringIndexerModel (java.lang.String[][] labelsArray)  { throw new RuntimeException(); }
  /**
   * @deprecated `labels` is deprecated and will be removed in 3.1.0. Use `labelsArray` instead. Since 3.0.0. 
  */
  public  java.lang.String[] labels ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StringIndexerModel setHandleInvalid (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StringIndexerModel setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StringIndexerModel setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StringIndexerModel setInputCols (java.lang.String[] value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StringIndexerModel setOutputCols (java.lang.String[] value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StringIndexerModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StringIndexerModel.StringIndexModelWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}

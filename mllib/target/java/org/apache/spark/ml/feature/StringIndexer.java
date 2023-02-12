package org.apache.spark.ml.feature;
/** @group setParam */
public  class StringIndexer extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.StringIndexerModel> implements org.apache.spark.ml.feature.StringIndexerBase, org.apache.spark.ml.util.DefaultParamsWritable {
  // not preceding
  static   java.lang.String SKIP_INVALID ()  { throw new RuntimeException(); }
  static   java.lang.String ERROR_INVALID ()  { throw new RuntimeException(); }
  static   java.lang.String KEEP_INVALID ()  { throw new RuntimeException(); }
  static   java.lang.String[] supportedHandleInvalids ()  { throw new RuntimeException(); }
  static   java.lang.String frequencyDesc ()  { throw new RuntimeException(); }
  static   java.lang.String frequencyAsc ()  { throw new RuntimeException(); }
  static   java.lang.String alphabetDesc ()  { throw new RuntimeException(); }
  static   java.lang.String alphabetAsc ()  { throw new RuntimeException(); }
  static   java.lang.String[] supportedStringOrderType ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.StringIndexer load (java.lang.String path)  { throw new RuntimeException(); }
  static   scala.Function2<scala.Tuple2<java.lang.String, java.lang.Object>, scala.Tuple2<java.lang.String, java.lang.Object>, java.lang.Object> getSortFunc (boolean ascending)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
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
  // not preceding
  public   StringIndexer (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public   StringIndexer ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StringIndexer setHandleInvalid (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StringIndexer setStringOrderType (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StringIndexer setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StringIndexer setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StringIndexer setInputCols (java.lang.String[] value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.StringIndexer setOutputCols (java.lang.String[] value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StringIndexerModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StringIndexer copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}

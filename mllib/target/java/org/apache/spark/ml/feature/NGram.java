package org.apache.spark.ml.feature;
/**
 * Minimum n-gram length, greater than or equal to 1.
 * Default: 2, bigram features
 * @group param
 */
public  class NGram extends org.apache.spark.ml.UnaryTransformer<scala.collection.Seq<java.lang.String>, scala.collection.Seq<java.lang.String>, org.apache.spark.ml.feature.NGram> implements org.apache.spark.ml.util.DefaultParamsWritable {
  // not preceding
  static public  org.apache.spark.ml.feature.NGram load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   NGram (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public   NGram ()  { throw new RuntimeException(); }
  /**
   * Minimum n-gram length, greater than or equal to 1.
   * Default: 2, bigram features
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam n ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.NGram setN (int value)  { throw new RuntimeException(); }
  /** @group getParam */
  public  int getN ()  { throw new RuntimeException(); }
  protected  scala.Function1<scala.collection.Seq<java.lang.String>, scala.collection.Seq<java.lang.String>> createTransformFunc ()  { throw new RuntimeException(); }
  protected  void validateInputType (org.apache.spark.sql.types.DataType inputType)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.DataType outputDataType ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}

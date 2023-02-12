package org.apache.spark.ml.feature;
/**
 * Normalization in L^p^ space. Must be greater than equal to 1.
 * (default: p = 2)
 * @group param
 */
public  class Normalizer extends org.apache.spark.ml.UnaryTransformer<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.feature.Normalizer> implements org.apache.spark.ml.util.DefaultParamsWritable {
  // not preceding
  static public  org.apache.spark.ml.feature.Normalizer load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   Normalizer (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public   Normalizer ()  { throw new RuntimeException(); }
  /**
   * Normalization in L^p^ space. Must be greater than equal to 1.
   * (default: p = 2)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.DoubleParam p ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  double getP ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Normalizer setP (double value)  { throw new RuntimeException(); }
  protected  scala.Function1<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.linalg.Vector> createTransformFunc ()  { throw new RuntimeException(); }
  protected  void validateInputType (org.apache.spark.sql.types.DataType inputType)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.DataType outputDataType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}

package org.apache.spark.ml.feature;
/**
 * The polynomial degree to expand, which should be greater than equal to 1. A value of 1 means
 * no expansion.
 * Default: 2
 * @group param
 */
public  class PolynomialExpansion extends org.apache.spark.ml.UnaryTransformer<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.feature.PolynomialExpansion> implements org.apache.spark.ml.util.DefaultParamsWritable {
  static   org.apache.spark.ml.linalg.Vector expand (org.apache.spark.ml.linalg.Vector v, int degree)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.PolynomialExpansion load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   PolynomialExpansion (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public   PolynomialExpansion ()  { throw new RuntimeException(); }
  /**
   * The polynomial degree to expand, which should be greater than equal to 1. A value of 1 means
   * no expansion.
   * Default: 2
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam degree ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  int getDegree ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.PolynomialExpansion setDegree (int value)  { throw new RuntimeException(); }
  protected  scala.Function1<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.linalg.Vector> createTransformFunc ()  { throw new RuntimeException(); }
  protected  void validateInputType (org.apache.spark.sql.types.DataType inputType)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.DataType outputDataType ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.PolynomialExpansion copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}

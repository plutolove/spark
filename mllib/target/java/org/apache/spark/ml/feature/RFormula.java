package org.apache.spark.ml.feature;
/**
 * Sets the formula to use for this transformer. Must be called before use.
 * @group setParam
 * param:  value an R formula in string form (e.g. "y ~ x + z")
 */
public  class RFormula extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.RFormulaModel> implements org.apache.spark.ml.feature.RFormulaBase, org.apache.spark.ml.util.DefaultParamsWritable {
  // not preceding
  static public  org.apache.spark.ml.feature.RFormula load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.Param<java.lang.String> formula ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.BooleanParam forceIndexLabel ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.Param<java.lang.String> handleInvalid ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> stringIndexerOrderType ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   RFormula (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public   RFormula ()  { throw new RuntimeException(); }
  /**
   * Sets the formula to use for this transformer. Must be called before use.
   * @group setParam
   * @param value an R formula in string form (e.g. "y ~ x + z")
   * @return (undocumented)
   */
  public  org.apache.spark.ml.feature.RFormula setFormula (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RFormula setHandleInvalid (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RFormula setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RFormula setLabelCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RFormula setForceIndexLabel (boolean value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.RFormula setStringIndexerOrderType (java.lang.String value)  { throw new RuntimeException(); }
  /** Whether the formula specifies fitting an intercept. */
    boolean hasIntercept ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.RFormulaModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.RFormula copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}

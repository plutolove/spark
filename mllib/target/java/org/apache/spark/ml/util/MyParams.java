package org.apache.spark.ml.util;
/**
 * Default test for Estimator, Model pairs:
 *  - Explicitly set Params, and train model
 *  - Test save/load using <code>testDefaultReadWrite</code> on Estimator and Model
 *  - Check Params on Estimator and Model
 *  - Compare model data
 * <p>
 * This requires that <code>Model</code>'s <code>Param</code>s should be a subset of <code>Estimator</code>'s <code>Param</code>s.
 * <p>
 * param:  estimator  Estimator to test
 * param:  dataset  Dataset to pass to <code>Estimator.fit()</code>
 * param:  testEstimatorParams  Set of <code>Param</code> values to set in estimator
 * param:  testModelParams Set of <code>Param</code> values to set in model
 * param:  checkModelData  Method which takes the original and loaded <code>Model</code> and compares their
 *                        data.  This method does not need to check <code>Param</code> values.
 * @param <E>   Type of <code>Estimator</code>
 * @param <M>   Type of <code>Model</code> produced by estimator
 */
public  class MyParams implements org.apache.spark.ml.param.Params, org.apache.spark.ml.util.MLWritable {
  // not preceding
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.util.MyParams> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MyParams load (java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.Param<?>[] params ()  { throw new RuntimeException(); }
  // not preceding
    org.apache.spark.ml.param.ParamMap paramMap ()  { throw new RuntimeException(); }
  // not preceding
    org.apache.spark.ml.param.ParamMap defaultParamMap ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   MyParams (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam intParamWithDefault ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam shouldNotSetIfSetintParamWithDefault ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntParam intParam ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.FloatParam floatParam ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleParam doubleParam ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.LongParam longParam ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.Param<java.lang.String> stringParam ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.IntArrayParam intArrayParam ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.DoubleArrayParam doubleArrayParam ()  { throw new RuntimeException(); }
  public final  org.apache.spark.ml.param.StringArrayParam stringArrayParam ()  { throw new RuntimeException(); }
  public  void checkExclusiveParams ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.Params copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}

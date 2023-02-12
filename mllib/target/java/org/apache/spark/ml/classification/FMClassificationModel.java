package org.apache.spark.ml.classification;
/**
 * Model produced by {@link FMClassifier}
 */
public  class FMClassificationModel extends org.apache.spark.ml.classification.ProbabilisticClassificationModel<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.classification.FMClassificationModel> implements org.apache.spark.ml.classification.FMClassifierParams, org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link FMClassificationModel} */
  static   class FMClassificationModelWriter extends org.apache.spark.ml.util.MLWriter implements org.apache.spark.internal.Logging {
    // not preceding
    public   FMClassificationModelWriter (org.apache.spark.ml.classification.FMClassificationModel instance)  { throw new RuntimeException(); }
    // not preceding
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.classification.FMClassificationModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.classification.FMClassificationModel load (java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam factorSize ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.BooleanParam fitLinear ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam miniBatchFraction ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam initStd ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> solver ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam regParam ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.BooleanParam fitIntercept ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam tol ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.DoubleParam stepSize ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  double intercept ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector linear ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Matrix factors ()  { throw new RuntimeException(); }
  // not preceding
     FMClassificationModel (java.lang.String uid, double intercept, org.apache.spark.ml.linalg.Vector linear, org.apache.spark.ml.linalg.Matrix factors)  { throw new RuntimeException(); }
  // not preceding
  public  int numClasses ()  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector predictRaw (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.linalg.Vector raw2probabilityInPlace (org.apache.spark.ml.linalg.Vector rawPrediction)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.FMClassificationModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}

package org.apache.spark.ml.classification;
/**
 * Linear SVM Model trained by {@link LinearSVC}
 */
public  class LinearSVCModel extends org.apache.spark.ml.classification.ClassificationModel<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.classification.LinearSVCModel> implements org.apache.spark.ml.classification.LinearSVCParams, org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link LinearSVCModel} */
  static   class LinearSVCWriter extends org.apache.spark.ml.util.MLWriter implements org.apache.spark.internal.Logging {
    // not preceding
    public   LinearSVCWriter (org.apache.spark.ml.classification.LinearSVCModel instance)  { throw new RuntimeException(); }
    // not preceding
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.classification.LinearSVCModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.classification.LinearSVCModel load (java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam threshold ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam aggregationDepth ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.BooleanParam standardization ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam tol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.BooleanParam fitIntercept ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam regParam ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector coefficients ()  { throw new RuntimeException(); }
  public  double intercept ()  { throw new RuntimeException(); }
  // not preceding
     LinearSVCModel (java.lang.String uid, org.apache.spark.ml.linalg.Vector coefficients, double intercept)  { throw new RuntimeException(); }
  // not preceding
  public  int numClasses ()  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LinearSVCModel setThreshold (double value)  { throw new RuntimeException(); }
  public  double predict (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector predictRaw (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  protected  double raw2prediction (org.apache.spark.ml.linalg.Vector rawPrediction)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LinearSVCModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}

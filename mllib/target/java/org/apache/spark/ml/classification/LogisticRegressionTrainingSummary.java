package org.apache.spark.ml.classification;
/** objective function (scaled loss + regularization) at each iteration. */
public  interface LogisticRegressionTrainingSummary extends org.apache.spark.ml.classification.LogisticRegressionSummary {
  /** objective function (scaled loss + regularization) at each iteration. */
  public  double[] objectiveHistory ()  ;
  /** Number of training iterations. */
  public  int totalIterations ()  ;
}

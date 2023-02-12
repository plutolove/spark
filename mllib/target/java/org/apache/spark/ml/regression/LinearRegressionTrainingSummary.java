package org.apache.spark.ml.regression;
/**
 * Number of training iterations until termination
 * <p>
 * This value is only available when using the "l-bfgs" solver.
 * <p>
 * @see <code>LinearRegression.solver</code>
 */
public  class LinearRegressionTrainingSummary extends org.apache.spark.ml.regression.LinearRegressionSummary {
  // not preceding
     LinearRegressionTrainingSummary (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions, java.lang.String predictionCol, java.lang.String labelCol, java.lang.String featuresCol, org.apache.spark.ml.regression.LinearRegressionModel model, double[] diagInvAtWA, double[] objectiveHistory)  { throw new RuntimeException(); }
  // not preceding
  public  double[] objectiveHistory ()  { throw new RuntimeException(); }
  // not preceding
  public  int totalIterations ()  { throw new RuntimeException(); }
}

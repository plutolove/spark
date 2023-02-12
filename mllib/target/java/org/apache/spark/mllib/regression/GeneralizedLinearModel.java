package org.apache.spark.mllib.regression;
/**
 * Predict the result given a data point and the weights learned.
 * <p>
 * param:  dataMatrix Row vector containing the features for this data point
 * param:  weightMatrix Column vector containing the weights of the model
 * param:  intercept Intercept of the model.
 */
public abstract class GeneralizedLinearModel implements scala.Serializable {
  // not preceding
  public   GeneralizedLinearModel (org.apache.spark.mllib.linalg.Vector weights, double intercept)  { throw new RuntimeException(); }
  public  double intercept ()  { throw new RuntimeException(); }
  /**
   * Predict values for the given data set using the model trained.
   * <p>
   * @param testData RDD representing data points to be predicted
   * @return RDD[Double] where each entry contains the corresponding prediction
   * <p>
   */
  public  org.apache.spark.rdd.RDD<java.lang.Object> predict (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> testData)  { throw new RuntimeException(); }
  /**
   * Predict values for a single data point using the model trained.
   * <p>
   * @param testData array representing a single data point
   * @return Double prediction from the trained model
   * <p>
   */
  public  double predict (org.apache.spark.mllib.linalg.Vector testData)  { throw new RuntimeException(); }
  // not preceding
  protected abstract  double predictPoint (org.apache.spark.mllib.linalg.Vector dataMatrix, org.apache.spark.mllib.linalg.Vector weightMatrix, double intercept)  ;
  /**
   * Print a summary of the model.
   * @return (undocumented)
   */
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.mllib.linalg.Vector weights ()  { throw new RuntimeException(); }
}

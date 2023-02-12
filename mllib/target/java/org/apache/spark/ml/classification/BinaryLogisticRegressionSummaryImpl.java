package org.apache.spark.ml.classification;
/**
 * Binary logistic regression results for a given model.
 * <p>
 * param:  predictions dataframe output by the model's <code>transform</code> method.
 * param:  probabilityCol field in "predictions" which gives the probability of
 *                       each class as a vector.
 * param:  predictionCol field in "predictions" which gives the prediction of
 *                      each class as a double.
 * param:  labelCol field in "predictions" which gives the true label of each instance.
 * param:  featuresCol field in "predictions" which gives the features of each instance as a vector.
 */
public  class BinaryLogisticRegressionSummaryImpl extends org.apache.spark.ml.classification.LogisticRegressionSummaryImpl implements org.apache.spark.ml.classification.BinaryLogisticRegressionSummary {
  // not preceding
  public   BinaryLogisticRegressionSummaryImpl (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> predictions, java.lang.String probabilityCol, java.lang.String predictionCol, java.lang.String labelCol, java.lang.String featuresCol)  { throw new RuntimeException(); }
  // not preceding
  public  double areaUnderROC ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> fMeasureByThreshold ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> pr ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> precisionByThreshold ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> recallByThreshold ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> roc ()  { throw new RuntimeException(); }
}

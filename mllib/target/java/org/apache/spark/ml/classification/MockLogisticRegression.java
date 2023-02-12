package org.apache.spark.ml.classification;
public  class MockLogisticRegression extends org.apache.spark.ml.classification.LogisticRegression {
  // not preceding
  public   MockLogisticRegression (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public   MockLogisticRegression ()  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.classification.LogisticRegressionModel train (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
}

package org.apache.spark.ml.feature;
/**
 * Imputation strategy. Available options are ["mean", "median"].
 * param:  df DataFrame with columns "id", "value", "expected_mean", "expected_median"
 */
// not preceding
public  class ImputerSuite$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ImputerSuite$ MODULE$ = null;
  public   ImputerSuite$ ()  { throw new RuntimeException(); }
  // not preceding
  public  void iterateStrategyTest (boolean isMultiCol, org.apache.spark.ml.feature.Imputer imputer, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
  public  void verifyTransformResult (java.lang.String strategy, java.lang.String inputCol, java.lang.String outputCol, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> resultDF)  { throw new RuntimeException(); }
}

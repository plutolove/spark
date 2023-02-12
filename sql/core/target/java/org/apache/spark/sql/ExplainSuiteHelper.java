package org.apache.spark.sql;
/**
 * Get the explain from a DataFrame and run the specified action on it.
 */
public  interface ExplainSuiteHelper extends org.apache.spark.sql.test.SharedSparkSession {
  /**
   * Runs the plan and makes sure the plans contains all of the keywords.
   * @param df (undocumented)
   * @param mode (undocumented)
   * @param keywords (undocumented)
   */
  public  void checkKeywordsExistsInExplain (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, org.apache.spark.sql.execution.ExplainMode mode, scala.collection.Seq<java.lang.String> keywords)  ;
  public  void checkKeywordsExistsInExplain (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.collection.Seq<java.lang.String> keywords)  ;
  /**
   * Runs the plan and makes sure the plans does not contain any of the keywords.
   * @param df (undocumented)
   * @param mode (undocumented)
   * @param keywords (undocumented)
   */
  public  void checkKeywordsNotExistsInExplain (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, org.apache.spark.sql.execution.ExplainMode mode, scala.collection.Seq<java.lang.String> keywords)  ;
  public  java.lang.String getNormalizedExplain (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, org.apache.spark.sql.execution.ExplainMode mode)  ;
  /**
   * Get the explain from a DataFrame and run the specified action on it.
   * @param df (undocumented)
   * @param mode (undocumented)
   * @param f (undocumented)
   */
  public  void withNormalizedExplain (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, org.apache.spark.sql.execution.ExplainMode mode, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> f)  ;
  /**
   * Get the explain by running the sql. The explain mode should be part of the
   * sql text itself.
   * @param queryText (undocumented)
   * @param f (undocumented)
   */
  public  void withNormalizedExplain (java.lang.String queryText, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> f)  ;
}

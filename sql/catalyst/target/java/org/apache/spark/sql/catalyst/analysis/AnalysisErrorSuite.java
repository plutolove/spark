package org.apache.spark.sql.catalyst.analysis;
public  class AnalysisErrorSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.catalyst.analysis.AnalysisTest {
  // not preceding
  public   AnalysisErrorSuite ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.catalyst.analysis.Analyzer caseInsensitiveAnalyzer ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.catalyst.analysis.Analyzer caseSensitiveAnalyzer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Literal dateLit ()  { throw new RuntimeException(); }
  // not preceding
  public  void errorTest (java.lang.String name, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, scala.collection.Seq<java.lang.String> errorMessages, boolean caseSensitive)  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
}

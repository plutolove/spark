package org.apache.spark.sql.catalyst.analysis;
public  interface AnalysisTest extends org.apache.spark.sql.catalyst.plans.PlanTest {
  public  void assertAnalysisError (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan inputPlan, scala.collection.Seq<java.lang.String> expectedErrors, boolean caseSensitive)  ;
  public  void assertAnalysisSuccess (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan inputPlan, boolean caseSensitive)  ;
  public  org.apache.spark.sql.catalyst.analysis.Analyzer caseInsensitiveAnalyzer ()  ;
  public  org.apache.spark.sql.catalyst.analysis.Analyzer caseSensitiveAnalyzer ()  ;
  public  void checkAnalysis (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan inputPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan expectedPlan, boolean caseSensitive)  ;
  public  void comparePlans (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan1, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan2, boolean checkAnalysis)  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> extendedAnalysisRules ()  ;
  public  org.apache.spark.sql.catalyst.analysis.Analyzer getAnalyzer (boolean caseSensitive)  ;
  public  void interceptParseException (scala.Function1<java.lang.String, java.lang.Object> parser, java.lang.String sqlCommand, scala.collection.Seq<java.lang.String> messages)  ;
  public  org.apache.spark.sql.catalyst.analysis.Analyzer makeAnalyzer (boolean caseSensitive)  ;
}

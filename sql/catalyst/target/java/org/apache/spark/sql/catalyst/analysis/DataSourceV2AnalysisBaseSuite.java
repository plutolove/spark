package org.apache.spark.sql.catalyst.analysis;
public abstract class DataSourceV2AnalysisBaseSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.catalyst.analysis.AnalysisTest {
  // not preceding
  public   DataSourceV2AnalysisBaseSuite ()  { throw new RuntimeException(); }
  public  void assertNotResolved (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logicalPlan)  { throw new RuntimeException(); }
  public  void assertResolved (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan logicalPlan)  { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan byName (org.apache.spark.sql.catalyst.analysis.NamedRelation table, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query)  ;
  public abstract  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan byPosition (org.apache.spark.sql.catalyst.analysis.NamedRelation table, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query)  ;
  // not preceding
  protected  org.apache.spark.sql.catalyst.analysis.Analyzer caseInsensitiveAnalyzer ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.catalyst.analysis.Analyzer caseSensitiveAnalyzer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer getAnalyzer (boolean caseSensitive)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.internal.SQLConf getSQLConf (boolean caseSensitive)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TestRelation requiredTable ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TestRelation table ()  { throw new RuntimeException(); }
  protected  void testNotResolvedOverwriteByExpression ()  { throw new RuntimeException(); }
  protected  void testResolvedOverwriteByExpression ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference toLower (org.apache.spark.sql.catalyst.expressions.AttributeReference attr)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TestRelation widerTable ()  { throw new RuntimeException(); }
}

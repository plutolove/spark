package org.apache.spark.sql.execution;
/**
 * Normalizes plans:
 * - CreateTable the createTime in tableDesc will replaced by -1L.
 */
public  class SparkSqlParserSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.catalyst.analysis.AnalysisTest {
  // not preceding
  public   SparkSqlParserSuite ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.catalyst.analysis.Analyzer caseInsensitiveAnalyzer ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.catalyst.analysis.Analyzer caseSensitiveAnalyzer ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.internal.SQLConf newConf ()  { throw new RuntimeException(); }
  /**
   * Normalizes plans:
   * - CreateTable the createTime in tableDesc will replaced by -1L.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan normalizePlan (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
}

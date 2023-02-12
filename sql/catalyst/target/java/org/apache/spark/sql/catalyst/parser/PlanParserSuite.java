package org.apache.spark.sql.catalyst.parser;
/**
 * Parser test cases for rules defined in {@link CatalystSqlParser} / {@link AstBuilder}.
 * <p>
 * There is also SparkSqlParserSuite in sql/core module for parser rules defined in sql/core module.
 */
public  class PlanParserSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.catalyst.analysis.AnalysisTest {
  // not preceding
  public   PlanParserSuite ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.catalyst.analysis.Analyzer caseInsensitiveAnalyzer ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.catalyst.analysis.Analyzer caseSensitiveAnalyzer ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
}

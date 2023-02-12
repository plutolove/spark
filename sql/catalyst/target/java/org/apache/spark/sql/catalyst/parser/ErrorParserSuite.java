package org.apache.spark.sql.catalyst.parser;
/**
 * Test various parser errors.
 */
public  class ErrorParserSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.catalyst.analysis.AnalysisTest {
  // not preceding
  public   ErrorParserSuite ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.catalyst.analysis.Analyzer caseInsensitiveAnalyzer ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.catalyst.analysis.Analyzer caseSensitiveAnalyzer ()  { throw new RuntimeException(); }
  public  void intercept (java.lang.String sqlCommand, scala.collection.Seq<java.lang.String> messages)  { throw new RuntimeException(); }
  public  void intercept (java.lang.String sql, int line, int startPosition, int stopPosition, scala.collection.Seq<java.lang.String> messages)  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
}

package org.apache.spark.sql.catalyst.parser;
/**
 * Test basic expression parsing.
 * If the type of an expression is supported it should be tested here.
 * <p>
 * Please note that some of the expressions test don't have to be sound expressions, only their
 * structure needs to be valid. Unsound expressions should be caught by the Analyzer or
 * CheckAnalysis classes.
 */
public  class ExpressionParserSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.catalyst.analysis.AnalysisTest {
  // not preceding
  public   ExpressionParserSuite ()  { throw new RuntimeException(); }
  public  void assertEqual (java.lang.String sqlCommand, org.apache.spark.sql.catalyst.expressions.Expression e, org.apache.spark.sql.catalyst.parser.ParserInterface parser)  { throw new RuntimeException(); }
  public  void assertEval (java.lang.String sqlCommand, Object expect, org.apache.spark.sql.catalyst.parser.ParserInterface parser)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.catalyst.analysis.Analyzer caseInsensitiveAnalyzer ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.catalyst.analysis.Analyzer caseSensitiveAnalyzer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.parser.CatalystSqlParser$ defaultParser ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Literal intervalLiteral (scala.Enumeration.Value u, java.lang.String s)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Enumeration.Value> intervalUnits ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.unsafe.types.UTF8String stringToUTF8Str (java.lang.String str)  { throw new RuntimeException(); }
}

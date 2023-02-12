package org.apache.spark.sql;
public  class MyParser implements org.apache.spark.sql.catalyst.parser.ParserInterface, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.parser.ParserInterface delegate ()  { throw new RuntimeException(); }
  // not preceding
  public   MyParser (org.apache.spark.sql.SparkSession spark, org.apache.spark.sql.catalyst.parser.ParserInterface delegate)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan parsePlan (java.lang.String sqlText)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression parseExpression (java.lang.String sqlText)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.TableIdentifier parseTableIdentifier (java.lang.String sqlText)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.FunctionIdentifier parseFunctionIdentifier (java.lang.String sqlText)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> parseMultipartIdentifier (java.lang.String sqlText)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType parseTableSchema (java.lang.String sqlText)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType parseDataType (java.lang.String sqlText)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType parseRawDataType (java.lang.String sqlText)  { throw new RuntimeException(); }
}

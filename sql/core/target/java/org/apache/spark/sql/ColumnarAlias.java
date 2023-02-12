package org.apache.spark.sql;
public  class ColumnarAlias extends org.apache.spark.sql.catalyst.expressions.Alias implements org.apache.spark.sql.ColumnarExpression {
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.ExprId exprId ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> qualifier ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.Metadata> explicitMetadata ()  { throw new RuntimeException(); }
  // not preceding
  public   ColumnarAlias (org.apache.spark.sql.ColumnarExpression child, java.lang.String name, org.apache.spark.sql.catalyst.expressions.ExprId exprId, scala.collection.Seq<java.lang.String> qualifier, scala.Option<org.apache.spark.sql.types.Metadata> explicitMetadata)  { throw new RuntimeException(); }
  // not preceding
  public  Object columnarEval (org.apache.spark.sql.vectorized.ColumnarBatch batch)  { throw new RuntimeException(); }
}

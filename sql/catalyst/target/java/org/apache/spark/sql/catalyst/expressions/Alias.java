package org.apache.spark.sql.catalyst.expressions;
/** Just a simple passthrough for code generation. */
public  class Alias extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.sql.catalyst.expressions.NamedExpression, scala.Product, scala.Serializable {
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.ExprId exprId ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> qualifier ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.Metadata> explicitMetadata ()  { throw new RuntimeException(); }
  // not preceding
  public   Alias (org.apache.spark.sql.catalyst.expressions.Expression child, java.lang.String name, org.apache.spark.sql.catalyst.expressions.ExprId exprId, scala.collection.Seq<java.lang.String> qualifier, scala.Option<org.apache.spark.sql.types.Metadata> explicitMetadata)  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  /** Just a simple passthrough for code generation. */
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode genCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.Metadata metadata ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.NamedExpression newInstance ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Attribute toAttribute ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  protected final  scala.collection.Seq<java.lang.Object> otherCopyArgs ()  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  java.lang.String sql ()  { throw new RuntimeException(); }
}

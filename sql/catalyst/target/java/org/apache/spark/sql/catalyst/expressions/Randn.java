package org.apache.spark.sql.catalyst.expressions;
/** Generate a random column with i.i.d. values drawn from the standard normal distribution. */
public  class Randn extends org.apache.spark.sql.catalyst.expressions.RDG implements org.apache.spark.sql.catalyst.expressions.ExpressionWithRandomSeed, scala.Product, scala.Serializable {
  // not preceding
  static public  org.apache.spark.sql.catalyst.expressions.Randn apply (long seed)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  // not preceding
  public   Randn (org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
  // not preceding
  public   Randn ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Randn withNewSeed (long seed)  { throw new RuntimeException(); }
  protected  double evalInternal (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Randn freshCopy ()  { throw new RuntimeException(); }
}

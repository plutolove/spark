package org.apache.spark.sql.catalyst.expressions;
// not preceding
public  class RegExpExtract extends org.apache.spark.sql.catalyst.expressions.TernaryExpression implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes, scala.Product, scala.Serializable {
  // not preceding
  static public  void checkGroupIndex (int groupCount, int groupIndex)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression subject ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression regexp ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression idx ()  { throw new RuntimeException(); }
  // not preceding
  public   RegExpExtract (org.apache.spark.sql.catalyst.expressions.Expression subject, org.apache.spark.sql.catalyst.expressions.Expression regexp, org.apache.spark.sql.catalyst.expressions.Expression idx)  { throw new RuntimeException(); }
  // not preceding
  public   RegExpExtract (org.apache.spark.sql.catalyst.expressions.Expression s, org.apache.spark.sql.catalyst.expressions.Expression r)  { throw new RuntimeException(); }
  public  Object nullSafeEval (Object s, Object p, Object r)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
}

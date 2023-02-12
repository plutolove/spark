package org.apache.spark.sql.catalyst.expressions.objects;
// not preceding
public  class MapObjects extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.NonSQLExpression, scala.Product, scala.Serializable {
  // not preceding
  static public  org.apache.spark.sql.catalyst.expressions.objects.MapObjects apply (scala.Function1<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> function, org.apache.spark.sql.catalyst.expressions.Expression inputData, org.apache.spark.sql.types.DataType elementType, boolean elementNullable, scala.Option<java.lang.Class<?>> customCollectionCls)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.objects.LambdaVariable loopVar ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression lambdaFunction ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression inputData ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Class<?>> customCollectionCls ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
}

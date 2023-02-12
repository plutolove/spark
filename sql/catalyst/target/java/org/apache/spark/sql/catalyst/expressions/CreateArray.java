package org.apache.spark.sql.catalyst.expressions;
/**
 * Returns an Array containing the evaluation of all children expressions.
 */
public  class CreateArray extends org.apache.spark.sql.catalyst.expressions.Expression implements scala.Product, scala.Serializable {
  // not preceding
  static public  org.apache.spark.sql.catalyst.expressions.CreateArray apply (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  boolean useStringTypeWhenEmpty ()  { throw new RuntimeException(); }
  // not preceding
  public   CreateArray (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children, boolean useStringTypeWhenEmpty)  { throw new RuntimeException(); }
  // not preceding
  public   CreateArray (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children)  { throw new RuntimeException(); }
  public  boolean foldable ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<java.lang.Object> stringArgs ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.ArrayType dataType ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
}

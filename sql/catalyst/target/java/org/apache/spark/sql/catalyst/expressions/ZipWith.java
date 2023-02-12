package org.apache.spark.sql.catalyst.expressions;
/**
 * The function accepts two key arrays and returns a collection of keys with indexes
 * to value arrays. Indexes are represented as an array of two items. This is a small
 * optimization leveraging mutability of arrays.
 */
public  class ZipWith extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.HigherOrderFunction, org.apache.spark.sql.catalyst.expressions.codegen.CodegenFallback, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean argumentsResolved ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> functionsForEval ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression function ()  { throw new RuntimeException(); }
  // not preceding
  public   ZipWith (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right, org.apache.spark.sql.catalyst.expressions.Expression function)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression functionForEval ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> arguments ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> argumentTypes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> functions ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> functionTypes ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.ArrayType dataType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.ZipWith bind (scala.Function2<org.apache.spark.sql.catalyst.expressions.Expression, scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.types.DataType, java.lang.Object>>, org.apache.spark.sql.catalyst.expressions.LambdaFunction> f)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.NamedLambdaVariable leftElemVar ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.NamedLambdaVariable rightElemVar ()  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
}

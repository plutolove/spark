package org.apache.spark.sql.catalyst.expressions;
/**
 * Returns a named struct with generated names or using the names when available.
 * It should not be used for <code>struct</code> expressions or functions explicitly called
 * by users.
 */
// not preceding
public  class CreateStruct {
  // not preceding
  static public  org.apache.spark.sql.catalyst.expressions.CreateNamedStruct apply (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children)  { throw new RuntimeException(); }
  /**
   * Returns a named struct with a pretty SQL name. It will show the pretty SQL string
   * in its output column name as if <code>struct(...)</code> was called. Should be
   * used for <code>struct</code> expressions or functions explicitly called by users.
   * @param children (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.expressions.CreateNamedStruct create (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children)  { throw new RuntimeException(); }
  /**
   * Entry to use in the function registry.
   * @return (undocumented)
   */
  static public  scala.Tuple2<java.lang.String, scala.Tuple2<org.apache.spark.sql.catalyst.expressions.ExpressionInfo, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression>>> registryEntry ()  { throw new RuntimeException(); }
}
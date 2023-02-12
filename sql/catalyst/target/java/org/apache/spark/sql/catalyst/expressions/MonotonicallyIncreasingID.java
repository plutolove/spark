package org.apache.spark.sql.catalyst.expressions;
/**
 * Record ID within each partition. By being transient, count's value is reset to 0 every time
 * we serialize and deserialize and initialize it.
 */
public  class MonotonicallyIncreasingID extends org.apache.spark.sql.catalyst.expressions.LeafExpression implements org.apache.spark.sql.catalyst.expressions.Stateful, scala.Product, scala.Serializable {
  static public abstract  R apply ()  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public final  boolean deterministic ()  { throw new RuntimeException(); }
  // not preceding
  public   MonotonicallyIncreasingID ()  { throw new RuntimeException(); }
  // not preceding
  protected  void initializeInternal (int partitionIndex)  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  protected  long evalInternal (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  public  java.lang.String sql ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.MonotonicallyIncreasingID freshCopy ()  { throw new RuntimeException(); }
}

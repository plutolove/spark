package org.apache.spark.sql.catalyst.expressions;
/** Name of the class -- this has to be called after we verify children has at least two exprs. */
public  class CallMethodViaReflection extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.Nondeterministic, org.apache.spark.sql.catalyst.expressions.codegen.CodegenFallback, scala.Product, scala.Serializable {
  // not preceding
  static public  scala.collection.immutable.Map<org.apache.spark.sql.types.DataType, scala.collection.Seq<java.lang.Class<?>>> typeMapping ()  { throw new RuntimeException(); }
  /**
   * Finds a Java static method using reflection that matches the given argument types,
   * and whose return type is string.
   * <p>
   * The types sequence must be the valid types defined in {@link typeMapping}.
   * <p>
   * This is made public for unit testing.
   * @param className (undocumented)
   * @param methodName (undocumented)
   * @param argTypes (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<java.lang.reflect.Method> findMethod (java.lang.String className, java.lang.String methodName, scala.collection.Seq<org.apache.spark.sql.types.DataType> argTypes)  { throw new RuntimeException(); }
  // not preceding
  public final  boolean deterministic ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  // not preceding
  public   CallMethodViaReflection (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  protected  void initializeInternal (int partitionIndex)  { throw new RuntimeException(); }
  protected  Object evalInternal (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.reflect.Method method ()  { throw new RuntimeException(); }
}

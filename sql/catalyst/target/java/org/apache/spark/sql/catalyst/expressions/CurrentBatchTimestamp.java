package org.apache.spark.sql.catalyst.expressions;
/**
 * Need to return literal value in order to support compile time expression evaluation
 * e.g., select(current_date())
 */
public  class CurrentBatchTimestamp extends org.apache.spark.sql.catalyst.expressions.LeafExpression implements org.apache.spark.sql.catalyst.expressions.TimeZoneAwareExpression, org.apache.spark.sql.catalyst.expressions.Nondeterministic, org.apache.spark.sql.catalyst.expressions.codegen.CodegenFallback, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public final  boolean deterministic ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
  // not preceding
  public  java.time.ZoneId zoneId ()  { throw new RuntimeException(); }
  public  long timestampMs ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> timeZoneId ()  { throw new RuntimeException(); }
  // not preceding
  public   CurrentBatchTimestamp (long timestampMs, org.apache.spark.sql.types.DataType dataType, scala.Option<java.lang.String> timeZoneId)  { throw new RuntimeException(); }
  // not preceding
  public   CurrentBatchTimestamp (long timestampMs, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.TimeZoneAwareExpression withTimeZone (java.lang.String timeZoneId)  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  protected  void initializeInternal (int partitionIndex)  { throw new RuntimeException(); }
  /**
   * Need to return literal value in order to support compile time expression evaluation
   * e.g., select(current_date())
   * @param input (undocumented)
   * @return (undocumented)
   */
  protected  Object evalInternal (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Literal toLiteral ()  { throw new RuntimeException(); }
}

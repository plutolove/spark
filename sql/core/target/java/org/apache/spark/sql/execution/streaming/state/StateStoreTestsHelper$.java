package org.apache.spark.sql.execution.streaming.state;
/**
 * Get a specific version of data referred to by the given provider but not using
 * this provider
 */
// not preceding
public  class StateStoreTestsHelper$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StateStoreTestsHelper$ MODULE$ = null;
  public   StateStoreTestsHelper$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection strProj ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection intProj ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow stringToRow (java.lang.String s)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow intToRow (int i)  { throw new RuntimeException(); }
  public  java.lang.String rowToString (org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  { throw new RuntimeException(); }
  public  int rowToInt (org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.String, java.lang.Object> rowsToStringInt (org.apache.spark.sql.execution.streaming.state.UnsafeRowPair row)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<scala.Tuple2<java.lang.String, java.lang.Object>> rowsToSet (scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.UnsafeRowPair> iterator)  { throw new RuntimeException(); }
  public  void remove (org.apache.spark.sql.execution.streaming.state.StateStore store, scala.Function1<java.lang.String, java.lang.Object> condition)  { throw new RuntimeException(); }
  public  void put (org.apache.spark.sql.execution.streaming.state.StateStore store, java.lang.String key, int value)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> get (org.apache.spark.sql.execution.streaming.state.StateStore store, java.lang.String key)  { throw new RuntimeException(); }
  public  java.lang.String newDir ()  { throw new RuntimeException(); }
}

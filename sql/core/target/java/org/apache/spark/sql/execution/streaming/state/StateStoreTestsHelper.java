package org.apache.spark.sql.execution.streaming.state;
/**
 * Get a specific version of data referred to by the given provider but not using
 * this provider
 */
// not preceding
public  class StateStoreTestsHelper {
  // not preceding
  static public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection strProj ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection intProj ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.UnsafeRow stringToRow (java.lang.String s)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.UnsafeRow intToRow (int i)  { throw new RuntimeException(); }
  static public  java.lang.String rowToString (org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  { throw new RuntimeException(); }
  static public  int rowToInt (org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  { throw new RuntimeException(); }
  static public  scala.Tuple2<java.lang.String, java.lang.Object> rowsToStringInt (org.apache.spark.sql.execution.streaming.state.UnsafeRowPair row)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Set<scala.Tuple2<java.lang.String, java.lang.Object>> rowsToSet (scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.UnsafeRowPair> iterator)  { throw new RuntimeException(); }
  static public  void remove (org.apache.spark.sql.execution.streaming.state.StateStore store, scala.Function1<java.lang.String, java.lang.Object> condition)  { throw new RuntimeException(); }
  static public  void put (org.apache.spark.sql.execution.streaming.state.StateStore store, java.lang.String key, int value)  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.Object> get (org.apache.spark.sql.execution.streaming.state.StateStore store, java.lang.String key)  { throw new RuntimeException(); }
  static public  java.lang.String newDir ()  { throw new RuntimeException(); }
}

package org.apache.spark.sql.execution.streaming.state;
public  class MemoryStateStore implements org.apache.spark.sql.execution.streaming.state.StateStore {
  // not preceding
  public   MemoryStateStore ()  { throw new RuntimeException(); }
  public  void abort ()  { throw new RuntimeException(); }
  public  long commit ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow get (org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  { throw new RuntimeException(); }
  public  boolean hasCommitted ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.StateStoreId id ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.UnsafeRowPair> iterator ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.StateStoreMetrics metrics ()  { throw new RuntimeException(); }
  public  void put (org.apache.spark.sql.catalyst.expressions.UnsafeRow key, org.apache.spark.sql.catalyst.expressions.UnsafeRow newValue)  { throw new RuntimeException(); }
  public  void remove (org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  { throw new RuntimeException(); }
  public  long version ()  { throw new RuntimeException(); }
}

package org.apache.spark.sql.execution.streaming;
/**
 * A simple offset for sources that produce a single linear stream of data.
 */
public  class LongOffset extends org.apache.spark.sql.execution.streaming.Offset implements scala.Product, scala.Serializable {
  // not preceding
  static public  org.apache.spark.sql.execution.streaming.LongOffset apply (org.apache.spark.sql.execution.streaming.SerializedOffset offset)  { throw new RuntimeException(); }
  // not preceding
  public  long offset ()  { throw new RuntimeException(); }
  // not preceding
  public   LongOffset (long offset)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String json ()  { throw new RuntimeException(); }
}

package org.apache.spark.sql.catalyst.expressions;
public abstract class UnixTime extends org.apache.spark.sql.catalyst.expressions.ToTimestamp {
  // not preceding
  public   UnixTime ()  { throw new RuntimeException(); }
  // not preceding
  public  long downScaleFactor ()  { throw new RuntimeException(); }
}

package org.apache.spark.sql.streaming;
/** Creates test to check all the comparisons of offsets given a `one` that is less than `two`. */
public  class LongOffsetSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.streaming.OffsetSuite {
  // not preceding
  public   LongOffsetSuite ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.streaming.LongOffset one ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.LongOffset three ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.LongOffset two ()  { throw new RuntimeException(); }
}

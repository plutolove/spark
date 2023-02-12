package org.apache.spark.sql.hive.execution;
public  class TestPair implements org.apache.hadoop.io.Writable, scala.Serializable {
  // not preceding
  public   TestPair (int x, int y)  { throw new RuntimeException(); }
  // not preceding
  public   TestPair ()  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, java.lang.Object> entry ()  { throw new RuntimeException(); }
  public  void readFields (java.io.DataInput input)  { throw new RuntimeException(); }
  public  void write (java.io.DataOutput output)  { throw new RuntimeException(); }
}

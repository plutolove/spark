package org.apache.spark.rdd;
  class JdbcPartition implements org.apache.spark.Partition {
  // not preceding
  public   JdbcPartition (int idx, long lower, long upper)  { throw new RuntimeException(); }
  // not preceding
  public  int index ()  { throw new RuntimeException(); }
  // not preceding
  public  long lower ()  { throw new RuntimeException(); }
  public  long upper ()  { throw new RuntimeException(); }
}

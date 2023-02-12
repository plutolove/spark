package org.apache.spark.rdd;
public  class TestPartition implements org.apache.spark.Partition, scala.Serializable {
  // not preceding
  public   TestPartition (int i, int value)  { throw new RuntimeException(); }
  // not preceding
  public  int index ()  { throw new RuntimeException(); }
  public  int testValue ()  { throw new RuntimeException(); }
}

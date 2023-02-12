package org.apache.spark.sql.streaming;
public  interface StateStoreMetricsTest extends org.apache.spark.sql.streaming.StreamTest {
  public  scala.collection.Seq<java.lang.Object> arraySum (scala.collection.Seq<long[]> arraySeq, int arrayLength)  ;
  public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery assertNumStateRows (scala.collection.Seq<java.lang.Object> total, scala.collection.Seq<java.lang.Object> updated)  ;
  public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery assertNumStateRows (long total, long updated)  ;
  public  void beforeEach ()  ;
}

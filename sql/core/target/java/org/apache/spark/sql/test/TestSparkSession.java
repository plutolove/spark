package org.apache.spark.sql.test;
/**
 * A special <code>SparkSession</code> prepared for testing.
 */
  class TestSparkSession extends org.apache.spark.sql.SparkSession {
  // not preceding
  public   TestSparkSession (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  // not preceding
  public   TestSparkSession (org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
  public   TestSparkSession ()  { throw new RuntimeException(); }
  public  void loadTestData ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.internal.SessionState sessionState ()  { throw new RuntimeException(); }
}

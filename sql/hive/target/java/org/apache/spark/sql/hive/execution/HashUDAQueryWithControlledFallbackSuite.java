package org.apache.spark.sql.hive.execution;
public  class HashUDAQueryWithControlledFallbackSuite extends org.apache.spark.sql.hive.execution.UDAQuerySuite {
  // not preceding
  public   HashUDAQueryWithControlledFallbackSuite ()  { throw new RuntimeException(); }
  // not preceding
  protected  void checkAnswer (scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> actual, scala.collection.Seq<org.apache.spark.sql.Row> expectedAnswer)  { throw new RuntimeException(); }
  protected  void checkAnswer (scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> df, org.apache.spark.sql.Row expectedAnswer)  { throw new RuntimeException(); }
  protected  void checkAnswer (scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> df, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expectedAnswer)  { throw new RuntimeException(); }
}
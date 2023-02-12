package org.apache.spark.sql.hive;
public  class HiveContextCompatibilitySuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterEach {
  // not preceding
  public   HiveContextCompatibilitySuite ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  // not preceding
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
}

package org.apache.spark.sql;
/**
 * A shared SparkSession for all tests in this suite. Make sure you reset any changes to this
 * session as this is a singleton HiveSparkSession in HiveSessionStateSuite and it's shared
 * with all Hive test suites.
 */
public  class SessionStateSuite extends org.apache.spark.SparkFunSuite {
  // not preceding
  public   SessionStateSuite ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.SparkSession activeSession ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
}

package org.apache.spark.sql.hive;
/**
 * Creates a test that checks to see if the error thrown when analyzing a given query includes
 * the location of the given token in the query string.
 * <p>
 * param:  name the name of the test
 * param:  query the query to analyze
 * param:  token a unique token in the string that should be indicated by the exception
 */
public  class ErrorPositionSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.hive.test.TestHiveSingleton, org.scalatest.BeforeAndAfterEach {
  // not preceding
  public   ErrorPositionSuite ()  { throw new RuntimeException(); }
  protected  void afterEach ()  { throw new RuntimeException(); }
  // not preceding
  protected  void beforeEach ()  { throw new RuntimeException(); }
  // not preceding
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.hive.client.HiveClient hiveClient ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.hive.test.TestHiveContext hiveContext ()  { throw new RuntimeException(); }
  /**
   * Creates a test that checks to see if the error thrown when analyzing a given query includes
   * the location of the given token in the query string.
   * <p>
   * @param name the name of the test
   * @param query the query to analyze
   * @param token a unique token in the string that should be indicated by the exception
   */
  public  void positionTest (java.lang.String name, java.lang.String query, java.lang.String token)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
}

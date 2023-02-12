package org.apache.spark.sql;
/**
 * End-to-end suite testing statistics collection and use on both entire table and columns.
 */
public  class StatisticsCollectionSuite extends org.apache.spark.sql.StatisticsCollectionTestBase implements org.apache.spark.sql.test.SharedSparkSession {
  // not preceding
  public   StatisticsCollectionSuite ()  { throw new RuntimeException(); }
  // not preceding
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.String> getStatAttrNames (java.lang.String tableName)  { throw new RuntimeException(); }
}

package org.apache.spark.sql.hive.client;
/**
 * This test suite requires a clean JVM because it's testing the initialization of static codes in
 * <code>org.apache.hadoop.util.VersionInfo</code>.
 */
public  class HadoopVersionInfoSuite extends org.apache.spark.SparkFunSuite {
  // not preceding
  public   HadoopVersionInfoSuite ()  { throw new RuntimeException(); }
  // not preceding
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
}

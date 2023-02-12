package org.apache.spark.sql.hive;
/**
 * Set the staging directory (and hence path to ignore Parquet files under)
 * to the default value of hive.exec.stagingdir.
 */
public  class ParquetHiveCompatibilitySuite extends org.apache.spark.sql.execution.datasources.parquet.ParquetCompatibilityTest implements org.apache.spark.sql.hive.test.TestHiveSingleton {
  // not preceding
  public   ParquetHiveCompatibilitySuite ()  { throw new RuntimeException(); }
  // not preceding
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.hive.client.HiveClient hiveClient ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.hive.test.TestHiveContext hiveContext ()  { throw new RuntimeException(); }
  protected  void logParquetSchema (java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
}

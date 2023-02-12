package org.apache.spark.sql.hive;
/**
 * A suite to test the automatic conversion of metastore tables with parquet data to use the
 * built in parquet support.
 */
public  class HiveParquetMetastoreSuite extends org.apache.spark.sql.hive.ParquetPartitioningTest {
  // not preceding
  public   HiveParquetMetastoreSuite ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  // not preceding
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.HadoopFsRelation collectHadoopFsRelation (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
}

package org.apache.spark.sql.execution.datasources.parquet;
/**
 * this is part of test 'Enabling/disabling ignoreCorruptFiles' but run in a loop
 * to increase the chance of failure
 */
public  class ParquetV1QuerySuite extends org.apache.spark.sql.execution.datasources.parquet.ParquetQuerySuite {
  // not preceding
  public   ParquetV1QuerySuite ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
}

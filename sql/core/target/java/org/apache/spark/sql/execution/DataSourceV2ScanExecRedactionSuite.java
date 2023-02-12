package org.apache.spark.sql.execution;
/**
 * Suite that tests the redaction of BatchScanExec.
 */
public  class DataSourceV2ScanExecRedactionSuite extends org.apache.spark.sql.execution.DataSourceScanRedactionTest {
  // not preceding
  public   DataSourceV2ScanExecRedactionSuite ()  { throw new RuntimeException(); }
  protected  org.apache.hadoop.fs.Path getRootPath (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
}

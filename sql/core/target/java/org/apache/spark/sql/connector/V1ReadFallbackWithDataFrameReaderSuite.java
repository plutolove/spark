package org.apache.spark.sql.connector;
public  class V1ReadFallbackWithDataFrameReaderSuite extends org.apache.spark.sql.connector.V1ReadFallbackSuite {
  // not preceding
  public   V1ReadFallbackWithDataFrameReaderSuite ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> baseTableScan ()  { throw new RuntimeException(); }
}

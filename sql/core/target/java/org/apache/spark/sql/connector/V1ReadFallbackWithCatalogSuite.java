package org.apache.spark.sql.connector;
public  class V1ReadFallbackWithCatalogSuite extends org.apache.spark.sql.connector.V1ReadFallbackSuite {
  // not preceding
  public   V1ReadFallbackWithCatalogSuite ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> baseTableScan ()  { throw new RuntimeException(); }
  // not preceding
  public  void beforeAll ()  { throw new RuntimeException(); }
}

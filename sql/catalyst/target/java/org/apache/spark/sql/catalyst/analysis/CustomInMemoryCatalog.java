package org.apache.spark.sql.catalyst.analysis;
public  class CustomInMemoryCatalog extends org.apache.spark.sql.catalyst.catalog.InMemoryCatalog {
  // not preceding
  public   CustomInMemoryCatalog ()  { throw new RuntimeException(); }
  public  boolean functionExists (java.lang.String db, java.lang.String funcName)  { throw new RuntimeException(); }
  public  int getFunctionExistsCalledTimes ()  { throw new RuntimeException(); }
}

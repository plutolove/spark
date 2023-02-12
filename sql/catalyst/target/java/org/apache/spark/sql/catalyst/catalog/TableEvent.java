package org.apache.spark.sql.catalyst.catalog;
/**
 * Name of the table that was touched.
 */
public  interface TableEvent extends org.apache.spark.sql.catalyst.catalog.DatabaseEvent {
  // not preceding
  public  java.lang.String name ()  ;
}

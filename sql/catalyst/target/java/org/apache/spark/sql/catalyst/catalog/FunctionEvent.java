package org.apache.spark.sql.catalyst.catalog;
/**
 * Name of the function that was touched.
 */
public  interface FunctionEvent extends org.apache.spark.sql.catalyst.catalog.DatabaseEvent {
  // not preceding
  public  java.lang.String name ()  ;
}

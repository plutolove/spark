package org.apache.spark.sql.catalyst.catalog;
/**
 * Database of the object that was touched.
 */
public  interface DatabaseEvent extends org.apache.spark.sql.catalyst.catalog.ExternalCatalogEvent {
  // not preceding
  public  java.lang.String database ()  ;
}

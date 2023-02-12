package org.apache.spark.sql.catalyst.catalog;
/**
 * Listener interface for external catalog modification events.
 */
public  interface ExternalCatalogEventListener {
  // not preceding
  public  void onEvent (org.apache.spark.sql.catalyst.catalog.ExternalCatalogEvent event)  ;
}

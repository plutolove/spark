package org.apache.spark.sql.connector.catalog;
/**
 * If the V2_SESSION_CATALOG config is specified, we try to instantiate the user-specified v2
 * session catalog. Otherwise, return the default session catalog.
 * <p>
 * This catalog is a v2 catalog that delegates to the v1 session catalog. it is used when the
 * session catalog is responsible for an identifier, but the source requires the v2 catalog API.
 * This happens when the source implementation extends the v2 TableProvider API and is not listed
 * in the fallback configuration, spark.sql.sources.write.useV1SourceList
 */
// not preceding
public  class CatalogManager$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CatalogManager$ MODULE$ = null;
  public   CatalogManager$ ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String SESSION_CATALOG_NAME ()  { throw new RuntimeException(); }
}

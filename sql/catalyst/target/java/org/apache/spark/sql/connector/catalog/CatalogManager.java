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
  class CatalogManager implements org.apache.spark.internal.Logging {
  // not preceding
  static public  java.lang.String SESSION_CATALOG_NAME ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.SessionCatalog v1SessionCatalog ()  { throw new RuntimeException(); }
  // not preceding
  public   CatalogManager (org.apache.spark.sql.internal.SQLConf conf, org.apache.spark.sql.connector.catalog.CatalogPlugin defaultSessionCatalog, org.apache.spark.sql.catalyst.catalog.SessionCatalog v1SessionCatalog)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.CatalogPlugin catalog (java.lang.String name)  { throw new RuntimeException(); }
  public  boolean isCatalogRegistered (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * If the V2_SESSION_CATALOG config is specified, we try to instantiate the user-specified v2
   * session catalog. Otherwise, return the default session catalog.
   * <p>
   * This catalog is a v2 catalog that delegates to the v1 session catalog. it is used when the
   * session catalog is responsible for an identifier, but the source requires the v2 catalog API.
   * This happens when the source implementation extends the v2 TableProvider API and is not listed
   * in the fallback configuration, spark.sql.sources.write.useV1SourceList
   * @return (undocumented)
   */
    org.apache.spark.sql.connector.catalog.CatalogPlugin v2SessionCatalog ()  { throw new RuntimeException(); }
  public  java.lang.String[] currentNamespace ()  { throw new RuntimeException(); }
  public  void setCurrentNamespace (java.lang.String[] namespace)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.CatalogPlugin currentCatalog ()  { throw new RuntimeException(); }
  public  void setCurrentCatalog (java.lang.String catalogName)  { throw new RuntimeException(); }
    void reset ()  { throw new RuntimeException(); }
}

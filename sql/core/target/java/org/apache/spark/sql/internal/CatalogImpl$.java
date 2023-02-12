package org.apache.spark.sql.internal;
/**
 * Refreshes the cache entry and the associated metadata for all Dataset (if any), that contain
 * the given data source path. Path matching is by prefix, i.e. "/" would invalidate
 * everything that is cached.
 * <p>
 * @group cachemgmt
 * @since 2.0.0
 */
// not preceding
public  class CatalogImpl$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CatalogImpl$ MODULE$ = null;
  public   CatalogImpl$ ()  { throw new RuntimeException(); }
  // not preceding
  public <T extends org.apache.spark.sql.catalyst.DefinedByConstructorParams> org.apache.spark.sql.Dataset<T> makeDataset (scala.collection.Seq<T> data, org.apache.spark.sql.SparkSession sparkSession, scala.reflect.api.TypeTags.TypeTag<T> evidence$1)  { throw new RuntimeException(); }
}

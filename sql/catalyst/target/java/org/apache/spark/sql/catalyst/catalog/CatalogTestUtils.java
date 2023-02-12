package org.apache.spark.sql.catalyst.catalog;
/**
 * Creates a basic catalog, with the following structure:
 * <p>
 * default
 * db1
 * db2
 *   - tbl1
 *   - tbl2
 *     - part1
 *     - part2
 *   - func1
 * db3
 *   - view1
 */
public abstract class CatalogTestUtils {
  // not preceding
  public   CatalogTestUtils ()  { throw new RuntimeException(); }
  /**
   * Whether the catalog's table partitions equal the ones given.
   * Note: Hive sets some random serde things, so we just compare the specs here.
   * @param catalog (undocumented)
   * @param db (undocumented)
   * @param table (undocumented)
   * @param parts (undocumented)
   * @return (undocumented)
   */
  public  boolean catalogPartitionsEqual (org.apache.spark.sql.catalyst.catalog.ExternalCatalog catalog, java.lang.String db, java.lang.String table, scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogTablePartition> parts)  { throw new RuntimeException(); }
  public abstract  java.lang.String defaultProvider ()  ;
  // not preceding
  public  java.lang.String funcClass ()  { throw new RuntimeException(); }
  /**
   * Creates a basic catalog, with the following structure:
   * <p>
   * default
   * db1
   * db2
   *   - tbl1
   *   - tbl2
   *     - part1
   *     - part2
   *   - func1
   * db3
   *   - view1
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.catalog.ExternalCatalog newBasicCatalog ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogDatabase newDb (java.lang.String name)  { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.catalyst.catalog.ExternalCatalog newEmptyCatalog ()  ;
  public  org.apache.spark.sql.catalyst.catalog.CatalogFunction newFunc ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogFunction newFunc (java.lang.String name, scala.Option<java.lang.String> database)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String newFuncClass ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogTable newTable (java.lang.String name, java.lang.String db)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogTable newTable (java.lang.String name, scala.Option<java.lang.String> database)  { throw new RuntimeException(); }
  public  java.net.URI newUriForDatabase ()  { throw new RuntimeException(); }
  public  java.net.URI newUriForPartition (scala.collection.Seq<java.lang.String> parts)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogTable newView (java.lang.String db, java.lang.String name, scala.collection.immutable.Map<java.lang.String, java.lang.String> props)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.catalog.CatalogTablePartition part1 ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.catalog.CatalogTablePartition part2 ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.catalog.CatalogTablePartition part3 ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.catalog.CatalogTablePartition partWithEmptyValue ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.catalog.CatalogTablePartition partWithLessColumns ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.catalog.CatalogTablePartition partWithMixedOrder ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.catalog.CatalogTablePartition partWithMoreColumns ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.catalog.CatalogTablePartition partWithUnknownColumns ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat storageFormat ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  java.lang.String tableInputFormat ()  ;
  public abstract  java.lang.String tableOutputFormat ()  ;
}

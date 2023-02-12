package org.apache.spark.sql.catalyst.catalog;
/**
 * Creates a {@link CatalogColumnStat} object from the given map.
 * This is used to deserialize column stats from some external storage.
 * The serialization side is defined in {@link CatalogColumnStat.toMap}.
 */
public  class CatalogTableType implements scala.Product, scala.Serializable {
  // not preceding
  static public  org.apache.spark.sql.catalyst.catalog.CatalogTableType EXTERNAL ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.catalog.CatalogTableType MANAGED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.catalog.CatalogTableType VIEW ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.catalyst.catalog.CatalogTableType> tableTypes ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String name ()  { throw new RuntimeException(); }
}

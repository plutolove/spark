package org.apache.spark.sql.connector.catalog;
/**
 * The list of reserved table properties, which can not be removed or changed directly by
 * the syntax:
 * {{
 *   ALTER TABLE ... SET TBLPROPERTIES ...
 * }}
 * <p>
 * They need specific syntax to modify
 */
// not preceding
public  class CatalogV2Util {
  // not preceding
  static public  scala.collection.Seq<java.lang.String> TABLE_RESERVED_PROPERTIES ()  { throw new RuntimeException(); }
  /**
   * The list of reserved namespace properties, which can not be removed or changed directly by
   * the syntax:
   * {{
   *   ALTER NAMESPACE ... SET PROPERTIES ...
   * }}
   * <p>
   * They need specific syntax to modify
   * @return (undocumented)
   */
  static public  scala.collection.Seq<java.lang.String> NAMESPACE_RESERVED_PROPERTIES ()  { throw new RuntimeException(); }
  /**
   * Apply properties changes to a map and return the result.
   * @param properties (undocumented)
   * @param changes (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.String> applyNamespaceChanges (scala.collection.immutable.Map<java.lang.String, java.lang.String> properties, scala.collection.Seq<org.apache.spark.sql.connector.catalog.NamespaceChange> changes)  { throw new RuntimeException(); }
  /**
   * Apply properties changes to a Java map and return the result.
   * @param properties (undocumented)
   * @param changes (undocumented)
   * @return (undocumented)
   */
  static public  java.util.Map<java.lang.String, java.lang.String> applyNamespaceChanges (java.util.Map<java.lang.String, java.lang.String> properties, scala.collection.Seq<org.apache.spark.sql.connector.catalog.NamespaceChange> changes)  { throw new RuntimeException(); }
  /**
   * Apply properties changes to a map and return the result.
   * @param properties (undocumented)
   * @param changes (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.String> applyPropertiesChanges (scala.collection.immutable.Map<java.lang.String, java.lang.String> properties, scala.collection.Seq<org.apache.spark.sql.connector.catalog.TableChange> changes)  { throw new RuntimeException(); }
  /**
   * Apply properties changes to a Java map and return the result.
   * @param properties (undocumented)
   * @param changes (undocumented)
   * @return (undocumented)
   */
  static public  java.util.Map<java.lang.String, java.lang.String> applyPropertiesChanges (java.util.Map<java.lang.String, java.lang.String> properties, scala.collection.Seq<org.apache.spark.sql.connector.catalog.TableChange> changes)  { throw new RuntimeException(); }
  /**
   * Apply schema changes to a schema and return the result.
   * @param schema (undocumented)
   * @param changes (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.types.StructType applySchemaChanges (org.apache.spark.sql.types.StructType schema, scala.collection.Seq<org.apache.spark.sql.connector.catalog.TableChange> changes)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.connector.catalog.Table> loadTable (org.apache.spark.sql.connector.catalog.CatalogPlugin catalog, org.apache.spark.sql.connector.catalog.Identifier ident)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.catalyst.analysis.NamedRelation> loadRelation (org.apache.spark.sql.connector.catalog.CatalogPlugin catalog, org.apache.spark.sql.connector.catalog.Identifier ident)  { throw new RuntimeException(); }
  static public  boolean isSessionCatalog (org.apache.spark.sql.connector.catalog.CatalogPlugin catalog)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.String> convertTableProperties (scala.collection.immutable.Map<java.lang.String, java.lang.String> properties, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, scala.Option<java.lang.String> location, scala.Option<java.lang.String> comment, scala.Option<java.lang.String> provider)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.String> withDefaultOwnership (scala.collection.immutable.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.logical.AlterTable createAlterTable (scala.collection.Seq<java.lang.String> originalNameParts, org.apache.spark.sql.connector.catalog.CatalogPlugin catalog, scala.collection.Seq<java.lang.String> tableName, scala.collection.Seq<org.apache.spark.sql.connector.catalog.TableChange> changes)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.connector.catalog.TableCatalog getTableProviderCatalog (org.apache.spark.sql.connector.catalog.SupportsCatalogOptions provider, org.apache.spark.sql.connector.catalog.CatalogManager catalogManager, org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  static public  void failCharType (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  static public  void assertNoCharTypeInSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
}
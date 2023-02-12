package org.apache.spark.sql.catalyst.catalog;
/**
 * schema of this table's partition columns
 */
public  class CatalogTable implements scala.Product, scala.Serializable {
  /** Readable string representation for the CatalogTable. */
  static public  java.lang.String VIEW_PREFIX ()  { throw new RuntimeException(); }
  static public  java.lang.String VIEW_DEFAULT_DATABASE ()  { throw new RuntimeException(); }
  static public  java.lang.String VIEW_CATALOG_AND_NAMESPACE ()  { throw new RuntimeException(); }
  static public  java.lang.String VIEW_CATALOG_AND_NAMESPACE_PART_PREFIX ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.String> catalogAndNamespaceToProps (java.lang.String currentCatalog, scala.collection.Seq<java.lang.String> currentNamespace)  { throw new RuntimeException(); }
  static public  java.lang.String VIEW_QUERY_OUTPUT_PREFIX ()  { throw new RuntimeException(); }
  static public  java.lang.String VIEW_QUERY_OUTPUT_NUM_COLUMNS ()  { throw new RuntimeException(); }
  static public  java.lang.String VIEW_QUERY_OUTPUT_COLUMN_NAME_PREFIX ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.catalog.CatalogTable normalize (org.apache.spark.sql.catalyst.catalog.CatalogTable table)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.TableIdentifier identifier ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogTableType tableType ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat storage ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> provider ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> partitionColumnNames ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.catalog.BucketSpec> bucketSpec ()  { throw new RuntimeException(); }
  public  java.lang.String owner ()  { throw new RuntimeException(); }
  public  long createTime ()  { throw new RuntimeException(); }
  public  long lastAccessTime ()  { throw new RuntimeException(); }
  public  java.lang.String createVersion ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> properties ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.catalog.CatalogStatistics> stats ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> viewText ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> comment ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> unsupportedFeatures ()  { throw new RuntimeException(); }
  public  boolean tracksPartitionsInCatalog ()  { throw new RuntimeException(); }
  public  boolean schemaPreservesCase ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> ignoredProperties ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> viewOriginalText ()  { throw new RuntimeException(); }
  // not preceding
  public   CatalogTable (org.apache.spark.sql.catalyst.TableIdentifier identifier, org.apache.spark.sql.catalyst.catalog.CatalogTableType tableType, org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat storage, org.apache.spark.sql.types.StructType schema, scala.Option<java.lang.String> provider, scala.collection.Seq<java.lang.String> partitionColumnNames, scala.Option<org.apache.spark.sql.catalyst.catalog.BucketSpec> bucketSpec, java.lang.String owner, long createTime, long lastAccessTime, java.lang.String createVersion, scala.collection.immutable.Map<java.lang.String, java.lang.String> properties, scala.Option<org.apache.spark.sql.catalyst.catalog.CatalogStatistics> stats, scala.Option<java.lang.String> viewText, scala.Option<java.lang.String> comment, scala.collection.Seq<java.lang.String> unsupportedFeatures, boolean tracksPartitionsInCatalog, boolean schemaPreservesCase, scala.collection.immutable.Map<java.lang.String, java.lang.String> ignoredProperties, scala.Option<java.lang.String> viewOriginalText)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.types.StructType partitionSchema ()  { throw new RuntimeException(); }
  /**
   * schema of this table's data columns
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType dataSchema ()  { throw new RuntimeException(); }
  /** Return the database this table was specified to belong to, assuming it exists. */
  public  java.lang.String database ()  { throw new RuntimeException(); }
  /** Return the table location, assuming it is specified. */
  public  java.net.URI location ()  { throw new RuntimeException(); }
  /** Return the fully qualified name of this table, assuming the database was specified. */
  public  java.lang.String qualifiedName ()  { throw new RuntimeException(); }
  /**
   * Return the current catalog and namespace (concatenated as a Seq[String]) of when the view was
   * created.
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> viewCatalogAndNamespace ()  { throw new RuntimeException(); }
  /**
   * Return the output column names of the query that creates a view, the column names are used to
   * resolve a view, should be empty if the CatalogTable is not a View or created by older versions
   * of Spark(before 2.2.0).
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> viewQueryColumnNames ()  { throw new RuntimeException(); }
  /** Syntactic sugar to update a field in `storage`. */
  public  org.apache.spark.sql.catalyst.catalog.CatalogTable withNewStorage (scala.Option<java.net.URI> locationUri, scala.Option<java.lang.String> inputFormat, scala.Option<java.lang.String> outputFormat, boolean compressed, scala.Option<java.lang.String> serde, scala.collection.immutable.Map<java.lang.String, java.lang.String> properties)  { throw new RuntimeException(); }
  public  scala.collection.mutable.LinkedHashMap<java.lang.String, java.lang.String> toLinkedHashMap ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /** Readable string representation for the CatalogTable. */
  public  java.lang.String simpleString ()  { throw new RuntimeException(); }
}

package org.apache.spark.sql.execution.datasources.v2;
/**
 * A logical plan representing a data source v2 table.
 * <p>
 * param:  table   The table that this relation represents.
 * param:  output the output attributes of this relation.
 * param:  catalog catalogPlugin for the table. None if no catalog is specified.
 * param:  identifier the identifier for the table. None if no identifier is defined.
 * param:  options The options for this table operation. It's used to create fresh {@link ScanBuilder}
 *                and {@link WriteBuilder}.
 */
public  class DataSourceV2Relation extends org.apache.spark.sql.catalyst.plans.logical.LeafNode implements org.apache.spark.sql.catalyst.analysis.MultiInstanceRelation, org.apache.spark.sql.catalyst.analysis.NamedRelation, scala.Product, scala.Serializable {
  // not preceding
  static public  org.apache.spark.sql.execution.datasources.v2.DataSourceV2Relation create (org.apache.spark.sql.connector.catalog.Table table, scala.Option<org.apache.spark.sql.connector.catalog.CatalogPlugin> catalog, scala.Option<org.apache.spark.sql.connector.catalog.Identifier> identifier, org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.datasources.v2.DataSourceV2Relation create (org.apache.spark.sql.connector.catalog.Table table, scala.Option<org.apache.spark.sql.connector.catalog.CatalogPlugin> catalog, scala.Option<org.apache.spark.sql.connector.catalog.Identifier> identifier)  { throw new RuntimeException(); }
  /**
   * This is used to transform data source v2 statistics to logical.Statistics.
   * @param v2Statistics (undocumented)
   * @param defaultRowCount (undocumented)
   * @param defaultSizeInBytes (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.plans.logical.Statistics transformV2Stats (org.apache.spark.sql.connector.read.Statistics v2Statistics, scala.Option<scala.math.BigInt> defaultRowCount, long defaultSizeInBytes)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.catalog.Table table ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> output ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.connector.catalog.CatalogPlugin> catalog ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.connector.catalog.Identifier> identifier ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.util.CaseInsensitiveStringMap options ()  { throw new RuntimeException(); }
  // not preceding
  public   DataSourceV2Relation (org.apache.spark.sql.connector.catalog.Table table, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> output, scala.Option<org.apache.spark.sql.connector.catalog.CatalogPlugin> catalog, scala.Option<org.apache.spark.sql.connector.catalog.Identifier> identifier, org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  boolean skipSchemaResolution ()  { throw new RuntimeException(); }
  public  java.lang.String simpleString (int maxFields)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.Statistics computeStats ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.v2.DataSourceV2Relation newInstance ()  { throw new RuntimeException(); }
}

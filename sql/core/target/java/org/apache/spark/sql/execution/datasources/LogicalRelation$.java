package org.apache.spark.sql.execution.datasources;
/**
 * Returns a new instance of this LogicalRelation. According to the semantics of
 * MultiInstanceRelation, this method returns a copy of this object with
 * unique expression ids. We respect the <code>expectedOutputAttributes</code> and create
 * new instances of attributes in it.
 */
// not preceding
public  class LogicalRelation$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LogicalRelation$ MODULE$ = null;
  public   LogicalRelation$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.datasources.LogicalRelation apply (org.apache.spark.sql.sources.BaseRelation relation, boolean isStreaming)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.LogicalRelation apply (org.apache.spark.sql.sources.BaseRelation relation, org.apache.spark.sql.catalyst.catalog.CatalogTable table)  { throw new RuntimeException(); }
}

package org.apache.spark.sql.execution.columnar;
// not preceding
public  class InMemoryRelation$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final InMemoryRelation$ MODULE$ = null;
  public   InMemoryRelation$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.columnar.InMemoryRelation apply (boolean useCompression, int batchSize, org.apache.spark.storage.StorageLevel storageLevel, org.apache.spark.sql.execution.SparkPlan child, scala.Option<java.lang.String> tableName, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan optimizedPlan)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.columnar.InMemoryRelation apply (org.apache.spark.sql.execution.columnar.CachedRDDBuilder cacheBuilder, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan optimizedPlan)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.columnar.InMemoryRelation apply (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, org.apache.spark.sql.execution.columnar.CachedRDDBuilder cacheBuilder, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> outputOrdering, org.apache.spark.sql.catalyst.plans.logical.Statistics statsOfPlanToCache)  { throw new RuntimeException(); }
}

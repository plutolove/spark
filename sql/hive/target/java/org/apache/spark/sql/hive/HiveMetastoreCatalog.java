package org.apache.spark.sql.hive;
/** These locks guard against multiple attempts to instantiate a table, which wastes memory. */
  class HiveMetastoreCatalog implements org.apache.spark.internal.Logging {
  // not preceding
  static public  org.apache.spark.sql.types.StructType mergeWithMetastoreSchema (org.apache.spark.sql.types.StructType metastoreSchema, org.apache.spark.sql.types.StructType inferredSchema)  { throw new RuntimeException(); }
  // not preceding
  public   HiveMetastoreCatalog (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
    org.apache.spark.sql.catalyst.plans.logical.LogicalPlan getCachedDataSourceTable (org.apache.spark.sql.catalyst.TableIdentifier table)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.LogicalRelation convert (org.apache.spark.sql.catalyst.catalog.HiveTableRelation relation)  { throw new RuntimeException(); }
}

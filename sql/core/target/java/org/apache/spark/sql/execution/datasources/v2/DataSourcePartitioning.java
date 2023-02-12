package org.apache.spark.sql.execution.datasources.v2;
/**
 * An adapter from public data source partitioning to catalyst internal <code>Partitioning</code>.
 */
public  class DataSourcePartitioning implements org.apache.spark.sql.catalyst.plans.physical.Partitioning {
  // not preceding
  public   DataSourcePartitioning (org.apache.spark.sql.connector.read.partitioning.Partitioning partitioning, org.apache.spark.sql.catalyst.expressions.AttributeMap<java.lang.String> colNames)  { throw new RuntimeException(); }
  // not preceding
  public  int numPartitions ()  { throw new RuntimeException(); }
  public  boolean satisfies0 (org.apache.spark.sql.catalyst.plans.physical.Distribution required)  { throw new RuntimeException(); }
}

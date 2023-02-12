package org.apache.spark.sql.connector;
public  class InMemoryV1Provider implements org.apache.spark.sql.internal.connector.SimpleTableProvider, org.apache.spark.sql.sources.DataSourceRegister, org.apache.spark.sql.sources.CreatableRelationProvider {
  // not preceding
  static public  scala.collection.mutable.Map<java.lang.String, org.apache.spark.sql.connector.InMemoryTableWithV1Fallback> tables ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getTableData (org.apache.spark.sql.SparkSession spark, java.lang.String name)  { throw new RuntimeException(); }
  static public  void clear ()  { throw new RuntimeException(); }
  // not preceding
  public   InMemoryV1Provider ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.catalog.Table getTable (org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  public  java.lang.String shortName ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.BaseRelation createRelation (org.apache.spark.sql.SQLContext sqlContext, org.apache.spark.sql.SaveMode mode, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data)  { throw new RuntimeException(); }
}

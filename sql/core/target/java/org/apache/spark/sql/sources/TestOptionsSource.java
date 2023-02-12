package org.apache.spark.sql.sources;
public  class TestOptionsSource implements org.apache.spark.sql.sources.SchemaRelationProvider, org.apache.spark.sql.sources.CreatableRelationProvider {
  // not preceding
  public   TestOptionsSource ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.sources.BaseRelation createRelation (org.apache.spark.sql.SQLContext sqlContext, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.BaseRelation createRelation (org.apache.spark.sql.SQLContext sqlContext, org.apache.spark.sql.SaveMode mode, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data)  { throw new RuntimeException(); }
}

package org.apache.spark.sql.sources;
public  class FakeSourceOne implements org.apache.spark.sql.sources.RelationProvider, org.apache.spark.sql.sources.DataSourceRegister {
  // not preceding
  public   FakeSourceOne ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.sources.BaseRelation createRelation (org.apache.spark.sql.SQLContext cont, scala.collection.immutable.Map<java.lang.String, java.lang.String> param)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String shortName ()  { throw new RuntimeException(); }
}

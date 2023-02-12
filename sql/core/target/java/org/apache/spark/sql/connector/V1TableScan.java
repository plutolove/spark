package org.apache.spark.sql.connector;
public  class V1TableScan extends org.apache.spark.sql.sources.BaseRelation implements org.apache.spark.sql.sources.TableScan {
  // not preceding
  public   V1TableScan (org.apache.spark.sql.SQLContext context, org.apache.spark.sql.types.StructType requiredSchema, org.apache.spark.sql.sources.Filter[] filters)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.Row> buildScan ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SQLContext sqlContext ()  { throw new RuntimeException(); }
}

package org.apache.spark.sql.sources;
public  class SimpleInsert extends org.apache.spark.sql.sources.BaseRelation implements org.apache.spark.sql.sources.InsertableRelation, scala.Product, scala.Serializable {
  // not preceding
  public  org.apache.spark.sql.types.StructType userSpecifiedSchema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  // not preceding
  public   SimpleInsert (org.apache.spark.sql.types.StructType userSpecifiedSchema, org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SQLContext sqlContext ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  public  void insert (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> input, boolean overwrite)  { throw new RuntimeException(); }
}

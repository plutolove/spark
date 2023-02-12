package org.apache.spark.sql;
public  interface TPCDSBase extends org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.TPCDSSchema {
  public  void afterAll ()  ;
  public  void beforeAll ()  ;
  public  void createTable (org.apache.spark.sql.SparkSession spark, java.lang.String tableName, java.lang.String format, scala.collection.Seq<java.lang.String> options)  ;
  public  scala.collection.Seq<java.lang.String> modifiedTPCDSQueries ()  ;
  public  scala.collection.Iterable<java.lang.String> tableNames ()  ;
  public  scala.collection.Seq<java.lang.String> tpcdsQueries ()  ;
  public  scala.collection.Seq<java.lang.String> tpcdsQueriesV2_7_0 ()  ;
}

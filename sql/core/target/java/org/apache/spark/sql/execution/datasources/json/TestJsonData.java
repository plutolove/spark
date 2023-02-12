package org.apache.spark.sql.execution.datasources.json;
public  interface TestJsonData {
  public  org.apache.spark.sql.Dataset<java.lang.String> additionalCorruptRecords ()  ;
  public  org.apache.spark.sql.Dataset<java.lang.String> arrayAndStructRecords ()  ;
  public  org.apache.spark.sql.Dataset<java.lang.String> arrayElementTypeConflict ()  ;
  public  org.apache.spark.sql.Dataset<java.lang.String> bigIntegerRecords ()  ;
  public  org.apache.spark.sql.Dataset<java.lang.String> complexFieldAndType1 ()  ;
  public  org.apache.spark.sql.Dataset<java.lang.String> complexFieldAndType2 ()  ;
  public  org.apache.spark.sql.Dataset<java.lang.String> complexFieldValueTypeConflict ()  ;
  public  org.apache.spark.sql.Dataset<java.lang.String> corruptRecords ()  ;
  public  org.apache.spark.sql.Dataset<java.lang.String> datesRecords ()  ;
  public  org.apache.spark.sql.Dataset<java.lang.String> empty ()  ;
  public  org.apache.spark.sql.Dataset<java.lang.String> emptyRecords ()  ;
  public  org.apache.spark.sql.Dataset<java.lang.String> floatingValueRecords ()  ;
  public  org.apache.spark.sql.Dataset<java.lang.String> jsonArray ()  ;
  public  org.apache.spark.sql.Dataset<java.lang.String> jsonNullStruct ()  ;
  public  org.apache.spark.sql.Dataset<java.lang.String> mapType1 ()  ;
  public  org.apache.spark.sql.Dataset<java.lang.String> mapType2 ()  ;
  public  org.apache.spark.sql.Dataset<java.lang.String> missingFields ()  ;
  public  org.apache.spark.sql.Dataset<java.lang.String> nullsInArrays ()  ;
  public  org.apache.spark.sql.Dataset<java.lang.String> primitiveFieldAndType ()  ;
  public  org.apache.spark.sql.Dataset<java.lang.String> primitiveFieldValueTypeConflict ()  ;
  public  org.apache.spark.sql.Dataset<java.lang.String> sampledTestData ()  ;
  public  org.apache.spark.sql.Dataset<java.lang.String> singleRow ()  ;
  public  org.apache.spark.sql.SparkSession spark ()  ;
  public  org.apache.spark.sql.Dataset<java.lang.String> timestampAsLong ()  ;
}

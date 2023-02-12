package org.apache.spark.sql.execution.datasources.csv;
/** Verifies data and schema. */
public  class CSVv1Suite extends org.apache.spark.sql.execution.datasources.csv.CSVSuite {
  // not preceding
  public   CSVv1Suite ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
}

package org.apache.spark.sql;
public  interface FileScanSuiteBase extends org.apache.spark.sql.test.SharedSparkSession {
  public  org.apache.spark.sql.execution.datasources.PartitioningAwareFileIndex newPartitioningAwareFileIndex ()  ;
  public  void run (scala.collection.Seq<scala.Tuple3<java.lang.String, scala.Function9<org.apache.spark.sql.SparkSession, org.apache.spark.sql.execution.datasources.PartitioningAwareFileIndex, org.apache.spark.sql.types.StructType, org.apache.spark.sql.types.StructType, org.apache.spark.sql.types.StructType, org.apache.spark.sql.sources.Filter[], org.apache.spark.sql.util.CaseInsensitiveStringMap, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.execution.datasources.v2.FileScan>, scala.collection.Seq<java.lang.String>>> scanBuilders)  ;
}

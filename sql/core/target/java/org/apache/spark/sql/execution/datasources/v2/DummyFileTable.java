package org.apache.spark.sql.execution.datasources.v2;
public  class DummyFileTable extends org.apache.spark.sql.execution.datasources.v2.FileTable {
  // not preceding
  public   DummyFileTable (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.util.CaseInsensitiveStringMap options, scala.collection.Seq<java.lang.String> paths, org.apache.spark.sql.types.StructType expectedDataSchema, scala.Option<org.apache.spark.sql.types.StructType> userSpecifiedSchema)  { throw new RuntimeException(); }
  public  java.lang.Class<? extends org.apache.spark.sql.execution.datasources.FileFormat> fallbackFileFormat ()  { throw new RuntimeException(); }
  public  java.lang.String formatName ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<org.apache.spark.sql.types.StructType> inferSchema (scala.collection.Seq<org.apache.hadoop.fs.FileStatus> files)  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.ScanBuilder newScanBuilder (org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.write.WriteBuilder newWriteBuilder (org.apache.spark.sql.connector.write.LogicalWriteInfo info)  { throw new RuntimeException(); }
  public  boolean supportsDataType (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
}

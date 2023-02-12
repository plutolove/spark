package org.apache.spark.sql.v2.avro;
public  class AvroWriteBuilder extends org.apache.spark.sql.execution.datasources.v2.FileWriteBuilder {
  // not preceding
  public   AvroWriteBuilder (scala.collection.Seq<java.lang.String> paths, java.lang.String formatName, scala.Function1<org.apache.spark.sql.types.DataType, java.lang.Object> supportsDataType, org.apache.spark.sql.connector.write.LogicalWriteInfo info)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.datasources.OutputWriterFactory prepareWrite (org.apache.spark.sql.internal.SQLConf sqlConf, org.apache.hadoop.mapreduce.Job job, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, org.apache.spark.sql.types.StructType dataSchema)  { throw new RuntimeException(); }
}

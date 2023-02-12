package org.apache.spark.sql.avro;
/**
 * Overrides the couple of methods responsible for generating the output streams / files so
 * that the data can be correctly partitioned
 */
  class AvroOutputWriter extends org.apache.spark.sql.execution.datasources.OutputWriter {
  // not preceding
  public   AvroOutputWriter (java.lang.String path, org.apache.hadoop.mapreduce.TaskAttemptContext context, org.apache.spark.sql.types.StructType schema, org.apache.avro.Schema avroSchema)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  void write (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
}

package org.apache.spark.input;
/**
 * Reads the record in directly as a stream for other objects to manipulate and handle
 */
  class StreamRecordReader extends org.apache.spark.input.StreamBasedRecordReader<org.apache.spark.input.PortableDataStream> {
  // not preceding
  public   StreamRecordReader (org.apache.hadoop.mapreduce.lib.input.CombineFileSplit split, org.apache.hadoop.mapreduce.TaskAttemptContext context, java.lang.Integer index)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.input.PortableDataStream parseStream (org.apache.spark.input.PortableDataStream inStream)  { throw new RuntimeException(); }
}

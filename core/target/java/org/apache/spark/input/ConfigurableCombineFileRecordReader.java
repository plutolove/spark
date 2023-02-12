package org.apache.spark.input;
/**
 * A {@link org.apache.hadoop.mapreduce.lib.input.CombineFileRecordReader CombineFileRecordReader}
 * that can pass Hadoop Configuration to {@link org.apache.hadoop.conf.Configurable Configurable}
 * RecordReaders.
 */
  class ConfigurableCombineFileRecordReader<K extends java.lang.Object, V extends java.lang.Object> extends org.apache.hadoop.mapreduce.lib.input.CombineFileRecordReader<K, V> implements org.apache.spark.input.Configurable {
  // not preceding
  public   ConfigurableCombineFileRecordReader (org.apache.hadoop.mapreduce.InputSplit split, org.apache.hadoop.mapreduce.TaskAttemptContext context, java.lang.Class<? extends org.apache.hadoop.mapreduce.RecordReader<K, V>> recordReaderClass)  { throw new RuntimeException(); }
  // not preceding
  public  boolean initNextRecordReader ()  { throw new RuntimeException(); }
  public  void setConf (org.apache.hadoop.conf.Configuration c)  { throw new RuntimeException(); }
}

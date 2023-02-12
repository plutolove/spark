package org.apache.spark.sql.hive.execution;
/**
 * Since SPARK-30201 ObjectInspectorCopyOption.JAVA change to ObjectInspectorCopyOption.DEFAULT.
 * The reason is DEFAULT option can convert <code>UTF8String</code> to <code>Text</code> with bytes and
 * we can compatible with non UTF-8 code bytes during write.
 */
public  class HiveOutputWriter extends org.apache.spark.sql.execution.datasources.OutputWriter implements org.apache.spark.sql.hive.HiveInspectors {
  // not preceding
  public   HiveOutputWriter (java.lang.String path, org.apache.spark.sql.hive.HiveShim.ShimFileSinkDesc fileSinkConf, org.apache.hadoop.mapred.JobConf jobConf, org.apache.spark.sql.types.StructType dataSchema)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  void write (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
}

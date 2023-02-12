package org.apache.spark.sql.hive.execution;
/** Contains the exception thrown while writing the parent iterator to the external process. */
public  class ScriptTransformationWriterThread extends java.lang.Thread implements org.apache.spark.sql.hive.HiveInspectors, org.apache.spark.internal.Logging {
  // not preceding
  public   ScriptTransformationWriterThread (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> iter, scala.collection.Seq<org.apache.spark.sql.types.DataType> inputSchema, org.apache.hadoop.hive.serde2.AbstractSerDe inputSerde, org.apache.hadoop.hive.serde2.objectinspector.StructObjectInspector inputSoi, org.apache.spark.sql.hive.execution.HiveScriptIOSchema ioschema, java.io.OutputStream outputStream, java.lang.Process proc, org.apache.spark.util.CircularBuffer stderrBuffer, org.apache.spark.TaskContext taskContext, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  /** Contains the exception thrown while writing the parent iterator to the external process. */
  public  scala.Option<java.lang.Throwable> exception ()  { throw new RuntimeException(); }
  public  void run ()  { throw new RuntimeException(); }
}

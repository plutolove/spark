package org.apache.spark.sql.execution.python;
public  class PythonForeachWriter extends org.apache.spark.sql.ForeachWriter<org.apache.spark.sql.catalyst.expressions.UnsafeRow> {
  // not preceding
  static public  class UnsafeRowBuffer implements org.apache.spark.internal.Logging {
    // not preceding
    public   UnsafeRowBuffer (org.apache.spark.memory.TaskMemoryManager taskMemoryManager, java.io.File tempDir, int numFields)  { throw new RuntimeException(); }
    public  void add (org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  { throw new RuntimeException(); }
    public  void allRowsAdded ()  { throw new RuntimeException(); }
    public  void close ()  { throw new RuntimeException(); }
    public  org.apache.spark.util.NextIterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> iterator ()  { throw new RuntimeException(); }
  }
  // not preceding
  public   PythonForeachWriter (org.apache.spark.api.python.PythonFunction func, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  boolean open (long partitionId, long version)  { throw new RuntimeException(); }
  public  void process (org.apache.spark.sql.catalyst.expressions.UnsafeRow value)  { throw new RuntimeException(); }
  public  void close (java.lang.Throwable errorOrNull)  { throw new RuntimeException(); }
}

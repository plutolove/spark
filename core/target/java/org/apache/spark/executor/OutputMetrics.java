package org.apache.spark.executor;
/**
 * Total number of bytes written.
 */
public  class OutputMetrics implements scala.Serializable {
  // not preceding
     OutputMetrics ()  { throw new RuntimeException(); }
  // not preceding
    org.apache.spark.util.LongAccumulator _bytesWritten ()  { throw new RuntimeException(); }
    org.apache.spark.util.LongAccumulator _recordsWritten ()  { throw new RuntimeException(); }
  /**
   * Total number of bytes written.
   * @return (undocumented)
   */
  public  long bytesWritten ()  { throw new RuntimeException(); }
  /**
   * Total number of records written.
   * @return (undocumented)
   */
  public  long recordsWritten ()  { throw new RuntimeException(); }
    void setBytesWritten (long v)  { throw new RuntimeException(); }
    void setRecordsWritten (long v)  { throw new RuntimeException(); }
}

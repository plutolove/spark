package org.apache.spark.executor;
/**
 * Total number of bytes read.
 */
public  class InputMetrics implements scala.Serializable {
  // not preceding
     InputMetrics ()  { throw new RuntimeException(); }
  // not preceding
    org.apache.spark.util.LongAccumulator _bytesRead ()  { throw new RuntimeException(); }
    org.apache.spark.util.LongAccumulator _recordsRead ()  { throw new RuntimeException(); }
  /**
   * Total number of bytes read.
   * @return (undocumented)
   */
  public  long bytesRead ()  { throw new RuntimeException(); }
    void incBytesRead (long v)  { throw new RuntimeException(); }
    void incRecordsRead (long v)  { throw new RuntimeException(); }
  /**
   * Total number of records read.
   * @return (undocumented)
   */
  public  long recordsRead ()  { throw new RuntimeException(); }
    void setBytesRead (long v)  { throw new RuntimeException(); }
}

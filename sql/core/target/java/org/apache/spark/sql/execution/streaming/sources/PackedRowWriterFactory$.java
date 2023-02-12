package org.apache.spark.sql.execution.streaming.sources;
/**
 * A simple {@link DataWriterFactory} whose tasks just pack rows into the commit message for delivery
 * to a {@link BatchWrite} on the driver.
 * <p>
 * Note that, because it sends all rows to the driver, this factory will generally be unsuitable
 * for production-quality sinks. It's intended for use in tests.
 */
// not preceding
public  class PackedRowWriterFactory$ implements org.apache.spark.sql.connector.write.streaming.StreamingDataWriterFactory, scala.Product, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PackedRowWriterFactory$ MODULE$ = null;
  public   PackedRowWriterFactory$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.write.DataWriter<org.apache.spark.sql.catalyst.InternalRow> createWriter (int partitionId, long taskId, long epochId)  { throw new RuntimeException(); }
}

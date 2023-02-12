package org.apache.spark.sql.execution.streaming;
/**
 * Unpacks an offset into {@link StreamProgress} by associating each offset with the ordered list of
 * sources.
 * <p>
 * This method is typically used to associate a serialized offset with actual sources (which
 * cannot be serialized).
 */
public  class OffsetSeq implements scala.Product, scala.Serializable {
  /**
   * Returns a {@link OffsetSeq} with a variable sequence of offsets.
   * <code>nulls</code> in the sequence are converted to <code>None</code>s.
   * @param offsets (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.execution.streaming.OffsetSeq fill (scala.collection.Seq<org.apache.spark.sql.connector.read.streaming.Offset> offsets)  { throw new RuntimeException(); }
  /**
   * Returns a {@link OffsetSeq} with metadata and a variable sequence of offsets.
   * <code>nulls</code> in the sequence are converted to <code>None</code>s.
   * @param metadata (undocumented)
   * @param offsets (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.execution.streaming.OffsetSeq fill (scala.Option<java.lang.String> metadata, scala.collection.Seq<org.apache.spark.sql.connector.read.streaming.Offset> offsets)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<scala.Option<org.apache.spark.sql.connector.read.streaming.Offset>> offsets ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.execution.streaming.OffsetSeqMetadata> metadata ()  { throw new RuntimeException(); }
  // not preceding
  public   OffsetSeq (scala.collection.Seq<scala.Option<org.apache.spark.sql.connector.read.streaming.Offset>> offsets, scala.Option<org.apache.spark.sql.execution.streaming.OffsetSeqMetadata> metadata)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.streaming.StreamProgress toStreamProgress (scala.collection.Seq<org.apache.spark.sql.connector.read.streaming.SparkDataStream> sources)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}

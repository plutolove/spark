package org.apache.spark.shuffle;
/**
 * Notify the writer that a record worth of bytes has been written with OutputStream#write.
 */
  class ShufflePartitionPairsWriter implements org.apache.spark.util.collection.PairsWriter, java.io.Closeable {
  // not preceding
  public   ShufflePartitionPairsWriter (org.apache.spark.shuffle.api.ShufflePartitionWriter partitionWriter, org.apache.spark.serializer.SerializerManager serializerManager, org.apache.spark.serializer.SerializerInstance serializerInstance, org.apache.spark.storage.BlockId blockId, org.apache.spark.shuffle.ShuffleWriteMetricsReporter writeMetrics)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  void write (Object key, Object value)  { throw new RuntimeException(); }
}

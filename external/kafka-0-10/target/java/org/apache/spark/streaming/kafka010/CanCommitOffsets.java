package org.apache.spark.streaming.kafka010;
/**
 * Queue up offset ranges for commit to Kafka at a future time.  Threadsafe.
 * This is only needed if you intend to store offsets in Kafka, instead of your own store.
 * param:  offsetRanges The maximum untilOffset for a given partition will be used at commit.
 */
public  interface CanCommitOffsets {
  // not preceding
  public  void commitAsync (org.apache.spark.streaming.kafka010.OffsetRange[] offsetRanges)  ;
  /**
   * Queue up offset ranges for commit to Kafka at a future time.  Threadsafe.
   * This is only needed if you intend to store offsets in Kafka, instead of your own store.
   * @param offsetRanges The maximum untilOffset for a given partition will be used at commit.
   * @param callback Only the most recently provided callback will be used at commit.
   */
  public  void commitAsync (org.apache.spark.streaming.kafka010.OffsetRange[] offsetRanges, org.apache.kafka.clients.consumer.OffsetCommitCallback callback)  ;
}

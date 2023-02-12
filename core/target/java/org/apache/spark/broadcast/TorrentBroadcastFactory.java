package org.apache.spark.broadcast;
/**
 * Remove all persisted state associated with the torrent broadcast with the given ID.
 * param:  removeFromDriver Whether to remove state from the driver.
 * param:  blocking Whether to block until unbroadcasted
 */
  class TorrentBroadcastFactory implements org.apache.spark.broadcast.BroadcastFactory {
  // not preceding
  public   TorrentBroadcastFactory ()  { throw new RuntimeException(); }
  // not preceding
  public  void initialize (boolean isDriver, org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityMgr)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> org.apache.spark.broadcast.Broadcast<T> newBroadcast (T value_, boolean isLocal, long id, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Remove all persisted state associated with the torrent broadcast with the given ID.
   * @param removeFromDriver Whether to remove state from the driver.
   * @param blocking Whether to block until unbroadcasted
   * @param id (undocumented)
   */
  public  void unbroadcast (long id, boolean removeFromDriver, boolean blocking)  { throw new RuntimeException(); }
}

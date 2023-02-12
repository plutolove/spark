package org.apache.spark.streaming.scheduler;
/**
 * A custom receiver that could be stopped via StoppableReceiver.shouldStop
 */
public  class StoppableReceiver extends org.apache.spark.streaming.receiver.Receiver<java.lang.Object> {
  // not preceding
  static public  boolean shouldStop ()  { throw new RuntimeException(); }
  // not preceding
  public   StoppableReceiver ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<java.lang.Thread> receivingThreadOption ()  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
}

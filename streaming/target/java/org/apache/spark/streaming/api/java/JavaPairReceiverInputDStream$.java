package org.apache.spark.streaming.api.java;
/**
 * Convert a scala {@link org.apache.spark.streaming.dstream.ReceiverInputDStream} to a Java-friendly
 * {@link org.apache.spark.streaming.api.java.JavaReceiverInputDStream}.
 */
// not preceding
public  class JavaPairReceiverInputDStream$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final JavaPairReceiverInputDStream$ MODULE$ = null;
  public   JavaPairReceiverInputDStream$ ()  { throw new RuntimeException(); }
  // not preceding
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairReceiverInputDStream<K, V> fromReceiverInputDStream (org.apache.spark.streaming.dstream.ReceiverInputDStream<scala.Tuple2<K, V>> receiverInputDStream, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2)  { throw new RuntimeException(); }
}

package org.apache.spark.streaming.dstream;
/**
 * Asynchronously maintains &amp; sends new rate limits to the receiver through the receiver tracker.
 */
public abstract class ReceiverInputDStream<T extends java.lang.Object> extends org.apache.spark.streaming.dstream.InputDStream<T> {
  /**
   * A RateController that sends the new rate to receivers, via the receiver tracker.
   */
    class ReceiverRateController extends org.apache.spark.streaming.scheduler.RateController {
    // not preceding
    public   ReceiverRateController (int id, org.apache.spark.streaming.scheduler.rate.RateEstimator estimator)  { throw new RuntimeException(); }
    // not preceding
    public  void publish (long rate)  { throw new RuntimeException(); }
  }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   ReceiverInputDStream (org.apache.spark.streaming.StreamingContext _ssc, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /**
   * @param validTime (undocumented)
   * @return (undocumented)
   * Generates RDDs with blocks received by the receiver of this stream. */
  public  scala.Option<org.apache.spark.rdd.RDD<T>> compute (org.apache.spark.streaming.Time validTime)  { throw new RuntimeException(); }
    org.apache.spark.rdd.RDD<T> createBlockRDD (org.apache.spark.streaming.Time time, scala.collection.Seq<org.apache.spark.streaming.scheduler.ReceivedBlockInfo> blockInfos)  { throw new RuntimeException(); }
  /**
   * Gets the receiver object that will be sent to the worker nodes
   * to receive data. This method needs to defined by any specific implementation
   * of a ReceiverInputDStream.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.streaming.receiver.Receiver<T> getReceiver ()  ;
  // not preceding
  protected  scala.Option<org.apache.spark.streaming.scheduler.RateController> rateController ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}

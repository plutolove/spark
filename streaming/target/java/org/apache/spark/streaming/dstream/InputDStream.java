package org.apache.spark.streaming.dstream;
/** This is a unique identifier for the input stream. */
public abstract class InputDStream<T extends java.lang.Object> extends org.apache.spark.streaming.dstream.DStream<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   InputDStream (org.apache.spark.streaming.StreamingContext _ssc, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /**
   * The base scope associated with the operation that created this DStream.
   * <p>
   * For InputDStreams, we use the name of this DStream as the scope name.
   * If an outer scope is given, we assume that it includes an alternative name for this stream.
   * @return (undocumented)
   */
  protected  scala.Option<java.lang.String> baseScope ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.streaming.dstream.DStream<?>> dependencies ()  { throw new RuntimeException(); }
  /** This is a unique identifier for the input stream. */
  public  int id ()  { throw new RuntimeException(); }
  /**
   * Checks whether the 'time' is valid wrt slideDuration for generating RDD.
   * Additionally it also ensures valid times are in strictly increasing order.
   * This ensures that InputDStream.compute() is called strictly on increasing
   * times.
   * @param time (undocumented)
   * @return (undocumented)
   */
    boolean isTimeValid (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
  // not preceding
    org.apache.spark.streaming.Time lastValidTime ()  { throw new RuntimeException(); }
  /** A human-readable name of this InputDStream */
    java.lang.String name ()  { throw new RuntimeException(); }
  protected  scala.Option<org.apache.spark.streaming.scheduler.RateController> rateController ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration slideDuration ()  { throw new RuntimeException(); }
  /** Method called to start receiving data. Subclasses must implement this method. */
  public abstract  void start ()  ;
  /** Method called to stop receiving data. Subclasses must implement this method. */
  public abstract  void stop ()  ;
}

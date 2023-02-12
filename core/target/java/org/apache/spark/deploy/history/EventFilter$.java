package org.apache.spark.deploy.history;
/**
 * Classify whether the event is accepted or rejected by this filter.
 * <p>
 * The method should return the partial function which matches the events where the filter can
 * decide whether the event should be accepted or rejected. Otherwise it should leave the events
 * be unmatched.
 */
// not preceding
public  class EventFilter$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EventFilter$ MODULE$ = null;
  public   EventFilter$ ()  { throw new RuntimeException(); }
  // not preceding
  public  void applyFilterToFile (org.apache.hadoop.fs.FileSystem fs, scala.collection.Seq<org.apache.spark.deploy.history.EventFilter> filters, org.apache.hadoop.fs.Path path, scala.Function2<java.lang.String, org.apache.spark.scheduler.SparkListenerEvent, scala.runtime.BoxedUnit> onAccepted, scala.Function2<java.lang.String, org.apache.spark.scheduler.SparkListenerEvent, scala.runtime.BoxedUnit> onRejected, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> onUnidentified)  { throw new RuntimeException(); }
}

package org.apache.spark;
/**
 * <code>preserveCause</code> is used to keep the exception itself so it is available to the
 * driver. This may be set to <code>false</code> in the event that the exception is not in fact
 * serializable.
 */
public  class ExceptionFailure implements org.apache.spark.TaskFailedReason, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String className ()  { throw new RuntimeException(); }
  public  java.lang.String description ()  { throw new RuntimeException(); }
  public  java.lang.StackTraceElement[] stackTrace ()  { throw new RuntimeException(); }
  public  java.lang.String fullStackTrace ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.scheduler.AccumulableInfo> accumUpdates ()  { throw new RuntimeException(); }
    scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>> accums ()  { throw new RuntimeException(); }
    scala.collection.Seq<java.lang.Object> metricPeaks ()  { throw new RuntimeException(); }
  // not preceding
  public   ExceptionFailure (java.lang.String className, java.lang.String description, java.lang.StackTraceElement[] stackTrace, java.lang.String fullStackTrace, scala.Option<org.apache.spark.ThrowableSerializationWrapper> exceptionWrapper, scala.collection.Seq<org.apache.spark.scheduler.AccumulableInfo> accumUpdates, scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>> accums, scala.collection.Seq<java.lang.Object> metricPeaks)  { throw new RuntimeException(); }
  // not preceding
     ExceptionFailure (java.lang.Throwable e, scala.collection.Seq<org.apache.spark.scheduler.AccumulableInfo> accumUpdates, boolean preserveCause)  { throw new RuntimeException(); }
     ExceptionFailure (java.lang.Throwable e, scala.collection.Seq<org.apache.spark.scheduler.AccumulableInfo> accumUpdates)  { throw new RuntimeException(); }
    org.apache.spark.ExceptionFailure withAccums (scala.collection.Seq<org.apache.spark.util.AccumulatorV2<?, ?>> accums)  { throw new RuntimeException(); }
    org.apache.spark.ExceptionFailure withMetricPeaks (scala.collection.Seq<java.lang.Object> metricPeaks)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Throwable> exception ()  { throw new RuntimeException(); }
  public  java.lang.String toErrorString ()  { throw new RuntimeException(); }
}

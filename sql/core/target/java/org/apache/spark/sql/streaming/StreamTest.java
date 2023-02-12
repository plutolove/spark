package org.apache.spark.sql.streaming;
/** How long to wait for an active stream to catch up when checking a result. */
public  interface StreamTest extends org.apache.spark.sql.test.SharedSparkSession, org.scalatest.concurrent.TimeLimits, org.scalatest.BeforeAndAfterAll {
  // not preceding
  public  interface AddData extends org.apache.spark.sql.streaming.StreamTest.StreamAction {
    // not preceding
    public  scala.Tuple2<org.apache.spark.sql.connector.read.streaming.SparkDataStream, org.apache.spark.sql.connector.read.streaming.Offset> addData (scala.Option<org.apache.spark.sql.execution.streaming.StreamExecution> query)  ;
  }
  // not preceding
  // not preceding
  public  class AddData$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AddData$ MODULE$ = null;
    public   AddData$ ()  { throw new RuntimeException(); }
    // not preceding
    public <A extends java.lang.Object> org.apache.spark.sql.streaming.StreamTest.AddDataMemory<A> apply (org.apache.spark.sql.execution.streaming.MemoryStreamBase<A> source, scala.collection.Seq<A> data)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class MultiAddData {
    // not preceding
    static public <A extends java.lang.Object> org.apache.spark.sql.streaming.StreamTest.StreamAction apply (org.apache.spark.sql.execution.streaming.MemoryStream<A> source1, scala.collection.Seq<A> data1, org.apache.spark.sql.execution.streaming.MemoryStream<A> source2, scala.collection.Seq<A> data2)  { throw new RuntimeException(); }
    static public <A extends java.lang.Object> org.apache.spark.sql.streaming.StreamTest.StreamAction apply (scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.execution.streaming.MemoryStream<A>, scala.collection.Seq<A>>> inputs)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class MultiAddData$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final MultiAddData$ MODULE$ = null;
    public   MultiAddData$ ()  { throw new RuntimeException(); }
    // not preceding
    public <A extends java.lang.Object> org.apache.spark.sql.streaming.StreamTest.StreamAction apply (org.apache.spark.sql.execution.streaming.MemoryStream<A> source1, scala.collection.Seq<A> data1, org.apache.spark.sql.execution.streaming.MemoryStream<A> source2, scala.collection.Seq<A> data2)  { throw new RuntimeException(); }
    public <A extends java.lang.Object> org.apache.spark.sql.streaming.StreamTest.StreamAction apply (scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.execution.streaming.MemoryStream<A>, scala.collection.Seq<A>>> inputs)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class AddDataMemory<A extends java.lang.Object> implements org.apache.spark.sql.streaming.StreamTest.AddData, scala.Product, scala.Serializable {
    public  org.apache.spark.sql.execution.streaming.MemoryStreamBase<A> source ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<A> data ()  { throw new RuntimeException(); }
    // not preceding
    public   AddDataMemory (org.apache.spark.sql.execution.streaming.MemoryStreamBase<A> source, scala.collection.Seq<A> data)  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  scala.Tuple2<org.apache.spark.sql.connector.read.streaming.SparkDataStream, org.apache.spark.sql.connector.read.streaming.Offset> addData (scala.Option<org.apache.spark.sql.execution.streaming.StreamExecution> query)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class AddDataMemory$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AddDataMemory$ MODULE$ = null;
    public   AddDataMemory$ ()  { throw new RuntimeException(); }
  }
  /**
   * Checks to make sure that the current data stored in the sink matches the <code>expectedAnswer</code>.
   * This operation automatically blocks until all added data has been processed.
   */
  // not preceding
  public  class CheckAnswer {
    // not preceding
    static public <A extends java.lang.Object> org.apache.spark.sql.streaming.StreamTest.CheckAnswerRows apply (scala.collection.Seq<A> data, org.apache.spark.sql.Encoder<A> evidence$2)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRows apply (scala.collection.Seq<org.apache.spark.sql.Row> rows)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRowsByFunc apply (scala.Function1<scala.collection.Seq<org.apache.spark.sql.Row>, scala.runtime.BoxedUnit> globalCheckFunction)  { throw new RuntimeException(); }
  }
  /**
   * Checks to make sure that the current data stored in the sink matches the <code>expectedAnswer</code>.
   * This operation automatically blocks until all added data has been processed.
   */
  // not preceding
  public  class CheckAnswer$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CheckAnswer$ MODULE$ = null;
    public   CheckAnswer$ ()  { throw new RuntimeException(); }
    // not preceding
    public <A extends java.lang.Object> org.apache.spark.sql.streaming.StreamTest.CheckAnswerRows apply (scala.collection.Seq<A> data, org.apache.spark.sql.Encoder<A> evidence$2)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRows apply (scala.collection.Seq<org.apache.spark.sql.Row> rows)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRowsByFunc apply (scala.Function1<scala.collection.Seq<org.apache.spark.sql.Row>, scala.runtime.BoxedUnit> globalCheckFunction)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class CheckLastBatch {
    // not preceding
    static public <A extends java.lang.Object> org.apache.spark.sql.streaming.StreamTest.CheckAnswerRows apply (scala.collection.Seq<A> data, org.apache.spark.sql.Encoder<A> evidence$3)  { throw new RuntimeException(); }
    static public <A extends java.lang.Object> org.apache.spark.sql.streaming.StreamTest.CheckAnswerRows apply (boolean isSorted, scala.collection.Seq<A> data, org.apache.spark.sql.Encoder<A> evidence$4)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRows apply (scala.collection.Seq<org.apache.spark.sql.Row> rows)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRowsByFunc apply (scala.Function1<scala.collection.Seq<org.apache.spark.sql.Row>, scala.runtime.BoxedUnit> globalCheckFunction)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class CheckLastBatch$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CheckLastBatch$ MODULE$ = null;
    public   CheckLastBatch$ ()  { throw new RuntimeException(); }
    // not preceding
    public <A extends java.lang.Object> org.apache.spark.sql.streaming.StreamTest.CheckAnswerRows apply (scala.collection.Seq<A> data, org.apache.spark.sql.Encoder<A> evidence$3)  { throw new RuntimeException(); }
    public <A extends java.lang.Object> org.apache.spark.sql.streaming.StreamTest.CheckAnswerRows apply (boolean isSorted, scala.collection.Seq<A> data, org.apache.spark.sql.Encoder<A> evidence$4)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRows apply (scala.collection.Seq<org.apache.spark.sql.Row> rows)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRowsByFunc apply (scala.Function1<scala.collection.Seq<org.apache.spark.sql.Row>, scala.runtime.BoxedUnit> globalCheckFunction)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class CheckAnswerRows implements org.apache.spark.sql.streaming.StreamTest.StreamAction, org.apache.spark.sql.streaming.StreamTest.StreamMustBeRunning, scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
    // not preceding
    public  scala.collection.Seq<org.apache.spark.sql.Row> expectedAnswer ()  { throw new RuntimeException(); }
    public  boolean lastOnly ()  { throw new RuntimeException(); }
    public  boolean isSorted ()  { throw new RuntimeException(); }
    // not preceding
    public   CheckAnswerRows (scala.collection.Seq<org.apache.spark.sql.Row> expectedAnswer, boolean lastOnly, boolean isSorted)  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class CheckAnswerRows$ extends scala.runtime.AbstractFunction3<scala.collection.Seq<org.apache.spark.sql.Row>, java.lang.Object, java.lang.Object, org.apache.spark.sql.streaming.StreamTest.CheckAnswerRows> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CheckAnswerRows$ MODULE$ = null;
    public   CheckAnswerRows$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class CheckAnswerRowsContains implements org.apache.spark.sql.streaming.StreamTest.StreamAction, org.apache.spark.sql.streaming.StreamTest.StreamMustBeRunning, scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    // not preceding
    public  scala.collection.Seq<org.apache.spark.sql.Row> expectedAnswer ()  { throw new RuntimeException(); }
    public  boolean lastOnly ()  { throw new RuntimeException(); }
    // not preceding
    public   CheckAnswerRowsContains (scala.collection.Seq<org.apache.spark.sql.Row> expectedAnswer, boolean lastOnly)  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class CheckAnswerRowsContains$ extends scala.runtime.AbstractFunction2<scala.collection.Seq<org.apache.spark.sql.Row>, java.lang.Object, org.apache.spark.sql.streaming.StreamTest.CheckAnswerRowsContains> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CheckAnswerRowsContains$ MODULE$ = null;
    public   CheckAnswerRowsContains$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class CheckAnswerRowsByFunc implements org.apache.spark.sql.streaming.StreamTest.StreamAction, org.apache.spark.sql.streaming.StreamTest.StreamMustBeRunning, scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    // not preceding
    public  scala.Function1<scala.collection.Seq<org.apache.spark.sql.Row>, scala.runtime.BoxedUnit> globalCheckFunction ()  { throw new RuntimeException(); }
    public  boolean lastOnly ()  { throw new RuntimeException(); }
    // not preceding
    public   CheckAnswerRowsByFunc (scala.Function1<scala.collection.Seq<org.apache.spark.sql.Row>, scala.runtime.BoxedUnit> globalCheckFunction, boolean lastOnly)  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class CheckAnswerRowsByFunc$ extends scala.runtime.AbstractFunction2<scala.Function1<scala.collection.Seq<org.apache.spark.sql.Row>, scala.runtime.BoxedUnit>, java.lang.Object, org.apache.spark.sql.streaming.StreamTest.CheckAnswerRowsByFunc> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CheckAnswerRowsByFunc$ MODULE$ = null;
    public   CheckAnswerRowsByFunc$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class CheckNewAnswerRows implements org.apache.spark.sql.streaming.StreamTest.StreamAction, org.apache.spark.sql.streaming.StreamTest.StreamMustBeRunning, scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1)  ;
    // not preceding
    public  scala.collection.Seq<org.apache.spark.sql.Row> expectedAnswer ()  { throw new RuntimeException(); }
    // not preceding
    public   CheckNewAnswerRows (scala.collection.Seq<org.apache.spark.sql.Row> expectedAnswer)  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class CheckNewAnswerRows$ extends scala.runtime.AbstractFunction1<scala.collection.Seq<org.apache.spark.sql.Row>, org.apache.spark.sql.streaming.StreamTest.CheckNewAnswerRows> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CheckNewAnswerRows$ MODULE$ = null;
    public   CheckNewAnswerRows$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class CheckNewAnswer {
    // not preceding
    static public  org.apache.spark.sql.streaming.StreamTest.CheckNewAnswerRows apply ()  { throw new RuntimeException(); }
    static public <A extends java.lang.Object> org.apache.spark.sql.streaming.StreamTest.CheckNewAnswerRows apply (A data, scala.collection.Seq<A> moreData, org.apache.spark.sql.Encoder<A> evidence$5)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.streaming.StreamTest.CheckNewAnswerRows apply (scala.collection.Seq<org.apache.spark.sql.Row> rows)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class CheckNewAnswer$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CheckNewAnswer$ MODULE$ = null;
    public   CheckNewAnswer$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.streaming.StreamTest.CheckNewAnswerRows apply ()  { throw new RuntimeException(); }
    public <A extends java.lang.Object> org.apache.spark.sql.streaming.StreamTest.CheckNewAnswerRows apply (A data, scala.collection.Seq<A> moreData, org.apache.spark.sql.Encoder<A> evidence$5)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.CheckNewAnswerRows apply (scala.collection.Seq<org.apache.spark.sql.Row> rows)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class StopStream {
    static public abstract  boolean canEqual (Object that)  ;
    static public abstract  boolean equals (Object that)  ;
    static public abstract  Object productElement (int n)  ;
    static public abstract  int productArity ()  ;
    static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
    static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class StopStream$ implements org.apache.spark.sql.streaming.StreamTest.StreamAction, org.apache.spark.sql.streaming.StreamTest.StreamMustBeRunning, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StopStream$ MODULE$ = null;
    public   StopStream$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class StartStream implements org.apache.spark.sql.streaming.StreamTest.StreamAction, scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.streaming.Trigger trigger ()  { throw new RuntimeException(); }
    public  org.apache.spark.util.Clock triggerClock ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.String, java.lang.String> additionalConfs ()  { throw new RuntimeException(); }
    public  java.lang.String checkpointLocation ()  { throw new RuntimeException(); }
    // not preceding
    public   StartStream (org.apache.spark.sql.streaming.Trigger trigger, org.apache.spark.util.Clock triggerClock, scala.collection.immutable.Map<java.lang.String, java.lang.String> additionalConfs, java.lang.String checkpointLocation)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class StartStream$ extends scala.runtime.AbstractFunction4<org.apache.spark.sql.streaming.Trigger, org.apache.spark.util.Clock, scala.collection.immutable.Map<java.lang.String, java.lang.String>, java.lang.String, org.apache.spark.sql.streaming.StreamTest.StartStream> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StartStream$ MODULE$ = null;
    public   StartStream$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class AdvanceManualClock implements org.apache.spark.sql.streaming.StreamTest.StreamAction, scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  long timeToAdd ()  { throw new RuntimeException(); }
    // not preceding
    public   AdvanceManualClock (long timeToAdd)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class AdvanceManualClock$ extends scala.runtime.AbstractFunction1<java.lang.Object, org.apache.spark.sql.streaming.StreamTest.AdvanceManualClock> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AdvanceManualClock$ MODULE$ = null;
    public   AdvanceManualClock$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class ExpectFailure<T extends java.lang.Throwable> implements org.apache.spark.sql.streaming.StreamTest.StreamAction, scala.Product, scala.Serializable {
    public  scala.Function1<java.lang.Throwable, scala.runtime.BoxedUnit> assertFailure ()  { throw new RuntimeException(); }
    public  boolean isFatalError ()  { throw new RuntimeException(); }
    // not preceding
    public   ExpectFailure (scala.Function1<java.lang.Throwable, scala.runtime.BoxedUnit> assertFailure, boolean isFatalError, scala.reflect.ClassTag<T> evidence$6)  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.Class<T> causeClass ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class ExpectFailure$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ExpectFailure$ MODULE$ = null;
    public   ExpectFailure$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class StreamProgressLockedActions implements org.apache.spark.sql.streaming.StreamTest.StreamAction, scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    // not preceding
    public  scala.collection.Seq<org.apache.spark.sql.streaming.StreamTest.StreamAction> actions ()  { throw new RuntimeException(); }
    public  java.lang.String desc ()  { throw new RuntimeException(); }
    // not preceding
    public   StreamProgressLockedActions (scala.collection.Seq<org.apache.spark.sql.streaming.StreamTest.StreamAction> actions, java.lang.String desc)  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class StreamProgressLockedActions$ extends scala.runtime.AbstractFunction2<scala.collection.Seq<org.apache.spark.sql.streaming.StreamTest.StreamAction>, java.lang.String, org.apache.spark.sql.streaming.StreamTest.StreamProgressLockedActions> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StreamProgressLockedActions$ MODULE$ = null;
    public   StreamProgressLockedActions$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class Assert implements org.apache.spark.sql.streaming.StreamTest.StreamAction {
    static public  org.apache.spark.sql.streaming.StreamTest.Assert apply (scala.Function0<java.lang.Object> condition, java.lang.String message)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.streaming.StreamTest.Assert apply (java.lang.String message, scala.Function0<scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.streaming.StreamTest.Assert apply (scala.Function0<scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String message ()  { throw new RuntimeException(); }
    // not preceding
    public   Assert (scala.Function0<java.lang.Object> condition, java.lang.String message)  { throw new RuntimeException(); }
    // not preceding
    public  void run ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class Assert$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Assert$ MODULE$ = null;
    public   Assert$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.Assert apply (scala.Function0<java.lang.Object> condition, java.lang.String message)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.Assert apply (java.lang.String message, scala.Function0<scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.Assert apply (scala.Function0<scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class AssertOnQuery implements org.apache.spark.sql.streaming.StreamTest.StreamAction {
    // not preceding
    static public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply (scala.Function1<org.apache.spark.sql.execution.streaming.StreamExecution, java.lang.Object> condition, java.lang.String message)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply (java.lang.String message, scala.Function1<org.apache.spark.sql.execution.streaming.StreamExecution, java.lang.Object> condition)  { throw new RuntimeException(); }
    // not preceding
    public  scala.Function1<org.apache.spark.sql.execution.streaming.StreamExecution, java.lang.Object> condition ()  { throw new RuntimeException(); }
    public  java.lang.String message ()  { throw new RuntimeException(); }
    // not preceding
    public   AssertOnQuery (scala.Function1<org.apache.spark.sql.execution.streaming.StreamExecution, java.lang.Object> condition, java.lang.String message)  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class AssertOnQuery$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AssertOnQuery$ MODULE$ = null;
    public   AssertOnQuery$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply (scala.Function1<org.apache.spark.sql.execution.streaming.StreamExecution, java.lang.Object> condition, java.lang.String message)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply (java.lang.String message, scala.Function1<org.apache.spark.sql.execution.streaming.StreamExecution, java.lang.Object> condition)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class Execute {
    // not preceding
    static public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply (java.lang.String name, scala.Function1<org.apache.spark.sql.execution.streaming.StreamExecution, java.lang.Object> func)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply (scala.Function1<org.apache.spark.sql.execution.streaming.StreamExecution, java.lang.Object> func)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class Execute$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Execute$ MODULE$ = null;
    public   Execute$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply (java.lang.String name, scala.Function1<org.apache.spark.sql.execution.streaming.StreamExecution, java.lang.Object> func)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply (scala.Function1<org.apache.spark.sql.execution.streaming.StreamExecution, java.lang.Object> func)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ProcessAllAvailable {
    // not preceding
    static public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ProcessAllAvailable$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ProcessAllAvailable$ MODULE$ = null;
    public   ProcessAllAvailable$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class AwaitEpoch {
    // not preceding
    static public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply (long epoch)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class AwaitEpoch$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AwaitEpoch$ MODULE$ = null;
    public   AwaitEpoch$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply (long epoch)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class IncrementEpoch {
    // not preceding
    static public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class IncrementEpoch$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final IncrementEpoch$ MODULE$ = null;
    public   IncrementEpoch$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery apply ()  { throw new RuntimeException(); }
  }
  /** Expect awaitTermination to not be blocked */
  // not preceding
  public  class AwaitTerminationTester {
    // not preceding
    // not preceding
    static public  class ExpectNotBlocked$ implements org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$.ExpectedBehavior, scala.Product, scala.Serializable {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final ExpectNotBlocked$ MODULE$ = null;
      public   ExpectNotBlocked$ ()  { throw new RuntimeException(); }
    }
    // not preceding
    // not preceding
    static public  class ExpectBlocked$ implements org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$.ExpectedBehavior, scala.Product, scala.Serializable {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final ExpectBlocked$ MODULE$ = null;
      public   ExpectBlocked$ ()  { throw new RuntimeException(); }
    }
    // not preceding
    static public  class ExpectException<E extends java.lang.Exception> implements org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$.ExpectedBehavior, scala.Product, scala.Serializable {
      public  scala.reflect.ClassTag<E> t ()  { throw new RuntimeException(); }
      // not preceding
      public   ExpectException (scala.reflect.ClassTag<E> t)  { throw new RuntimeException(); }
    }
    // not preceding
    static public  class ExpectException$ implements scala.Serializable {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final ExpectException$ MODULE$ = null;
      public   ExpectException$ ()  { throw new RuntimeException(); }
    }
    // not preceding
    static public  interface ExpectedBehavior {
    }
    static public  org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$.ExpectNotBlocked$ ExpectNotBlocked ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$.ExpectBlocked$ ExpectBlocked ()  { throw new RuntimeException(); }
    static public  void test (org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$.ExpectedBehavior expectedBehavior, scala.Function0<scala.runtime.BoxedUnit> awaitTermFunc, org.scalatest.time.Span testTimeout)  { throw new RuntimeException(); }
  }
  /** Expect awaitTermination to not be blocked */
  // not preceding
  public  class AwaitTerminationTester$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AwaitTerminationTester$ MODULE$ = null;
    public  org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$.ExpectNotBlocked$ ExpectNotBlocked ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$.ExpectBlocked$ ExpectBlocked ()  { throw new RuntimeException(); }
    public   AwaitTerminationTester$ ()  { throw new RuntimeException(); }
    public  void test (org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$.ExpectedBehavior expectedBehavior, scala.Function0<scala.runtime.BoxedUnit> awaitTermFunc, org.scalatest.time.Span testTimeout)  { throw new RuntimeException(); }
  }
  /** A trait for actions that can be performed while testing a streaming DataFrame. */
  public  interface StreamAction {
  }
  // not preceding
  public  interface StreamMustBeRunning {
  }
  // not preceding
  public  interface ExternalAction extends org.apache.spark.sql.streaming.StreamTest.StreamAction {
    // not preceding
    public  void runAction ()  ;
  }
  public  org.apache.spark.sql.streaming.StreamTest.AddData$ AddData ()  ;
  public  org.apache.spark.sql.streaming.StreamTest.Assert$ Assert ()  ;
  public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery$ AssertOnQuery ()  ;
  public  org.apache.spark.sql.streaming.StreamTest.AwaitEpoch$ AwaitEpoch ()  ;
  public  org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$ AwaitTerminationTester ()  ;
  public  org.apache.spark.sql.streaming.StreamTest.CheckAnswer$ CheckAnswer ()  ;
  public  org.apache.spark.sql.streaming.StreamTest.CheckLastBatch$ CheckLastBatch ()  ;
  public  org.apache.spark.sql.streaming.StreamTest.CheckNewAnswer$ CheckNewAnswer ()  ;
  public  org.apache.spark.sql.streaming.StreamTest.Execute$ Execute ()  ;
  public  org.apache.spark.sql.streaming.StreamTest.IncrementEpoch$ IncrementEpoch ()  ;
  public  org.apache.spark.sql.streaming.StreamTest.MultiAddData$ MultiAddData ()  ;
  public  org.apache.spark.sql.streaming.StreamTest.ProcessAllAvailable$ ProcessAllAvailable ()  ;
  public  org.apache.spark.sql.streaming.StreamTest.StopStream$ StopStream ()  ;
  public  void afterAll ()  ;
  // not preceding
  public <A extends java.lang.Object> scala.Function1<A, org.apache.spark.sql.Row> createToExternalRowConverter (org.apache.spark.sql.Encoder<A> evidence$1)  ;
  public  org.scalatest.concurrent.Signaler defaultSignaler ()  ;
  public  org.apache.spark.sql.streaming.Trigger defaultTrigger ()  ;
  /**
   * Creates a stress test that randomly starts/stops/adds data/checks the result.
   * <p>
   * @param ds a dataframe that executes + 1 on a stream of integers, returning the result
   * @param addData an add data action that adds the given numbers to the stream, encoding them
   *                as needed
   * @param iterations the iteration number
   */
  public  void runStressTest (org.apache.spark.sql.Dataset<java.lang.Object> ds, scala.Function1<scala.collection.Seq<java.lang.Object>, org.apache.spark.sql.streaming.StreamTest.StreamAction> addData, int iterations)  ;
  /**
   * Creates a stress test that randomly starts/stops/adds data/checks the result.
   * <p>
   * @param ds a dataframe that executes + 1 on a stream of integers, returning the result
   * @param prepareActions actions need to run before starting the stress test.
   * @param addData an add data action that adds the given numbers to the stream, encoding them
   *                as needed
   * @param iterations the iteration number
   */
  public  void runStressTest (org.apache.spark.sql.Dataset<java.lang.Object> ds, scala.collection.Seq<org.apache.spark.sql.streaming.StreamTest.StreamAction> prepareActions, scala.Function2<scala.collection.Seq<java.lang.Object>, java.lang.Object, org.apache.spark.sql.streaming.StreamTest.StreamAction> addData, int iterations)  ;
  /** How long to wait for an active stream to catch up when checking a result. */
  public  org.scalatest.time.Span streamingTimeout ()  ;
  // not preceding
  public  void testStream (org.apache.spark.sql.Dataset<?> _stream, org.apache.spark.sql.streaming.OutputMode outputMode, scala.collection.Seq<org.apache.spark.sql.streaming.StreamTest.StreamAction> actions)  ;
}

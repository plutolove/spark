package org.apache.spark.sql.execution.streaming;
/** Predicate for watermark on state keys */
// not preceding
public  class StreamingSymmetricHashJoinHelper {
  // not preceding
  // not preceding
  static public  class LeftSide$ implements org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinSide, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final LeftSide$ MODULE$ = null;
    public   LeftSide$ ()  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class RightSide$ implements org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinSide, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RightSide$ MODULE$ = null;
    public   RightSide$ ()  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class JoinStateKeyWatermarkPredicate implements org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinStateWatermarkPredicate, scala.Product, scala.Serializable {
    // not preceding
    public  org.apache.spark.sql.catalyst.expressions.Expression expr ()  { throw new RuntimeException(); }
    // not preceding
    public   JoinStateKeyWatermarkPredicate (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String desc ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class JoinStateKeyWatermarkPredicate$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinStateKeyWatermarkPredicate> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final JoinStateKeyWatermarkPredicate$ MODULE$ = null;
    public   JoinStateKeyWatermarkPredicate$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class JoinStateValueWatermarkPredicate implements org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinStateWatermarkPredicate, scala.Product, scala.Serializable {
    // not preceding
    public  org.apache.spark.sql.catalyst.expressions.Expression expr ()  { throw new RuntimeException(); }
    // not preceding
    public   JoinStateValueWatermarkPredicate (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String desc ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class JoinStateValueWatermarkPredicate$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinStateValueWatermarkPredicate> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final JoinStateValueWatermarkPredicate$ MODULE$ = null;
    public   JoinStateValueWatermarkPredicate$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class JoinStateWatermarkPredicates implements scala.Product, scala.Serializable {
    // not preceding
    public  scala.Option<org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinStateWatermarkPredicate> left ()  { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinStateWatermarkPredicate> right ()  { throw new RuntimeException(); }
    // not preceding
    public   JoinStateWatermarkPredicates (scala.Option<org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinStateWatermarkPredicate> left, scala.Option<org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinStateWatermarkPredicate> right)  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class JoinStateWatermarkPredicates$ extends scala.runtime.AbstractFunction2<scala.Option<org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinStateWatermarkPredicate>, scala.Option<org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinStateWatermarkPredicate>, org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinStateWatermarkPredicates> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final JoinStateWatermarkPredicates$ MODULE$ = null;
    public   JoinStateWatermarkPredicates$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class JoinConditionSplitPredicates implements scala.Product, scala.Serializable {
    // not preceding
    public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> leftSideOnly ()  { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> rightSideOnly ()  { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> bothSides ()  { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> full ()  { throw new RuntimeException(); }
    // not preceding
    public   JoinConditionSplitPredicates (scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> leftSideOnly, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> rightSideOnly, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> bothSides, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> full)  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class JoinConditionSplitPredicates$ implements org.apache.spark.sql.catalyst.expressions.PredicateHelper, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final JoinConditionSplitPredicates$ MODULE$ = null;
    public   JoinConditionSplitPredicates$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinConditionSplitPredicates apply (scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition, org.apache.spark.sql.execution.SparkPlan left, org.apache.spark.sql.execution.SparkPlan right)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  interface JoinSide {
  }
  // not preceding
  static public  interface JoinStateWatermarkPredicate {
    public  java.lang.String desc ()  ;
    public  org.apache.spark.sql.catalyst.expressions.Expression expr ()  ;
    public  java.lang.String toString ()  ;
  }
  /**
   * Set the preferred location of each partition using the executor that has the related
   * {@link StateStoreProvider} already loaded.
   */
  static public  class StateStoreAwareZipPartitionsRDD<A extends java.lang.Object, B extends java.lang.Object, V extends java.lang.Object> extends org.apache.spark.rdd.ZippedPartitionsBaseRDD<V> {
    // not preceding
    public   StateStoreAwareZipPartitionsRDD (org.apache.spark.SparkContext sc, scala.Function3<java.lang.Object, scala.collection.Iterator<A>, scala.collection.Iterator<B>, scala.collection.Iterator<V>> f, org.apache.spark.rdd.RDD<A> rdd1, org.apache.spark.rdd.RDD<B> rdd2, org.apache.spark.sql.execution.streaming.StatefulOperatorStateInfo stateInfo, scala.collection.Seq<java.lang.String> stateStoreNames, scala.Option<org.apache.spark.sql.execution.streaming.state.StateStoreCoordinatorRef> storeCoordinator, scala.reflect.ClassTag<A> evidence$1, scala.reflect.ClassTag<B> evidence$2, scala.reflect.ClassTag<V> evidence$3)  { throw new RuntimeException(); }
    public  void clearDependencies ()  { throw new RuntimeException(); }
    public  scala.collection.Iterator<V> compute (org.apache.spark.Partition s, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
    public  scala.Function3<java.lang.Object, scala.collection.Iterator<A>, scala.collection.Iterator<B>, scala.collection.Iterator<V>> f ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition partition)  { throw new RuntimeException(); }
    public  org.apache.spark.rdd.RDD<A> rdd1 ()  { throw new RuntimeException(); }
    public  org.apache.spark.rdd.RDD<B> rdd2 ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class StateStoreAwareZipPartitionsHelper<T extends java.lang.Object> {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    public   StateStoreAwareZipPartitionsHelper (org.apache.spark.rdd.RDD<T> dataRDD, scala.reflect.ClassTag<T> evidence$4)  { throw new RuntimeException(); }
    // not preceding
    public <U extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> stateStoreAwareZipPartitions (org.apache.spark.rdd.RDD<U> dataRDD2, org.apache.spark.sql.execution.streaming.StatefulOperatorStateInfo stateInfo, scala.collection.Seq<java.lang.String> storeNames, org.apache.spark.sql.execution.streaming.state.StateStoreCoordinatorRef storeCoordinator, scala.Function3<java.lang.Object, scala.collection.Iterator<T>, scala.collection.Iterator<U>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<U> evidence$5, scala.reflect.ClassTag<V> evidence$6)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinStateWatermarkPredicates getStateWatermarkPredicates (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> leftAttributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> rightAttributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> leftKeys, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> rightKeys, scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> condition, scala.Option<java.lang.Object> eventTimeWatermark)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
}

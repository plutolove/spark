package org.apache.spark.sql.execution;
/**
 * Plans special cases of limit operators.
 */
public abstract class SparkStrategies extends org.apache.spark.sql.catalyst.planning.QueryPlanner<org.apache.spark.sql.execution.SparkPlan> {
  /**
   * Plans special cases of limit operators.
   */
  // not preceding
  public  class SpecialLimits {
    // not preceding
    static public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
    static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
    static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
    static protected  org.apache.spark.sql.execution.SparkPlan planLater (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * Plans special cases of limit operators.
   */
  // not preceding
  public  class SpecialLimits$ extends org.apache.spark.sql.execution.SparkStrategy {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SpecialLimits$ MODULE$ = null;
    public   SpecialLimits$ ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class JoinSelection {
    static public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
    static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
    static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
    static protected  org.apache.spark.sql.execution.SparkPlan planLater (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitConjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
    static public  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> findExpressionAndTrackLineageDown (org.apache.spark.sql.catalyst.expressions.Expression exp, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitDisjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
    static protected  org.apache.spark.sql.catalyst.expressions.Expression replaceAlias (org.apache.spark.sql.catalyst.expressions.Expression condition, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Expression> aliases)  { throw new RuntimeException(); }
    static protected  boolean canEvaluate (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    static protected  boolean canEvaluateWithinJoin (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class JoinSelection$ extends org.apache.spark.sql.execution.SparkStrategy implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final JoinSelection$ MODULE$ = null;
    public   JoinSelection$ ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class StatefulAggregationStrategy {
    // not preceding
    static public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
    static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
    static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
    static protected  org.apache.spark.sql.execution.SparkPlan planLater (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class StatefulAggregationStrategy$ extends org.apache.spark.sql.execution.SparkStrategy {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StatefulAggregationStrategy$ MODULE$ = null;
    public   StatefulAggregationStrategy$ ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class StreamingDeduplicationStrategy {
    // not preceding
    static public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
    static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
    static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
    static protected  org.apache.spark.sql.execution.SparkPlan planLater (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class StreamingDeduplicationStrategy$ extends org.apache.spark.sql.execution.SparkStrategy {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StreamingDeduplicationStrategy$ MODULE$ = null;
    public   StreamingDeduplicationStrategy$ ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class StreamingGlobalLimitStrategy extends org.apache.spark.sql.execution.SparkStrategy implements scala.Product, scala.Serializable {
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.streaming.OutputMode outputMode ()  { throw new RuntimeException(); }
    // not preceding
    public   StreamingGlobalLimitStrategy (org.apache.spark.sql.streaming.OutputMode outputMode)  { throw new RuntimeException(); }
    /** Ensures that this plan does not have a streaming aggregate in it. */
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class StreamingGlobalLimitStrategy$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.streaming.OutputMode, org.apache.spark.sql.execution.SparkStrategies.StreamingGlobalLimitStrategy> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StreamingGlobalLimitStrategy$ MODULE$ = null;
    public   StreamingGlobalLimitStrategy$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class StreamingJoinStrategy {
    // not preceding
    static public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
    static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
    static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
    static protected  org.apache.spark.sql.execution.SparkPlan planLater (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class StreamingJoinStrategy$ extends org.apache.spark.sql.execution.SparkStrategy {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StreamingJoinStrategy$ MODULE$ = null;
    public   StreamingJoinStrategy$ ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class Aggregation {
    // not preceding
    static public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
    static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
    static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
    static protected  org.apache.spark.sql.execution.SparkPlan planLater (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class Aggregation$ extends org.apache.spark.sql.execution.SparkStrategy {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Aggregation$ MODULE$ = null;
    public   Aggregation$ ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class Window {
    // not preceding
    static public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
    static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
    static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
    static protected  org.apache.spark.sql.execution.SparkPlan planLater (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class Window$ extends org.apache.spark.sql.execution.SparkStrategy {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Window$ MODULE$ = null;
    public   Window$ ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class InMemoryScans {
    // not preceding
    static public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
    static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
    static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
    static protected  org.apache.spark.sql.execution.SparkPlan planLater (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class InMemoryScans$ extends org.apache.spark.sql.execution.SparkStrategy {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final InMemoryScans$ MODULE$ = null;
    public   InMemoryScans$ ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class StreamingRelationStrategy {
    // not preceding
    static public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
    static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
    static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
    static protected  org.apache.spark.sql.execution.SparkPlan planLater (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class StreamingRelationStrategy$ extends org.apache.spark.sql.execution.SparkStrategy {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StreamingRelationStrategy$ MODULE$ = null;
    public   StreamingRelationStrategy$ ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class FlatMapGroupsWithStateStrategy {
    // not preceding
    static public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
    static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
    static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
    static protected  org.apache.spark.sql.execution.SparkPlan planLater (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class FlatMapGroupsWithStateStrategy$ extends org.apache.spark.sql.execution.SparkStrategy {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FlatMapGroupsWithStateStrategy$ MODULE$ = null;
    public   FlatMapGroupsWithStateStrategy$ ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class PythonEvals {
    // not preceding
    static public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
    static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
    static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
    static protected  org.apache.spark.sql.execution.SparkPlan planLater (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class PythonEvals$ extends org.apache.spark.sql.execution.SparkStrategy {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final PythonEvals$ MODULE$ = null;
    public   PythonEvals$ ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class BasicOperators {
    // not preceding
    static public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
    static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
    static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
    static protected  org.apache.spark.sql.execution.SparkPlan planLater (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class BasicOperators$ extends org.apache.spark.sql.execution.SparkStrategy {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final BasicOperators$ MODULE$ = null;
    public   BasicOperators$ ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.execution.SparkStrategies.Aggregation$ Aggregation ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkStrategies.BasicOperators$ BasicOperators ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkStrategies.FlatMapGroupsWithStateStrategy$ FlatMapGroupsWithStateStrategy ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkStrategies.InMemoryScans$ InMemoryScans ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkStrategies.JoinSelection$ JoinSelection ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkStrategies.PythonEvals$ PythonEvals ()  { throw new RuntimeException(); }
  // not preceding
  public   SparkStrategies ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkStrategies.SpecialLimits$ SpecialLimits ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkStrategies.StatefulAggregationStrategy$ StatefulAggregationStrategy ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkStrategies.StreamingDeduplicationStrategy$ StreamingDeduplicationStrategy ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkStrategies.StreamingJoinStrategy$ StreamingJoinStrategy ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkStrategies.StreamingRelationStrategy$ StreamingRelationStrategy ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkStrategies.Window$ Window ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Iterator<org.apache.spark.sql.execution.SparkPlan> plan (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> singleRowRdd ()  { throw new RuntimeException(); }
}

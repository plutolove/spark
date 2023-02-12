package org.apache.spark.sql.catalyst.optimizer;
/** Find all possible plans at the next level, based on existing levels. */
// not preceding
public  class JoinReorderDP {
  /** Get the cost of the root node of this plan tree. */
  static public  class JoinPlan implements scala.Product, scala.Serializable {
    // not preceding
    public  scala.collection.immutable.Set<java.lang.Object> itemIds ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> joinConds ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.optimizer.Cost planCost ()  { throw new RuntimeException(); }
    // not preceding
    public   JoinPlan (scala.collection.immutable.Set<java.lang.Object> itemIds, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> joinConds, org.apache.spark.sql.catalyst.optimizer.Cost planCost)  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.optimizer.Cost rootCost (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
    /**
     * To identify the plan with smaller computational cost,
     * we use the weighted geometric mean of ratio of rows and the ratio of sizes in bytes.
     * <p>
     * There are other ways to combine these values as a cost comparison function.
     * Some of these, that we have experimented with, but have gotten worse result,
     * than with the current one:
     * 1) Weighted arithmetic mean of these two ratios - adding up fractions puts
     * less emphasis on ratios between 0 and 1. Ratios 10 and 0.1 should be considered
     * to be just as strong evidences in opposite directions. The arithmetic mean of these
     * would be heavily biased towards the 10.
     * 2) Absolute cost (cost = weight * rowCount + (1 - weight) * size) - when adding up
     * two numeric measurements that have different units we can easily end up with one
     * overwhelming the other.
     * @param other (undocumented)
     * @param conf (undocumented)
     * @return (undocumented)
     */
    public  boolean betterThan (org.apache.spark.sql.catalyst.optimizer.JoinReorderDP.JoinPlan other, org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class JoinPlan$ extends scala.runtime.AbstractFunction4<scala.collection.immutable.Set<java.lang.Object>, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.optimizer.Cost, org.apache.spark.sql.catalyst.optimizer.JoinReorderDP.JoinPlan> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final JoinPlan$ MODULE$ = null;
    public   JoinPlan$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan search (org.apache.spark.sql.internal.SQLConf conf, scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> items, scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> conditions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitConjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static public  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> findExpressionAndTrackLineageDown (org.apache.spark.sql.catalyst.expressions.Expression exp, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitDisjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression replaceAlias (org.apache.spark.sql.catalyst.expressions.Expression condition, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Expression> aliases)  { throw new RuntimeException(); }
  static protected  boolean canEvaluate (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static protected  boolean canEvaluateWithinJoin (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
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

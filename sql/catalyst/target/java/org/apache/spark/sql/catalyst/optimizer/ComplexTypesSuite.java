package org.apache.spark.sql.catalyst.optimizer;
/**
 * SPARK-18601 discusses simplification direct access to complex types creators.
 * i.e. <pre><code>create_named_struct(square, <code>x</code> * <code>x</code>).square</code></pre> can be simplified to <pre><code><code>x</code> * <code>x</code></code></pre>.
 * sam applies to create_array and create_map
 */
public  class ComplexTypesSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.catalyst.plans.PlanTest, org.apache.spark.sql.catalyst.expressions.ExpressionEvalHelper {
  // not preceding
  // not preceding
  public  class Optimizer {
    // not preceding
    static public  scala.collection.immutable.List<org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>.Batch> batches ()  { throw new RuntimeException(); }
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
    static protected  scala.collection.immutable.Set<java.lang.String> blacklistedOnceBatches ()  { throw new RuntimeException(); }
    static protected  boolean isPlanIntegral (TreeType plan)  { throw new RuntimeException(); }
    static public  TreeType executeAndTrack (TreeType plan, org.apache.spark.sql.catalyst.QueryPlanningTracker tracker)  { throw new RuntimeException(); }
    static public  TreeType execute (TreeType plan)  { throw new RuntimeException(); }
    static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
    static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class Optimizer$ extends org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Optimizer$ MODULE$ = null;
    public   Optimizer$ ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.immutable.List<org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>.Batch> batches ()  { throw new RuntimeException(); }
  }
  // not preceding
  public   ComplexTypesSuite ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.MaxDiscarded$ MaxDiscarded ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.MaxDiscardedFactor$ MaxDiscardedFactor ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.MaxSize$ MaxSize ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.MinSize$ MinSize ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.MinSuccessful$ MinSuccessful ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.optimizer.ComplexTypesSuite.Optimizer$ Optimizer ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.PropertyCheckConfig$ PropertyCheckConfig ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.PropertyCheckConfiguration$ PropertyCheckConfiguration ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.SizeRange$ SizeRange ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.Workers$ Workers ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.prop.Configuration.PropertyCheckConfiguration generatorDrivenConfig ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
}

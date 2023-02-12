package org.apache.spark.sql.catalyst.optimizer;
/**
 * Dummy rule for test batches
 */
public  class OptimizerExtendableSuite extends org.apache.spark.SparkFunSuite {
  // not preceding
  // not preceding
  public  class DummyRule {
    // not preceding
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan p)  { throw new RuntimeException(); }
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
    static public  java.lang.String ruleName ()  { throw new RuntimeException(); }
    static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
    static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class DummyRule$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DummyRule$ MODULE$ = null;
    public   DummyRule$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan p)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class ExtendedOptimizer extends org.apache.spark.sql.catalyst.optimizer.SimpleTestOptimizer {
    // not preceding
    public   ExtendedOptimizer ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>.Batch> defaultBatches ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>.Batch> myBatches ()  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.catalyst.optimizer.OptimizerExtendableSuite.DummyRule$ DummyRule ()  { throw new RuntimeException(); }
  // not preceding
  public   OptimizerExtendableSuite ()  { throw new RuntimeException(); }
}

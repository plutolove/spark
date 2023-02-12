package org.apache.spark.sql.catalyst.analysis;
/**
 * If the plan cannot be resolved within maxIterations, analyzer will throw exception to inform
 * user to increase the value of SQLConf.ANALYZER_MAX_ITERATIONS.
 */
public  class Analyzer extends org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.CheckAnalysis, org.apache.spark.sql.connector.catalog.LookupCatalog {
  /**
   * For {@link Add}:
   * 1. if both side are interval, stays the same;
   * 2. else if one side is date and the other is interval,
   *    turns it to {@link DateAddInterval};
   * 3. else if one side is interval, turns it to {@link TimeAdd};
   * 4. else if one side is date, turns it to {@link DateAdd} ;
   * 5. else stays the same.
   * <p>
   * For {@link Subtract}:
   * 1. if both side are interval, stays the same;
   * 2. else if the left side is date and the right side is interval,
   *    turns it to {@link DateAddInterval(l, -r)};
   * 3. else if the right side is an interval, turns it to {@link TimeSub};
   * 4. else if one side is timestamp, turns it to {@link SubtractTimestamps};
   * 5. else if the right side is date, turns it to {@link DateDiff}/{@link SubtractDates};
   * 6. else if the left side is date, turns it to {@link DateSub};
   * 7. else turns it to stays the same.
   * <p>
   * For {@link Multiply}:
   * 1. If one side is interval, turns it to {@link MultiplyInterval};
   * 2. otherwise, stays the same.
   * <p>
   * For {@link Divide}:
   * 1. If the left side is interval, turns it to {@link DivideInterval};
   * 2. otherwise, stays the same.
   */
  // not preceding
  public  class ResolveBinaryArithmetic {
    // not preceding
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  /**
   * For {@link Add}:
   * 1. if both side are interval, stays the same;
   * 2. else if one side is date and the other is interval,
   *    turns it to {@link DateAddInterval};
   * 3. else if one side is interval, turns it to {@link TimeAdd};
   * 4. else if one side is date, turns it to {@link DateAdd} ;
   * 5. else stays the same.
   * <p>
   * For {@link Subtract}:
   * 1. if both side are interval, stays the same;
   * 2. else if the left side is date and the right side is interval,
   *    turns it to {@link DateAddInterval(l, -r)};
   * 3. else if the right side is an interval, turns it to {@link TimeSub};
   * 4. else if one side is timestamp, turns it to {@link SubtractTimestamps};
   * 5. else if the right side is date, turns it to {@link DateDiff}/{@link SubtractDates};
   * 6. else if the left side is date, turns it to {@link DateSub};
   * 7. else turns it to stays the same.
   * <p>
   * For {@link Multiply}:
   * 1. If one side is interval, turns it to {@link MultiplyInterval};
   * 2. otherwise, stays the same.
   * <p>
   * For {@link Divide}:
   * 1. If the left side is interval, turns it to {@link DivideInterval};
   * 2. otherwise, stays the same.
   */
  // not preceding
  public  class ResolveBinaryArithmetic$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveBinaryArithmetic$ MODULE$ = null;
    public   ResolveBinaryArithmetic$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class WindowsSubstitution {
    // not preceding
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  public  class WindowsSubstitution$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final WindowsSubstitution$ MODULE$ = null;
    public   WindowsSubstitution$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ResolveAliases {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  public  class ResolveAliases$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveAliases$ MODULE$ = null;
    public   ResolveAliases$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ResolveGroupingAnalytics {
    // not preceding
    static public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> rollupExprs (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
    static public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> cubeExprs (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
    static public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> cubeExprs0 (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
    static   boolean hasGroupingFunction (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  public  class ResolveGroupingAnalytics$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveGroupingAnalytics$ MODULE$ = null;
    public   ResolveGroupingAnalytics$ ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> rollupExprs (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
    public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> cubeExprs (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
    public  scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>> cubeExprs0 (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
      boolean hasGroupingFunction (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ResolvePivot {
    // not preceding
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  public  class ResolvePivot$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolvePivot$ MODULE$ = null;
    public   ResolvePivot$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class ResolveNamespace extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.connector.catalog.LookupCatalog, scala.Product, scala.Serializable {
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.catalog.LookupCatalog.SessionCatalogAndIdentifier$ SessionCatalogAndIdentifier ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.catalog.LookupCatalog.NonSessionCatalogAndIdentifier$ NonSessionCatalogAndIdentifier ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.catalog.LookupCatalog.CatalogAndNamespace$ CatalogAndNamespace ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.catalog.LookupCatalog.CatalogAndIdentifier$ CatalogAndIdentifier ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.connector.catalog.LookupCatalog.AsTableIdentifier$ AsTableIdentifier ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.connector.catalog.CatalogManager catalogManager ()  { throw new RuntimeException(); }
    // not preceding
    public   ResolveNamespace (org.apache.spark.sql.connector.catalog.CatalogManager catalogManager)  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class ResolveNamespace$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.connector.catalog.CatalogManager, org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveNamespace> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveNamespace$ MODULE$ = null;
    public   ResolveNamespace$ ()  { throw new RuntimeException(); }
  }
  /**
   * Resolve relations to temp views. This is not an actual rule, and is called by
   * {@link ResolveTables} and {@link ResolveRelations}.
   */
  // not preceding
  public  class ResolveTempViews {
    // not preceding
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    static public  scala.Option<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> lookupTempView (scala.collection.Seq<java.lang.String> identifier)  { throw new RuntimeException(); }
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
  /**
   * Resolve relations to temp views. This is not an actual rule, and is called by
   * {@link ResolveTables} and {@link ResolveRelations}.
   */
  // not preceding
  public  class ResolveTempViews$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveTempViews$ MODULE$ = null;
    public   ResolveTempViews$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> lookupTempView (scala.collection.Seq<java.lang.String> identifier)  { throw new RuntimeException(); }
  }
  /**
   * Performs the lookup of DataSourceV2 Tables from v2 catalog.
   */
  // not preceding
  public  class ResolveTables {
    // not preceding
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  /**
   * Performs the lookup of DataSourceV2 Tables from v2 catalog.
   */
  // not preceding
  public  class ResolveTables$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveTables$ MODULE$ = null;
    public   ResolveTables$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ResolveRelations {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  public  class ResolveRelations$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveRelations$ MODULE$ = null;
    public   ResolveRelations$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ResolveInsertInto {
    // not preceding
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  public  class ResolveInsertInto$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveInsertInto$ MODULE$ = null;
    public   ResolveInsertInto$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ResolveReferences {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    static public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.Assignment> resolveAssignments (scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.Assignment> assignments, org.apache.spark.sql.catalyst.plans.logical.MergeIntoTable mergeInto, boolean resolveValuesWithSourceOnly)  { throw new RuntimeException(); }
    static public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> newAliases (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> expressions)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.catalyst.expressions.AttributeSet findAliases (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList)  { throw new RuntimeException(); }
    /**
     * Returns true if <code>exprs</code> contains a {@link Star}.
     * @param exprs (undocumented)
     * @return (undocumented)
     */
    static public  boolean containsStar (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
    /**
     * Expands the matching attribute.*'s in <code>child</code>'s output.
     * @param expr (undocumented)
     * @param child (undocumented)
     * @return (undocumented)
     */
    static public  org.apache.spark.sql.catalyst.expressions.Expression expandStarExpression (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
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
  public  class ResolveReferences$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveReferences$ MODULE$ = null;
    public   ResolveReferences$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.Assignment> resolveAssignments (scala.collection.Seq<org.apache.spark.sql.catalyst.plans.logical.Assignment> assignments, org.apache.spark.sql.catalyst.plans.logical.MergeIntoTable mergeInto, boolean resolveValuesWithSourceOnly)  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> newAliases (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> expressions)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.AttributeSet findAliases (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projectList)  { throw new RuntimeException(); }
    /**
     * Returns true if <code>exprs</code> contains a {@link Star}.
     * @param exprs (undocumented)
     * @return (undocumented)
     */
    public  boolean containsStar (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
    /**
     * Expands the matching attribute.*'s in <code>child</code>'s output.
     * @param expr (undocumented)
     * @param child (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.sql.catalyst.expressions.Expression expandStarExpression (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
  }
  /**
   * In many dialects of SQL it is valid to use ordinal positions in order/sort by and group by
   * clauses. This rule is to convert ordinal positions to the corresponding expressions in the
   * select list. This support is introduced in Spark 2.0.
   * <p>
   * - When the sort references or group by expressions are not integer but foldable expressions,
   * just ignore them.
   * - When spark.sql.orderByOrdinal/spark.sql.groupByOrdinal is set to false, ignore the position
   * numbers too.
   * <p>
   * Before the release of Spark 2.0, the literals in order/sort by and group by clauses
   * have no effect on the results.
   */
  // not preceding
  public  class ResolveOrdinalInOrderByAndGroupBy {
    // not preceding
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  /**
   * In many dialects of SQL it is valid to use ordinal positions in order/sort by and group by
   * clauses. This rule is to convert ordinal positions to the corresponding expressions in the
   * select list. This support is introduced in Spark 2.0.
   * <p>
   * - When the sort references or group by expressions are not integer but foldable expressions,
   * just ignore them.
   * - When spark.sql.orderByOrdinal/spark.sql.groupByOrdinal is set to false, ignore the position
   * numbers too.
   * <p>
   * Before the release of Spark 2.0, the literals in order/sort by and group by clauses
   * have no effect on the results.
   */
  // not preceding
  public  class ResolveOrdinalInOrderByAndGroupBy$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveOrdinalInOrderByAndGroupBy$ MODULE$ = null;
    public   ResolveOrdinalInOrderByAndGroupBy$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ResolveAggAliasInGroupBy {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  public  class ResolveAggAliasInGroupBy$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveAggAliasInGroupBy$ MODULE$ = null;
    public   ResolveAggAliasInGroupBy$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ResolveMissingReferences {
    // not preceding
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  public  class ResolveMissingReferences$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveMissingReferences$ MODULE$ = null;
    public   ResolveMissingReferences$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class LookupFunctions {
    // not preceding
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.catalyst.FunctionIdentifier normalizeFuncName (org.apache.spark.sql.catalyst.FunctionIdentifier name)  { throw new RuntimeException(); }
    static protected  java.lang.String formatDatabaseName (java.lang.String name)  { throw new RuntimeException(); }
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
  public  class LookupFunctions$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final LookupFunctions$ MODULE$ = null;
    public   LookupFunctions$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.FunctionIdentifier normalizeFuncName (org.apache.spark.sql.catalyst.FunctionIdentifier name)  { throw new RuntimeException(); }
    protected  java.lang.String formatDatabaseName (java.lang.String name)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ResolveFunctions {
    // not preceding
    static public  java.util.concurrent.atomic.AtomicBoolean trimWarningEnabled ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  public  class ResolveFunctions$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveFunctions$ MODULE$ = null;
    public   ResolveFunctions$ ()  { throw new RuntimeException(); }
    // not preceding
    public  java.util.concurrent.atomic.AtomicBoolean trimWarningEnabled ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ResolveSubquery {
    /**
     * Resolve and rewrite all subqueries in an operator tree..
     * @param plan (undocumented)
     * @return (undocumented)
     */
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
    static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitConjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
    static public  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> findExpressionAndTrackLineageDown (org.apache.spark.sql.catalyst.expressions.Expression exp, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitDisjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
    static protected  org.apache.spark.sql.catalyst.expressions.Expression replaceAlias (org.apache.spark.sql.catalyst.expressions.Expression condition, org.apache.spark.sql.catalyst.expressions.AttributeMap<org.apache.spark.sql.catalyst.expressions.Expression> aliases)  { throw new RuntimeException(); }
    static protected  boolean canEvaluate (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    static protected  boolean canEvaluateWithinJoin (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ResolveSubquery$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.expressions.PredicateHelper {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveSubquery$ MODULE$ = null;
    public   ResolveSubquery$ ()  { throw new RuntimeException(); }
    /**
     * Resolve and rewrite all subqueries in an operator tree..
     * @param plan (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ResolveSubqueryColumnAliases {
    // not preceding
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  public  class ResolveSubqueryColumnAliases$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveSubqueryColumnAliases$ MODULE$ = null;
    public   ResolveSubqueryColumnAliases$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class GlobalAggregates {
    // not preceding
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    static public  boolean containsAggregates (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
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
  public  class GlobalAggregates$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final GlobalAggregates$ MODULE$ = null;
    public   GlobalAggregates$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    public  boolean containsAggregates (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ResolveAggregateFunctions {
    // not preceding
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    static public  boolean containsAggregate (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
    static public  scala.Option<scala.Tuple2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression>, org.apache.spark.sql.catalyst.expressions.Expression>> resolveFilterCondInAggregate (org.apache.spark.sql.catalyst.expressions.Expression filterCond, org.apache.spark.sql.catalyst.plans.logical.Aggregate agg)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan resolveHaving (org.apache.spark.sql.catalyst.plans.logical.Filter filter, org.apache.spark.sql.catalyst.plans.logical.Aggregate agg)  { throw new RuntimeException(); }
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
  public  class ResolveAggregateFunctions$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveAggregateFunctions$ MODULE$ = null;
    public   ResolveAggregateFunctions$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    public  boolean containsAggregate (org.apache.spark.sql.catalyst.expressions.Expression condition)  { throw new RuntimeException(); }
    public  scala.Option<scala.Tuple2<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression>, org.apache.spark.sql.catalyst.expressions.Expression>> resolveFilterCondInAggregate (org.apache.spark.sql.catalyst.expressions.Expression filterCond, org.apache.spark.sql.catalyst.plans.logical.Aggregate agg)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan resolveHaving (org.apache.spark.sql.catalyst.plans.logical.Filter filter, org.apache.spark.sql.catalyst.plans.logical.Aggregate agg)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ExtractGenerator {
    // not preceding
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  public  class ExtractGenerator$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ExtractGenerator$ MODULE$ = null;
    public   ExtractGenerator$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ResolveGenerate {
    // not preceding
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    /**
     * Construct the output attributes for a {@link Generator}, given a list of names.  If the list of
     * names is empty names are assigned from field names in generator.
     * @param generator (undocumented)
     * @param names (undocumented)
     * @return (undocumented)
     */
    static   scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> makeGeneratorOutput (org.apache.spark.sql.catalyst.expressions.Generator generator, scala.collection.Seq<java.lang.String> names)  { throw new RuntimeException(); }
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
  public  class ResolveGenerate$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveGenerate$ MODULE$ = null;
    public   ResolveGenerate$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    /**
     * Construct the output attributes for a {@link Generator}, given a list of names.  If the list of
     * names is empty names are assigned from field names in generator.
     * @param generator (undocumented)
     * @param names (undocumented)
     * @return (undocumented)
     */
      scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> makeGeneratorOutput (org.apache.spark.sql.catalyst.expressions.Generator generator, scala.collection.Seq<java.lang.String> names)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ExtractWindowExpressions {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  public  class ExtractWindowExpressions$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ExtractWindowExpressions$ MODULE$ = null;
    public   ExtractWindowExpressions$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class PullOutNondeterministic {
    // not preceding
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  public  class PullOutNondeterministic$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final PullOutNondeterministic$ MODULE$ = null;
    public   PullOutNondeterministic$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ResolveRandomSeed {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  public  class ResolveRandomSeed$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveRandomSeed$ MODULE$ = null;
    public   ResolveRandomSeed$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class HandleNullInputsForUDF {
    // not preceding
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  public  class HandleNullInputsForUDF$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final HandleNullInputsForUDF$ MODULE$ = null;
    public   HandleNullInputsForUDF$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ResolveWindowFrame {
    // not preceding
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  public  class ResolveWindowFrame$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveWindowFrame$ MODULE$ = null;
    public   ResolveWindowFrame$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ResolveWindowOrder {
    // not preceding
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  public  class ResolveWindowOrder$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveWindowOrder$ MODULE$ = null;
    public   ResolveWindowOrder$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ResolveNaturalAndUsingJoin {
    // not preceding
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  public  class ResolveNaturalAndUsingJoin$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveNaturalAndUsingJoin$ MODULE$ = null;
    public   ResolveNaturalAndUsingJoin$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ResolveOutputRelation {
    // not preceding
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  public  class ResolveOutputRelation$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveOutputRelation$ MODULE$ = null;
    public   ResolveOutputRelation$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  /**
   * For each top-level Tuple field, we use {@link GetColumnByOrdinal} to get its corresponding column
   * by position.  However, the actual number of columns may be different from the number of Tuple
   * fields.  This method is used to check the number of columns and fields, and throw an
   * exception if they do not match.
   */
  // not preceding
  public  class ResolveDeserializer {
    // not preceding
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  /**
   * For each top-level Tuple field, we use {@link GetColumnByOrdinal} to get its corresponding column
   * by position.  However, the actual number of columns may be different from the number of Tuple
   * fields.  This method is used to check the number of columns and fields, and throw an
   * exception if they do not match.
   */
  // not preceding
  public  class ResolveDeserializer$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveDeserializer$ MODULE$ = null;
    public   ResolveDeserializer$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ResolveNewInstance {
    // not preceding
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  public  class ResolveNewInstance$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveNewInstance$ MODULE$ = null;
    public   ResolveNewInstance$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ResolveUpCast {
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  public  class ResolveUpCast$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveUpCast$ MODULE$ = null;
    public   ResolveUpCast$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class ResolveAlterTableChanges {
    // not preceding
    static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  public  class ResolveAlterTableChanges$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ResolveAlterTableChanges$ MODULE$ = null;
    public   ResolveAlterTableChanges$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  public   Analyzer (org.apache.spark.sql.connector.catalog.CatalogManager catalogManager, org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  public   Analyzer (org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog, org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.AsTableIdentifier$ AsTableIdentifier ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.CatalogAndIdentifier$ CatalogAndIdentifier ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.CatalogAndNamespace$ CatalogAndNamespace ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ExtractGenerator$ ExtractGenerator ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ExtractWindowExpressions$ ExtractWindowExpressions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.GlobalAggregates$ GlobalAggregates ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.HandleNullInputsForUDF$ HandleNullInputsForUDF ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.LookupFunctions$ LookupFunctions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.NonSessionCatalogAndIdentifier$ NonSessionCatalogAndIdentifier ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.PullOutNondeterministic$ PullOutNondeterministic ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveAggAliasInGroupBy$ ResolveAggAliasInGroupBy ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveAggregateFunctions$ ResolveAggregateFunctions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveAliases$ ResolveAliases ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveAlterTableChanges$ ResolveAlterTableChanges ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveBinaryArithmetic$ ResolveBinaryArithmetic ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveDeserializer$ ResolveDeserializer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveFunctions$ ResolveFunctions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveGenerate$ ResolveGenerate ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveGroupingAnalytics$ ResolveGroupingAnalytics ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveInsertInto$ ResolveInsertInto ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveMissingReferences$ ResolveMissingReferences ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveNaturalAndUsingJoin$ ResolveNaturalAndUsingJoin ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveNewInstance$ ResolveNewInstance ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveOrdinalInOrderByAndGroupBy$ ResolveOrdinalInOrderByAndGroupBy ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveOutputRelation$ ResolveOutputRelation ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolvePivot$ ResolvePivot ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveRandomSeed$ ResolveRandomSeed ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveReferences$ ResolveReferences ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveRelations$ ResolveRelations ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveSubquery$ ResolveSubquery ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveSubqueryColumnAliases$ ResolveSubqueryColumnAliases ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveTables$ ResolveTables ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveTempViews$ ResolveTempViews ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveUpCast$ ResolveUpCast ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveWindowFrame$ ResolveWindowFrame ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveWindowOrder$ ResolveWindowOrder ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.SessionCatalogAndIdentifier$ SessionCatalogAndIdentifier ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.WindowsSubstitution$ WindowsSubstitution ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>.Batch> batches ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.CatalogManager catalogManager ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan execute (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan executeAndCheck (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.catalyst.QueryPlanningTracker tracker)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<scala.Function1<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, scala.runtime.BoxedUnit>> extendedCheckRules ()  { throw new RuntimeException(); }
  /**
   * Override to provide additional rules for the "Resolution" batch.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> extendedResolutionRules ()  { throw new RuntimeException(); }
  /**
   * If the plan cannot be resolved within maxIterations, analyzer will throw exception to inform
   * user to increase the value of SQLConf.ANALYZER_MAX_ITERATIONS.
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>.FixedPoint fixedPoint ()  { throw new RuntimeException(); }
  public  boolean isView (scala.collection.Seq<java.lang.String> nameParts)  { throw new RuntimeException(); }
  /**
   * Override to provide rules to do post-hoc resolution. Note that these rules will be executed
   * in an individual batch. This batch is to run right after the normal resolution batch and
   * execute its rules in one pass.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> postHocResolutionRules ()  { throw new RuntimeException(); }
  /**
   * Resolves the attribute, column value and extract value expressions(s) by traversing the
   * input expression in bottom-up manner. In order to resolve the nested complex type fields
   * correctly, this function makes use of <code>throws</code> parameter to control when to raise an
   * AnalysisException.
   * <p>
   * Example :
   * SELECT a.b FROM t ORDER BY b[0].d
   * <p>
   * In the above example, in b needs to be resolved before d can be resolved. Given we are
   * doing a bottom up traversal, it will first attempt to resolve d and fail as b has not
   * been resolved yet. If <code>throws</code> is false, this function will handle the exception by
   * returning the original attribute. In this case <code>d</code> will be resolved in subsequent passes
   * after <code>b</code> is resolved.
   * @param expr (undocumented)
   * @param plan (undocumented)
   * @param throws_ (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.sql.catalyst.expressions.Expression resolveExpressionBottomUp (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, boolean throws_)  { throw new RuntimeException(); }
  public  scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver ()  { throw new RuntimeException(); }
}

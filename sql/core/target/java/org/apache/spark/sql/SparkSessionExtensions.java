package org.apache.spark.sql;
/**
 * Build the override rules for columnar execution.
 */
public  class SparkSessionExtensions {
  // not preceding
  public   SparkSessionExtensions ()  { throw new RuntimeException(); }
  /**
   * Build the check analysis <code>Rule</code>s using the given {@link SparkSession}.
   * @param session (undocumented)
   * @return (undocumented)
   */
    scala.collection.Seq<scala.Function1<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, scala.runtime.BoxedUnit>> buildCheckRules (org.apache.spark.sql.SparkSession session)  { throw new RuntimeException(); }
  /**
   * Build the override rules for columnar execution.
   * @param session (undocumented)
   * @return (undocumented)
   */
    scala.collection.Seq<org.apache.spark.sql.execution.ColumnarRule> buildColumnarRules (org.apache.spark.sql.SparkSession session)  { throw new RuntimeException(); }
    scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> buildOptimizerRules (org.apache.spark.sql.SparkSession session)  { throw new RuntimeException(); }
    org.apache.spark.sql.catalyst.parser.ParserInterface buildParser (org.apache.spark.sql.SparkSession session, org.apache.spark.sql.catalyst.parser.ParserInterface initial)  { throw new RuntimeException(); }
    scala.collection.Seq<org.apache.spark.sql.execution.SparkStrategy> buildPlannerStrategies (org.apache.spark.sql.SparkSession session)  { throw new RuntimeException(); }
  /**
   * Build the analyzer post-hoc resolution <code>Rule</code>s using the given {@link SparkSession}.
   * @param session (undocumented)
   * @return (undocumented)
   */
    scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> buildPostHocResolutionRules (org.apache.spark.sql.SparkSession session)  { throw new RuntimeException(); }
  /**
   * Build the override rules for the query stage preparation phase of adaptive query execution.
   * @param session (undocumented)
   * @return (undocumented)
   */
    scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan>> buildQueryStagePrepRules (org.apache.spark.sql.SparkSession session)  { throw new RuntimeException(); }
  /**
   * Build the analyzer resolution <code>Rule</code>s using the given {@link SparkSession}.
   * @param session (undocumented)
   * @return (undocumented)
   */
    scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> buildResolutionRules (org.apache.spark.sql.SparkSession session)  { throw new RuntimeException(); }
  /**
   * Inject an check analysis <code>Rule</code> builder into the {@link SparkSession}. The injected rules will
   * be executed after the analysis phase. A check analysis rule is used to detect problems with a
   * LogicalPlan and should throw an exception when a problem is found.
   * @param builder (undocumented)
   */
  public  void injectCheckRule (scala.Function1<org.apache.spark.sql.SparkSession, scala.Function1<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, scala.runtime.BoxedUnit>> builder)  { throw new RuntimeException(); }
  /**
   * Inject a rule that can override the columnar execution of an executor.
   * @param builder (undocumented)
   */
  public  void injectColumnar (scala.Function1<org.apache.spark.sql.SparkSession, org.apache.spark.sql.execution.ColumnarRule> builder)  { throw new RuntimeException(); }
  /**
   * Injects a custom function into the {@link org.apache.spark.sql.catalyst.analysis.FunctionRegistry}
   * at runtime for all sessions.
   * @param functionDescription (undocumented)
   */
  public  void injectFunction (scala.Tuple3<org.apache.spark.sql.catalyst.FunctionIdentifier, org.apache.spark.sql.catalyst.expressions.ExpressionInfo, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression>> functionDescription)  { throw new RuntimeException(); }
  /**
   * Inject an optimizer <code>Rule</code> builder into the {@link SparkSession}. The injected rules will be
   * executed during the operator optimization batch. An optimizer rule is used to improve the
   * quality of an analyzed logical plan; these rules should never modify the result of the
   * LogicalPlan.
   * @param builder (undocumented)
   */
  public  void injectOptimizerRule (scala.Function1<org.apache.spark.sql.SparkSession, org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> builder)  { throw new RuntimeException(); }
  /**
   * Inject a custom parser into the {@link SparkSession}. Note that the builder is passed a session
   * and an initial parser. The latter allows for a user to create a partial parser and to delegate
   * to the underlying parser for completeness. If a user injects more parsers, then the parsers
   * are stacked on top of each other.
   * @param builder (undocumented)
   */
  public  void injectParser (scala.Function2<org.apache.spark.sql.SparkSession, org.apache.spark.sql.catalyst.parser.ParserInterface, org.apache.spark.sql.catalyst.parser.ParserInterface> builder)  { throw new RuntimeException(); }
  /**
   * Inject a planner <code>Strategy</code> builder into the {@link SparkSession}. The injected strategy will
   * be used to convert a <code>LogicalPlan</code> into a executable
   * {@link org.apache.spark.sql.execution.SparkPlan}.
   * @param builder (undocumented)
   */
  public  void injectPlannerStrategy (scala.Function1<org.apache.spark.sql.SparkSession, org.apache.spark.sql.execution.SparkStrategy> builder)  { throw new RuntimeException(); }
  /**
   * Inject an analyzer <code>Rule</code> builder into the {@link SparkSession}. These analyzer
   * rules will be executed after resolution.
   * @param builder (undocumented)
   */
  public  void injectPostHocResolutionRule (scala.Function1<org.apache.spark.sql.SparkSession, org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> builder)  { throw new RuntimeException(); }
  /**
   * Inject a rule that can override the the query stage preparation phase of adaptive query
   * execution.
   * @param builder (undocumented)
   */
  public  void injectQueryStagePrepRule (scala.Function1<org.apache.spark.sql.SparkSession, org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan>> builder)  { throw new RuntimeException(); }
  /**
   * Inject an analyzer resolution <code>Rule</code> builder into the {@link SparkSession}. These analyzer
   * rules will be executed as part of the resolution phase of analysis.
   * @param builder (undocumented)
   */
  public  void injectResolutionRule (scala.Function1<org.apache.spark.sql.SparkSession, org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> builder)  { throw new RuntimeException(); }
    org.apache.spark.sql.catalyst.analysis.FunctionRegistry registerFunctions (org.apache.spark.sql.catalyst.analysis.FunctionRegistry functionRegistry)  { throw new RuntimeException(); }
}

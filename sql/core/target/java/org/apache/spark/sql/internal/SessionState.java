package org.apache.spark.sql.internal;
/**
 * Get an identical copy of the <code>SessionState</code> and associate it with the given <code>SparkSession</code>
 */
  class SessionState {
  // not preceding
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.ExperimentalMethods experimentalMethods ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.FunctionRegistry functionRegistry ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.UDFRegistration udfRegistration ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.parser.ParserInterface sqlParser ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlanner planner ()  { throw new RuntimeException(); }
  public  scala.Function0<org.apache.spark.sql.streaming.StreamingQueryManager> streamingQueryManagerBuilder ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.util.ExecutionListenerManager listenerManager ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.ColumnarRule> columnarRules ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan>> queryStagePrepRules ()  { throw new RuntimeException(); }
  // not preceding
  public   SessionState (org.apache.spark.sql.internal.SharedState sharedState, org.apache.spark.sql.internal.SQLConf conf, org.apache.spark.sql.ExperimentalMethods experimentalMethods, org.apache.spark.sql.catalyst.analysis.FunctionRegistry functionRegistry, org.apache.spark.sql.UDFRegistration udfRegistration, scala.Function0<org.apache.spark.sql.catalyst.catalog.SessionCatalog> catalogBuilder, org.apache.spark.sql.catalyst.parser.ParserInterface sqlParser, scala.Function0<org.apache.spark.sql.catalyst.analysis.Analyzer> analyzerBuilder, scala.Function0<org.apache.spark.sql.catalyst.optimizer.Optimizer> optimizerBuilder, org.apache.spark.sql.execution.SparkPlanner planner, scala.Function0<org.apache.spark.sql.streaming.StreamingQueryManager> streamingQueryManagerBuilder, org.apache.spark.sql.util.ExecutionListenerManager listenerManager, scala.Function0<org.apache.spark.sql.internal.SessionResourceLoader> resourceLoaderBuilder, scala.Function1<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.execution.QueryExecution> createQueryExecution, scala.Function2<org.apache.spark.sql.SparkSession, org.apache.spark.sql.internal.SessionState, org.apache.spark.sql.internal.SessionState> createClone, scala.collection.Seq<org.apache.spark.sql.execution.ColumnarRule> columnarRules, scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan>> queryStagePrepRules)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.catalog.SessionCatalog catalog ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.analysis.Analyzer analyzer ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.optimizer.Optimizer optimizer ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.internal.SessionResourceLoader resourceLoader ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.streaming.StreamingQueryManager streamingQueryManager ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.CatalogManager catalogManager ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration newHadoopConf ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration newHadoopConfWithOptions (scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * Get an identical copy of the <code>SessionState</code> and associate it with the given <code>SparkSession</code>
   * @param newSparkSession (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.internal.SessionState clone (org.apache.spark.sql.SparkSession newSparkSession)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.QueryExecution executePlan (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  public  void refreshTable (java.lang.String tableName)  { throw new RuntimeException(); }
}

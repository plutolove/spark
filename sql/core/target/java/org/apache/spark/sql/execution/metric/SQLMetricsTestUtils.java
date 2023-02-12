package org.apache.spark.sql.execution.metric;
/**
 * Get execution metrics for the SQL execution and verify metrics values.
 * <p>
 * param:  metricsValues the expected metric values (numFiles, numPartitions, numOutputRows).
 * param:  func the function can produce execution id after running.
 */
public  interface SQLMetricsTestUtils extends org.apache.spark.sql.test.SQLTestUtils {
  public  java.lang.String aggregateMetricsPattern ()  ;
  public  scala.collection.immutable.Set<java.lang.Object> currentExecutionIds ()  ;
  /**
   * Call <code>df.collect()</code> and collect necessary metrics from execution data.
   * <p>
   * @param df <code>DataFrame</code> to run
   * @param expectedNumOfJobs number of jobs that will run
   * @param expectedNodeIds the node ids of the metrics to collect from execution data.
   * @param enableWholeStage enable whole-stage code generation or not.
   * @return (undocumented)
   */
  public  scala.Option<scala.collection.immutable.Map<java.lang.Object, scala.Tuple2<java.lang.String, scala.collection.immutable.Map<java.lang.String, java.lang.Object>>>> getSparkPlanMetrics (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, int expectedNumOfJobs, scala.collection.immutable.Set<java.lang.Object> expectedNodeIds, boolean enableWholeStage)  ;
  public  java.lang.String sizeMetricPattern ()  ;
  public  org.apache.spark.sql.execution.ui.SQLAppStatusStore statusStore ()  ;
  public  void testMetricsDynamicPartition (java.lang.String provider, java.lang.String dataFormat, java.lang.String tableName)  ;
  public  void testMetricsNonDynamicPartition (java.lang.String dataFormat, java.lang.String tableName)  ;
  /**
   * Call <code>df.collect()</code> and verify if the collected metrics are same as "expectedMetrics".
   * <p>
   * @param df <code>DataFrame</code> to run
   * @param expectedNumOfJobs number of jobs that will run
   * @param expectedMetrics the expected metrics. The format is
   *                        <code>nodeId -> (operatorName, metric name -> metric value)</code>.
   */
  public  void testSparkPlanMetrics (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, int expectedNumOfJobs, scala.collection.immutable.Map<java.lang.Object, scala.Tuple2<java.lang.String, scala.collection.immutable.Map<java.lang.String, java.lang.Object>>> expectedMetrics)  ;
  /**
   * Call <code>df.collect()</code> and verify if the collected metrics satisfy the specified predicates.
   * @param df <code>DataFrame</code> to run
   * @param expectedNumOfJobs number of jobs that will run
   * @param expectedMetricsPredicates the expected metrics predicates. The format is
   *                                  <code>nodeId -> (operatorName, metric name -> metric predicate)</code>.
   * @param enableWholeStage enable whole-stage code generation or not.
   */
  public  void testSparkPlanMetricsWithPredicates (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, int expectedNumOfJobs, scala.collection.immutable.Map<java.lang.Object, scala.Tuple2<java.lang.String, scala.collection.immutable.Map<java.lang.String, scala.Function1<java.lang.Object, java.lang.Object>>>> expectedMetricsPredicates, boolean enableWholeStage)  ;
  public  java.lang.String timingMetricPattern ()  ;
  /**
   * Get execution metrics for the SQL execution and verify metrics values.
   * <p>
   * @param metricsValues the expected metric values (numFiles, numPartitions, numOutputRows).
   * @param func the function can produce execution id after running.
   */
  public  void verifyWriteDataMetrics (scala.collection.Seq<java.lang.Object> metricsValues, scala.Function0<scala.runtime.BoxedUnit> func)  ;
}

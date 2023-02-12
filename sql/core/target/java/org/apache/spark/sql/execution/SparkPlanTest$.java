package org.apache.spark.sql.execution;
/**
 * Runs the plan and makes sure the answer matches the result produced by a reference plan.
 * param:  input the input data to be used.
 * param:  planFunction a function which accepts the input SparkPlan and uses it to instantiate
 *                     the physical operator that's being tested.
 * param:  expectedPlanFunction a function which accepts the input SparkPlan and uses it to
 *                             instantiate a reference implementation of the physical operator
 *                             that's being tested. The result of executing this plan will be
 *                             treated as the source-of-truth for the test.
 */
// not preceding
public  class SparkPlanTest$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkPlanTest$ MODULE$ = null;
  public   SparkPlanTest$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<java.lang.String> checkAnswer (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> input, scala.Function1<org.apache.spark.sql.execution.SparkPlan, org.apache.spark.sql.execution.SparkPlan> planFunction, scala.Function1<org.apache.spark.sql.execution.SparkPlan, org.apache.spark.sql.execution.SparkPlan> expectedPlanFunction, boolean sortAnswers, org.apache.spark.sql.SQLContext spark)  { throw new RuntimeException(); }
  /**
   * Runs the plan and makes sure the answer matches the expected result.
   * @param input the input data to be used.
   * @param planFunction a function which accepts the input SparkPlan and uses it to instantiate
   *                     the physical operator that's being tested.
   * @param expectedAnswer the expected result in a {@link Seq} of {@link Row}s.
   * @param sortAnswers if true, the answers will be sorted by their toString representations prior
   *                    to being compared.
   * @param spark (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<java.lang.String> checkAnswer (scala.collection.Seq<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> input, scala.Function1<scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan>, org.apache.spark.sql.execution.SparkPlan> planFunction, scala.collection.Seq<org.apache.spark.sql.Row> expectedAnswer, boolean sortAnswers, org.apache.spark.sql.SQLContext spark)  { throw new RuntimeException(); }
  /**
   * Runs the plan
   * @param outputPlan SparkPlan to be executed
   * @param spark SqlContext used for execution of the plan
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.Row> executePlan (org.apache.spark.sql.execution.SparkPlan outputPlan, org.apache.spark.sql.SQLContext spark)  { throw new RuntimeException(); }
}

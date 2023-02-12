package org.apache.spark.sql.execution.datasources.orc;
/**
 * A test suite that tests Apache ORC filter API based filter pushdown optimization.
 * OrcFilterSuite and HiveOrcFilterSuite is logically duplicated to provide the same test coverage.
 * The difference are the packages containing 'Predicate' and 'SearchArgument' classes.
 * - OrcFilterSuite uses 'org.apache.orc.storage.ql.io.sarg' package.
 * - HiveOrcFilterSuite uses 'org.apache.hadoop.hive.ql.io.sarg' package.
 */
public  class OrcFilterSuite extends org.apache.spark.sql.execution.datasources.orc.OrcTest implements org.apache.spark.sql.test.SharedSparkSession {
  // not preceding
  public   OrcFilterSuite ()  { throw new RuntimeException(); }
  protected  void checkFilterPredicate (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, org.apache.spark.sql.catalyst.expressions.Predicate predicate, scala.Function1<org.apache.hadoop.hive.ql.io.sarg.SearchArgument, scala.runtime.BoxedUnit> checker)  { throw new RuntimeException(); }
  protected  void checkFilterPredicate (org.apache.spark.sql.catalyst.expressions.Predicate predicate, org.apache.hadoop.hive.ql.io.sarg.PredicateLeaf.Operator filterOperator, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
  protected  void checkFilterPredicate (org.apache.spark.sql.catalyst.expressions.Predicate predicate, java.lang.String stringExpr, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
  // not preceding
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
}

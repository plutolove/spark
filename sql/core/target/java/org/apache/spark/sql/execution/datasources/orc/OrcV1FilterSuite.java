package org.apache.spark.sql.execution.datasources.orc;
public  class OrcV1FilterSuite extends org.apache.spark.sql.execution.datasources.orc.OrcFilterSuite {
  // not preceding
  public   OrcV1FilterSuite ()  { throw new RuntimeException(); }
  public  void checkFilterPredicate (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, org.apache.spark.sql.catalyst.expressions.Predicate predicate, scala.Function1<org.apache.hadoop.hive.ql.io.sarg.SearchArgument, scala.runtime.BoxedUnit> checker)  { throw new RuntimeException(); }
  public  void checkFilterPredicate (org.apache.spark.sql.catalyst.expressions.Predicate predicate, org.apache.hadoop.hive.ql.io.sarg.PredicateLeaf.Operator filterOperator, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
  public  void checkFilterPredicate (org.apache.spark.sql.catalyst.expressions.Predicate predicate, java.lang.String stringExpr, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
  public  void checkNoFilterPredicate (org.apache.spark.sql.catalyst.expressions.Predicate predicate, boolean noneSupported, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
}

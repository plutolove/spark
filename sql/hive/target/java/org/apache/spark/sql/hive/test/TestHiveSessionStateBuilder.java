package org.apache.spark.sql.hive.test;
/**
 * A map used to store all confs that need to be overridden in sql/hive unit tests.
 */
  class TestHiveSessionStateBuilder extends org.apache.spark.sql.hive.HiveSessionStateBuilder implements org.apache.spark.sql.internal.WithTestConf {
  // not preceding
  public   TestHiveSessionStateBuilder (org.apache.spark.sql.SparkSession session, scala.Option<org.apache.spark.sql.internal.SessionState> state)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  public  scala.Function1<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.execution.QueryExecution> createQueryExecution ()  { throw new RuntimeException(); }
  protected  scala.Function2<org.apache.spark.sql.SparkSession, scala.Option<org.apache.spark.sql.internal.SessionState>, org.apache.spark.sql.internal.BaseSessionStateBuilder> newBuilder ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> overrideConfs ()  { throw new RuntimeException(); }
}

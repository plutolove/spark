package org.apache.spark.sql.catalyst;
/**
 * A PlanTest that ensures that all tests in this suite are run with nested schema pruning enabled.
 * Remove this trait once the default value of SQLConf.NESTED_SCHEMA_PRUNING_ENABLED is set to true.
 */
public  interface SchemaPruningTest extends org.apache.spark.sql.catalyst.plans.PlanTest, org.scalatest.BeforeAndAfterAll {
  public  void afterAll ()  ;
  public  void beforeAll ()  ;
}

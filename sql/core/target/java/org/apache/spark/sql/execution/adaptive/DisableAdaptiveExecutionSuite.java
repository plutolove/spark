package org.apache.spark.sql.execution.adaptive;
/**
 * Helper trait that disables AQE for all tests regardless of default config values.
 */
public  interface DisableAdaptiveExecutionSuite extends org.apache.spark.sql.test.SQLTestUtils {
  public  void test (java.lang.String testName, scala.collection.Seq<org.scalatest.Tag> testTags, scala.Function0<java.lang.Object> testFun, org.scalactic.source.Position pos)  ;
}

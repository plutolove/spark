package org.apache.spark.sql.execution.adaptive;
/**
 * Helper trait that enables AQE for all tests regardless of default config values, except that
 * tests tagged with {@link DisableAdaptiveExecution} will be skipped.
 */
public  interface EnableAdaptiveExecutionSuite extends org.apache.spark.sql.test.SQLTestUtils {
  public  boolean forceApply ()  ;
  public  void test (java.lang.String testName, scala.collection.Seq<org.scalatest.Tag> testTags, scala.Function0<java.lang.Object> testFun, org.scalactic.source.Position pos)  ;
}

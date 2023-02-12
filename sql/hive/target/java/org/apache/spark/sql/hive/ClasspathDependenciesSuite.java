package org.apache.spark.sql.hive;
/**
 * Verify that some classes load and that others are not found on the classpath.
 * <p>
 * This is used to detect classpath and shading conflicts.
 */
public  class ClasspathDependenciesSuite extends org.apache.spark.SparkFunSuite {
  // not preceding
  public   ClasspathDependenciesSuite ()  { throw new RuntimeException(); }
}

package org.apache.spark.sql.hive.execution;
/**
 * A set of test cases based on the big-data-benchmark.
 * https://amplab.cs.berkeley.edu/benchmark/
 */
public  class BigDataBenchmarkSuite extends org.apache.spark.sql.hive.execution.HiveComparisonTest {
  // not preceding
  public   BigDataBenchmarkSuite ()  { throw new RuntimeException(); }
  // not preceding
  public  java.io.File testDataDirectory ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.hive.test.TestHiveSparkSession.TestTable> testTables ()  { throw new RuntimeException(); }
  public  java.lang.String userVisitPath ()  { throw new RuntimeException(); }
}

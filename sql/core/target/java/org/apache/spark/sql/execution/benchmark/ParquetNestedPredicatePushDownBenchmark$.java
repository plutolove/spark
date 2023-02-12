package org.apache.spark.sql.execution.benchmark;
/**
 * Benchmark for sorted data with a filter which allows to filter out all the row groups
 * when nested fields predicate push down enabled
 */
// not preceding
public  class ParquetNestedPredicatePushDownBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase implements org.apache.spark.sql.execution.benchmark.SqlBasedBenchmark {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ParquetNestedPredicatePushDownBenchmark$ MODULE$ = null;
  // not preceding
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  public   ParquetNestedPredicatePushDownBenchmark$ ()  { throw new RuntimeException(); }
  /**
   * Benchmark for sorted data with a filter which allows to filter out all the row groups
   * when nested fields predicate push down enabled
   */
  public  void runLoadNoRowGroupWhenPredicatePushedDown ()  { throw new RuntimeException(); }
  /**
   * Benchmark with a filter which allows to load only some row groups
   * when nested fields predicate push down enabled
   */
  public  void runLoadSomeRowGroupWhenPredicatePushedDown ()  { throw new RuntimeException(); }
  /**
   * Benchmark with a filter which still requires to
   * load all the row groups on sorted data to see if we introduce too much
   * overhead or not if enable nested predicate push down.
   */
  public  void runLoadAllRowGroupsWhenPredicatePushedDown ()  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
}

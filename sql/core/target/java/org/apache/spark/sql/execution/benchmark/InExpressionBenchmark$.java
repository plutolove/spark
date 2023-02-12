package org.apache.spark.sql.execution.benchmark;
/**
 * A benchmark that compares the performance of different ways to evaluate SQL IN expressions.
 * <p>
 * Specifically, this class compares the if-based approach, which might iterate through all items
 * inside the IN value list, to other options with better worst-case time complexities (e.g., sets).
 * <p>
 * To run this benchmark:
 * <pre><code>
 *   1. without sbt:
 *      bin/spark-submit --class &lt;this class&gt;
 *        --jars &lt;spark core test jar&gt;,&lt;spark catalyst test jar&gt; &lt;spark sql test jar&gt;
 *   2. build/sbt "sql/test:runMain &lt;this class&gt;"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "sql/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/InExpressionBenchmark-results.txt".
 * </code></pre>
 */
// not preceding
public  class InExpressionBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase implements org.apache.spark.sql.execution.benchmark.SqlBasedBenchmark {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final InExpressionBenchmark$ MODULE$ = null;
  // not preceding
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  public   InExpressionBenchmark$ ()  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
}

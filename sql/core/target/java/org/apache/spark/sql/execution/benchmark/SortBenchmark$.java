package org.apache.spark.sql.execution.benchmark;
/**
 * Benchmark to measure performance for aggregate primitives.
 * <pre><code>
 *   To run this benchmark:
 *   1. without sbt:
 *      bin/spark-submit --class &lt;this class&gt; --jars &lt;spark core test jar&gt; &lt;sql core test jar&gt;
 *   2. build/sbt "sql/test:runMain &lt;this class&gt;"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "sql/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/&lt;this class&gt;-results.txt".
 * </code></pre>
 */
// not preceding
public  class SortBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SortBenchmark$ MODULE$ = null;
  public   SortBenchmark$ ()  { throw new RuntimeException(); }
  public  void sortBenchmark ()  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
}

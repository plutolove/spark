package org.apache.spark.sql.execution.vectorized;
/**
 * Benchmark to low level memory access using different ways to manage buffers.
 * To run this benchmark:
 * <pre><code>
 *   1. without sbt:
 *      bin/spark-submit --class &lt;this class&gt;
 *        --jars &lt;spark core test jar&gt; &lt;spark sql test jar&gt;
 *   2. build/sbt "sql/test:runMain &lt;this class&gt;"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "sql/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/ColumnarBatchBenchmark-results.txt".
 * </code></pre>
 */
// not preceding
public  class ColumnarBatchBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ColumnarBatchBenchmark$ MODULE$ = null;
  public   ColumnarBatchBenchmark$ ()  { throw new RuntimeException(); }
  // not preceding
  public  void intAccess (long iters)  { throw new RuntimeException(); }
  public  void booleanAccess (int iters)  { throw new RuntimeException(); }
  public  void stringAccess (long iters)  { throw new RuntimeException(); }
  public  void arrayAccess (int iters)  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
}

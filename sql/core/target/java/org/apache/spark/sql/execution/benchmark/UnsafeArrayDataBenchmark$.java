package org.apache.spark.sql.execution.benchmark;
/**
 * Benchmark {@link UnsafeArrayDataBenchmark} for UnsafeArrayData
 * To run this benchmark:
 * <pre><code>
 *   1. without sbt:
 *      bin/spark-submit --class &lt;this class&gt; --jars &lt;spark core test jar&gt; &lt;spark sql test jar&gt;
 *   2. build/sbt "sql/test:runMain &lt;this class&gt;"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "sql/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/UnsafeArrayDataBenchmark-results.txt".
 * </code></pre>
 */
// not preceding
public  class UnsafeArrayDataBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final UnsafeArrayDataBenchmark$ MODULE$ = null;
  public   UnsafeArrayDataBenchmark$ ()  { throw new RuntimeException(); }
  // not preceding
  public  int calculateHeaderPortionInBytes (int count)  { throw new RuntimeException(); }
  public  void readUnsafeArray (int iters)  { throw new RuntimeException(); }
  public  void writeUnsafeArray (int iters)  { throw new RuntimeException(); }
  public  void getPrimitiveArray (int iters)  { throw new RuntimeException(); }
  public  void putPrimitiveArray (int iters)  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
}

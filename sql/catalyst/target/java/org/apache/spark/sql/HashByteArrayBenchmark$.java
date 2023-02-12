package org.apache.spark.sql;
/**
 * Synthetic benchmark for MurMurHash 3 and xxHash64.
 * To run this benchmark:
 * <pre><code>
 *   1. without sbt:
 *      bin/spark-submit --class &lt;this class&gt; --jars &lt;spark core test jar&gt; &lt;spark catalyst test jar&gt;
 *   2. build/sbt "catalyst/test:runMain &lt;this class&gt;"
 *   3. generate result:
 *      SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "catalyst/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/HashByteArrayBenchmark-results.txt".
 * </code></pre>
 */
// not preceding
public  class HashByteArrayBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HashByteArrayBenchmark$ MODULE$ = null;
  public   HashByteArrayBenchmark$ ()  { throw new RuntimeException(); }
  // not preceding
  public  void test (int length, long seed, int numArrays, int iters)  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
}

package org.apache.spark.sql;
/**
 * Benchmark for the previous interpreted hash function(InternalRow.hashCode) vs codegened
 * hash expressions (Murmur3Hash/xxHash64).
 * To run this benchmark:
 * <pre><code>
 *   1. without sbt:
 *      bin/spark-submit --class &lt;this class&gt; --jars &lt;spark core test jar&gt; &lt;spark catalyst test jar&gt;
 *   2. build/sbt "catalyst/test:runMain &lt;this class&gt;"
 *   3. generate result:
 *      SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "catalyst/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/HashBenchmark-results.txt".
 * </code></pre>
 */
// not preceding
public  class HashBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HashBenchmark$ MODULE$ = null;
  public   HashBenchmark$ ()  { throw new RuntimeException(); }
  // not preceding
  public  void test (java.lang.String name, org.apache.spark.sql.types.StructType schema, int numRows, int iters)  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
}

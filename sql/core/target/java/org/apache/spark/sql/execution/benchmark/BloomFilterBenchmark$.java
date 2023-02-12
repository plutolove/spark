package org.apache.spark.sql.execution.benchmark;
/**
 * Benchmark to measure read performance with Bloom filters.
 * <p>
 * Currently, only ORC supports bloom filters, we will add Parquet BM as soon as it becomes
 * available.
 * <p>
 * To run this benchmark:
 * <pre><code>
 *   1. without sbt: bin/spark-submit --class &lt;this class&gt;
 *     --jars &lt;spark core test jar&gt;,&lt;spark catalyst test jar&gt; &lt;spark sql test jar&gt;
 *   2. build/sbt "sql/test:runMain &lt;this class&gt;"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "sql/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/BloomFilterBenchmark-results.txt".
 * </code></pre>
 */
// not preceding
public  class BloomFilterBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase implements org.apache.spark.sql.execution.benchmark.SqlBasedBenchmark {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final BloomFilterBenchmark$ MODULE$ = null;
  // not preceding
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  public   BloomFilterBenchmark$ ()  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
}

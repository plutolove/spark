package org.apache.spark.sql.execution.columnar.compression;
/**
 * Benchmark to decoders using various compression schemes.
 * To run this benchmark:
 * <pre><code>
 *   1. without sbt:
 *      bin/spark-submit --class &lt;this class&gt;
 *        --jars &lt;spark core test jar&gt;,&lt;spark catalyst test jar&gt; &lt;spark sql test jar&gt;
 *   2. build/sbt "sql/test:runMain &lt;this class&gt;"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "sql/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/CompressionSchemeBenchmark-results.txt".
 * </code></pre>
 */
// not preceding
public  class CompressionSchemeBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase implements org.apache.spark.sql.execution.columnar.compression.AllCompressionSchemes {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CompressionSchemeBenchmark$ MODULE$ = null;
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.execution.columnar.compression.CompressionScheme> schemes ()  { throw new RuntimeException(); }
  public   CompressionSchemeBenchmark$ ()  { throw new RuntimeException(); }
  public  void bitEncodingBenchmark (int iters)  { throw new RuntimeException(); }
  public  void shortEncodingBenchmark (int iters)  { throw new RuntimeException(); }
  public  void intEncodingBenchmark (int iters)  { throw new RuntimeException(); }
  public  void longEncodingBenchmark (int iters)  { throw new RuntimeException(); }
  public  void stringEncodingBenchmark (int iters)  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
}

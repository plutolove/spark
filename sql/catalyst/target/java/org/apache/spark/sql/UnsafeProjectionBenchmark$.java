package org.apache.spark.sql;
/**
 * Benchmark <code>UnsafeProjection</code> for fixed-length/primitive-type fields.
 * <pre><code>
 *   To run this benchmark:
 *   1. without sbt:
 *      bin/spark-submit --class &lt;this class&gt; --jars &lt;spark core test jar&gt; &lt;spark catalyst test jar&gt;
 *   2. build/sbt "sql/test:runMain &lt;this class&gt;"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "sql/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/UnsafeProjectionBenchmark-results.txt".
 * </code></pre>
 */
// not preceding
public  class UnsafeProjectionBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final UnsafeProjectionBenchmark$ MODULE$ = null;
  public   UnsafeProjectionBenchmark$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.InternalRow[] generateRows (org.apache.spark.sql.types.StructType schema, int numRows)  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
}

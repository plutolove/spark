package org.apache.spark.sql.execution;
/**
 * Benchmark ExternalAppendOnlyUnsafeRowArray.
 * To run this benchmark:
 * <pre><code>
 *   1. without sbt:
 *      bin/spark-submit --class &lt;this class&gt; --jars &lt;spark core test jar&gt; &lt;spark sql test jar&gt;
 *   2. build/sbt build/sbt ";project sql;set javaOptions
 *        in Test += \"-Dspark.memory.debugFill=false\";test:runMain &lt;this class&gt;"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt ";project sql;set javaOptions
 *        in Test += \"-Dspark.memory.debugFill=false\";test:runMain &lt;this class&gt;"
 *      Results will be written to
 *      "benchmarks/ExternalAppendOnlyUnsafeRowArrayBenchmark-results.txt".
 * </code></pre>
 */
// not preceding
public  class ExternalAppendOnlyUnsafeRowArrayBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ExternalAppendOnlyUnsafeRowArrayBenchmark$ MODULE$ = null;
  public   ExternalAppendOnlyUnsafeRowArrayBenchmark$ ()  { throw new RuntimeException(); }
  public  void testAgainstRawArrayBuffer (int numSpillThreshold, int numRows, int iterations)  { throw new RuntimeException(); }
  public  void testAgainstRawUnsafeExternalSorter (int numSpillThreshold, int numRows, int iterations)  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
}

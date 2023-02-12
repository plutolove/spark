package org.apache.spark.sql.execution.benchmark;
/**
 * Benchmark to measure hash based aggregation.
 * To run this benchmark:
 * <pre><code>
 *   1. without sbt: bin/spark-submit --class &lt;this class&gt;
 *        --jars &lt;spark catalyst test jar&gt;,&lt;spark core test jar&gt;,&lt;spark sql test jar&gt;
 *        &lt;spark hive test jar&gt;
 *   2. build/sbt "hive/test:runMain &lt;this class&gt;"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "hive/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/ObjectHashAggregateExecBenchmark-results.txt".
 * </code></pre>
 */
// not preceding
public  class ObjectHashAggregateExecBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase implements org.apache.spark.sql.execution.benchmark.SqlBasedBenchmark {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ObjectHashAggregateExecBenchmark$ MODULE$ = null;
  // not preceding
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  public   ObjectHashAggregateExecBenchmark$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SparkSession getSparkSession ()  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
}

package org.apache.spark.sql.execution.benchmark;
/**
 * Benchmark to measure whole stage codegen performance.
 * To run this benchmark:
 * <pre><code>
 *   1. without sbt:
 *      bin/spark-submit --class &lt;this class&gt;
 *        --jars &lt;spark core test jar&gt;,&lt;spark catalyst test jar&gt; &lt;sql core test jar&gt;
 *   2. build/sbt "sql/test:runMain &lt;this class&gt;"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "sql/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/MiscBenchmark-results.txt".
 * </code></pre>
 */
// not preceding
public  class MiscBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase implements org.apache.spark.sql.execution.benchmark.SqlBasedBenchmark {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MiscBenchmark$ MODULE$ = null;
  // not preceding
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  public   MiscBenchmark$ ()  { throw new RuntimeException(); }
  // not preceding
  public  void filterAndAggregateWithoutGroup (long numRows)  { throw new RuntimeException(); }
  public  void limitAndAggregateWithoutGroup (long numRows)  { throw new RuntimeException(); }
  public  void sample (int numRows)  { throw new RuntimeException(); }
  public  void collect (int numRows)  { throw new RuntimeException(); }
  public  void collectLimit (int numRows)  { throw new RuntimeException(); }
  public  void explode (int numRows)  { throw new RuntimeException(); }
  public  void stack (int numRows)  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
}

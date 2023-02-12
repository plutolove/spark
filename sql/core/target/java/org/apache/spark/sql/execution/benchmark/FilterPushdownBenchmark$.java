package org.apache.spark.sql.execution.benchmark;
/**
 * Benchmark to measure read performance with Filter pushdown.
 * To run this benchmark:
 * <pre><code>
 *   1. without sbt: bin/spark-submit --class &lt;this class&gt;
 *      --jars &lt;spark core test jar&gt;,&lt;spark catalyst test jar&gt; &lt;spark sql test jar&gt;
 *   2. build/sbt "sql/test:runMain &lt;this class&gt;"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "sql/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/FilterPushdownBenchmark-results.txt".
 * </code></pre>
 */
// not preceding
public  class FilterPushdownBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase implements org.apache.spark.sql.execution.benchmark.SqlBasedBenchmark {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FilterPushdownBenchmark$ MODULE$ = null;
  // not preceding
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  public   FilterPushdownBenchmark$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SparkSession getSparkSession ()  { throw new RuntimeException(); }
  public  void withTempTable (scala.collection.Seq<java.lang.String> tableNames, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  public  void filterPushDownBenchmark (int values, java.lang.String title, java.lang.String whereExpr, java.lang.String selectExpr)  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
}

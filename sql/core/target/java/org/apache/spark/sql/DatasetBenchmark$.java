package org.apache.spark.sql;
/**
 * Benchmark for Dataset typed operations comparing with DataFrame and RDD versions.
 * To run this benchmark:
 * <pre><code>
 *   1. without sbt:
 *      bin/spark-submit --class &lt;this class&gt;
 *        --jars &lt;spark core test jar&gt;,&lt;spark catalyst test jar&gt; &lt;spark sql test jar&gt;
 *   2. build/sbt "sql/test:runMain &lt;this class&gt;"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "sql/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/DatasetBenchmark-results.txt".
 * </code></pre>
 */
// not preceding
public  class DatasetBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase implements org.apache.spark.sql.execution.benchmark.SqlBasedBenchmark {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DatasetBenchmark$ MODULE$ = null;
  // not preceding
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  public   DatasetBenchmark$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.benchmark.Benchmark backToBackMapLong (org.apache.spark.sql.SparkSession spark, long numRows, int numChains)  { throw new RuntimeException(); }
  public  org.apache.spark.benchmark.Benchmark backToBackMap (org.apache.spark.sql.SparkSession spark, long numRows, int numChains)  { throw new RuntimeException(); }
  public  org.apache.spark.benchmark.Benchmark backToBackFilterLong (org.apache.spark.sql.SparkSession spark, long numRows, int numChains)  { throw new RuntimeException(); }
  public  org.apache.spark.benchmark.Benchmark backToBackFilter (org.apache.spark.sql.SparkSession spark, long numRows, int numChains)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.benchmark.Benchmark aggregate (org.apache.spark.sql.SparkSession spark, long numRows)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession getSparkSession ()  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
}

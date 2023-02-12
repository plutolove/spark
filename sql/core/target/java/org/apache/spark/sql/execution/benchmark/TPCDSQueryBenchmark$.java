package org.apache.spark.sql.execution.benchmark;
/**
 * Benchmark to measure TPCDS query performance.
 * To run this:
 * <pre><code>
 *   1. without sbt:
 *        bin/spark-submit --jars &lt;spark core test jar&gt;,&lt;spark catalyst test jar&gt;
 *          --class &lt;this class&gt; &lt;spark sql test jar&gt; --data-location &lt;location&gt;
 *   2. build/sbt "sql/test:runMain &lt;this class&gt; --data-location &lt;TPCDS data location&gt;"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt
 *        "sql/test:runMain &lt;this class&gt; --data-location &lt;location&gt;"
 *      Results will be written to "benchmarks/TPCDSQueryBenchmark-results.txt".
 * </code></pre>
 */
// not preceding
public  class TPCDSQueryBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase implements org.apache.spark.sql.execution.benchmark.SqlBasedBenchmark {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TPCDSQueryBenchmark$ MODULE$ = null;
  // not preceding
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  public   TPCDSQueryBenchmark$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SparkSession getSparkSession ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> tables ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> setupTables (java.lang.String dataLocation)  { throw new RuntimeException(); }
  public  void runTpcdsQueries (java.lang.String queryLocation, scala.collection.Seq<java.lang.String> queries, scala.collection.immutable.Map<java.lang.String, java.lang.Object> tableSizes, java.lang.String nameSuffix)  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
}

package org.apache.spark.sql.execution.benchmark;
/**
 * Benchmark to measure built-in data sources write performance.
 * To run this benchmark:
 * <pre><code>
 *   By default it measures 4 data source format: Parquet, ORC, JSON, CSV.
 *   1. without sbt: bin/spark-submit --class &lt;this class&gt;
 *        --jars &lt;spark core test jar&gt;,&lt;spark catalyst test jar&gt; &lt;spark sql test jar&gt;
 *   2. build/sbt "sql/test:runMain &lt;this class&gt;"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "sql/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/BuiltInDataSourceWriteBenchmark-results.txt".
 *
 *   To measure specified formats, run it with arguments.
 *   1. without sbt:
 *        bin/spark-submit --class &lt;this class&gt; --jars &lt;spark core test jar&gt;,
 *        &lt;spark catalyst test jar&gt; &lt;spark sql test jar&gt; format1 [format2] [...]
 *   2. build/sbt "sql/test:runMain &lt;this class&gt; format1 [format2] [...]"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt
 *        "sql/test:runMain &lt;this class&gt; format1 [format2] [...]"
 *      Results will be written to "benchmarks/BuiltInDataSourceWriteBenchmark-results.txt".
 * </code></pre>
 * <p>
 */
// not preceding
public  class BuiltInDataSourceWriteBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase implements org.apache.spark.sql.execution.benchmark.DataSourceWriteBenchmark {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final BuiltInDataSourceWriteBenchmark$ MODULE$ = null;
  // not preceding
  public  java.lang.String tempTable ()  { throw new RuntimeException(); }
  // not preceding
  public  int numRows ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  public   BuiltInDataSourceWriteBenchmark$ ()  { throw new RuntimeException(); }
  // not preceding
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
}

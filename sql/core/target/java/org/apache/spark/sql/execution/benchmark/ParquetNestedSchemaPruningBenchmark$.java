package org.apache.spark.sql.execution.benchmark;
/**
 * Synthetic benchmark for nested schema pruning performance for Parquet datasource.
 * To run this benchmark:
 * <pre><code>
 *   1. without sbt:
 *      bin/spark-submit --class &lt;this class&gt;
 *        --jars &lt;spark core test jar&gt;,&lt;spark catalyst test jar&gt; &lt;sql core test jar&gt;
 *   2. build/sbt "sql/test:runMain &lt;this class&gt;"
 *   3. generate result:
 *      SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "sql/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/ParquetNestedSchemaPruningBenchmark-results.txt".
 * </code></pre>
 */
// not preceding
public  class ParquetNestedSchemaPruningBenchmark$ extends org.apache.spark.sql.execution.benchmark.NestedSchemaPruningBenchmark {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ParquetNestedSchemaPruningBenchmark$ MODULE$ = null;
  public   ParquetNestedSchemaPruningBenchmark$ ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String dataSourceName ()  { throw new RuntimeException(); }
  public  java.lang.String benchmarkName ()  { throw new RuntimeException(); }
}

package org.apache.spark.sql.execution.benchmark;
/**
 * Benchmark primitive arrays via DataFrame and Dataset program using primitive arrays
 * To run this benchmark:
 * 1. without sbt:
 *    bin/spark-submit --class <this class>
 *      --jars <spark core test jar>,<spark catalyst test jar> < spark sql test jar>
 * 2. build/sbt "sql/test:runMain <this class>"
 * 3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "sql/test:runMain <this class>"
 *    Results will be written to "benchmarks/PrimitiveArrayBenchmark-results.txt".
 */
// not preceding
public  class PrimitiveArrayBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase implements org.apache.spark.sql.execution.benchmark.SqlBasedBenchmark {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PrimitiveArrayBenchmark$ MODULE$ = null;
  // not preceding
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  public   PrimitiveArrayBenchmark$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SparkSession getSparkSession ()  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
  public  void writeDatasetArray (int iters)  { throw new RuntimeException(); }
}

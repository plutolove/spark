package org.apache.spark.sql.execution.datasources.json;
/**
 * The benchmarks aims to measure performance of JSON parsing when encoding is set and isn't.
 * To run this benchmark:
 * <pre><code>
 *   1. without sbt:
 *      bin/spark-submit --class &lt;this class&gt; --jars &lt;spark core test jar&gt;,
 *        &lt;spark catalyst test jar&gt; &lt;spark sql test jar&gt;
 *   2. build/sbt "sql/test:runMain &lt;this class&gt;"
 *   3. generate result:
 *      SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "sql/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/JSONBenchmark-results.txt".
 * </code></pre>
 */
// not preceding
public  class JsonBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase implements org.apache.spark.sql.execution.benchmark.SqlBasedBenchmark {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final JsonBenchmark$ MODULE$ = null;
  // not preceding
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  public   JsonBenchmark$ ()  { throw new RuntimeException(); }
  public  void schemaInferring (int rowsNum, int numIters)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType writeShortColumn (java.lang.String path, int rowsNum)  { throw new RuntimeException(); }
  public  void countShortColumn (int rowsNum, int numIters)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType writeWideColumn (java.lang.String path, int rowsNum)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType writeWideRow (java.lang.String path, int rowsNum)  { throw new RuntimeException(); }
  public  void countWideColumn (int rowsNum, int numIters)  { throw new RuntimeException(); }
  public  void countWideRow (int rowsNum, int numIters)  { throw new RuntimeException(); }
  public  void selectSubsetOfColumns (int rowsNum, int numIters)  { throw new RuntimeException(); }
  public  void jsonParserCreation (int rowsNum, int numIters)  { throw new RuntimeException(); }
  public  void jsonFunctions (int rows, int iters)  { throw new RuntimeException(); }
  public  void jsonInDS (int rows, int iters)  { throw new RuntimeException(); }
  public  void jsonInFile (int rows, int iters)  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
}

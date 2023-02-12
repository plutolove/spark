package org.apache.spark.sql.execution.benchmark;
/**
 * Writes the given DataFrame to parquet at a temporary location, and returns a DataFrame
 * backed by the written parquet files.
 */
// not preceding
public  class WideSchemaBenchmark$ extends org.apache.spark.benchmark.BenchmarkBase implements org.apache.spark.sql.execution.benchmark.SqlBasedBenchmark {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final WideSchemaBenchmark$ MODULE$ = null;
  // not preceding
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  public   WideSchemaBenchmark$ ()  { throw new RuntimeException(); }
  public  void parsingLargeSelectExpressions ()  { throw new RuntimeException(); }
  public  void manyColumnFieldReadAndWrite ()  { throw new RuntimeException(); }
  public  void wideShallowlyNestedStructFieldReadAndWrite ()  { throw new RuntimeException(); }
  public  void deeplyNestedStructFieldReadAndWrite ()  { throw new RuntimeException(); }
  public  void bushyStructFieldReadAndWrite ()  { throw new RuntimeException(); }
  public  void wideArrayFieldReadAndWrite ()  { throw new RuntimeException(); }
  public  void wideMapFieldReadAndWrite ()  { throw new RuntimeException(); }
  public  void runBenchmarkWithDeleteTmpFiles (java.lang.String benchmarkName, scala.Function0<java.lang.Object> func)  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
}

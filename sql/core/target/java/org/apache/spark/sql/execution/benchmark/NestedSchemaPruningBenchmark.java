package org.apache.spark.sql.execution.benchmark;
/**
 * The base class for synthetic benchmark for nested schema pruning performance.
 */
public abstract class NestedSchemaPruningBenchmark extends org.apache.spark.benchmark.BenchmarkBase implements org.apache.spark.sql.execution.benchmark.SqlBasedBenchmark {
  protected  int N ()  { throw new RuntimeException(); }
  // not preceding
  public   NestedSchemaPruningBenchmark ()  { throw new RuntimeException(); }
  public abstract  java.lang.String benchmarkName ()  ;
  // not preceding
  public abstract  java.lang.String dataSourceName ()  ;
  protected  void limitBenchmark (int numRows, int numIters)  { throw new RuntimeException(); }
  protected  int numIters ()  { throw new RuntimeException(); }
  protected  void repartitionBenchmark (int numRows, int numIters)  { throw new RuntimeException(); }
  protected  void repartitionByExprBenchmark (int numRows, int numIters)  { throw new RuntimeException(); }
  public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
  protected  void sampleBenchmark (int numRows, int numIters)  { throw new RuntimeException(); }
  protected  void selectBenchmark (int numRows, int numIters)  { throw new RuntimeException(); }
  protected  void sortBenchmark (int numRows, int numIters)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
}

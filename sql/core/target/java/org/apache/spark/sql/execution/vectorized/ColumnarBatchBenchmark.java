package org.apache.spark.sql.execution.vectorized;
/**
 * Benchmark to low level memory access using different ways to manage buffers.
 * To run this benchmark:
 * <pre><code>
 *   1. without sbt:
 *      bin/spark-submit --class &lt;this class&gt;
 *        --jars &lt;spark core test jar&gt; &lt;spark sql test jar&gt;
 *   2. build/sbt "sql/test:runMain &lt;this class&gt;"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "sql/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/ColumnarBatchBenchmark-results.txt".
 * </code></pre>
 */
// not preceding
public  class ColumnarBatchBenchmark {
  // not preceding
  static public  void intAccess (long iters)  { throw new RuntimeException(); }
  static public  void booleanAccess (int iters)  { throw new RuntimeException(); }
  static public  void stringAccess (long iters)  { throw new RuntimeException(); }
  static public  void arrayAccess (int iters)  { throw new RuntimeException(); }
  static public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
  static public  scala.Option<java.io.OutputStream> output ()  { throw new RuntimeException(); }
  static public  void output_$eq (scala.Option<java.io.OutputStream> x$1)  { throw new RuntimeException(); }
  static public final  void runBenchmark (java.lang.String benchmarkName, scala.Function0<java.lang.Object> func)  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  void afterAll ()  { throw new RuntimeException(); }
}

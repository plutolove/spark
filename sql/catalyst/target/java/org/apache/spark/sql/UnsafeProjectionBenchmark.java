package org.apache.spark.sql;
/**
 * Benchmark <code>UnsafeProjection</code> for fixed-length/primitive-type fields.
 * <pre><code>
 *   To run this benchmark:
 *   1. without sbt:
 *      bin/spark-submit --class &lt;this class&gt; --jars &lt;spark core test jar&gt; &lt;spark catalyst test jar&gt;
 *   2. build/sbt "sql/test:runMain &lt;this class&gt;"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "sql/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/UnsafeProjectionBenchmark-results.txt".
 * </code></pre>
 */
// not preceding
public  class UnsafeProjectionBenchmark {
  // not preceding
  static public  org.apache.spark.sql.catalyst.InternalRow[] generateRows (org.apache.spark.sql.types.StructType schema, int numRows)  { throw new RuntimeException(); }
  static public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
  static public  scala.Option<java.io.OutputStream> output ()  { throw new RuntimeException(); }
  static public  void output_$eq (scala.Option<java.io.OutputStream> x$1)  { throw new RuntimeException(); }
  static public final  void runBenchmark (java.lang.String benchmarkName, scala.Function0<java.lang.Object> func)  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  void afterAll ()  { throw new RuntimeException(); }
}

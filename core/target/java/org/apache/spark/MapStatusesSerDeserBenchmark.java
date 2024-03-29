package org.apache.spark;
/**
 * Benchmark for MapStatuses serialization &amp; deserialization performance.
 * <pre><code>
 *   To run this benchmark:
 *   1. without sbt: bin/spark-submit --class &lt;this class&gt; &lt;spark core test jar&gt;
 *   2. build/sbt "core/test:runMain &lt;this class&gt;"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "core/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/MapStatusesSerDeserBenchmark-results.txt".
 * </code></pre>
 */
// not preceding
public  class MapStatusesSerDeserBenchmark {
  // not preceding
  static public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  static public  org.apache.spark.MapOutputTrackerMaster tracker ()  { throw new RuntimeException(); }
  static public  void serDeserBenchmark (int numMaps, int blockSize, boolean enableBroadcast)  { throw new RuntimeException(); }
  static public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
  static public  void createSparkContext ()  { throw new RuntimeException(); }
  static public  void afterAll ()  { throw new RuntimeException(); }
  static public  scala.Option<java.io.OutputStream> output ()  { throw new RuntimeException(); }
  static public  void output_$eq (scala.Option<java.io.OutputStream> x$1)  { throw new RuntimeException(); }
  static public final  void runBenchmark (java.lang.String benchmarkName, scala.Function0<java.lang.Object> func)  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}

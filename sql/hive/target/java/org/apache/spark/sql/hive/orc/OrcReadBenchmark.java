package org.apache.spark.sql.hive.orc;
/**
 * Benchmark to measure ORC read performance.
 * <pre><code>
 *   To run this benchmark:
 *   1. without sbt: bin/spark-submit --class &lt;this class&gt;
 *        --jars &lt;catalyst test jar&gt;,&lt;core test jar&gt;,&lt;spark sql test jar&gt; &lt;spark-hive test jar&gt;
 *   2. build/sbt "hive/test:runMain &lt;this class&gt;"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "hive/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/OrcReadBenchmark-results.txt".
 * </code></pre>
 * <p>
 * This is in <code>sql/hive</code> module in order to compare <code>sql/core</code> and <code>sql/hive</code> ORC data sources.
 */
// not preceding
public  class OrcReadBenchmark {
  // not preceding
  static protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  // not preceding
  static protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  // not preceding
  static public  org.apache.spark.sql.SparkSession getSparkSession ()  { throw new RuntimeException(); }
  static public  void withTempTable (scala.collection.Seq<java.lang.String> tableNames, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  void numericScanBenchmark (int values, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  void intStringScanBenchmark (int values)  { throw new RuntimeException(); }
  static public  void partitionTableScanBenchmark (int values)  { throw new RuntimeException(); }
  static public  void repeatedStringScanBenchmark (int values)  { throw new RuntimeException(); }
  static public  void stringWithNullsScanBenchmark (int values, double fractionOfNulls)  { throw new RuntimeException(); }
  static public  void columnsBenchmark (int values, int width)  { throw new RuntimeException(); }
  static public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
  static public  scala.Option<java.io.OutputStream> output ()  { throw new RuntimeException(); }
  static public  void output_$eq (scala.Option<java.io.OutputStream> x$1)  { throw new RuntimeException(); }
  static public final  void runBenchmark (java.lang.String benchmarkName, scala.Function0<java.lang.Object> func)  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  void afterAll ()  { throw new RuntimeException(); }
  static protected  void withSQLConf (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> pairs, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static protected  void withTempPath (scala.Function1<java.io.File, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> void testSpecialDatetimeValues (scala.Function1<java.time.ZoneId, T> test)  { throw new RuntimeException(); }
  static public final  void codegenBenchmark (java.lang.String name, long cardinality, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.benchmark.SqlBasedBenchmark.DatasetToBenchmark DatasetToBenchmark (org.apache.spark.sql.Dataset<?> ds)  { throw new RuntimeException(); }
  static protected abstract  void org$apache$spark$sql$execution$benchmark$SqlBasedBenchmark$_setter_$spark_$eq (org.apache.spark.sql.SparkSession x$1)  ;
}

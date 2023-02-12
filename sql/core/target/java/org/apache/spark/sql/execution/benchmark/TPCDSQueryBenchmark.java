package org.apache.spark.sql.execution.benchmark;
/**
 * Benchmark to measure TPCDS query performance.
 * To run this:
 * <pre><code>
 *   1. without sbt:
 *        bin/spark-submit --jars &lt;spark core test jar&gt;,&lt;spark catalyst test jar&gt;
 *          --class &lt;this class&gt; &lt;spark sql test jar&gt; --data-location &lt;location&gt;
 *   2. build/sbt "sql/test:runMain &lt;this class&gt; --data-location &lt;TPCDS data location&gt;"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt
 *        "sql/test:runMain &lt;this class&gt; --data-location &lt;location&gt;"
 *      Results will be written to "benchmarks/TPCDSQueryBenchmark-results.txt".
 * </code></pre>
 */
// not preceding
public  class TPCDSQueryBenchmark {
  // not preceding
  static protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  // not preceding
  static protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  // not preceding
  static public  org.apache.spark.sql.SparkSession getSparkSession ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<java.lang.String> tables ()  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> setupTables (java.lang.String dataLocation)  { throw new RuntimeException(); }
  static public  void runTpcdsQueries (java.lang.String queryLocation, scala.collection.Seq<java.lang.String> queries, scala.collection.immutable.Map<java.lang.String, java.lang.Object> tableSizes, java.lang.String nameSuffix)  { throw new RuntimeException(); }
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

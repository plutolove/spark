package org.apache.spark.sql;
/**
 * Benchmark for Dataset typed operations comparing with DataFrame and RDD versions.
 * To run this benchmark:
 * <pre><code>
 *   1. without sbt:
 *      bin/spark-submit --class &lt;this class&gt;
 *        --jars &lt;spark core test jar&gt;,&lt;spark catalyst test jar&gt; &lt;spark sql test jar&gt;
 *   2. build/sbt "sql/test:runMain &lt;this class&gt;"
 *   3. generate result: SPARK_GENERATE_BENCHMARK_FILES=1 build/sbt "sql/test:runMain &lt;this class&gt;"
 *      Results will be written to "benchmarks/DatasetBenchmark-results.txt".
 * </code></pre>
 */
// not preceding
public  class DatasetBenchmark {
  // not preceding
  static public  class Data implements scala.Product, scala.Serializable {
    // not preceding
    public  long l ()  { throw new RuntimeException(); }
    public  java.lang.String s ()  { throw new RuntimeException(); }
    // not preceding
    public   Data (long l, java.lang.String s)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class Data$ extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.String, org.apache.spark.sql.DatasetBenchmark.Data> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Data$ MODULE$ = null;
    public   Data$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class ComplexAggregator$ extends org.apache.spark.sql.expressions.Aggregator<org.apache.spark.sql.DatasetBenchmark.Data, org.apache.spark.sql.DatasetBenchmark.Data, java.lang.Object> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ComplexAggregator$ MODULE$ = null;
    public   ComplexAggregator$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.DatasetBenchmark.Data zero ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.DatasetBenchmark.Data reduce (org.apache.spark.sql.DatasetBenchmark.Data b, org.apache.spark.sql.DatasetBenchmark.Data a)  { throw new RuntimeException(); }
    public  long finish (org.apache.spark.sql.DatasetBenchmark.Data reduction)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.DatasetBenchmark.Data merge (org.apache.spark.sql.DatasetBenchmark.Data b1, org.apache.spark.sql.DatasetBenchmark.Data b2)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Encoder<org.apache.spark.sql.DatasetBenchmark.Data> bufferEncoder ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Encoder<java.lang.Object> outputEncoder ()  { throw new RuntimeException(); }
  }
  // not preceding
  static protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  // not preceding
  static protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  // not preceding
  static public  org.apache.spark.benchmark.Benchmark backToBackMapLong (org.apache.spark.sql.SparkSession spark, long numRows, int numChains)  { throw new RuntimeException(); }
  static public  org.apache.spark.benchmark.Benchmark backToBackMap (org.apache.spark.sql.SparkSession spark, long numRows, int numChains)  { throw new RuntimeException(); }
  static public  org.apache.spark.benchmark.Benchmark backToBackFilterLong (org.apache.spark.sql.SparkSession spark, long numRows, int numChains)  { throw new RuntimeException(); }
  static public  org.apache.spark.benchmark.Benchmark backToBackFilter (org.apache.spark.sql.SparkSession spark, long numRows, int numChains)  { throw new RuntimeException(); }
  // not preceding
  static public  org.apache.spark.benchmark.Benchmark aggregate (org.apache.spark.sql.SparkSession spark, long numRows)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.SparkSession getSparkSession ()  { throw new RuntimeException(); }
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

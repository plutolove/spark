package org.apache.spark.sql.execution.benchmark;
/**
 * Benchmark for sorted data with a filter which allows to filter out all the row groups
 * when nested fields predicate push down enabled
 */
// not preceding
public  class ParquetNestedPredicatePushDownBenchmark {
  // not preceding
  static protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  // not preceding
  static protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  /**
   * Benchmark for sorted data with a filter which allows to filter out all the row groups
   * when nested fields predicate push down enabled
   */
  static public  void runLoadNoRowGroupWhenPredicatePushedDown ()  { throw new RuntimeException(); }
  /**
   * Benchmark with a filter which allows to load only some row groups
   * when nested fields predicate push down enabled
   */
  static public  void runLoadSomeRowGroupWhenPredicatePushedDown ()  { throw new RuntimeException(); }
  /**
   * Benchmark with a filter which still requires to
   * load all the row groups on sorted data to see if we introduce too much
   * overhead or not if enable nested predicate push down.
   */
  static public  void runLoadAllRowGroupsWhenPredicatePushedDown ()  { throw new RuntimeException(); }
  static public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
  static public  scala.Option<java.io.OutputStream> output ()  { throw new RuntimeException(); }
  static public  void output_$eq (scala.Option<java.io.OutputStream> x$1)  { throw new RuntimeException(); }
  static public final  void runBenchmark (java.lang.String benchmarkName, scala.Function0<java.lang.Object> func)  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  void afterAll ()  { throw new RuntimeException(); }
  static protected  void withSQLConf (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> pairs, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static protected  void withTempPath (scala.Function1<java.io.File, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> void testSpecialDatetimeValues (scala.Function1<java.time.ZoneId, T> test)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.SparkSession getSparkSession ()  { throw new RuntimeException(); }
  static public final  void codegenBenchmark (java.lang.String name, long cardinality, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.benchmark.SqlBasedBenchmark.DatasetToBenchmark DatasetToBenchmark (org.apache.spark.sql.Dataset<?> ds)  { throw new RuntimeException(); }
  static protected abstract  void org$apache$spark$sql$execution$benchmark$SqlBasedBenchmark$_setter_$spark_$eq (org.apache.spark.sql.SparkSession x$1)  ;
}

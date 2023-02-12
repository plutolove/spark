package org.apache.spark.sql.execution.benchmark;
/**
 * Writes the given DataFrame to parquet at a temporary location, and returns a DataFrame
 * backed by the written parquet files.
 */
// not preceding
public  class WideSchemaBenchmark {
  // not preceding
  static protected  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  // not preceding
  static protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  static public  void parsingLargeSelectExpressions ()  { throw new RuntimeException(); }
  static public  void manyColumnFieldReadAndWrite ()  { throw new RuntimeException(); }
  static public  void wideShallowlyNestedStructFieldReadAndWrite ()  { throw new RuntimeException(); }
  static public  void deeplyNestedStructFieldReadAndWrite ()  { throw new RuntimeException(); }
  static public  void bushyStructFieldReadAndWrite ()  { throw new RuntimeException(); }
  static public  void wideArrayFieldReadAndWrite ()  { throw new RuntimeException(); }
  static public  void wideMapFieldReadAndWrite ()  { throw new RuntimeException(); }
  static public  void runBenchmarkWithDeleteTmpFiles (java.lang.String benchmarkName, scala.Function0<java.lang.Object> func)  { throw new RuntimeException(); }
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

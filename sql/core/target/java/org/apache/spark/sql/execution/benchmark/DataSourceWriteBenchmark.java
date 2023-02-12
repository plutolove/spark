package org.apache.spark.sql.execution.benchmark;
public  interface DataSourceWriteBenchmark extends org.apache.spark.sql.execution.benchmark.SqlBasedBenchmark {
  public  int numRows ()  ;
  public  void runDataSourceBenchmark (java.lang.String format)  ;
  public  java.lang.String tempTable ()  ;
  public  void withTable (scala.collection.Seq<java.lang.String> tableNames, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  public  void withTempTable (scala.collection.Seq<java.lang.String> tableNames, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  public  void writeBucket (java.lang.String table, java.lang.String format, org.apache.spark.benchmark.Benchmark benchmark)  ;
  public  void writeIntString (java.lang.String table, java.lang.String format, org.apache.spark.benchmark.Benchmark benchmark)  ;
  public  void writeNumeric (java.lang.String table, java.lang.String format, org.apache.spark.benchmark.Benchmark benchmark, java.lang.String dataType)  ;
  public  void writePartition (java.lang.String table, java.lang.String format, org.apache.spark.benchmark.Benchmark benchmark)  ;
}

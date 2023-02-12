package org.apache.spark.sql.execution.datasources.parquet;
/**
 * Takes a sequence of products <code>data</code> to generate multi-level nested
 * dataframes as new test data. It tests both non-nested and nested dataframes
 * which are written and read back with Parquet datasource.
 * <p>
 * This is different from {@link ParquetTest.withParquetDataFrame} which does not
 * test nested cases.
 */
public  class ParquetV1FilterSuite extends org.apache.spark.sql.execution.datasources.parquet.ParquetFilterSuite {
  // not preceding
  public   ParquetV1FilterSuite ()  { throw new RuntimeException(); }
  public  void checkFilterPredicate (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, org.apache.spark.sql.catalyst.expressions.Predicate predicate, java.lang.Class<? extends org.apache.parquet.filter2.predicate.FilterPredicate> filterClass, scala.Function2<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>, scala.collection.Seq<org.apache.spark.sql.Row>, scala.runtime.BoxedUnit> checker, scala.collection.Seq<org.apache.spark.sql.Row> expected)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
}

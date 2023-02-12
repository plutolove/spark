package org.apache.spark.sql.execution.datasources;
/** Helper for building checks on the arguments passed to the reader. */
public  class FileSourceStrategySuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.catalyst.expressions.PredicateHelper {
  // not preceding
  public   FileSourceStrategySuite ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calenderIntervalData ()  { throw new RuntimeException(); }
  /** Helper for building checks on the arguments passed to the reader. */
  protected <T extends java.lang.Object> void checkArgument (java.lang.String name, scala.Function1<org.apache.spark.sql.execution.datasources.LastArguments$, T> arg, T expected)  { throw new RuntimeException(); }
  protected  scala.Function1<scala.collection.immutable.Set<org.apache.spark.sql.sources.Filter>, scala.runtime.BoxedUnit> checkDataFilters ()  { throw new RuntimeException(); }
  protected  scala.Function1<org.apache.spark.sql.types.StructType, scala.runtime.BoxedUnit> checkDataSchema ()  { throw new RuntimeException(); }
  protected  scala.Function1<org.apache.spark.sql.types.StructType, scala.runtime.BoxedUnit> checkPartitionSchema ()  { throw new RuntimeException(); }
  /** Plans the query and calls the provided validation function with the planned partitioning. */
  public  void checkScan (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.Function1<scala.collection.Seq<org.apache.spark.sql.execution.datasources.FilePartition>, scala.runtime.BoxedUnit> func)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  /**
   * Constructs a new table given a list of file names and sizes expressed in bytes. The table
   * is written out in a temporary directory and any nested directories in the files names
   * are automatically created.
   * <p>
   * When <code>buckets</code> is > 0 the returned {@link DataFrame} will have metadata specifying that number of
   * buckets.  However, it is the responsibility of the caller to assign files to each bucket
   * by appending the bucket id to the file names.
   * @param files (undocumented)
   * @param buckets (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createTable (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>> files, int buckets)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> emptyTestData ()  { throw new RuntimeException(); }
  // not preceding
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.FileScanRDD getFileScanRDD (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
  /** Returns a set with all the filters present in the physical plan. */
  public  org.apache.spark.sql.catalyst.expressions.ExpressionSet getPhysicalFilters (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> largeAndSmallInts ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> lowerCaseData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> lowerCaseDataWithDuplicates ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.MapData> mapData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> negativeData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> nullInts ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> nullStrings ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.StringData> nullableRepeatedData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> person ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.StringData> repeatedData ()  { throw new RuntimeException(); }
  /** Returns a resolved expression for `str` in the context of `df`. */
  public  org.apache.spark.sql.catalyst.expressions.Expression resolve (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.lang.String str)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> salary ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
  // not preceding
  protected  scala.Function1<java.lang.String, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> sql ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> tableName ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testData2 ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testData3 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.test.SQLTestUtilsBase.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> trainingSales ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<java.lang.String> unparsedStrings ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> upperCaseData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
}

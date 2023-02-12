package org.apache.spark.sql;
/**
 * Define a very simple 3 row table used for testing column serialization.
 * Note: last column is seq[int] which doesn't support stats collection.
 */
public abstract class StatisticsCollectionTestBase extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SQLTestUtils {
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  // not preceding
  public   StatisticsCollectionTestBase ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calenderIntervalData ()  { throw new RuntimeException(); }
  /**
   * Compute column stats for the given DataFrame and compare it with colStats.
   * @param df (undocumented)
   * @param colStats (undocumented)
   */
  public  void checkColStats (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.collection.mutable.LinkedHashMap<java.lang.String, org.apache.spark.sql.catalyst.catalog.CatalogColumnStat> colStats)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.catalog.CatalogStatistics> checkTableStats (java.lang.String tableName, boolean hasSizeInBytes, scala.Option<java.lang.Object> expectedRowCounts)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  /**
   * Define a very simple 3 row table used for testing column serialization.
   * Note: last column is seq[int] which doesn't support stats collection.
   * @return (undocumented)
   */
  protected  scala.collection.Seq<scala.Tuple13<java.lang.Boolean, java.lang.Byte, java.lang.Short, java.lang.Integer, java.lang.Long, java.lang.Double, java.lang.Float, java.math.BigDecimal, java.lang.String, byte[], java.sql.Date, java.sql.Timestamp, scala.collection.Seq<java.lang.Object>>> data ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> emptyTestData ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> expectedSerializedColStats ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> expectedSerializedHistograms ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogTable getCatalogTable (java.lang.String tableName)  { throw new RuntimeException(); }
  public  long getDataSize (java.io.File file)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogStatistics getPartitionStats (java.lang.String tableName, scala.collection.immutable.Map<java.lang.String, java.lang.String> partSpec)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan getTableFromCatalogCache (java.lang.String tableName)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.catalog.CatalogStatistics getTableStats (java.lang.String tableName)  { throw new RuntimeException(); }
  public  boolean isTableInCatalogCache (java.lang.String tableName)  { throw new RuntimeException(); }
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
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> salary ()  { throw new RuntimeException(); }
  // not preceding
  protected  scala.Function1<java.lang.String, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> sql ()  { throw new RuntimeException(); }
  /** A mapping from column to the stats collected. */
  protected  scala.collection.mutable.LinkedHashMap<java.lang.String, org.apache.spark.sql.catalyst.catalog.CatalogColumnStat> stats ()  { throw new RuntimeException(); }
  /**
   * A mapping from column to the stats collected including histograms.
   * The number of bins in the histograms is 2.
   * @return (undocumented)
   */
  protected  scala.collection.mutable.LinkedHashMap<java.lang.String, org.apache.spark.sql.catalyst.catalog.CatalogColumnStat> statsWithHgms ()  { throw new RuntimeException(); }
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
  /**
   * Validate if the given catalog table has the provided statistics.
   * @param tableName (undocumented)
   * @param colStats (undocumented)
   */
  public  void validateColStats (java.lang.String tableName, scala.collection.mutable.LinkedHashMap<java.lang.String, org.apache.spark.sql.catalyst.catalog.CatalogColumnStat> colStats)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
}

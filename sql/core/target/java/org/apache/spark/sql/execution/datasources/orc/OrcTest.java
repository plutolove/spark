package org.apache.spark.sql.execution.datasources.orc;
/**
 * Writes <code>data</code> to a Orc file, which is then passed to <code>f</code> and will be deleted after <code>f</code>
 * returns.
 */
public abstract class OrcTest extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.execution.datasources.FileBasedDataSourceTest, org.scalatest.BeforeAndAfterAll {
  // not preceding
  public   OrcTest ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  protected  void afterAll ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  protected  void beforeAll ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calenderIntervalData ()  { throw new RuntimeException(); }
  protected  void checkNoFilterPredicate (org.apache.spark.sql.catalyst.expressions.Predicate predicate, boolean noneSupported, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
  protected  void checkPredicatePushDown (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, int numRows, java.lang.String predicate)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  protected  java.lang.String dataSourceName ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> emptyTestData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> largeAndSmallInts ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> lowerCaseData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> lowerCaseDataWithDuplicates ()  { throw new RuntimeException(); }
  protected <T extends scala.Product> void makeOrcFile (scala.collection.Seq<T> data, java.io.File path, scala.reflect.ClassTag<T> evidence$7, scala.reflect.api.TypeTags.TypeTag<T> evidence$8)  { throw new RuntimeException(); }
  protected <T extends scala.Product> void makeOrcFile (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.io.File path, scala.reflect.ClassTag<T> evidence$9, scala.reflect.api.TypeTags.TypeTag<T> evidence$10)  { throw new RuntimeException(); }
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
  public  java.lang.String orcImp ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> person ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> readResourceOrcFile (java.lang.String name)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.StringData> repeatedData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> salary ()  { throw new RuntimeException(); }
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
  protected  java.lang.String vectorizedReaderEnabledKey ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
  /**
   * Writes <code>data</code> to a Orc file and reads it back as a <code>DataFrame</code>,
   * which is then passed to <code>f</code>. The Orc file will be deleted after <code>f</code> returns.
   * @param data (undocumented)
   * @param testVectorized (undocumented)
   * @param f (undocumented)
   * @param evidence$3 (undocumented)
   * @param evidence$4 (undocumented)
   */
  protected <T extends scala.Product> void withOrcDataFrame (scala.collection.Seq<T> data, boolean testVectorized, scala.Function1<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>, scala.runtime.BoxedUnit> f, scala.reflect.ClassTag<T> evidence$3, scala.reflect.api.TypeTags.TypeTag<T> evidence$4)  { throw new RuntimeException(); }
  /**
   * Writes <code>data</code> to a Orc file, which is then passed to <code>f</code> and will be deleted after <code>f</code>
   * returns.
   * @param data (undocumented)
   * @param f (undocumented)
   * @param evidence$1 (undocumented)
   * @param evidence$2 (undocumented)
   */
  protected <T extends scala.Product> void withOrcFile (scala.collection.Seq<T> data, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> f, scala.reflect.ClassTag<T> evidence$1, scala.reflect.api.TypeTags.TypeTag<T> evidence$2)  { throw new RuntimeException(); }
  /**
   * Writes <code>data</code> to a Orc file, reads it back as a <code>DataFrame</code> and registers it as a
   * temporary table named <code>tableName</code>, then call <code>f</code>. The temporary table together with the
   * Orc file will be dropped/deleted after <code>f</code> returns.
   * @param data (undocumented)
   * @param tableName (undocumented)
   * @param testVectorized (undocumented)
   * @param f (undocumented)
   * @param evidence$5 (undocumented)
   * @param evidence$6 (undocumented)
   */
  protected <T extends scala.Product> void withOrcTable (scala.collection.Seq<T> data, java.lang.String tableName, boolean testVectorized, scala.Function0<scala.runtime.BoxedUnit> f, scala.reflect.ClassTag<T> evidence$5, scala.reflect.api.TypeTags.TypeTag<T> evidence$6)  { throw new RuntimeException(); }
}

package org.apache.spark.sql;
/**
 * End-to-end tests to check TPCDS query results.
 * <p>
 * To run this test suite:
 * <pre><code>
 *   SPARK_TPCDS_DATA=&lt;path of TPCDS SF=1 data&gt; build/sbt "sql/testOnly *TPCDSQueryTestSuite"
 * </code></pre>
 * <p>
 * To run a single test file upon change:
 * <pre><code>
 *   SPARK_TPCDS_DATA=&lt;path of TPCDS SF=1 data&gt;
 *     build/sbt "~sql/testOnly *TPCDSQueryTestSuite -- -z q79"
 * </code></pre>
 * <p>
 * To re-generate golden files for this suite, run:
 * <pre><code>
 *   SPARK_GENERATE_GOLDEN_FILES=1 SPARK_TPCDS_DATA=&lt;path of TPCDS SF=1 data&gt;
 *     build/sbt "sql/testOnly *TPCDSQueryTestSuite"
 * </code></pre>
 * <p>
 * To re-generate golden file for a single test, run:
 * <pre><code>
 *   SPARK_GENERATE_GOLDEN_FILES=1 SPARK_TPCDS_DATA=&lt;path of TPCDS SF=1 data&gt;
 *     build/sbt "sql/testOnly *TPCDSQueryTestSuite -- -z q79"
 * </code></pre>
 */
public  class TPCDSQueryTestSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.TPCDSBase, org.apache.spark.sql.SQLQueryTestHelper {
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  // not preceding
  public   TPCDSQueryTestSuite ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  protected  java.lang.String baseResourcePath ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calenderIntervalData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.test.TestSparkSession createSparkSession ()  { throw new RuntimeException(); }
  public  void createTable (org.apache.spark.sql.SparkSession spark, java.lang.String tableName, java.lang.String format, scala.collection.Seq<java.lang.String> options)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String emptySchema ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> emptyTestData ()  { throw new RuntimeException(); }
  // not preceding
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> largeAndSmallInts ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> lowerCaseData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> lowerCaseDataWithDuplicates ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.MapData> mapData ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<java.lang.String> modifiedTPCDSQueries ()  { throw new RuntimeException(); }
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
  protected  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
  // not preceding
  protected  scala.Function1<java.lang.String, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> sql ()  { throw new RuntimeException(); }
  // not preceding
  protected  scala.collection.immutable.Map<java.lang.String, java.lang.String> tableColumns ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> tableName ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Iterable<java.lang.String> tableNames ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testData2 ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testData3 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.test.SQLTestUtilsBase.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> tpcdsQueries ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<java.lang.String> tpcdsQueriesV2_7_0 ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> trainingSales ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<java.lang.String> unparsedStrings ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> upperCaseData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
}

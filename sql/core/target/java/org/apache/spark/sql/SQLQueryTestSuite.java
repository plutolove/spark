package org.apache.spark.sql;
/** List of test cases to ignore, in lower cases. */
public  class SQLQueryTestSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.catalyst.plans.SQLHelper, org.apache.spark.sql.SQLQueryTestHelper {
  /** A single SQL query's output. */
  protected  class QueryOutput implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
    // not preceding
    public  java.lang.String sql ()  { throw new RuntimeException(); }
    public  java.lang.String schema ()  { throw new RuntimeException(); }
    public  java.lang.String output ()  { throw new RuntimeException(); }
    // not preceding
    public   QueryOutput (java.lang.String sql, java.lang.String schema, java.lang.String output)  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  // not preceding
  protected  class QueryOutput$ extends scala.runtime.AbstractFunction3<java.lang.String, java.lang.String, java.lang.String, org.apache.spark.sql.SQLQueryTestSuite.QueryOutput> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final QueryOutput$ MODULE$ = null;
    public   QueryOutput$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  protected  class RegularTestCase implements org.apache.spark.sql.SQLQueryTestSuite.TestCase, scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  java.lang.String inputFile ()  { throw new RuntimeException(); }
    public  java.lang.String resultFile ()  { throw new RuntimeException(); }
    // not preceding
    public   RegularTestCase (java.lang.String name, java.lang.String inputFile, java.lang.String resultFile)  { throw new RuntimeException(); }
  }
  // not preceding
  protected  class RegularTestCase$ extends scala.runtime.AbstractFunction3<java.lang.String, java.lang.String, java.lang.String, org.apache.spark.sql.SQLQueryTestSuite.RegularTestCase> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RegularTestCase$ MODULE$ = null;
    public   RegularTestCase$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  protected  class PgSQLTestCase implements org.apache.spark.sql.SQLQueryTestSuite.TestCase, org.apache.spark.sql.SQLQueryTestSuite.PgSQLTest, scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  java.lang.String inputFile ()  { throw new RuntimeException(); }
    public  java.lang.String resultFile ()  { throw new RuntimeException(); }
    // not preceding
    public   PgSQLTestCase (java.lang.String name, java.lang.String inputFile, java.lang.String resultFile)  { throw new RuntimeException(); }
  }
  // not preceding
  protected  class PgSQLTestCase$ extends scala.runtime.AbstractFunction3<java.lang.String, java.lang.String, java.lang.String, org.apache.spark.sql.SQLQueryTestSuite.PgSQLTestCase> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final PgSQLTestCase$ MODULE$ = null;
    public   PgSQLTestCase$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  protected  class UDFTestCase implements org.apache.spark.sql.SQLQueryTestSuite.TestCase, org.apache.spark.sql.SQLQueryTestSuite.UDFTest, scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  java.lang.String inputFile ()  { throw new RuntimeException(); }
    public  java.lang.String resultFile ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.IntegratedUDFTestUtils.TestUDF udf ()  { throw new RuntimeException(); }
    // not preceding
    public   UDFTestCase (java.lang.String name, java.lang.String inputFile, java.lang.String resultFile, org.apache.spark.sql.IntegratedUDFTestUtils.TestUDF udf)  { throw new RuntimeException(); }
  }
  // not preceding
  protected  class UDFTestCase$ extends scala.runtime.AbstractFunction4<java.lang.String, java.lang.String, java.lang.String, org.apache.spark.sql.IntegratedUDFTestUtils.TestUDF, org.apache.spark.sql.SQLQueryTestSuite.UDFTestCase> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final UDFTestCase$ MODULE$ = null;
    public   UDFTestCase$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  protected  class UDFPgSQLTestCase implements org.apache.spark.sql.SQLQueryTestSuite.TestCase, org.apache.spark.sql.SQLQueryTestSuite.UDFTest, org.apache.spark.sql.SQLQueryTestSuite.PgSQLTest, scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  java.lang.String inputFile ()  { throw new RuntimeException(); }
    public  java.lang.String resultFile ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.IntegratedUDFTestUtils.TestUDF udf ()  { throw new RuntimeException(); }
    // not preceding
    public   UDFPgSQLTestCase (java.lang.String name, java.lang.String inputFile, java.lang.String resultFile, org.apache.spark.sql.IntegratedUDFTestUtils.TestUDF udf)  { throw new RuntimeException(); }
  }
  // not preceding
  protected  class UDFPgSQLTestCase$ extends scala.runtime.AbstractFunction4<java.lang.String, java.lang.String, java.lang.String, org.apache.spark.sql.IntegratedUDFTestUtils.TestUDF, org.apache.spark.sql.SQLQueryTestSuite.UDFPgSQLTestCase> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final UDFPgSQLTestCase$ MODULE$ = null;
    public   UDFPgSQLTestCase$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  protected  class AnsiTestCase implements org.apache.spark.sql.SQLQueryTestSuite.TestCase, org.apache.spark.sql.SQLQueryTestSuite.AnsiTest, scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  java.lang.String inputFile ()  { throw new RuntimeException(); }
    public  java.lang.String resultFile ()  { throw new RuntimeException(); }
    // not preceding
    public   AnsiTestCase (java.lang.String name, java.lang.String inputFile, java.lang.String resultFile)  { throw new RuntimeException(); }
  }
  // not preceding
  protected  class AnsiTestCase$ extends scala.runtime.AbstractFunction3<java.lang.String, java.lang.String, java.lang.String, org.apache.spark.sql.SQLQueryTestSuite.AnsiTestCase> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AnsiTestCase$ MODULE$ = null;
    public   AnsiTestCase$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  interface TestCase {
    public  java.lang.String inputFile ()  ;
    // not preceding
    public  java.lang.String name ()  ;
    public  java.lang.String resultFile ()  ;
  }
  // not preceding
  public  interface PgSQLTest {
  }
  // not preceding
  public  interface AnsiTest {
  }
  // not preceding
  public  interface UDFTest {
    // not preceding
    public  org.apache.spark.sql.IntegratedUDFTestUtils.TestUDF udf ()  ;
  }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  // not preceding
  public   SQLQueryTestSuite ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  protected  java.io.File baseResourcePath ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  /** List of test cases to ignore, in lower cases. */
  protected  scala.collection.immutable.Set<java.lang.String> blackList ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calenderIntervalData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  // not preceding
  protected  void createScalaTestCase (org.apache.spark.sql.SQLQueryTestSuite.TestCase testCase)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String emptySchema ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> emptyTestData ()  { throw new RuntimeException(); }
  // not preceding
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  protected  java.lang.String goldenFilePath ()  { throw new RuntimeException(); }
  protected  java.lang.String inputFilePath ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> largeAndSmallInts ()  { throw new RuntimeException(); }
  /** Returns all the files (not directories) in a directory, recursively. */
  protected  scala.collection.Seq<java.io.File> listFilesRecursively (java.io.File path)  { throw new RuntimeException(); }
  // not preceding
  protected  scala.collection.Seq<org.apache.spark.sql.SQLQueryTestSuite.TestCase> listTestCases ()  { throw new RuntimeException(); }
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
  protected  void runQueries (scala.collection.Seq<java.lang.String> queries, org.apache.spark.sql.SQLQueryTestSuite.TestCase testCase, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> configSet)  { throw new RuntimeException(); }
  /** Run a test case. */
  protected  void runTest (org.apache.spark.sql.SQLQueryTestSuite.TestCase testCase)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> salary ()  { throw new RuntimeException(); }
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
  protected  java.lang.String validFileExtensions ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
}

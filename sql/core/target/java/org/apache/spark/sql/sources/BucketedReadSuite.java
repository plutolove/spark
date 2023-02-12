package org.apache.spark.sql.sources;
/**
 * A helper method to test the bucket read functionality using join.  It will save <code>df1</code> and <code>df2</code>
 * to hive tables, bucketed or not, according to the given bucket specifics.  Next we will join
 * these 2 tables, and firstly make sure the answer is corrected, and then check if the shuffle
 * exists as user expected according to the <code>shuffleLeft</code> and <code>shuffleRight</code>.
 */
public abstract class BucketedReadSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.test.SQLTestUtils {
  public  class BucketedTableTestSpec implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.Option<org.apache.spark.sql.catalyst.catalog.BucketSpec> bucketSpec ()  { throw new RuntimeException(); }
    public  int numPartitions ()  { throw new RuntimeException(); }
    public  boolean expectedShuffle ()  { throw new RuntimeException(); }
    public  boolean expectedSort ()  { throw new RuntimeException(); }
    // not preceding
    public   BucketedTableTestSpec (scala.Option<org.apache.spark.sql.catalyst.catalog.BucketSpec> bucketSpec, int numPartitions, boolean expectedShuffle, boolean expectedSort)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class BucketedTableTestSpec$ extends scala.runtime.AbstractFunction4<scala.Option<org.apache.spark.sql.catalyst.catalog.BucketSpec>, java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.sql.sources.BucketedReadSuite.BucketedTableTestSpec> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final BucketedTableTestSpec$ MODULE$ = null;
    public   BucketedTableTestSpec$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public   BucketedReadSuite ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  protected  void afterAll ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  // not preceding
  protected  void beforeAll ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calenderIntervalData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
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

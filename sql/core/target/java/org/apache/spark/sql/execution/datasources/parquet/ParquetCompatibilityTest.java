package org.apache.spark.sql.execution.datasources.parquet;
/**
 * Helper class for testing Parquet compatibility.
 */
 abstract class ParquetCompatibilityTest extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.execution.datasources.parquet.ParquetTest {
  // not preceding
  static public  class RecordConsumerDSL {
    // not preceding
    public   RecordConsumerDSL (org.apache.parquet.io.api.RecordConsumer consumer)  { throw new RuntimeException(); }
    public  void field (java.lang.String name, int index, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
    public  void group (scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
    // not preceding
    public  void message (scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  void writeDirect (java.lang.String path, java.lang.String schema, scala.collection.Seq<scala.Function1<org.apache.parquet.io.api.RecordConsumer, scala.runtime.BoxedUnit>> recordWriters)  { throw new RuntimeException(); }
  /**
   * Provide a builder for constructing a parquet writer - after PARQUET-248 directly constructing
   * the writer is deprecated and should be done through a builder. The default builders include
   * Avro - but for raw Parquet writing we must create our own builder.
   * @param path (undocumented)
   * @param schema (undocumented)
   * @param metadata (undocumented)
   * @param recordWriters (undocumented)
   */
  static public  void writeDirect (java.lang.String path, java.lang.String schema, scala.collection.immutable.Map<java.lang.String, java.lang.String> metadata, scala.collection.Seq<scala.Function1<org.apache.parquet.io.api.RecordConsumer, scala.runtime.BoxedUnit>> recordWriters)  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String dataSourceName ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String vectorizedReaderEnabledKey ()  { throw new RuntimeException(); }
  // not preceding
  protected  scala.Function1<java.lang.String, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> sql ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.test.SQLTestUtilsBase.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> emptyTestData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testData2 ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testData3 ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> negativeData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> largeAndSmallInts ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> upperCaseData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> lowerCaseData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> lowerCaseDataWithDuplicates ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.MapData> mapData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calenderIntervalData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.StringData> repeatedData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.StringData> nullableRepeatedData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> nullInts ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> nullStrings ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> tableName ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<java.lang.String> unparsedStrings ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> person ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> salary ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> trainingSales ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  // not preceding
  public   ParquetCompatibilityTest ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.parquet.schema.MessageType readParquetSchema (java.lang.String path)  { throw new RuntimeException(); }
  protected  org.apache.parquet.schema.MessageType readParquetSchema (java.lang.String path, scala.Function1<org.apache.hadoop.fs.Path, java.lang.Object> pathFilter)  { throw new RuntimeException(); }
  protected  void logParquetSchema (java.lang.String path)  { throw new RuntimeException(); }
}

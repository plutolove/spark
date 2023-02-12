package org.apache.spark.sql.streaming;
/**
 * A subclass <code>AddData</code> for adding data to files. This is meant to use the
 * <code>FileStreamSource</code> actually being used in the execution.
 */
public abstract class FileStreamSourceTest extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.streaming.StreamTest, org.apache.spark.sql.test.SharedSparkSession, org.scalatest.PrivateMethodTester {
  // not preceding
  public  class AddTextFileData extends org.apache.spark.sql.streaming.FileStreamSourceTest.AddFileData implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String content ()  { throw new RuntimeException(); }
    public  java.io.File src ()  { throw new RuntimeException(); }
    public  java.io.File tmp ()  { throw new RuntimeException(); }
    public  java.lang.String tmpFilePrefix ()  { throw new RuntimeException(); }
    // not preceding
    public   AddTextFileData (java.lang.String content, java.io.File src, java.io.File tmp, java.lang.String tmpFilePrefix)  { throw new RuntimeException(); }
    // not preceding
    public  void addData (org.apache.spark.sql.execution.streaming.FileStreamSource source)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class AddTextFileData$ extends scala.runtime.AbstractFunction4<java.lang.String, java.io.File, java.io.File, java.lang.String, org.apache.spark.sql.streaming.FileStreamSourceTest.AddTextFileData> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AddTextFileData$ MODULE$ = null;
    public   AddTextFileData$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class AddOrcFileData extends org.apache.spark.sql.streaming.FileStreamSourceTest.AddFileData implements scala.Product, scala.Serializable {
    // not preceding
    static public  org.apache.spark.sql.streaming.FileStreamSourceTest.AddOrcFileData apply (scala.collection.Seq<java.lang.String> seq, java.io.File src, java.io.File tmp)  { throw new RuntimeException(); }
    /** Write orc files in a temp dir, and move the individual files to the 'src' dir */
    static public  void writeToFile (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.io.File src, java.io.File tmp)  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data ()  { throw new RuntimeException(); }
    public  java.io.File src ()  { throw new RuntimeException(); }
    public  java.io.File tmp ()  { throw new RuntimeException(); }
    // not preceding
    public   AddOrcFileData (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.io.File src, java.io.File tmp)  { throw new RuntimeException(); }
    // not preceding
    public  void addData (org.apache.spark.sql.execution.streaming.FileStreamSource source)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class AddOrcFileData$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AddOrcFileData$ MODULE$ = null;
    public   AddOrcFileData$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.streaming.FileStreamSourceTest.AddOrcFileData apply (scala.collection.Seq<java.lang.String> seq, java.io.File src, java.io.File tmp)  { throw new RuntimeException(); }
    /** Write orc files in a temp dir, and move the individual files to the 'src' dir */
    public  void writeToFile (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.io.File src, java.io.File tmp)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class AddParquetFileData extends org.apache.spark.sql.streaming.FileStreamSourceTest.AddFileData implements scala.Product, scala.Serializable {
    // not preceding
    static public  org.apache.spark.sql.streaming.FileStreamSourceTest.AddParquetFileData apply (scala.collection.Seq<java.lang.String> seq, java.io.File src, java.io.File tmp)  { throw new RuntimeException(); }
    /** Write parquet files in a temp dir, and move the individual files to the 'src' dir */
    static public  void writeToFile (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.io.File src, java.io.File tmp)  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data ()  { throw new RuntimeException(); }
    public  java.io.File src ()  { throw new RuntimeException(); }
    public  java.io.File tmp ()  { throw new RuntimeException(); }
    // not preceding
    public   AddParquetFileData (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.io.File src, java.io.File tmp)  { throw new RuntimeException(); }
    // not preceding
    public  void addData (org.apache.spark.sql.execution.streaming.FileStreamSource source)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class AddParquetFileData$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AddParquetFileData$ MODULE$ = null;
    public   AddParquetFileData$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.streaming.FileStreamSourceTest.AddParquetFileData apply (scala.collection.Seq<java.lang.String> seq, java.io.File src, java.io.File tmp)  { throw new RuntimeException(); }
    /** Write parquet files in a temp dir, and move the individual files to the 'src' dir */
    public  void writeToFile (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.io.File src, java.io.File tmp)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class AddFilesToFileStreamSinkLog implements org.apache.spark.sql.streaming.StreamTest.ExternalAction, scala.Product, scala.Serializable {
    // not preceding
    public  org.apache.hadoop.fs.FileSystem fs ()  { throw new RuntimeException(); }
    public  org.apache.hadoop.fs.Path srcDir ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.streaming.FileStreamSinkLog sinkLog ()  { throw new RuntimeException(); }
    public  int batchId ()  { throw new RuntimeException(); }
    // not preceding
    public   AddFilesToFileStreamSinkLog (org.apache.hadoop.fs.FileSystem fs, org.apache.hadoop.fs.Path srcDir, org.apache.spark.sql.execution.streaming.FileStreamSinkLog sinkLog, int batchId, scala.Function1<org.apache.hadoop.fs.Path, java.lang.Object> pathFilter)  { throw new RuntimeException(); }
    // not preceding
    public  void runAction ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class AddFilesToFileStreamSinkLog$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AddFilesToFileStreamSinkLog$ MODULE$ = null;
    public   AddFilesToFileStreamSinkLog$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public abstract class AddFileData implements org.apache.spark.sql.streaming.StreamTest.AddData {
    // not preceding
    public   AddFileData ()  { throw new RuntimeException(); }
    public  scala.Tuple2<org.apache.spark.sql.execution.streaming.Source, org.apache.spark.sql.execution.streaming.Offset> addData (scala.Option<org.apache.spark.sql.execution.streaming.StreamExecution> query)  { throw new RuntimeException(); }
    protected abstract  void addData (org.apache.spark.sql.execution.streaming.FileStreamSource source)  ;
    /** Source directory to add file data to */
    protected abstract  java.io.File src ()  ;
  }
  public  org.apache.spark.sql.streaming.StreamTest.AddData$ AddData ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AddDataMemory$ AddDataMemory ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.FileStreamSourceTest.AddOrcFileData$ AddOrcFileData ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.FileStreamSourceTest.AddParquetFileData$ AddParquetFileData ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AdvanceManualClock$ AdvanceManualClock ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.Assert$ Assert ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery$ AssertOnQuery ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AwaitEpoch$ AwaitEpoch ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$ AwaitTerminationTester ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckAnswer$ CheckAnswer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRows$ CheckAnswerRows ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRowsByFunc$ CheckAnswerRowsByFunc ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRowsContains$ CheckAnswerRowsContains ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckLastBatch$ CheckLastBatch ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckNewAnswer$ CheckNewAnswer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckNewAnswerRows$ CheckNewAnswerRows ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.Execute$ Execute ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.ExpectFailure$ ExpectFailure ()  { throw new RuntimeException(); }
  // not preceding
  public   FileStreamSourceTest ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.IncrementEpoch$ IncrementEpoch ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.MultiAddData$ MultiAddData ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  public  org.scalatest.PrivateMethodTester.PrivateMethod$ PrivateMethod ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.ProcessAllAvailable$ ProcessAllAvailable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.StartStream$ StartStream ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.StopStream$ StopStream ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.StreamProgressLockedActions$ StreamProgressLockedActions ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calenderIntervalData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createFileStream (java.lang.String format, java.lang.String path, scala.Option<org.apache.spark.sql.types.StructType> schema, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.concurrent.Signaler defaultSignaler ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.streaming.Trigger defaultTrigger ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> emptyTestData ()  { throw new RuntimeException(); }
  // not preceding
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.streaming.FileStreamSource getSourceFromFileStream (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.execution.streaming.FileStreamSource> getSourcesFromStreamingQuery (org.apache.spark.sql.execution.streaming.StreamExecution query)  { throw new RuntimeException(); }
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
  public  org.scalatest.time.Span streamingTimeout ()  { throw new RuntimeException(); }
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
  public  org.apache.spark.sql.types.StructType valueSchema ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
  protected  void withTempDirs (scala.Function2<java.io.File, java.io.File, scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
  protected  void withThreeTempDirs (scala.Function3<java.io.File, java.io.File, java.io.File, scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
}

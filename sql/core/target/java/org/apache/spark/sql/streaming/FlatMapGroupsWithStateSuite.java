package org.apache.spark.sql.streaming;
public  class FlatMapGroupsWithStateSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.streaming.StateStoreMetricsTest {
  // not preceding
  static public  boolean failInTask ()  { throw new RuntimeException(); }
  static public  void assertCanGetProcessingTime (scala.Function0<java.lang.Object> predicate)  { throw new RuntimeException(); }
  static public  void assertCanGetWatermark (scala.Function0<java.lang.Object> predicate)  { throw new RuntimeException(); }
  static public  void assertCannotGetWatermark (scala.Function0<scala.runtime.BoxedUnit> func)  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.concurrent.Signaler defaultSignaler ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.streaming.Trigger defaultTrigger ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.time.Span streamingTimeout ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AddData$ AddData ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.MultiAddData$ MultiAddData ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AddDataMemory$ AddDataMemory ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckAnswer$ CheckAnswer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckLastBatch$ CheckLastBatch ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRows$ CheckAnswerRows ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRowsContains$ CheckAnswerRowsContains ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckAnswerRowsByFunc$ CheckAnswerRowsByFunc ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckNewAnswerRows$ CheckNewAnswerRows ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.CheckNewAnswer$ CheckNewAnswer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.StopStream$ StopStream ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.StartStream$ StartStream ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AdvanceManualClock$ AdvanceManualClock ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.ExpectFailure$ ExpectFailure ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.StreamProgressLockedActions$ StreamProgressLockedActions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.Assert$ Assert ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AssertOnQuery$ AssertOnQuery ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.Execute$ Execute ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.ProcessAllAvailable$ ProcessAllAvailable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AwaitEpoch$ AwaitEpoch ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.IncrementEpoch$ IncrementEpoch ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StreamTest.AwaitTerminationTester$ AwaitTerminationTester ()  { throw new RuntimeException(); }
  // not preceding
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
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
  public   FlatMapGroupsWithStateSuite ()  { throw new RuntimeException(); }
  public  int currentBatchTimestamp ()  { throw new RuntimeException(); }
  public  int currentBatchWatermark ()  { throw new RuntimeException(); }
  public  int beforeTimeoutThreshold ()  { throw new RuntimeException(); }
  public  int afterTimeoutThreshold ()  { throw new RuntimeException(); }
  public  scala.Some<java.lang.Object> preTimeoutState ()  { throw new RuntimeException(); }
  public  void testWithTimeout (org.apache.spark.sql.streaming.GroupStateTimeout timeoutConf)  { throw new RuntimeException(); }
  public  void testStateUpdateWithData (java.lang.String testName, scala.Function1<org.apache.spark.sql.streaming.GroupState<java.lang.Object>, scala.runtime.BoxedUnit> stateUpdates, org.apache.spark.sql.streaming.GroupStateTimeout timeoutConf, scala.Option<java.lang.Object> priorState, long priorTimeoutTimestamp, scala.Option<java.lang.Object> expectedState, long expectedTimeoutTimestamp, java.lang.Class<? extends java.lang.Exception> expectedException)  { throw new RuntimeException(); }
  public  void testStateUpdateWithTimeout (java.lang.String testName, scala.Function1<org.apache.spark.sql.streaming.GroupState<java.lang.Object>, scala.runtime.BoxedUnit> stateUpdates, org.apache.spark.sql.streaming.GroupStateTimeout timeoutConf, long priorTimeoutTimestamp, scala.Option<java.lang.Object> expectedState, long expectedTimeoutTimestamp)  { throw new RuntimeException(); }
  public  void testStateUpdate (boolean testTimeoutUpdates, scala.Function3<java.lang.Object, scala.collection.Iterator<java.lang.Object>, org.apache.spark.sql.streaming.GroupState<java.lang.Object>, scala.collection.Iterator<java.lang.Object>> mapGroupsFunc, org.apache.spark.sql.streaming.GroupStateTimeout timeoutConf, scala.Option<java.lang.Object> priorState, long priorTimeoutTimestamp, scala.Option<java.lang.Object> expectedState, long expectedTimeoutTimestamp, java.lang.Class<? extends java.lang.Exception> expectedException)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.FlatMapGroupsWithStateExec newFlatMapGroupsWithStateExec (scala.Function3<java.lang.Object, scala.collection.Iterator<java.lang.Object>, org.apache.spark.sql.streaming.GroupState<java.lang.Object>, scala.collection.Iterator<java.lang.Object>> func, org.apache.spark.sql.streaming.GroupStateTimeout timeoutType, long batchTimestampMs)  { throw new RuntimeException(); }
  public <T extends java.lang.Exception> void testTimeoutDurationNotAllowed (org.apache.spark.sql.execution.streaming.GroupStateImpl<?> state, scala.reflect.Manifest<T> evidence$1)  { throw new RuntimeException(); }
  public <T extends java.lang.Exception> void testTimeoutTimestampNotAllowed (org.apache.spark.sql.execution.streaming.GroupStateImpl<?> state, scala.reflect.Manifest<T> evidence$2)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.StateStore newStateStore ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection intProj ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow intToRow (int i)  { throw new RuntimeException(); }
  public  int rowToInt (org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  { throw new RuntimeException(); }
  public  void testWithAllStateVersions (java.lang.String name, scala.Function0<scala.runtime.BoxedUnit> func)  { throw new RuntimeException(); }
}

package org.apache.spark.sql;
/**
 * Runs the plan and makes sure the answer contains all of the keywords.
 */
public abstract class QueryTest extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.catalyst.plans.PlanTest {
  // not preceding
  static public  org.scalatest.Assertions.AssertionsHelper assertionsHelper ()  { throw new RuntimeException(); }
  // not preceding
  static public final  org.scalatest.compatible.Assertion succeed ()  { throw new RuntimeException(); }
  /**
   * Runs the plan and makes sure the answer matches the expected result.
   * If there was exception during the execution or the contents of the DataFrame does not
   * match the expected result, an error message will be returned. Otherwise, a None will
   * be returned.
   * <p>
   * @param df the DataFrame to be executed
   * @param expectedAnswer the expected result in a Seq of Rows.
   * @param checkToRDD whether to verify deserialization to an RDD. This runs the query twice.
   * @return (undocumented)
   */
  static public  scala.Option<java.lang.String> getErrorMessageInCheckAnswer (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.collection.Seq<org.apache.spark.sql.Row> expectedAnswer, boolean checkToRDD)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.Row> prepareAnswer (scala.collection.Seq<org.apache.spark.sql.Row> answer, boolean isSorted)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Row prepareRow (org.apache.spark.sql.Row row)  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.String> includesRows (scala.collection.Seq<org.apache.spark.sql.Row> expectedRows, scala.collection.Seq<org.apache.spark.sql.Row> sparkAnswer)  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.String> sameRows (scala.collection.Seq<org.apache.spark.sql.Row> expectedAnswer, scala.collection.Seq<org.apache.spark.sql.Row> sparkAnswer, boolean isSorted)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object> org.scalactic.Equality<A> defaultEquality ()  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.TripleEqualsInvocation<T> $eq$eq$eq (T right)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.TripleEqualsInvocation<T> $bang$eq$eq (T right)  { throw new RuntimeException(); }
  static public  org.scalactic.TripleEqualsSupport.TripleEqualsInvocation<scala.runtime.Null$> $eq$eq$eq (scala.runtime.Null$ right)  { throw new RuntimeException(); }
  static public  org.scalactic.TripleEqualsSupport.TripleEqualsInvocation<scala.runtime.Null$> $bang$eq$eq (scala.runtime.Null$ right)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.TripleEqualsInvocationOnSpread<T> $eq$eq$eq (org.scalactic.TripleEqualsSupport.Spread<T> right)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.TripleEqualsInvocationOnSpread<T> $bang$eq$eq (org.scalactic.TripleEqualsSupport.Spread<T> right)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.Equalizer<T> convertToEqualizer (T left)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalactic.TripleEqualsSupport.CheckingEqualizer<T> convertToCheckingEqualizer (T left)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> unconstrainedEquality (org.scalactic.Equality<A> equalityOfA)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> lowPriorityTypeCheckedConstraint (org.scalactic.Equivalence<B> equivalenceOfB, scala.Predef.$less$colon$less<A, B> ev)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> convertEquivalenceToAToBConstraint (org.scalactic.Equivalence<B> equivalenceOfB, scala.Predef.$less$colon$less<A, B> ev)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> typeCheckedConstraint (org.scalactic.Equivalence<A> equivalenceOfA, scala.Predef.$less$colon$less<B, A> ev)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> convertEquivalenceToBToAConstraint (org.scalactic.Equivalence<A> equivalenceOfA, scala.Predef.$less$colon$less<B, A> ev)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> lowPriorityConversionCheckedConstraint (org.scalactic.Equivalence<B> equivalenceOfB, scala.Function1<A, B> cnv)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> convertEquivalenceToAToBConversionConstraint (org.scalactic.Equivalence<B> equivalenceOfB, scala.Function1<A, B> ev)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> conversionCheckedConstraint (org.scalactic.Equivalence<A> equivalenceOfA, scala.Function1<B, A> cnv)  { throw new RuntimeException(); }
  static public <A extends java.lang.Object, B extends java.lang.Object> org.scalactic.CanEqual<A, B> convertEquivalenceToBToAConversionConstraint (org.scalactic.Equivalence<A> equivalenceOfA, scala.Function1<B, A> ev)  { throw new RuntimeException(); }
  static   java.lang.Throwable newAssertionFailedException (scala.Option<java.lang.String> optionalMessage, scala.Option<java.lang.Throwable> optionalCause, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static   java.lang.Throwable newTestCanceledException (scala.Option<java.lang.String> optionalMessage, scala.Option<java.lang.Throwable> optionalCause, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion assume (boolean condition, org.scalactic.Prettifier prettifier, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion assume (boolean condition, Object clue, org.scalactic.Prettifier prettifier, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion assertTypeError (java.lang.String code, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion assertDoesNotCompile (java.lang.String code, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion assertCompiles (java.lang.String code, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T intercept (scala.Function0<java.lang.Object> f, scala.reflect.ClassTag<T> classTag, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> org.scalatest.compatible.Assertion assertThrows (scala.Function0<java.lang.Object> f, scala.reflect.ClassTag<T> classTag, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> java.lang.Throwable trap (scala.Function0<T> f)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion assertResult (Object expected, Object clue, Object actual, org.scalactic.Prettifier prettifier, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion assertResult (Object expected, Object actual, org.scalactic.Prettifier prettifier, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ fail (org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ fail (java.lang.String message, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ fail (java.lang.String message, java.lang.Throwable cause, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ fail (java.lang.Throwable cause, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ cancel (org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ cancel (java.lang.String message, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ cancel (java.lang.String message, java.lang.Throwable cause, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public  scala.runtime.Nothing$ cancel (java.lang.Throwable cause, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T withClue (Object clue, scala.Function0<T> fun)  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion pending ()  { throw new RuntimeException(); }
  static public  org.scalatest.compatible.Assertion pendingUntilFixed (scala.Function0<scala.runtime.BoxedUnit> f, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
  static protected abstract  void org$scalatest$Assertions$_setter_$assertionsHelper_$eq (org.scalatest.Assertions.AssertionsHelper x$1)  ;
  static protected abstract  void org$scalatest$Assertions$_setter_$succeed_$eq (org.scalatest.compatible.Assertion x$1)  ;
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  // not preceding
  public   QueryTest ()  { throw new RuntimeException(); }
  // not preceding
  protected abstract  org.apache.spark.sql.SparkSession spark ()  ;
  /**
   * Runs the plan and makes sure the answer contains all of the keywords.
   * @param df (undocumented)
   * @param keywords (undocumented)
   */
  public  void checkKeywordsExist (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.collection.Seq<java.lang.String> keywords)  { throw new RuntimeException(); }
  /**
   * Runs the plan and makes sure the answer does NOT contain any of the keywords.
   * @param df (undocumented)
   * @param keywords (undocumented)
   */
  public  void checkKeywordsNotExist (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.collection.Seq<java.lang.String> keywords)  { throw new RuntimeException(); }
  /**
   * Evaluates a dataset to make sure that the result of calling collect matches the given
   * expected answer.
   * @param ds (undocumented)
   * @param expectedAnswer (undocumented)
   */
  protected <T extends java.lang.Object> void checkDataset (scala.Function0<org.apache.spark.sql.Dataset<T>> ds, scala.collection.Seq<T> expectedAnswer)  { throw new RuntimeException(); }
  /**
   * Evaluates a dataset to make sure that the result of calling collect matches the given
   * expected answer, after sort.
   * @param ds (undocumented)
   * @param expectedAnswer (undocumented)
   * @param evidence$1 (undocumented)
   */
  protected <T extends java.lang.Object> void checkDatasetUnorderly (scala.Function0<org.apache.spark.sql.Dataset<T>> ds, scala.collection.Seq<T> expectedAnswer, scala.math.Ordering<T> evidence$1)  { throw new RuntimeException(); }
  /**
   * Runs the plan and makes sure the answer matches the expected result.
   * <p>
   * @param df the {@link DataFrame} to be executed
   * @param expectedAnswer the expected result in a {@link Seq} of {@link Row}s.
   */
  protected  void checkAnswer (scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> df, scala.collection.Seq<org.apache.spark.sql.Row> expectedAnswer)  { throw new RuntimeException(); }
  protected  void checkAnswer (scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> df, org.apache.spark.sql.Row expectedAnswer)  { throw new RuntimeException(); }
  protected  void checkAnswer (scala.Function0<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> df, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> expectedAnswer)  { throw new RuntimeException(); }
  /**
   * Runs the plan and makes sure the answer is within absTol of the expected result.
   * <p>
   * @param dataFrame the {@link DataFrame} to be executed
   * @param expectedAnswer the expected result in a {@link Seq} of {@link Row}s.
   * @param absTol the absolute tolerance between actual and expected answers.
   */
  protected  void checkAggregatesWithTol (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dataFrame, scala.collection.Seq<org.apache.spark.sql.Row> expectedAnswer, double absTol)  { throw new RuntimeException(); }
  protected  void checkAggregatesWithTol (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> dataFrame, org.apache.spark.sql.Row expectedAnswer, double absTol)  { throw new RuntimeException(); }
  /**
   * Asserts that a given {@link Dataset} will be executed using the given number of cached results.
   * @param query (undocumented)
   * @param numCachedTables (undocumented)
   */
  public  void assertCached (org.apache.spark.sql.Dataset<?> query, int numCachedTables)  { throw new RuntimeException(); }
  /**
   * Asserts that a given {@link Dataset} will be executed using the cache with the given name and
   * storage level.
   * @param query (undocumented)
   * @param cachedName (undocumented)
   * @param storageLevel (undocumented)
   */
  public  void assertCached (org.apache.spark.sql.Dataset<?> query, java.lang.String cachedName, org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  /**
   * Asserts that a given {@link Dataset} does not have missing inputs in all the analyzed plans.
   * @param query (undocumented)
   */
  public  void assertEmptyMissingInput (org.apache.spark.sql.Dataset<?> query)  { throw new RuntimeException(); }
}

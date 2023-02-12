package org.apache.spark.sql.test;
/**
 * Creates a temporary directory, which is then passed to <code>f</code> and will be deleted after <code>f</code>
 * returns.
 */
public  interface SQLTestUtils extends org.apache.spark.sql.test.SQLTestUtilsBase, org.apache.spark.sql.catalyst.plans.PlanTest {
  public  void beforeAll ()  ;
  /**
   * Creates a temporary directory, which is then passed to <code>f</code> and will be deleted after <code>f</code>
   * returns.
   * @param f (undocumented)
   */
  public  void withTempDir (scala.Function1<java.io.File, scala.runtime.BoxedUnit> f)  ;
  /**
   * A helper function for turning off/on codegen.
   * @param testName (undocumented)
   * @param f (undocumented)
   */
  public  void testWithWholeStageCodegenOnAndOff (java.lang.String testName, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> f)  ;
  /**
   * Materialize the test data immediately after the <code>SQLContext</code> is set up.
   * This is necessary if the data is accessed by name but not through direct reference.
   */
  public  void setupTestData ()  ;
  /**
   * Disable stdout and stderr when running the test. To not output the logs to the console,
   * ConsoleAppender's <code>follow</code> should be set to <code>true</code> so that it will honor reassignments of
   * System.out or System.err. Otherwise, ConsoleAppender will still output to the console even if
   * we change System.out and System.err.
   * @param name (undocumented)
   * @param f (undocumented)
   */
  public  void testQuietly (java.lang.String name, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  public  void test (java.lang.String testName, scala.collection.Seq<org.scalatest.Tag> testTags, scala.Function0<java.lang.Object> testFun, org.scalactic.source.Position pos)  ;
  /**
   * Run a test on a separate <code>UninterruptibleThread</code>.
   * @param name (undocumented)
   * @param quietly (undocumented)
   * @param body (undocumented)
   */
  public  void testWithUninterruptibleThread (java.lang.String name, boolean quietly, scala.Function0<scala.runtime.BoxedUnit> body)  ;
  /**
   * Copy file in jar's resource to a temp file, then pass it to <code>f</code>.
   * This function is used to make <code>f</code> can use the path of temp file(e.g. file:/), instead of
   * path of jar's resource which starts with 'jar:file:/'
   * @param resourcePath (undocumented)
   * @param f (undocumented)
   */
  public  void withResourceTempPath (java.lang.String resourcePath, scala.Function1<java.io.File, scala.runtime.BoxedUnit> f)  ;
  /**
   * Waits for all tasks on all executors to be finished.
   */
  public  void waitForTasksToFinish ()  ;
  /**
   * Creates the specified number of temporary directories, which is then passed to <code>f</code> and will be
   * deleted after <code>f</code> returns.
   * @param numPaths (undocumented)
   * @param f (undocumented)
   */
  public  void withTempPaths (int numPaths, scala.Function1<scala.collection.Seq<java.io.File>, scala.runtime.BoxedUnit> f)  ;
}

package org.apache.spark.sql.test;
/**
 * The {@link TestSparkSession} to use for all tests in this suite.
 * <p>
 * By default, the underlying {@link org.apache.spark.SparkContext} will be run in local
 * mode with the default test configurations.
 */
public  interface SharedSparkSessionBase extends org.apache.spark.sql.test.SQLTestUtilsBase, org.scalatest.BeforeAndAfterEach, org.scalatest.concurrent.Eventually {
  /**
   * Stop the underlying {@link org.apache.spark.SparkContext}, if any.
   */
  public  void afterAll ()  ;
  public  void afterEach ()  ;
  /**
   * Make sure the {@link TestSparkSession} is initialized before any tests are run.
   */
  public  void beforeAll ()  ;
  public  void beforeEach ()  ;
  public  org.apache.spark.sql.test.TestSparkSession createSparkSession ()  ;
  /**
   * Initialize the {@link TestSparkSession}.  Generally, this is just called from
   * beforeAll; however, in test using styles other than FunSuite, there is
   * often code that relies on the session between test group constructs and
   * the actual tests, which may need this session.  It is purely a semantic
   * difference, but semantically, it makes more sense to call
   * 'initializeSession' between a 'describe' and an 'it' call than it does to
   * call 'beforeAll'.
   */
  public  void initializeSession ()  ;
  /**
   * The {@link TestSparkSession} to use for all tests in this suite.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.SparkSession spark ()  ;
  public  org.apache.spark.SparkConf sparkConf ()  ;
  /**
   * The {@link TestSQLContext} to use for all tests in this suite.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.SQLContext sqlContext ()  ;
}

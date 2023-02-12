package org.apache.spark;
/**
 * Note: this method doesn't support <code>BeforeAndAfter</code>. You must use <code>BeforeAndAfterEach</code> to
 * set up and tear down resources.
 */
public abstract class SparkFunSuite extends org.scalatest.FunSuite implements org.scalatest.BeforeAndAfterAll, org.scalatest.BeforeAndAfterEach, org.apache.spark.ThreadAudit, org.apache.spark.internal.Logging {
  public  class LogAppender extends org.apache.log4j.AppenderSkeleton {
    // not preceding
    public   LogAppender (java.lang.String msg, int maxEvents)  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.mutable.ArrayBuffer<org.apache.log4j.spi.LoggingEvent> loggingEvents ()  { throw new RuntimeException(); }
    public  void append (org.apache.log4j.spi.LoggingEvent loggingEvent)  { throw new RuntimeException(); }
    public  void close ()  { throw new RuntimeException(); }
    public  boolean requiresLayout ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class LogAppender$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final LogAppender$ MODULE$ = null;
    public   LogAppender$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public   SparkFunSuite ()  { throw new RuntimeException(); }
  protected  void afterAll ()  { throw new RuntimeException(); }
  protected  void beforeAll ()  { throw new RuntimeException(); }
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  protected final  java.io.File getTestResourceFile (java.lang.String file)  { throw new RuntimeException(); }
  protected final  java.lang.String getTestResourcePath (java.lang.String file)  { throw new RuntimeException(); }
  // not preceding
  public  boolean invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected ()  { throw new RuntimeException(); }
  /**
   * Note: this method doesn't support <code>BeforeAndAfter</code>. You must use <code>BeforeAndAfterEach</code> to
   * set up and tear down resources.
   * @param n (undocumented)
   * @param body (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T retry (int n, scala.Function0<T> body)  { throw new RuntimeException(); }
  /**
   * Note: this method doesn't support <code>BeforeAndAfter</code>. You must use <code>BeforeAndAfterEach</code> to
   * set up and tear down resources.
   * @param s (undocumented)
   * @param n (undocumented)
   * @param body (undocumented)
   */
  public  void testRetry (java.lang.String s, int n, scala.Function0<scala.runtime.BoxedUnit> body)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Set<java.lang.String> threadWhiteList ()  { throw new RuntimeException(); }
  /**
   * Log the suite name and the test name before and after each test.
   * <p>
   * Subclasses should never override this method. If they wish to run
   * custom code before and after each test, they should mix in the
   * {{org.scalatest.BeforeAndAfter}} trait instead.
   * @param test (undocumented)
   * @return (undocumented)
   */
  protected final  org.scalatest.Outcome withFixture (org.scalatest.TestSuite.NoArgTest test)  { throw new RuntimeException(); }
  /**
   * Adds a log appender and optionally sets a log level to the root logger or the logger with
   * the specified name, then executes the specified function, and in the end removes the log
   * appender and restores the log level if necessary.
   * @param appender (undocumented)
   * @param loggerName (undocumented)
   * @param level (undocumented)
   * @param f (undocumented)
   */
  protected  void withLogAppender (org.apache.log4j.Appender appender, scala.Option<java.lang.String> loggerName, scala.Option<org.apache.log4j.Level> level, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  /**
   * Creates a temporary directory, which is then passed to <code>f</code> and will be deleted after <code>f</code>
   * returns.
   * @param f (undocumented)
   */
  protected  void withTempDir (scala.Function1<java.io.File, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
}

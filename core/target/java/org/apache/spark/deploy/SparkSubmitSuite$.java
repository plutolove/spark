package org.apache.spark.deploy;
/**
 * Helper function for testing main class resolution on remote JAR files.
 * <p>
 * param:  tempDir path to temporary directory
 * param:  deployMode either "client" or "cluster"
 * @return a pair of the JAR file and the 4-tuple returned by
 *         {@link org.apache.spark.deploy.SparkSubmit#prepareSubmitEnvironment}
 */
// not preceding
public  class SparkSubmitSuite$ extends org.apache.spark.SparkFunSuite implements org.scalatest.concurrent.TimeLimits {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkSubmitSuite$ MODULE$ = null;
  public   SparkSubmitSuite$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.concurrent.Signaler defaultSignaler ()  { throw new RuntimeException(); }
  public  void runSparkSubmit (scala.collection.Seq<java.lang.String> args, java.lang.String root, org.scalatest.time.Span timeout)  { throw new RuntimeException(); }
}

package org.apache.spark.ml;
/**
 * Base abstract class for all unit tests in Spark for handling common functionality.
 */
 abstract class SparkMLFunSuite extends org.scalatest.FunSuite implements org.scalatest.BeforeAndAfterAll {
  // not preceding
  public   SparkMLFunSuite ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean invokeBeforeAllAndAfterAllEvenIfNoTestsAreExpected ()  { throw new RuntimeException(); }
}

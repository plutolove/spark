package org.apache.spark.ml.util;
/**
 * Returns the temporary directory as a <code>File</code> instance.
 */
public  interface TempDirectory extends org.scalatest.BeforeAndAfterAll {
  public  void afterAll ()  ;
  public  void beforeAll ()  ;
  /**
   * Returns the temporary directory as a <code>File</code> instance.
   * @return (undocumented)
   */
  public  java.io.File tempDir ()  ;
}

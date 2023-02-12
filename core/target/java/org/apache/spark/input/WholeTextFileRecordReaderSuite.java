package org.apache.spark.input;
/**
 * This code will test the behaviors of WholeTextFileRecordReader based on local disk. There are
 * three aspects to check:
 *   1) Whether all files are read;
 *   2) Whether paths are read correctly;
 *   3) Does the contents be the same.
 */
public  class WholeTextFileRecordReaderSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterAll, org.apache.spark.internal.Logging {
  // not preceding
  public   WholeTextFileRecordReaderSuite ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
}

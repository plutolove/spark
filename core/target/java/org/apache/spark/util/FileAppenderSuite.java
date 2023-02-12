package org.apache.spark.util;
/**
 * Run the rolling file appender with data and see whether all the data was written correctly
 * across rolled over files.
 */
public  class FileAppenderSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter, org.apache.spark.internal.Logging {
  /** Used to synchronize when read is called on a stream */
  public  interface LatchedInputStream {
    public  java.util.concurrent.CountDownLatch latchReadProceed ()  ;
    public  java.util.concurrent.CountDownLatch latchReadStarted ()  ;
    public  int read ()  ;
  }
  // not preceding
  public   FileAppenderSuite ()  { throw new RuntimeException(); }
  /** Delete all the generated rolled over files */
  public  void cleanup ()  { throw new RuntimeException(); }
  // not preceding
  public  java.io.File testFile ()  { throw new RuntimeException(); }
  /**
   * Run the rolling file appender with data and see whether all the data was written correctly
   * across rolled over files.
   * @param appender (undocumented)
   * @param outputStream (undocumented)
   * @param textToAppend (undocumented)
   * @param sleepTimeBetweenTexts (undocumented)
   * @param isCompressed (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.io.File> testRolling (org.apache.spark.util.logging.FileAppender appender, java.io.OutputStream outputStream, scala.collection.Seq<java.lang.String> textToAppend, long sleepTimeBetweenTexts, boolean isCompressed)  { throw new RuntimeException(); }
}

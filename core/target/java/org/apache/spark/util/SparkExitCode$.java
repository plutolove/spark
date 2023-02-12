package org.apache.spark.util;
/** The default uncaught exception handler was reached. */
// not preceding
public  class SparkExitCode$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparkExitCode$ MODULE$ = null;
  public   SparkExitCode$ ()  { throw new RuntimeException(); }
  // not preceding
  public  int UNCAUGHT_EXCEPTION ()  { throw new RuntimeException(); }
  /** The default uncaught exception handler was called and an exception was encountered while
   * @return (undocumented)
   logging the exception. */
  public  int UNCAUGHT_EXCEPTION_TWICE ()  { throw new RuntimeException(); }
  /** The default uncaught exception handler was reached, and the uncaught exception was an
   * @return (undocumented)
   OutOfMemoryError. */
  public  int OOM ()  { throw new RuntimeException(); }
}

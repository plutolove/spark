package org.apache.spark.ui;
/**
 * Try to refresh the progress bar in every cycle
 */
  class ConsoleProgressBar implements org.apache.spark.internal.Logging {
  // not preceding
  public   ConsoleProgressBar (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /**
   * Mark all the stages as finished, clear the progress bar if showed, then the progress will not
   * interweave with output of jobs.
   */
  public  void finishAll ()  { throw new RuntimeException(); }
  /**
   * Tear down the timer thread.  The timer thread is a GC root, and it retains the entire
   * SparkContext if it's not terminated.
   */
  public  void stop ()  { throw new RuntimeException(); }
}

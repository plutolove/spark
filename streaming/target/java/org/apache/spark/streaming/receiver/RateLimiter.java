package org.apache.spark.streaming.receiver;
/**
 * Return the current rate limit. If no limit has been set so far, it returns <pre><code>Long.MaxValue</code></pre>.
 */
 abstract class RateLimiter implements org.apache.spark.internal.Logging {
  // not preceding
  public   RateLimiter (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Return the current rate limit. If no limit has been set so far, it returns <pre><code>Long.MaxValue</code></pre>.
   * @return (undocumented)
   */
  public  long getCurrentLimit ()  { throw new RuntimeException(); }
  /**
   * Set the rate limit to <code>newRate</code>. The new rate will not exceed the maximum rate configured by
   * <pre><code>spark.streaming.receiver.maxRate</code></pre>, even if <code>newRate</code> is higher than that.
   *
   * &#64;param newRate A new rate in records per second. It has no effect if it's 0 or negative.
   * @param newRate (undocumented)
   */
    void updateRate (long newRate)  { throw new RuntimeException(); }
  public  void waitToPush ()  { throw new RuntimeException(); }
}

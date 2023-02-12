package org.apache.spark.sql.catalyst.util;
/**
 * Returns a summary with the given observation inserted into the summary.
 * This method may either modify in place the current summary (and return the same summary,
 * modified in place), or it may create a new summary from scratch it necessary.
 * param:  x the new observation to insert into the summary
 */
public  class QuantileSummaries implements scala.Serializable {
  /**
   * Statistics from the Greenwald-Khanna paper.
   * param:  value the sampled value
   * param:  g the minimum rank jump from the previous value's minimum rank
   * param:  delta the maximum span of the rank.
   */
  static public  class Stats implements scala.Product, scala.Serializable {
    // not preceding
    public  double value ()  { throw new RuntimeException(); }
    public  long g ()  { throw new RuntimeException(); }
    public  long delta ()  { throw new RuntimeException(); }
    // not preceding
    public   Stats (double value, long g, long delta)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class Stats$ extends scala.runtime.AbstractFunction3<java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.sql.catalyst.util.QuantileSummaries.Stats> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Stats$ MODULE$ = null;
    public   Stats$ ()  { throw new RuntimeException(); }
  }
  /**
   * The default value for the compression threshold.
   * @return (undocumented)
   */
  static public  int defaultCompressThreshold ()  { throw new RuntimeException(); }
  /**
   * The size of the head buffer.
   * @return (undocumented)
   */
  static public  int defaultHeadSize ()  { throw new RuntimeException(); }
  /**
   * The default value for the relative error (1%).
   * With this value, the best extreme percentiles that can be approximated are 1% and 99%.
   * @return (undocumented)
   */
  static public  double defaultRelativeError ()  { throw new RuntimeException(); }
  // not preceding
  public  int compressThreshold ()  { throw new RuntimeException(); }
  public  double relativeError ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.util.QuantileSummaries.Stats[] sampled ()  { throw new RuntimeException(); }
  public  long count ()  { throw new RuntimeException(); }
  public  boolean compressed ()  { throw new RuntimeException(); }
  // not preceding
  public   QuantileSummaries (int compressThreshold, double relativeError, org.apache.spark.sql.catalyst.util.QuantileSummaries.Stats[] sampled, long count, boolean compressed)  { throw new RuntimeException(); }
  /**
   * Returns a summary with the given observation inserted into the summary.
   * This method may either modify in place the current summary (and return the same summary,
   * modified in place), or it may create a new summary from scratch it necessary.
   * @param x the new observation to insert into the summary
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.util.QuantileSummaries insert (double x)  { throw new RuntimeException(); }
  /**
   * Returns a new summary that compresses the summary statistics and the head buffer.
   * <p>
   * This implements the COMPRESS function of the GK algorithm. It does not modify the object.
   * <p>
   * @return a new summary object with compressed statistics
   */
  public  org.apache.spark.sql.catalyst.util.QuantileSummaries compress ()  { throw new RuntimeException(); }
  /**
   * Merges two (compressed) summaries together.
   * <p>
   * Returns a new summary.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.util.QuantileSummaries merge (org.apache.spark.sql.catalyst.util.QuantileSummaries other)  { throw new RuntimeException(); }
  /**
   * Runs a query for a given quantile.
   * The result follows the approximation guarantees detailed above.
   * The query can only be run on a compressed summary: you need to call compress() before using
   * it.
   * <p>
   * @param quantile the target quantile
   * @return
   */
  public  scala.Option<java.lang.Object> query (double quantile)  { throw new RuntimeException(); }
}

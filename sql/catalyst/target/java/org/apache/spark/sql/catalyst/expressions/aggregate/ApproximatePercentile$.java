package org.apache.spark.sql.catalyst.expressions.aggregate;
/**
 * PercentileDigest is a probabilistic data structure used for approximating percentiles
 * with limited memory. PercentileDigest is backed by {@link QuantileSummaries}.
 * <p>
 * param:  summaries underlying probabilistic data structure {@link QuantileSummaries}.
 */
// not preceding
public  class ApproximatePercentile$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ApproximatePercentile$ MODULE$ = null;
  public   ApproximatePercentile$ ()  { throw new RuntimeException(); }
  // not preceding
  public  int DEFAULT_PERCENTILE_ACCURACY ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.aggregate.ApproximatePercentile.PercentileDigestSerializer serializer ()  { throw new RuntimeException(); }
}

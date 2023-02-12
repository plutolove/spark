package org.apache.spark.sql.execution.adaptive;
/**
 * To equally divide n elements into m buckets, basically each bucket should have n/m elements,
 * for the remaining n%m elements, add one more element to the first n%m buckets each. Returns
 * a sequence with length numBuckets and each value represents the start index of each bucket.
 */
// not preceding
public  class OptimizeLocalShuffleReader$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OptimizeLocalShuffleReader$ MODULE$ = null;
  public   OptimizeLocalShuffleReader$ ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String LOCAL_SHUFFLE_READER_DESCRIPTION ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean canUseLocalShuffleReader (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
}

package org.apache.spark.scheduler;
/**
 * make sure all the shuffle dependencies have a consistent number of output partitions
 * (mostly to make sure the test setup makes sense, not that Spark itself would get this wrong)
 */
// not preceding
public  class MockRDD$ extends org.scalatest.Assertions.AssertionsHelper implements org.scalactic.TripleEquals, org.scalatest.Assertions, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MockRDD$ MODULE$ = null;
  // not preceding
  public  org.scalatest.Assertions.AssertionsHelper assertionsHelper ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.scalatest.compatible.Assertion succeed ()  { throw new RuntimeException(); }
  public   MockRDD$ ()  { throw new RuntimeException(); }
  // not preceding
  public  void validate (int numPartitions, scala.collection.Seq<org.apache.spark.ShuffleDependency<?, ?, ?>> dependencies)  { throw new RuntimeException(); }
}

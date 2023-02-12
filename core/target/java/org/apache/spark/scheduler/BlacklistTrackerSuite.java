package org.apache.spark.scheduler;
/**
 * Its easier to write our tests as if we could directly look at the sets of nodes &amp; executors in
 * the blacklist.  However the api doesn't expose a set, so this is a simple way to test
 * something similar, since we know the universe of values that might appear in these sets.
 */
public  class BlacklistTrackerSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterEach, org.scalatestplus.mockito.MockitoSugar, org.apache.spark.LocalSparkContext {
  // not preceding
  public   BlacklistTrackerSuite ()  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.String> allExecutorAndHostIds ()  { throw new RuntimeException(); }
  /**
   * Its easier to write our tests as if we could directly look at the sets of nodes &amp; executors in
   * the blacklist.  However the api doesn't expose a set, so this is a simple way to test
   * something similar, since we know the universe of values that might appear in these sets.
   * @param f (undocumented)
   * @param expected (undocumented)
   */
  public  void assertEquivalentToSet (scala.Function1<java.lang.String, java.lang.Object> f, scala.collection.immutable.Set<java.lang.String> expected)  { throw new RuntimeException(); }
  public  void beforeEach ()  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSetBlacklist createTaskSetBlacklist (int stageId)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.TaskSchedulerImpl mockTaskSchedWithConf (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
}

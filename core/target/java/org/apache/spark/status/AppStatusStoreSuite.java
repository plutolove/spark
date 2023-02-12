package org.apache.spark.status;
/**
 * Following are the tasks metrics,
 * 1, 3, 5 =&gt; Success
 * 0, 2, 4 =&gt; Failed
 * -1, 6 =&gt; Running
 * <p>
 * Task summary will consider (1, 3, 5) only
 */
public  class AppStatusStoreSuite extends org.apache.spark.SparkFunSuite {
  // not preceding
  public   AppStatusStoreSuite ()  { throw new RuntimeException(); }
}

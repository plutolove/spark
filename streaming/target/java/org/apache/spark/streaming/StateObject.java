package org.apache.spark.streaming;
/**
 * Test cleanup of RDDs in DStream metadata. <code>assertCleanup</code> is the function that asserts the
 * cleanup of RDDs is successful.
 */
public  class StateObject implements scala.Serializable {
  // not preceding
  public  int counter ()  { throw new RuntimeException(); }
  public  int expireCounter ()  { throw new RuntimeException(); }
  // not preceding
  public   StateObject (int counter, int expireCounter)  { throw new RuntimeException(); }
}

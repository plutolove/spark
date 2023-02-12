package org.apache.spark;
/**
 * If the heartbeat receiver is not stopped, notify it of executor removals so it doesn't
 * log superfluous errors.
 * <p>
 * Note that we must do this after the executor is actually removed to guard against the
 * following race condition: if we remove an executor's metadata from our data structure
 * prematurely, we may get an in-flight heartbeat from the executor before the executor is
 * actually removed, in which case we will still mark the executor as a dead host later
 * and expire it with loud error messages.
 */
// not preceding
public  class HeartbeatReceiver$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HeartbeatReceiver$ MODULE$ = null;
  public   HeartbeatReceiver$ ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String ENDPOINT_NAME ()  { throw new RuntimeException(); }
}

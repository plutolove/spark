package org.apache.spark.storage;
/**
 * Returns a sequence of {@link BlockManagerId}, whose rack is randomly picked from the given <code>racks</code>.
 * Note that, each rack will be picked at least once from <code>racks</code>, if <code>count</code> is greater or equal
 * to the number of <code>racks</code>.
 */
public  class TopologyAwareBlockReplicationPolicyBehavior extends org.apache.spark.storage.RandomBlockReplicationPolicyBehavior {
  // not preceding
  public   TopologyAwareBlockReplicationPolicyBehavior ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.storage.BasicBlockReplicationPolicy replicationPolicy ()  { throw new RuntimeException(); }
}

package org.apache.spark.storage;
/**
 * Method to prioritize a bunch of candidate peers of a block
 * <p>
 * param:  blockManagerId Id of the current BlockManager for self identification
 * param:  peers A list of peers of a BlockManager
 * param:  peersReplicatedTo Set of peers already replicated to
 * param:  blockId BlockId of the block being replicated. This can be used as a source of
 *                randomness if needed.
 * param:  numReplicas Number of peers we need to replicate to
 * @return A prioritized list of peers. Lower the index of a peer, higher its priority.
 *         This returns a list of size at most <code>numPeersToReplicateTo</code>.
 */
public  interface BlockReplicationPolicy {
  // not preceding
  public  scala.collection.immutable.List<org.apache.spark.storage.BlockManagerId> prioritize (org.apache.spark.storage.BlockManagerId blockManagerId, scala.collection.Seq<org.apache.spark.storage.BlockManagerId> peers, scala.collection.mutable.HashSet<org.apache.spark.storage.BlockManagerId> peersReplicatedTo, org.apache.spark.storage.BlockId blockId, int numReplicas)  ;
}

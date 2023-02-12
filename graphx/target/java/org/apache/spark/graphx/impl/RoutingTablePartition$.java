package org.apache.spark.graphx.impl;
/**
 * A message from an edge partition to a vertex specifying the position in which the edge
 * partition references the vertex (src, dst, or both). The edge partition is encoded in the lower
 * 30 bits of the Int, and the position is encoded in the upper 2 bits of the Int.
 */
// not preceding
public  class RoutingTablePartition$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RoutingTablePartition$ MODULE$ = null;
  public   RoutingTablePartition$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.impl.RoutingTablePartition empty ()  { throw new RuntimeException(); }
  /** Generate a `RoutingTableMessage` for each vertex referenced in `edgePartition`. */
  public  scala.collection.Iterator<scala.Tuple2<java.lang.Object, java.lang.Object>> edgePartitionToMsgs (int pid, org.apache.spark.graphx.impl.EdgePartition<?, ?> edgePartition)  { throw new RuntimeException(); }
  /** Build a `RoutingTablePartition` from `RoutingTableMessage`s. */
  public  org.apache.spark.graphx.impl.RoutingTablePartition fromMsgs (int numEdgePartitions, scala.collection.Iterator<scala.Tuple2<java.lang.Object, java.lang.Object>> iter)  { throw new RuntimeException(); }
}

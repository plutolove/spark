package org.apache.spark.graphx.impl;
/**
 * Generate a <code>VertexId</code> array for each edge partition keyed on the edge partition ID. The array
 * contains the visible vertex ids from the current partition that are referenced in the edge
 * partition.
 */
  class ShippableVertexPartitionOps<VD extends java.lang.Object> extends org.apache.spark.graphx.impl.VertexPartitionBaseOps<VD, org.apache.spark.graphx.impl.ShippableVertexPartition> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   ShippableVertexPartitionOps (org.apache.spark.graphx.impl.ShippableVertexPartition<VD> self, scala.reflect.ClassTag<VD> evidence$8)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.graphx.impl.ShippableVertexPartition<VD> withIndex (org.apache.spark.util.collection.OpenHashSet<java.lang.Object> index)  { throw new RuntimeException(); }
  public  org.apache.spark.graphx.impl.ShippableVertexPartition<VD> withMask (org.apache.spark.util.collection.BitSet mask)  { throw new RuntimeException(); }
  public <VD2 extends java.lang.Object> org.apache.spark.graphx.impl.ShippableVertexPartition<VD2> withValues (java.lang.Object values, scala.reflect.ClassTag<VD2> evidence$9)  { throw new RuntimeException(); }
}

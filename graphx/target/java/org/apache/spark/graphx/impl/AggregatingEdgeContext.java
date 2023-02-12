package org.apache.spark.graphx.impl;
/**
 * Send messages along edges and aggregate them at the receiving vertices. Implemented by
 * filtering the source vertex index, then scanning each edge cluster.
 * <p>
 * param:  sendMsg generates messages to neighboring vertices of an edge
 * param:  mergeMsg the combiner applied to messages destined to the same vertex
 * param:  tripletFields which triplet fields <code>sendMsg</code> uses
 * param:  activeness criteria for filtering edges based on activeness
 * <p>
 * @return iterator aggregated messages keyed by the receiving vertex id
 */
public  class AggregatingEdgeContext<VD extends java.lang.Object, ED extends java.lang.Object, A extends java.lang.Object> extends org.apache.spark.graphx.EdgeContext<VD, ED, A> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   AggregatingEdgeContext (scala.Function2<A, A, A> mergeMsg, java.lang.Object aggregates, org.apache.spark.util.collection.BitSet bitset)  { throw new RuntimeException(); }
  public  ED attr ()  { throw new RuntimeException(); }
  public  VD dstAttr ()  { throw new RuntimeException(); }
  public  long dstId ()  { throw new RuntimeException(); }
  public  void sendToDst (A msg)  { throw new RuntimeException(); }
  public  void sendToSrc (A msg)  { throw new RuntimeException(); }
  // not preceding
  public  void set (long srcId, long dstId, int localSrcId, int localDstId, VD srcAttr, VD dstAttr, ED attr)  { throw new RuntimeException(); }
  public  void setRest (long dstId, int localDstId, VD dstAttr, ED attr)  { throw new RuntimeException(); }
  public  void setSrcOnly (long srcId, int localSrcId, VD srcAttr)  { throw new RuntimeException(); }
  public  VD srcAttr ()  { throw new RuntimeException(); }
  public  long srcId ()  { throw new RuntimeException(); }
}

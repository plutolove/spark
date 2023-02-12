package org.apache.spark.graphx.impl;
/** Return the vertex attribute for the given vertex ID. */
 abstract class VertexPartitionBase<VD extends java.lang.Object> implements scala.Serializable {
  // not preceding
  static public <VD extends java.lang.Object> scala.Tuple3<org.apache.spark.util.collection.OpenHashSet<java.lang.Object>, java.lang.Object, org.apache.spark.util.collection.BitSet> initFrom (scala.collection.Iterator<scala.Tuple2<java.lang.Object, VD>> iter, scala.reflect.ClassTag<VD> evidence$1)  { throw new RuntimeException(); }
  /**
   * Construct the constituents of a VertexPartitionBase from the given vertices, merging duplicate
   * entries using <code>mergeFunc</code>.
   * @param iter (undocumented)
   * @param mergeFunc (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  static public <VD extends java.lang.Object> scala.Tuple3<org.apache.spark.util.collection.OpenHashSet<java.lang.Object>, java.lang.Object, org.apache.spark.util.collection.BitSet> initFrom (scala.collection.Iterator<scala.Tuple2<java.lang.Object, VD>> iter, scala.Function2<VD, VD, VD> mergeFunc, scala.reflect.ClassTag<VD> evidence$2)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   VertexPartitionBase (scala.reflect.ClassTag<VD> evidence$3)  { throw new RuntimeException(); }
  // not preceding
  public abstract  org.apache.spark.util.collection.OpenHashSet<java.lang.Object> index ()  ;
  public abstract  java.lang.Object values ()  ;
  public abstract  org.apache.spark.util.collection.BitSet mask ()  ;
  public  int capacity ()  { throw new RuntimeException(); }
  public  int size ()  { throw new RuntimeException(); }
  /** Return the vertex attribute for the given vertex ID. */
  public  VD apply (long vid)  { throw new RuntimeException(); }
  public  boolean isDefined (long vid)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<java.lang.Object, VD>> iterator ()  { throw new RuntimeException(); }
}

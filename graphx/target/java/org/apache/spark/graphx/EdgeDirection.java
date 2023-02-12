package org.apache.spark.graphx;
/**
 * Reverse the direction of an edge.  An in becomes out,
 * out becomes in and both and either remain the same.
 */
public  class EdgeDirection implements scala.Serializable {
  // not preceding
  static public final  org.apache.spark.graphx.EdgeDirection In ()  { throw new RuntimeException(); }
  /** Edges originating from a vertex. */
  static public final  org.apache.spark.graphx.EdgeDirection Out ()  { throw new RuntimeException(); }
  /** Edges originating from *or* arriving at a vertex of interest. */
  static public final  org.apache.spark.graphx.EdgeDirection Either ()  { throw new RuntimeException(); }
  /** Edges originating from *and* arriving at a vertex of interest. */
  static public final  org.apache.spark.graphx.EdgeDirection Both ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.graphx.EdgeDirection reverse ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  boolean equals (Object o)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
}

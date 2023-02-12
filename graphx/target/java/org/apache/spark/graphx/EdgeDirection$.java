package org.apache.spark.graphx;
/** Edges arriving at a vertex. */
// not preceding
public  class EdgeDirection$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EdgeDirection$ MODULE$ = null;
  public   EdgeDirection$ ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.graphx.EdgeDirection In ()  { throw new RuntimeException(); }
  /** Edges originating from a vertex. */
  public final  org.apache.spark.graphx.EdgeDirection Out ()  { throw new RuntimeException(); }
  /** Edges originating from *or* arriving at a vertex of interest. */
  public final  org.apache.spark.graphx.EdgeDirection Either ()  { throw new RuntimeException(); }
  /** Edges originating from *and* arriving at a vertex of interest. */
  public final  org.apache.spark.graphx.EdgeDirection Both ()  { throw new RuntimeException(); }
}

package org.apache.spark.graphx;
/** Returns the partition number for a given edge. */
public  interface PartitionStrategy extends scala.Serializable {
  // not preceding
  // not preceding
  static public  class EdgePartition2D$ implements org.apache.spark.graphx.PartitionStrategy, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final EdgePartition2D$ MODULE$ = null;
    public   EdgePartition2D$ ()  { throw new RuntimeException(); }
    // not preceding
    public  int getPartition (long src, long dst, int numParts)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class EdgePartition1D$ implements org.apache.spark.graphx.PartitionStrategy, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final EdgePartition1D$ MODULE$ = null;
    public   EdgePartition1D$ ()  { throw new RuntimeException(); }
    // not preceding
    public  int getPartition (long src, long dst, int numParts)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class RandomVertexCut$ implements org.apache.spark.graphx.PartitionStrategy, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RandomVertexCut$ MODULE$ = null;
    public   RandomVertexCut$ ()  { throw new RuntimeException(); }
    // not preceding
    public  int getPartition (long src, long dst, int numParts)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class CanonicalRandomVertexCut$ implements org.apache.spark.graphx.PartitionStrategy, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CanonicalRandomVertexCut$ MODULE$ = null;
    public   CanonicalRandomVertexCut$ ()  { throw new RuntimeException(); }
    // not preceding
    public  int getPartition (long src, long dst, int numParts)  { throw new RuntimeException(); }
  }
  // not preceding
  public  int getPartition (long src, long dst, int numParts)  ;
}

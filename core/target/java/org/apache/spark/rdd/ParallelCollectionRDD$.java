package org.apache.spark.rdd;
/**
 * Slice a collection into numSlices sub-collections. One extra thing we do here is to treat Range
 * collections specially, encoding the slices as other Ranges to minimize memory cost. This makes
 * it efficient to run Spark over RDDs representing large sets of numbers. And if the collection
 * is an inclusive Range, we use inclusive range for the last slice.
 */
// not preceding
public  class ParallelCollectionRDD$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ParallelCollectionRDD$ MODULE$ = null;
  public   ParallelCollectionRDD$ ()  { throw new RuntimeException(); }
  // not preceding
  public <T extends java.lang.Object> scala.collection.Seq<scala.collection.Seq<T>> slice (scala.collection.Seq<T> seq, int numSlices, scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
}

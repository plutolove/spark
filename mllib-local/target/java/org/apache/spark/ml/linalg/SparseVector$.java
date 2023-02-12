package org.apache.spark.ml.linalg;
/**
 * Create a slice of this vector based on the given indices.
 * param:  selectedIndices Unsorted list of indices into the vector.
 *                        This does NOT do bound checking.
 * @return  New SparseVector with values in the order specified by the given indices.
 * <p>
 * NOTE: The API needs to be discussed before making this public.
 *       Also, if we have a version assuming indices are sorted, we should optimize it.
 */
// not preceding
public  class SparseVector$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparseVector$ MODULE$ = null;
  public   SparseVector$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<scala.Tuple3<java.lang.Object, int[], double[]>> unapply (org.apache.spark.ml.linalg.SparseVector sv)  { throw new RuntimeException(); }
}

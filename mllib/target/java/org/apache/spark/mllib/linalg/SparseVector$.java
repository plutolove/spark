package org.apache.spark.mllib.linalg;
/**
 * Convert new linalg type to spark.mllib type.  Light copy; only copies references
 */
// not preceding
public  class SparseVector$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SparseVector$ MODULE$ = null;
  public   SparseVector$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<scala.Tuple3<java.lang.Object, int[], double[]>> unapply (org.apache.spark.mllib.linalg.SparseVector sv)  { throw new RuntimeException(); }
  /**
   * Convert new linalg type to spark.mllib type.  Light copy; only copies references
   * @param v (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.linalg.SparseVector fromML (org.apache.spark.ml.linalg.SparseVector v)  { throw new RuntimeException(); }
}

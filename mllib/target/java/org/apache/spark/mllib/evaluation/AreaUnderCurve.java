package org.apache.spark.mllib.evaluation;
/**
 * Uses the trapezoidal rule to compute the area under the line connecting the two input points.
 * param:  points two 2D points stored in Seq
 */
// not preceding
public  class AreaUnderCurve {
  /**
   * Returns the area under the given curve.
   * <p>
   * @param curve an RDD of ordered 2D points stored in pairs representing a curve
   * @return (undocumented)
   */
  static public  double of (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> curve)  { throw new RuntimeException(); }
  /**
   * Returns the area under the given curve.
   * <p>
   * @param curve an iterator over ordered 2D points stored in pairs representing a curve
   * @return (undocumented)
   */
  static public  double of (scala.collection.Iterable<scala.Tuple2<java.lang.Object, java.lang.Object>> curve)  { throw new RuntimeException(); }
}

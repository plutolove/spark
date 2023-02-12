package org.apache.spark.ml.feature;
/** The size of the output vector. */
  class FeatureEncoder implements scala.Serializable {
  // not preceding
  public   FeatureEncoder (int[] numFeatures)  { throw new RuntimeException(); }
  /**
   * Given an input row of features, invokes the specific function for every non-zero output.
   * <p>
   * @param value The row value to encode, either a Double or Vector.
   * @param f The callback to invoke on each non-zero (index, value) output pair.
   */
  public  void foreachNonzeroOutput (Object value, scala.Function2<java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  /** The size of the output vector. */
  public  int outputSize ()  { throw new RuntimeException(); }
}

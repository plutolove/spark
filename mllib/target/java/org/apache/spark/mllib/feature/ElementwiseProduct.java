package org.apache.spark.mllib.feature;
/**
 * Does the hadamard product transformation.
 * <p>
 * param:  vector vector to be transformed.
 * @return transformed vector.
 */
public  class ElementwiseProduct implements org.apache.spark.mllib.feature.VectorTransformer {
  // not preceding
  public   ElementwiseProduct (org.apache.spark.mllib.linalg.Vector scalingVec)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.mllib.linalg.Vector scalingVec ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.mllib.linalg.Vector transform (org.apache.spark.mllib.linalg.Vector vector)  { throw new RuntimeException(); }
    double[] transformDense (double[] values)  { throw new RuntimeException(); }
    scala.Tuple2<int[], double[]> transformSparse (int[] indices, double[] values)  { throw new RuntimeException(); }
}

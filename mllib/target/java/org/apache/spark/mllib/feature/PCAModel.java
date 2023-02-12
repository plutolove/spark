package org.apache.spark.mllib.feature;
/**
 * Transform a vector by computed Principal Components.
 * <p>
 * param:  vector vector to be transformed.
 *               Vector must be the same length as the source vectors given to <code>PCA.fit()</code>.
 * @return transformed vector. Vector will be of length k.
 */
public  class PCAModel implements org.apache.spark.mllib.feature.VectorTransformer {
  // not preceding
     PCAModel (int k, org.apache.spark.mllib.linalg.DenseMatrix pc, org.apache.spark.mllib.linalg.DenseVector explainedVariance)  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.DenseVector explainedVariance ()  { throw new RuntimeException(); }
  // not preceding
  public  int k ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.DenseMatrix pc ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.mllib.linalg.Vector transform (org.apache.spark.mllib.linalg.Vector vector)  { throw new RuntimeException(); }
}

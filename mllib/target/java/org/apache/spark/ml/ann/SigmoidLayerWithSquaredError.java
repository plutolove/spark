package org.apache.spark.ml.ann;
/**
 * Returns the value of loss function.
 * Computes loss based on target and output.
 * Writes delta (error) to delta in place.
 * Delta is allocated based on the outputSize
 * of model implementation.
 * <p>
 * param:  output actual output
 * param:  target target output
 * param:  delta delta (updated in place)
 * @return loss
 */
  class SigmoidLayerWithSquaredError implements org.apache.spark.ml.ann.Layer {
  // not preceding
  public   SigmoidLayerWithSquaredError ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.ann.LayerModel createModel (breeze.linalg.DenseVector<java.lang.Object> weights)  { throw new RuntimeException(); }
  public  int getOutputSize (int inputSize)  { throw new RuntimeException(); }
  public  boolean inPlace ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.ann.LayerModel initModel (breeze.linalg.DenseVector<java.lang.Object> weights, java.util.Random random)  { throw new RuntimeException(); }
  // not preceding
  public  int weightSize ()  { throw new RuntimeException(); }
}

package org.apache.spark.examples.ml;
/**
 * Param for max number of iterations
 * <p>
 * NOTE: The usual way to add a parameter to a model or algorithm is to include:
 *   - val myParamName: ParamType
 *   - def getMyParamName
 *   - def setMyParamName
 * Here, we have a trait to be mixed in with the Estimator and Model (MyLogisticRegression
 * and MyLogisticRegressionModel). We place the setter (setMaxIter) method in the Estimator
 * class since the maxIter parameter is only used during training (not in the Model).
 */
public  interface MyLogisticRegressionParams extends org.apache.spark.ml.classification.ClassifierParams {
  public  int getMaxIter ()  ;
  /**
   * Param for max number of iterations
   * <p>
   * NOTE: The usual way to add a parameter to a model or algorithm is to include:
   *   - val myParamName: ParamType
   *   - def getMyParamName
   *   - def setMyParamName
   * Here, we have a trait to be mixed in with the Estimator and Model (MyLogisticRegression
   * and MyLogisticRegressionModel). We place the setter (setMaxIter) method in the Estimator
   * class since the maxIter parameter is only used during training (not in the Model).
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntParam maxIter ()  ;
}

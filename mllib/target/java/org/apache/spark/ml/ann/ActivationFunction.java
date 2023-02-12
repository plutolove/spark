package org.apache.spark.ml.ann;
/**
 * Implements a function
 */
public  interface ActivationFunction extends scala.Serializable {
  /**
   * Implements a derivative of a function (needed for the back propagation)
   * @return (undocumented)
   */
  public  scala.Function1<java.lang.Object, java.lang.Object> derivative ()  ;
  // not preceding
  public  scala.Function1<java.lang.Object, java.lang.Object> eval ()  ;
}

package org.apache.spark.ml.optim.aggregator;
/** The dimension of the gradient array. */
public  interface DifferentiableLossAggregator<Datum extends java.lang.Object, Agg extends org.apache.spark.ml.optim.aggregator.DifferentiableLossAggregator<Datum, Agg>> extends scala.Serializable {
  /** Add a single data point to this aggregator. */
  public  Agg add (Datum instance)  ;
  /** The dimension of the gradient array. */
  public  int dim ()  ;
  /** The current weighted averaged gradient. */
  public  org.apache.spark.ml.linalg.Vector gradient ()  ;
  /** Array of gradient values that are mutated when new instances are added to the aggregator. */
  public  double[] gradientSumArray ()  ;
  /** The current loss value of this aggregator. */
  public  double loss ()  ;
  public  double lossSum ()  ;
  /** Merge two aggregators. The `this` object will be modified in place and returned. */
  public  Agg merge (Agg other)  ;
  /** Weighted count of instances in this aggregator. */
  public  double weight ()  ;
  public  double weightSum ()  ;
}

package org.apache.spark.ml.evaluation;
/** @group setParam */
public  class ClusteringEvaluator extends org.apache.spark.ml.evaluation.Evaluator implements org.apache.spark.ml.param.shared.HasPredictionCol, org.apache.spark.ml.param.shared.HasFeaturesCol, org.apache.spark.ml.util.DefaultParamsWritable {
  // not preceding
  static public  org.apache.spark.ml.evaluation.ClusteringEvaluator load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   ClusteringEvaluator (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public   ClusteringEvaluator ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.evaluation.ClusteringEvaluator copy (org.apache.spark.ml.param.ParamMap pMap)  { throw new RuntimeException(); }
  public  boolean isLargerBetter ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.ClusteringEvaluator setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.ClusteringEvaluator setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * param for metric name in evaluation
   * (supports <code>"silhouette"</code> (default))
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> metricName ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String getMetricName ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.ClusteringEvaluator setMetricName (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * param for distance measure to be used in evaluation
   * (supports <code>"squaredEuclidean"</code> (default), <code>"cosine"</code>)
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.Param<java.lang.String> distanceMeasure ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String getDistanceMeasure ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.evaluation.ClusteringEvaluator setDistanceMeasure (java.lang.String value)  { throw new RuntimeException(); }
  public  double evaluate (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}

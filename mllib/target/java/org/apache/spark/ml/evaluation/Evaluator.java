package org.apache.spark.ml.evaluation;
/**
 * Evaluates model output and returns a scalar metric.
 * The value of {@link isLargerBetter} specifies whether larger values are better.
 * <p>
 * param:  dataset a dataset that contains labels/observations and predictions.
 * param:  paramMap parameter map that specifies the input columns and output metrics
 * @return metric
 */
public abstract class Evaluator implements org.apache.spark.ml.param.Params {
  // not preceding
  public   Evaluator ()  { throw new RuntimeException(); }
  public abstract  org.apache.spark.ml.evaluation.Evaluator copy (org.apache.spark.ml.param.ParamMap extra)  ;
  // not preceding
    org.apache.spark.ml.param.ParamMap defaultParamMap ()  { throw new RuntimeException(); }
  // not preceding
  public  double evaluate (org.apache.spark.sql.Dataset<?> dataset, org.apache.spark.ml.param.ParamMap paramMap)  { throw new RuntimeException(); }
  /**
   * Evaluates model output and returns a scalar metric.
   * The value of {@link isLargerBetter} specifies whether larger values are better.
   * <p>
   * @param dataset a dataset that contains labels/observations and predictions.
   * @return metric
   */
  public abstract  double evaluate (org.apache.spark.sql.Dataset<?> dataset)  ;
  /**
   * Indicates whether the metric returned by <code>evaluate</code> should be maximized (true, default)
   * or minimized (false).
   * A given evaluator may support multiple metrics which may be maximized or minimized.
   * @return (undocumented)
   */
  public  boolean isLargerBetter ()  { throw new RuntimeException(); }
  // not preceding
    org.apache.spark.ml.param.ParamMap paramMap ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.Param<?>[] params ()  { throw new RuntimeException(); }
}
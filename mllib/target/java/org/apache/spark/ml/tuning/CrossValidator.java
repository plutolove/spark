package org.apache.spark.ml.tuning;
/** @group setParam */
public  class CrossValidator extends org.apache.spark.ml.Estimator<org.apache.spark.ml.tuning.CrossValidatorModel> implements org.apache.spark.ml.tuning.CrossValidatorParams, org.apache.spark.ml.param.shared.HasParallelism, org.apache.spark.ml.param.shared.HasCollectSubModels, org.apache.spark.ml.util.MLWritable, org.apache.spark.internal.Logging {
  static   class CrossValidatorWriter extends org.apache.spark.ml.util.MLWriter {
    // not preceding
    public   CrossValidatorWriter (org.apache.spark.ml.tuning.CrossValidator instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.tuning.CrossValidator> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.tuning.CrossValidator load (java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.BooleanParam collectSubModels ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.IntParam parallelism ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.IntParam numFolds ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.Estimator<?>> estimator ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.param.ParamMap[]> estimatorParamMaps ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.evaluation.Evaluator> evaluator ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   CrossValidator (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public   CrossValidator ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.CrossValidator setEstimator (org.apache.spark.ml.Estimator<?> value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.CrossValidator setEstimatorParamMaps (org.apache.spark.ml.param.ParamMap[] value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.CrossValidator setEvaluator (org.apache.spark.ml.evaluation.Evaluator value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.CrossValidator setNumFolds (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.tuning.CrossValidator setSeed (long value)  { throw new RuntimeException(); }
  /**
   * Set the maximum level of parallelism to evaluate models in parallel.
   * Default is 1 for serial evaluation
   * <p>
   * @group expertSetParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.tuning.CrossValidator setParallelism (int value)  { throw new RuntimeException(); }
  /**
   * Whether to collect submodels when fitting. If set, we can get submodels from
   * the returned model.
   * <p>
   * Note: If set this param, when you save the returned model, you can set an option
   * "persistSubModels" to be "true" before saving, in order to save these submodels.
   * You can check documents of
   * {@link org.apache.spark.ml.tuning.CrossValidatorModel.CrossValidatorModelWriter}
   * for more information.
   * <p>
   * @group expertSetParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.tuning.CrossValidator setCollectSubModels (boolean value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.CrossValidatorModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.CrossValidator copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}

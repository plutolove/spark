package org.apache.spark.ml.tuning;
/** A Python-friendly auxiliary constructor. */
public  class CrossValidatorModel extends org.apache.spark.ml.Model<org.apache.spark.ml.tuning.CrossValidatorModel> implements org.apache.spark.ml.tuning.CrossValidatorParams, org.apache.spark.ml.util.MLWritable {
  /**
   * Writer for CrossValidatorModel.
   * param:  instance CrossValidatorModel instance used to construct the writer
   * <p>
   * CrossValidatorModelWriter supports an option "persistSubModels", with possible values
   * "true" or "false". If you set the collectSubModels Param before fitting, then you can
   * set "persistSubModels" to "true" in order to persist the subModels. By default,
   * "persistSubModels" will be "true" when subModels are available and "false" otherwise.
   * If subModels are not available, then setting "persistSubModels" to "true" will cause
   * an exception.
   */
  static public final class CrossValidatorModelWriter extends org.apache.spark.ml.util.MLWriter {
    // not preceding
       CrossValidatorModelWriter (org.apache.spark.ml.tuning.CrossValidatorModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  // not preceding
  static   scala.Option<org.apache.spark.ml.Model<?>[][]> copySubModels (scala.Option<org.apache.spark.ml.Model<?>[][]> subModels)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.tuning.CrossValidatorModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.tuning.CrossValidatorModel load (java.lang.String path)  { throw new RuntimeException(); }
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
  public  org.apache.spark.ml.Model<?> bestModel ()  { throw new RuntimeException(); }
  public  double[] avgMetrics ()  { throw new RuntimeException(); }
  // not preceding
     CrossValidatorModel (java.lang.String uid, org.apache.spark.ml.Model<?> bestModel, double[] avgMetrics)  { throw new RuntimeException(); }
  // not preceding
     CrossValidatorModel (java.lang.String uid, org.apache.spark.ml.Model<?> bestModel, java.util.List<java.lang.Object> avgMetrics)  { throw new RuntimeException(); }
    org.apache.spark.ml.tuning.CrossValidatorModel setSubModels (scala.Option<org.apache.spark.ml.Model<?>[][]> subModels)  { throw new RuntimeException(); }
    org.apache.spark.ml.tuning.CrossValidatorModel setSubModels (java.util.List<java.util.List<org.apache.spark.ml.Model<?>>> subModels)  { throw new RuntimeException(); }
  /**
   * @return submodels represented in two dimension array. The index of outer array is the
   *         fold index, and the index of inner array corresponds to the ordering of
   *         estimatorParamMaps
   * @throws IllegalArgumentException if subModels are not available. To retrieve subModels,
   *         make sure to set collectSubModels to true before fitting.
   */
  public  org.apache.spark.ml.Model<?>[][] subModels ()  { throw new RuntimeException(); }
  public  boolean hasSubModels ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.CrossValidatorModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.CrossValidatorModel.CrossValidatorModelWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}

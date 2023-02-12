package org.apache.spark.ml.tuning;
/**
 * Writer for TrainValidationSplitModel.
 * param:  instance TrainValidationSplitModel instance used to construct the writer
 * <p>
 * TrainValidationSplitModel supports an option "persistSubModels", with possible values
 * "true" or "false". If you set the collectSubModels Param before fitting, then you can
 * set "persistSubModels" to "true" in order to persist the subModels. By default,
 * "persistSubModels" will be "true" when subModels are available and "false" otherwise.
 * If subModels are not available, then setting "persistSubModels" to "true" will cause
 * an exception.
 */
// not preceding
public  class TrainValidationSplitModel$ implements org.apache.spark.ml.util.MLReadable<org.apache.spark.ml.tuning.TrainValidationSplitModel>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TrainValidationSplitModel$ MODULE$ = null;
  public   TrainValidationSplitModel$ ()  { throw new RuntimeException(); }
  // not preceding
    scala.Option<org.apache.spark.ml.Model<?>[]> copySubModels (scala.Option<org.apache.spark.ml.Model<?>[]> subModels)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.tuning.TrainValidationSplitModel> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.TrainValidationSplitModel load (java.lang.String path)  { throw new RuntimeException(); }
}

package org.apache.spark.ml.feature;
/** @group setParam */
 abstract class LSH<T extends org.apache.spark.ml.feature.LSHModel<T>> extends org.apache.spark.ml.Estimator<T> implements org.apache.spark.ml.feature.LSHParams, org.apache.spark.ml.util.DefaultParamsWritable {
  // not preceding
  public   LSH ()  { throw new RuntimeException(); }
  /**
   * Validate and create a new instance of concrete LSHModel. Because different LSHModel may have
   * different initial setting, developer needs to define how their LSHModel is created instead of
   * using reflection in this abstract class.
   * @param inputDim The dimension of the input dataset
   * @return A new LSHModel instance without any params
   */
  protected abstract  T createRawLSHModel (int inputDim)  ;
  public  T fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.feature.LSHModel), List(TypeTree().setOriginal(Ident(TypeName("T"))))))))
  public final  org.apache.spark.ml.param.IntParam numHashTables ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.feature.LSH<T> setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.LSH<T> setNumHashTables (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.LSH<T> setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
}

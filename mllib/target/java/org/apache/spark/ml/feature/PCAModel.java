package org.apache.spark.ml.feature;
/** @group setParam */
public  class PCAModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.PCAModel> implements org.apache.spark.ml.feature.PCAParams, org.apache.spark.ml.util.MLWritable {
  // not preceding
  static   class PCAModelWriter extends org.apache.spark.ml.util.MLWriter {
    // not preceding
    public   PCAModelWriter (org.apache.spark.ml.feature.PCAModel instance)  { throw new RuntimeException(); }
    // not preceding
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.PCAModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.PCAModel load (java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam k ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.DenseMatrix pc ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.DenseVector explainedVariance ()  { throw new RuntimeException(); }
  // not preceding
     PCAModel (java.lang.String uid, org.apache.spark.ml.linalg.DenseMatrix pc, org.apache.spark.ml.linalg.DenseVector explainedVariance)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.feature.PCAModel setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.PCAModel setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Transform a vector by computed Principal Components.
   * <p>
   * @note Vectors to be transformed must be the same length as the source vectors given
   * to <code>PCA.fit()</code>.
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.PCAModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}

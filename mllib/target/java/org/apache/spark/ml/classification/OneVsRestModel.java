package org.apache.spark.ml.classification;
/** @group setParam */
public final class OneVsRestModel extends org.apache.spark.ml.Model<org.apache.spark.ml.classification.OneVsRestModel> implements org.apache.spark.ml.classification.OneVsRestParams, org.apache.spark.ml.util.MLWritable {
  /** {@link MLWriter} instance for {@link OneVsRestModel} */
  static   class OneVsRestModelWriter extends org.apache.spark.ml.util.MLWriter {
    // not preceding
    public   OneVsRestModelWriter (org.apache.spark.ml.classification.OneVsRestModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.classification.OneVsRestModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.classification.OneVsRestModel load (java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.classification.Classifier<?, ? extends org.apache.spark.ml.classification.Classifier<java.lang.Object, org.apache.spark.ml.classification.Classifier, org.apache.spark.ml.classification.ClassificationModel>, ? extends org.apache.spark.ml.classification.ClassificationModel<java.lang.Object, org.apache.spark.ml.classification.ClassificationModel>>> classifier ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> rawPredictionCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> labelCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
    org.apache.spark.sql.types.Metadata labelMetadata ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.ClassificationModel[] models ()  { throw new RuntimeException(); }
  // not preceding
     OneVsRestModel (java.lang.String uid, org.apache.spark.sql.types.Metadata labelMetadata, org.apache.spark.ml.classification.ClassificationModel[] models)  { throw new RuntimeException(); }
  public  int numClasses ()  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.OneVsRestModel setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.OneVsRestModel setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.classification.OneVsRestModel setRawPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.OneVsRestModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}

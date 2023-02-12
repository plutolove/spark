package org.apache.spark.ml.feature;
/** Java-friendly version of {@link categoryMaps} */
public  class VectorIndexerModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.VectorIndexerModel> implements org.apache.spark.ml.feature.VectorIndexerParams, org.apache.spark.ml.util.MLWritable {
  // not preceding
  static   class VectorIndexerModelWriter extends org.apache.spark.ml.util.MLWriter {
    // not preceding
    public   VectorIndexerModelWriter (org.apache.spark.ml.feature.VectorIndexerModel instance)  { throw new RuntimeException(); }
    // not preceding
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.VectorIndexerModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.VectorIndexerModel load (java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.Param<java.lang.String> handleInvalid ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.IntParam maxCategories ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, scala.collection.immutable.Map<java.lang.Object, java.lang.Object>> categoryMaps ()  { throw new RuntimeException(); }
  // not preceding
     VectorIndexerModel (java.lang.String uid, int numFeatures, scala.collection.immutable.Map<java.lang.Object, scala.collection.immutable.Map<java.lang.Object, java.lang.Object>> categoryMaps)  { throw new RuntimeException(); }
  // not preceding
  public  java.util.Map<java.lang.Integer, java.util.Map<java.lang.Double, java.lang.Integer>> javaCategoryMaps ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorIndexerModel setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorIndexerModel setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.VectorIndexerModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}

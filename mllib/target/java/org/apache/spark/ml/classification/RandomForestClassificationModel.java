package org.apache.spark.ml.classification;
/**
 * Construct a random forest classification model, with all trees weighted equally.
 * <p>
 * param:  trees  Component trees
 */
public  class RandomForestClassificationModel extends org.apache.spark.ml.classification.ProbabilisticClassificationModel<org.apache.spark.ml.linalg.Vector, org.apache.spark.ml.classification.RandomForestClassificationModel> implements org.apache.spark.ml.tree.RandomForestClassifierParams, org.apache.spark.ml.tree.TreeEnsembleModel<org.apache.spark.ml.classification.DecisionTreeClassificationModel>, org.apache.spark.ml.util.MLWritable, scala.Serializable {
  static   class RandomForestClassificationModelWriter extends org.apache.spark.ml.util.MLWriter {
    // not preceding
    public   RandomForestClassificationModelWriter (org.apache.spark.ml.classification.RandomForestClassificationModel instance)  { throw new RuntimeException(); }
    // not preceding
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.classification.RandomForestClassificationModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.classification.RandomForestClassificationModel load (java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  static   org.apache.spark.ml.classification.RandomForestClassificationModel fromOld (org.apache.spark.mllib.tree.model.RandomForestModel oldModel, org.apache.spark.ml.classification.RandomForestClassifier parent, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> categoricalFeatures, int numClasses, int numFeatures)  { throw new RuntimeException(); }
  // not preceding
  public  int totalNumNodes ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> impurity ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam numTrees ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.BooleanParam bootstrap ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam subsamplingRate ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> featureSubsetStrategy ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> leafCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam maxDepth ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam maxBins ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam minInstancesPerNode ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam minWeightFractionPerNode ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam minInfoGain ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam maxMemoryInMB ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.BooleanParam cacheNodeIds ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam checkpointInterval ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  int numFeatures ()  { throw new RuntimeException(); }
  public  int numClasses ()  { throw new RuntimeException(); }
  // not preceding
     RandomForestClassificationModel (java.lang.String uid, org.apache.spark.ml.classification.DecisionTreeClassificationModel[] _trees, int numFeatures, int numClasses)  { throw new RuntimeException(); }
  /**
   * Construct a random forest classification model, with all trees weighted equally.
   * <p>
   * @param trees  Component trees
   * @param numFeatures (undocumented)
   * @param numClasses (undocumented)
   */
     RandomForestClassificationModel (org.apache.spark.ml.classification.DecisionTreeClassificationModel[] trees, int numFeatures, int numClasses)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.DecisionTreeClassificationModel[] trees ()  { throw new RuntimeException(); }
  public  double[] treeWeights ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector predictRaw (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.linalg.Vector raw2probabilityInPlace (org.apache.spark.ml.linalg.Vector rawPrediction)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.RandomForestClassificationModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.linalg.Vector featureImportances ()  { throw new RuntimeException(); }
  /** (private[ml]) Convert to a model in the old API */
    org.apache.spark.mllib.tree.model.RandomForestModel toOld ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}

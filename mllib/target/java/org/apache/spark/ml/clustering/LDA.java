package org.apache.spark.ml.clustering;
/**
 * The features for LDA should be a <code>Vector</code> representing the word counts in a document.
 * The vector should be of length vocabSize, with counts for each term (word).
 * <p>
 * @group setParam
 */
public  class LDA extends org.apache.spark.ml.Estimator<org.apache.spark.ml.clustering.LDAModel> implements org.apache.spark.ml.clustering.LDAParams, org.apache.spark.ml.util.DefaultParamsWritable {
  // not preceding
  static   org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> getOldDataset (org.apache.spark.sql.Dataset<?> dataset, java.lang.String featuresCol)  { throw new RuntimeException(); }
  // not preceding
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.LDA> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.clustering.LDA load (java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam k ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleArrayParam docConcentration ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam topicConcentration ()  { throw new RuntimeException(); }
  // not preceding
  public final  java.lang.String[] supportedOptimizers ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> optimizer ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> topicDistributionCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam learningOffset ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam learningDecay ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam subsamplingRate ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.BooleanParam optimizeDocConcentration ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.BooleanParam keepLastCheckpoint ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam checkpointInterval ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   LDA (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public   LDA ()  { throw new RuntimeException(); }
  /**
   * The features for LDA should be a <code>Vector</code> representing the word counts in a document.
   * The vector should be of length vocabSize, with counts for each term (word).
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.clustering.LDA setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.LDA setMaxIter (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.LDA setSeed (long value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.LDA setCheckpointInterval (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.LDA setK (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.LDA setDocConcentration (double[] value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.LDA setDocConcentration (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.LDA setTopicConcentration (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.LDA setOptimizer (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.LDA setTopicDistributionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.clustering.LDA setLearningOffset (double value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.clustering.LDA setLearningDecay (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.LDA setSubsamplingRate (double value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.clustering.LDA setOptimizeDocConcentration (boolean value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.clustering.LDA setKeepLastCheckpoint (boolean value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.LDA copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.LDAModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
}

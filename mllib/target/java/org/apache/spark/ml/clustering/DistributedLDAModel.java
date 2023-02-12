package org.apache.spark.ml.clustering;
/**
 * Convert this distributed model to a local representation.  This discards info about the
 * training dataset.
 * <p>
 * WARNING: This involves collecting a large {@link topicsMatrix} to the driver.
 */
public  class DistributedLDAModel extends org.apache.spark.ml.clustering.LDAModel {
  // not preceding
  static   class DistributedWriter extends org.apache.spark.ml.util.MLWriter {
    // not preceding
    public   DistributedWriter (org.apache.spark.ml.clustering.DistributedLDAModel instance)  { throw new RuntimeException(); }
    // not preceding
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.DistributedLDAModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.clustering.DistributedLDAModel load (java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
     DistributedLDAModel (java.lang.String uid, int vocabSize, org.apache.spark.mllib.clustering.DistributedLDAModel oldDistributedModel, org.apache.spark.sql.SparkSession sparkSession, scala.Option<org.apache.spark.mllib.clustering.LocalLDAModel> oldLocalModelOption)  { throw new RuntimeException(); }
  // not preceding
    org.apache.spark.mllib.clustering.LocalLDAModel oldLocalModel ()  { throw new RuntimeException(); }
    org.apache.spark.mllib.clustering.LDAModel getModel ()  { throw new RuntimeException(); }
  /**
   * Convert this distributed model to a local representation.  This discards info about the
   * training dataset.
   * <p>
   * WARNING: This involves collecting a large {@link topicsMatrix} to the driver.
   * @return (undocumented)
   */
  public  org.apache.spark.ml.clustering.LocalLDAModel toLocal ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.DistributedLDAModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  boolean isDistributed ()  { throw new RuntimeException(); }
  // not preceding
  public  double trainingLogLikelihood ()  { throw new RuntimeException(); }
  // not preceding
  public  double logPrior ()  { throw new RuntimeException(); }
  /**
   * If using checkpointing and <code>LDA.keepLastCheckpoint</code> is set to true, then there may be
   * saved checkpoint files.  This method is provided so that users can manage those files.
   * <p>
   * Note that removing the checkpoints can cause failures if a partition is lost and is needed
   * by certain {@link DistributedLDAModel} methods.  Reference counting will clean up the checkpoints
   * when this model and derivative data go out of scope.
   * <p>
   * @return  Checkpoint files from training
   */
  public  java.lang.String[] getCheckpointFiles ()  { throw new RuntimeException(); }
  /**
   * Remove any remaining checkpoint files from training.
   * <p>
   * @see getCheckpointFiles
   */
  public  void deleteCheckpointFiles ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}

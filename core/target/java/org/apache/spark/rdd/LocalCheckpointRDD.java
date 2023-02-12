package org.apache.spark.rdd;
/**
 * Throw an exception indicating that the relevant block is not found.
 * <p>
 * This should only be called if the original RDD is explicitly unpersisted or if an
 * executor is lost. Under normal circumstances, however, the original RDD (our child)
 * is expected to be fully cached and so all partitions should already be computed and
 * available in the block storage.
 */
  class LocalCheckpointRDD<T extends java.lang.Object> extends org.apache.spark.rdd.CheckpointRDD<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   LocalCheckpointRDD (org.apache.spark.SparkContext sc, int rddId, int numPartitions, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  // not preceding
  public   LocalCheckpointRDD (org.apache.spark.rdd.RDD<T> rdd, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  /**
   * Throw an exception indicating that the relevant block is not found.
   * <p>
   * This should only be called if the original RDD is explicitly unpersisted or if an
   * executor is lost. Under normal circumstances, however, the original RDD (our child)
   * is expected to be fully cached and so all partitions should already be computed and
   * available in the block storage.
   * @param partition (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<T> compute (org.apache.spark.Partition partition, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  protected  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
}

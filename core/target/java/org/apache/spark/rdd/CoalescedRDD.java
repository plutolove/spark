package org.apache.spark.rdd;
/**
 * Returns the preferred machine for the partition. If split is of type CoalescedRDDPartition,
 * then the preferred machine will be one which most parent splits prefer too.
 * param:  partition the partition for which to retrieve the preferred machine, if exists
 * @return the machine most preferred by split
 */
  class CoalescedRDD<T extends java.lang.Object> extends org.apache.spark.rdd.RDD<T> {
  public  org.apache.spark.rdd.RDD<T> prev ()  { throw new RuntimeException(); }
  // not preceding
  public   CoalescedRDD (org.apache.spark.rdd.RDD<T> prev, int maxPartitions, scala.Option<org.apache.spark.rdd.PartitionCoalescer> partitionCoalescer, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<T> compute (org.apache.spark.Partition partition, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.Dependency<?>> getDependencies ()  { throw new RuntimeException(); }
  public  void clearDependencies ()  { throw new RuntimeException(); }
  /**
   * Returns the preferred machine for the partition. If split is of type CoalescedRDDPartition,
   * then the preferred machine will be one which most parent splits prefer too.
   * @param partition the partition for which to retrieve the preferred machine, if exists
   * @return the machine most preferred by split
   */
  public  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition partition)  { throw new RuntimeException(); }
}

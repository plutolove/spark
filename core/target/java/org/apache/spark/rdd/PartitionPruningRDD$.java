package org.apache.spark.rdd;
/**
 * Create a PartitionPruningRDD. This function can be used to create the PartitionPruningRDD
 * when its type T is not known at compile time.
 */
// not preceding
public  class PartitionPruningRDD$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PartitionPruningRDD$ MODULE$ = null;
  public   PartitionPruningRDD$ ()  { throw new RuntimeException(); }
  // not preceding
  public <T extends java.lang.Object> org.apache.spark.rdd.PartitionPruningRDD<T> create (org.apache.spark.rdd.RDD<T> rdd, scala.Function1<java.lang.Object, java.lang.Object> partitionFilterFunc)  { throw new RuntimeException(); }
}

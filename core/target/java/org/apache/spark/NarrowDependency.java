package org.apache.spark;
/**
 * Get the parent partitions for a child partition.
 * param:  partitionId a partition of the child RDD
 * @return the partitions of the parent RDD that the child partition depends upon
 */
public abstract class NarrowDependency<T extends java.lang.Object> extends org.apache.spark.Dependency<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   NarrowDependency (org.apache.spark.rdd.RDD<T> _rdd)  { throw new RuntimeException(); }
  // not preceding
  public abstract  scala.collection.Seq<java.lang.Object> getParents (int partitionId)  ;
  public  org.apache.spark.rdd.RDD<T> rdd ()  { throw new RuntimeException(); }
}

package org.apache.spark;
/**
 * An object that defines how the elements in a key-value pair RDD are partitioned by key.
 * Maps each key to a partition ID, from 0 to <code>numPartitions - 1</code>.
 * <p>
 * Note that, partitioner must be deterministic, i.e. it must return the same partition id given
 * the same partition key.
 */
public abstract class Partitioner implements scala.Serializable {
  // not preceding
  static public  org.apache.spark.Partitioner defaultPartitioner (org.apache.spark.rdd.RDD<?> rdd, scala.collection.Seq<org.apache.spark.rdd.RDD<?>> others)  { throw new RuntimeException(); }
  // not preceding
  public   Partitioner ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  int numPartitions ()  ;
  public abstract  int getPartition (Object key)  ;
}

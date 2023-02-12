package org.apache.spark.rdd;
/** Set a serializer for this RDD's shuffle, or null to use the default (spark.serializer) */
public  class CoGroupedRDD<K extends java.lang.Object> extends org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.collection.Iterable<?>[]>> {
  // not preceding
  public   CoGroupedRDD (scala.collection.Seq<org.apache.spark.rdd.RDD<? extends scala.Product2<K, ?>>> rdds, org.apache.spark.Partitioner part, scala.reflect.ClassTag<K> evidence$1)  { throw new RuntimeException(); }
  public  void clearDependencies ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<K, scala.collection.Iterable<?>[]>> compute (org.apache.spark.Partition s, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.Dependency<?>> getDependencies ()  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  public  scala.Some<org.apache.spark.Partitioner> partitioner ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.rdd.RDD<? extends scala.Product2<K, ?>>> rdds ()  { throw new RuntimeException(); }
  /** Set a serializer for this RDD's shuffle, or null to use the default (spark.serializer) */
  public  org.apache.spark.rdd.CoGroupedRDD<K> setSerializer (org.apache.spark.serializer.Serializer serializer)  { throw new RuntimeException(); }
}

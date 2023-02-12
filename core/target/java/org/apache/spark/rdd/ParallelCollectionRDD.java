package org.apache.spark.rdd;
  class ParallelCollectionRDD<T extends java.lang.Object> extends org.apache.spark.rdd.RDD<T> {
  // not preceding
  static public <T extends java.lang.Object> scala.collection.Seq<scala.collection.Seq<T>> slice (scala.collection.Seq<T> seq, int numSlices, scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
  // not preceding
  public   ParallelCollectionRDD (org.apache.spark.SparkContext sc, scala.collection.Seq<T> data, int numSlices, scala.collection.Map<java.lang.Object, scala.collection.Seq<java.lang.String>> locationPrefs, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<T> compute (org.apache.spark.Partition s, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition s)  { throw new RuntimeException(); }
}

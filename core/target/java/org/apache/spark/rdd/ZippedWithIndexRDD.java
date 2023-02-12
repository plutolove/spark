package org.apache.spark.rdd;
/** The start index of each partition. */
  class ZippedWithIndexRDD<T extends java.lang.Object> extends org.apache.spark.rdd.RDD<scala.Tuple2<T, java.lang.Object>> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   ZippedWithIndexRDD (org.apache.spark.rdd.RDD<T> prev, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<scala.Tuple2<T, java.lang.Object>> compute (org.apache.spark.Partition splitIn, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition split)  { throw new RuntimeException(); }
}

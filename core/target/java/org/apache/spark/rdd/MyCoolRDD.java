package org.apache.spark.rdd;
public  class MyCoolRDD extends org.apache.spark.rdd.RDD<java.lang.Object> {
  // not preceding
  public   MyCoolRDD (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<java.lang.Object> compute (org.apache.spark.Partition p, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
}

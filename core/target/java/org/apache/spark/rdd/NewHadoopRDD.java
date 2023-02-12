package org.apache.spark.rdd;
/** Maps over a partition, providing the InputSplit that was used as the base of the partition. */
public  class NewHadoopRDD<K extends java.lang.Object, V extends java.lang.Object> extends org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> implements org.apache.spark.internal.Logging {
  /**
   * Analogous to {@link org.apache.spark.rdd.MapPartitionsRDD}, but passes in an InputSplit to
   * the given function rather than the index of the partition.
   */
  static   class NewHadoopMapPartitionsWithSplitRDD<U extends java.lang.Object, T extends java.lang.Object> extends org.apache.spark.rdd.RDD<U> {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    public   NewHadoopMapPartitionsWithSplitRDD (org.apache.spark.rdd.RDD<T> prev, scala.Function2<org.apache.hadoop.mapreduce.InputSplit, scala.collection.Iterator<T>, scala.collection.Iterator<U>> f, boolean preservesPartitioning, scala.reflect.ClassTag<U> evidence$2, scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
    // not preceding
    public  scala.Option<org.apache.spark.Partitioner> partitioner ()  { throw new RuntimeException(); }
    public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
    public  scala.collection.Iterator<U> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class NewHadoopMapPartitionsWithSplitRDD$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NewHadoopMapPartitionsWithSplitRDD$ MODULE$ = null;
    public   NewHadoopMapPartitionsWithSplitRDD$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  java.lang.Object CONFIGURATION_INSTANTIATION_LOCK ()  { throw new RuntimeException(); }
  // not preceding
  public   NewHadoopRDD (org.apache.spark.SparkContext sc, java.lang.Class<? extends org.apache.hadoop.mapreduce.InputFormat<K, V>> inputFormatClass, java.lang.Class<K> keyClass, java.lang.Class<V> valueClass, org.apache.hadoop.conf.Configuration _conf)  { throw new RuntimeException(); }
  protected  org.apache.hadoop.mapreduce.JobID jobId ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration getConf ()  { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  public  org.apache.spark.InterruptibleIterator<scala.Tuple2<K, V>> compute (org.apache.spark.Partition theSplit, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  /** Maps over a partition, providing the InputSplit that was used as the base of the partition. */
  public <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> mapPartitionsWithInputSplit (scala.Function2<org.apache.hadoop.mapreduce.InputSplit, scala.collection.Iterator<scala.Tuple2<K, V>>, scala.collection.Iterator<U>> f, boolean preservesPartitioning, scala.reflect.ClassTag<U> evidence$1)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition hsplit)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.NewHadoopRDD<K, V> persist (org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
}

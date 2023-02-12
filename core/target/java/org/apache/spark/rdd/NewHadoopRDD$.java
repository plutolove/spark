package org.apache.spark.rdd;
/**
 * Configuration's constructor is not threadsafe (see SPARK-1097 and HADOOP-10456).
 * Therefore, we synchronize on this lock before calling new Configuration().
 */
// not preceding
public  class NewHadoopRDD$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final NewHadoopRDD$ MODULE$ = null;
  public   NewHadoopRDD$ ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.Object CONFIGURATION_INSTANTIATION_LOCK ()  { throw new RuntimeException(); }
}

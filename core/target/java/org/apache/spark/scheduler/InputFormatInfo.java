package org.apache.spark.scheduler;
/**
 * :: DeveloperApi ::
 * Parses and holds information about inputFormat (and files) specified as a parameter.
 */
public  class InputFormatInfo implements org.apache.spark.internal.Logging {
  // not preceding
  static public  scala.collection.immutable.Map<java.lang.String, scala.collection.immutable.Set<org.apache.spark.scheduler.SplitInfo>> computePreferredLocations (scala.collection.Seq<org.apache.spark.scheduler.InputFormatInfo> formats)  { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration configuration ()  { throw new RuntimeException(); }
  public  java.lang.Class<?> inputFormatClazz ()  { throw new RuntimeException(); }
  public  java.lang.String path ()  { throw new RuntimeException(); }
  // not preceding
  public   InputFormatInfo (org.apache.hadoop.conf.Configuration configuration, java.lang.Class<?> inputFormatClazz, java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  public  boolean mapreduceInputFormat ()  { throw new RuntimeException(); }
  public  boolean mapredInputFormat ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
}

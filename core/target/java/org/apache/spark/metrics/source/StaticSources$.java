package org.apache.spark.metrics.source;
/**
 * The set of all static sources. These sources may be reported to from any class, including
 * static classes, without requiring reference to a SparkEnv.
 */
// not preceding
public  class StaticSources$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StaticSources$ MODULE$ = null;
  public   StaticSources$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.metrics.source.Source> allSources ()  { throw new RuntimeException(); }
}

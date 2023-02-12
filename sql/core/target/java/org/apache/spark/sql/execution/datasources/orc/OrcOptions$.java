package org.apache.spark.sql.execution.datasources.orc;
/**
 * Whether it merges schemas or not. When the given Orc files have different schemas,
 * the schemas can be merged. By default use the value specified in SQLConf.
 */
// not preceding
public  class OrcOptions$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OrcOptions$ MODULE$ = null;
  public   OrcOptions$ ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String MERGE_SCHEMA ()  { throw new RuntimeException(); }
  public  java.lang.String getORCCompressionCodecName (java.lang.String name)  { throw new RuntimeException(); }
}

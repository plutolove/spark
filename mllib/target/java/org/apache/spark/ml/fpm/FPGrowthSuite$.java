package org.apache.spark.ml.fpm;
/**
 * Mapping from all Params to valid settings which differ from the defaults.
 * This is useful for tests which need to exercise all Params, such as save/load.
 * This excludes input columns to simplify some tests.
 */
// not preceding
public  class FPGrowthSuite$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FPGrowthSuite$ MODULE$ = null;
  public   FPGrowthSuite$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getFPGrowthData (org.apache.spark.sql.SparkSession spark)  { throw new RuntimeException(); }
  /**
   * Mapping from all Params to valid settings which differ from the defaults.
   * This is useful for tests which need to exercise all Params, such as save/load.
   * This excludes input columns to simplify some tests.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> allParamSettings ()  { throw new RuntimeException(); }
}
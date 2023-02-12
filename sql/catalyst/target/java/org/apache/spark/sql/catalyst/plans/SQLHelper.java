package org.apache.spark.sql.catalyst.plans;
/**
 * Sets all SQL configurations specified in <code>pairs</code>, calls <code>f</code>, and then restores all SQL
 * configurations.
 */
public  interface SQLHelper {
  public  java.lang.String sparkHome ()  ;
  public <T extends java.lang.Object> void testSpecialDatetimeValues (scala.Function1<java.time.ZoneId, T> test)  ;
  /**
   * Sets all SQL configurations specified in <code>pairs</code>, calls <code>f</code>, and then restores all SQL
   * configurations.
   * @param pairs (undocumented)
   * @param f (undocumented)
   */
  public  void withSQLConf (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> pairs, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /**
   * Generates a temporary path without creating the actual file/directory, then pass it to <code>f</code>. If
   * a file/directory is created there by <code>f</code>, it will be delete after <code>f</code> returns.
   * @param f (undocumented)
   */
  public  void withTempPath (scala.Function1<java.io.File, scala.runtime.BoxedUnit> f)  ;
}

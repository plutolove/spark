package org.apache.spark.examples.mllib;
/**
 * Finds all case class fields in concrete class instance, and outputs them in JSON-style format:
 * {
 *   [field name]:\t[field value]\n
 *   [field name]:\t[field value]\n
 *   ...
 * }
 */
public abstract class AbstractParams<T extends java.lang.Object> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   AbstractParams (scala.reflect.api.TypeTags.TypeTag<T> evidence$1)  { throw new RuntimeException(); }
  /**
   * Finds all case class fields in concrete class instance, and outputs them in JSON-style format:
   * {
   *   [field name]:\t[field value]\n
   *   [field name]:\t[field value]\n
   *   ...
   * }
   * @return (undocumented)
   */
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
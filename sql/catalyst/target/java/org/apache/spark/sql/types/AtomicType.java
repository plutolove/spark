package org.apache.spark.sql.types;
/**
 * An internal type used to represent everything that is not null, UDTs, arrays, structs, and maps.
 */
 abstract class AtomicType extends org.apache.spark.sql.types.DataType {
  // not preceding
  static public  boolean unapply (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  // not preceding
  public   AtomicType ()  { throw new RuntimeException(); }
   abstract  scala.reflect.api.TypeTags.TypeTag<java.lang.Object> tag ()  ;
   abstract  scala.math.Ordering<java.lang.Object> ordering ()  ;
}

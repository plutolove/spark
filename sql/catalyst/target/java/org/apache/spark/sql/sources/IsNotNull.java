package org.apache.spark.sql.sources;
/**
 * A filter that evaluates to <code>true</code> iff the attribute evaluates to a non-null value.
 * <p>
 * param:  attribute of the column to be evaluated; <code>dots</code> are used as separators
 *                  for nested columns. If any part of the names contains <code>dots</code>,
 *                  it is quoted to avoid confusion.
 * @since 1.3.0
 */
public  class IsNotNull extends org.apache.spark.sql.sources.Filter implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String attribute ()  { throw new RuntimeException(); }
  // not preceding
  public   IsNotNull (java.lang.String attribute)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String[] references ()  { throw new RuntimeException(); }
}
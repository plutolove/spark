package org.apache.spark.sql.catalyst.expressions;
/**
 * Converts time string with given pattern.
 * Deterministic version of {@link UnixTimestamp}, must have at least one parameter.
 */
public  class ToUnixTimestamp extends org.apache.spark.sql.catalyst.expressions.UnixTime implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression timeExp ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression format ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> timeZoneId ()  { throw new RuntimeException(); }
  // not preceding
  public   ToUnixTimestamp (org.apache.spark.sql.catalyst.expressions.Expression timeExp, org.apache.spark.sql.catalyst.expressions.Expression format, scala.Option<java.lang.String> timeZoneId)  { throw new RuntimeException(); }
  // not preceding
  public   ToUnixTimestamp (org.apache.spark.sql.catalyst.expressions.Expression timeExp, org.apache.spark.sql.catalyst.expressions.Expression format)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression right ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.TimeZoneAwareExpression withTimeZone (java.lang.String timeZoneId)  { throw new RuntimeException(); }
  public   ToUnixTimestamp (org.apache.spark.sql.catalyst.expressions.Expression time)  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
}

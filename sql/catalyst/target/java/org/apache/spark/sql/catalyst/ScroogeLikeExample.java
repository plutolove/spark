package org.apache.spark.sql.catalyst;
public  interface ScroogeLikeExample extends scala.Product1<java.lang.Object>, scala.Serializable {
  static public  class Immutable implements org.apache.spark.sql.catalyst.ScroogeLikeExample {
    // not preceding
    public   Immutable (int x)  { throw new RuntimeException(); }
    // not preceding
    public  int x ()  { throw new RuntimeException(); }
  }
  public  int x ()  ;
  public  int _1 ()  ;
  public  boolean canEqual (Object other)  ;
  public  boolean equals (Object other)  ;
  public  int hashCode ()  ;
}

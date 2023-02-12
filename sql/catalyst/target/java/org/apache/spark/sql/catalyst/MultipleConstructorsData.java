package org.apache.spark.sql.catalyst;
public  class MultipleConstructorsData implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  int a ()  { throw new RuntimeException(); }
  public  java.lang.String b ()  { throw new RuntimeException(); }
  public  double c ()  { throw new RuntimeException(); }
  // not preceding
  public   MultipleConstructorsData (int a, java.lang.String b, double c)  { throw new RuntimeException(); }
  // not preceding
  public   MultipleConstructorsData (java.lang.String b, int a)  { throw new RuntimeException(); }
}

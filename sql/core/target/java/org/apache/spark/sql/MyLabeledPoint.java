package org.apache.spark.sql;
  class MyLabeledPoint implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  double label ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.TestUDT.MyDenseVector features ()  { throw new RuntimeException(); }
  // not preceding
  public   MyLabeledPoint (double label, org.apache.spark.sql.types.TestUDT.MyDenseVector features)  { throw new RuntimeException(); }
  // not preceding
  public  double getLabel ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.TestUDT.MyDenseVector getFeatures ()  { throw new RuntimeException(); }
}

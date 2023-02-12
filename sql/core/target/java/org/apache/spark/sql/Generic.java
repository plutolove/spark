package org.apache.spark.sql;
public  class Generic<T extends java.lang.Object> implements scala.Product, scala.Serializable {
  public  T id ()  { throw new RuntimeException(); }
  public  double value ()  { throw new RuntimeException(); }
  // not preceding
  public   Generic (T id, double value)  { throw new RuntimeException(); }
}

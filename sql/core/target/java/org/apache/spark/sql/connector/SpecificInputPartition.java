package org.apache.spark.sql.connector;
public  class SpecificInputPartition implements org.apache.spark.sql.connector.read.InputPartition, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  int[] i ()  { throw new RuntimeException(); }
  public  int[] j ()  { throw new RuntimeException(); }
  // not preceding
  public   SpecificInputPartition (int[] i, int[] j)  { throw new RuntimeException(); }
}

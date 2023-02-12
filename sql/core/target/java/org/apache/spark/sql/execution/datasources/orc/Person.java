package org.apache.spark.sql.execution.datasources.orc;
public  class Person implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  int age ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.datasources.orc.Contact> contacts ()  { throw new RuntimeException(); }
  // not preceding
  public   Person (java.lang.String name, int age, scala.collection.Seq<org.apache.spark.sql.execution.datasources.orc.Contact> contacts)  { throw new RuntimeException(); }
}

package org.apache.spark.sql;
/** Used to test Kryo encoder. */
public  class KryoData {
  // not preceding
  static public  org.apache.spark.sql.KryoData apply (int a)  { throw new RuntimeException(); }
  // not preceding
  public  int a ()  { throw new RuntimeException(); }
  // not preceding
  public   KryoData (int a)  { throw new RuntimeException(); }
  // not preceding
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}

package org.apache.spark.sql.hive.execution;
public  class LogEntry implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String filename ()  { throw new RuntimeException(); }
  public  java.lang.String message ()  { throw new RuntimeException(); }
  // not preceding
  public   LogEntry (java.lang.String filename, java.lang.String message)  { throw new RuntimeException(); }
}

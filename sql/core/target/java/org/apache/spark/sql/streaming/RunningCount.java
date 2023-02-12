package org.apache.spark.sql.streaming;
/** Class to check custom state types */
public  class RunningCount implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  long count ()  { throw new RuntimeException(); }
  // not preceding
  public   RunningCount (long count)  { throw new RuntimeException(); }
}

package org.apache.spark.sql.catalyst.encoders;
/** For testing UDT for a case class */
public  class UDTCaseClass implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  java.net.URI uri ()  { throw new RuntimeException(); }
  // not preceding
  public   UDTCaseClass (java.net.URI uri)  { throw new RuntimeException(); }
}

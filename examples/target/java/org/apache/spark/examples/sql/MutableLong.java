package org.apache.spark.examples.sql;
public  class MutableLong implements scala.Serializable {
  // not preceding
  public   MutableLong (long value)  { throw new RuntimeException(); }
  // not preceding
  public  long value ()  { throw new RuntimeException(); }
}

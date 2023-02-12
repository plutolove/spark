package org.apache.spark.sql.catalyst.expressions;
public  class Outer implements scala.Serializable {
  // not preceding
  public  class Inner {
    // not preceding
    public   Inner (int value)  { throw new RuntimeException(); }
    public  boolean equals (Object other)  { throw new RuntimeException(); }
    // not preceding
    public  int hashCode ()  { throw new RuntimeException(); }
    // not preceding
    public  int value ()  { throw new RuntimeException(); }
  }
  // not preceding
  public   Outer ()  { throw new RuntimeException(); }
}

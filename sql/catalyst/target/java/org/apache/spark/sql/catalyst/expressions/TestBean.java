package org.apache.spark.sql.catalyst.expressions;
public  class TestBean implements scala.Serializable {
  // not preceding
  public   TestBean ()  { throw new RuntimeException(); }
  public  void setNonPrimitive (java.lang.Object i)  { throw new RuntimeException(); }
  public  void setX (int i)  { throw new RuntimeException(); }
}

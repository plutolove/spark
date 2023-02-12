package org.apache.spark.sql;
public  class FooAgg extends org.apache.spark.sql.expressions.Aggregator<org.apache.spark.sql.Row, java.lang.Object, java.lang.Object> implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  int s ()  { throw new RuntimeException(); }
  // not preceding
  public   FooAgg (int s)  { throw new RuntimeException(); }
  // not preceding
  public  int zero ()  { throw new RuntimeException(); }
  public  int reduce (int b, org.apache.spark.sql.Row r)  { throw new RuntimeException(); }
  public  int merge (int b1, int b2)  { throw new RuntimeException(); }
  public  int finish (int b)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<java.lang.Object> bufferEncoder ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<java.lang.Object> outputEncoder ()  { throw new RuntimeException(); }
}

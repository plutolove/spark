package org.apache.spark.sql;
public  class OptionBooleanIntAggregator extends org.apache.spark.sql.expressions.Aggregator<org.apache.spark.sql.Row, scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>>, scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>>> implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String colName ()  { throw new RuntimeException(); }
  // not preceding
  public   OptionBooleanIntAggregator (java.lang.String colName)  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>> zero ()  { throw new RuntimeException(); }
  public  scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>> reduce (scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>> buffer, org.apache.spark.sql.Row row)  { throw new RuntimeException(); }
  public  scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>> merge (scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>> b1, scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>> b2)  { throw new RuntimeException(); }
  public  scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>> finish (scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>> reduction)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>>> bufferEncoder ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>>> outputEncoder ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>>> OptionalBoolIntEncoder ()  { throw new RuntimeException(); }
}

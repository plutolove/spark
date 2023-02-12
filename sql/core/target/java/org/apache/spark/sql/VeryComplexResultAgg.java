package org.apache.spark.sql;
// not preceding
public  class VeryComplexResultAgg {
  // not preceding
  static public  java.lang.String zero ()  { throw new RuntimeException(); }
  static public  java.lang.String reduce (java.lang.String buffer, org.apache.spark.sql.Row input)  { throw new RuntimeException(); }
  static public  java.lang.String merge (java.lang.String b1, java.lang.String b2)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.ComplexAggData finish (java.lang.String reduction)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Encoder<java.lang.String> bufferEncoder ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Encoder<org.apache.spark.sql.ComplexAggData> outputEncoder ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.TypedColumn<IN, OUT> toColumn ()  { throw new RuntimeException(); }
}

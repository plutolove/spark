package org.apache.spark.sql;
// not preceding
public  class VeryComplexResultAgg$ extends org.apache.spark.sql.expressions.Aggregator<org.apache.spark.sql.Row, java.lang.String, org.apache.spark.sql.ComplexAggData> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final VeryComplexResultAgg$ MODULE$ = null;
  public   VeryComplexResultAgg$ ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String zero ()  { throw new RuntimeException(); }
  public  java.lang.String reduce (java.lang.String buffer, org.apache.spark.sql.Row input)  { throw new RuntimeException(); }
  public  java.lang.String merge (java.lang.String b1, java.lang.String b2)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.ComplexAggData finish (java.lang.String reduction)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<java.lang.String> bufferEncoder ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<org.apache.spark.sql.ComplexAggData> outputEncoder ()  { throw new RuntimeException(); }
}

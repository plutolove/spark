package org.apache.spark.sql;
// not preceding
public  class NullResultAgg {
  // not preceding
  static public  org.apache.spark.sql.AggData zero ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.AggData reduce (org.apache.spark.sql.AggData b, org.apache.spark.sql.AggData a)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.AggData finish (org.apache.spark.sql.AggData reduction)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.AggData merge (org.apache.spark.sql.AggData b1, org.apache.spark.sql.AggData b2)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Encoder<org.apache.spark.sql.AggData> bufferEncoder ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Encoder<org.apache.spark.sql.AggData> outputEncoder ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.TypedColumn<IN, OUT> toColumn ()  { throw new RuntimeException(); }
}

package org.apache.spark.sql.hive.execution;
// not preceding
public  class ArrayDataAgg {
  // not preceding
  static public  double[] zero ()  { throw new RuntimeException(); }
  static public  double[] reduce (double[] s, double[] array)  { throw new RuntimeException(); }
  static public  double[] merge (double[] s1, double[] s2)  { throw new RuntimeException(); }
  static public  double[] finish (double[] s)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Encoder<double[]> bufferEncoder ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Encoder<double[]> outputEncoder ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.TypedColumn<IN, OUT> toColumn ()  { throw new RuntimeException(); }
}

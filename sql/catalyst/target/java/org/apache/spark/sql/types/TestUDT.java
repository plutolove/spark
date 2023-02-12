package org.apache.spark.sql.types;
// not preceding
public  class TestUDT {
  // not preceding
  static   class MyDenseVector implements scala.Serializable {
    // not preceding
    public   MyDenseVector (double[] data)  { throw new RuntimeException(); }
    // not preceding
    public  double[] data ()  { throw new RuntimeException(); }
    public  boolean equals (Object other)  { throw new RuntimeException(); }
    // not preceding
    public  int hashCode ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  // not preceding
  static   class MyDenseVectorUDT extends org.apache.spark.sql.types.UserDefinedType<org.apache.spark.sql.types.TestUDT.MyDenseVector> {
    // not preceding
    public   MyDenseVectorUDT ()  { throw new RuntimeException(); }
      org.apache.spark.sql.types.TestUDT.MyDenseVectorUDT asNullable ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.TestUDT.MyDenseVector deserialize (Object datum)  { throw new RuntimeException(); }
    public  boolean equals (Object other)  { throw new RuntimeException(); }
    public  int hashCode ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.util.ArrayData serialize (org.apache.spark.sql.types.TestUDT.MyDenseVector features)  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.types.DataType sqlType ()  { throw new RuntimeException(); }
    public  java.lang.Class<org.apache.spark.sql.types.TestUDT.MyDenseVector> userClass ()  { throw new RuntimeException(); }
  }
}

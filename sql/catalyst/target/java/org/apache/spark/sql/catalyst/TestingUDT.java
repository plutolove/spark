package org.apache.spark.sql.catalyst;
// not preceding
public  class TestingUDT {
  // not preceding
  static public  class NestedStruct {
    // not preceding
    public   NestedStruct (java.lang.Integer a, long b, double c)  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.Integer a ()  { throw new RuntimeException(); }
    public  long b ()  { throw new RuntimeException(); }
    public  double c ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class NestedStructUDT extends org.apache.spark.sql.types.UserDefinedType<org.apache.spark.sql.catalyst.TestingUDT.NestedStruct> {
    // not preceding
    public   NestedStructUDT ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.TestingUDT.NestedStruct deserialize (Object datum)  { throw new RuntimeException(); }
    public  Object serialize (org.apache.spark.sql.catalyst.TestingUDT.NestedStruct n)  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.types.DataType sqlType ()  { throw new RuntimeException(); }
    public  java.lang.Class<org.apache.spark.sql.catalyst.TestingUDT.NestedStruct> userClass ()  { throw new RuntimeException(); }
  }
}

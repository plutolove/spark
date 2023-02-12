package org.apache.spark.sql;
// not preceding
public  class TestingUDT {
  // not preceding
  static public  class IntervalData implements scala.Serializable {
    // not preceding
    public   IntervalData ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class IntervalUDT extends org.apache.spark.sql.types.UserDefinedType<org.apache.spark.sql.TestingUDT.IntervalData> {
    // not preceding
    public   IntervalUDT ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.TestingUDT.IntervalData deserialize (Object datum)  { throw new RuntimeException(); }
    public  Object serialize (org.apache.spark.sql.TestingUDT.IntervalData obj)  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.types.DataType sqlType ()  { throw new RuntimeException(); }
    public  java.lang.Class<org.apache.spark.sql.TestingUDT.IntervalData> userClass ()  { throw new RuntimeException(); }
  }
  // not preceding
  static   class NullData implements scala.Serializable {
    // not preceding
    public   NullData ()  { throw new RuntimeException(); }
  }
  // not preceding
  static   class NullUDT extends org.apache.spark.sql.types.UserDefinedType<org.apache.spark.sql.TestingUDT.NullData> {
    // not preceding
    public   NullUDT ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.TestingUDT.NullData deserialize (Object datum)  { throw new RuntimeException(); }
    public  Object serialize (org.apache.spark.sql.TestingUDT.NullData obj)  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.types.DataType sqlType ()  { throw new RuntimeException(); }
    public  java.lang.Class<org.apache.spark.sql.TestingUDT.NullData> userClass ()  { throw new RuntimeException(); }
  }
}

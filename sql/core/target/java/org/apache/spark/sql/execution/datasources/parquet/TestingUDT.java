package org.apache.spark.sql.execution.datasources.parquet;
// not preceding
public  class TestingUDT {
  // not preceding
  static public  class SingleElement implements scala.Product, scala.Serializable {
    // not preceding
    public  long element ()  { throw new RuntimeException(); }
    // not preceding
    public   SingleElement (long element)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class SingleElement$ extends scala.runtime.AbstractFunction1<java.lang.Object, org.apache.spark.sql.execution.datasources.parquet.TestingUDT.SingleElement> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SingleElement$ MODULE$ = null;
    public   SingleElement$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class NestedStruct implements scala.Product, scala.Serializable {
    // not preceding
    public  java.lang.Integer a ()  { throw new RuntimeException(); }
    public  long b ()  { throw new RuntimeException(); }
    public  double c ()  { throw new RuntimeException(); }
    // not preceding
    public   NestedStruct (java.lang.Integer a, long b, double c)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class NestedStruct$ extends scala.runtime.AbstractFunction3<java.lang.Integer, java.lang.Object, java.lang.Object, org.apache.spark.sql.execution.datasources.parquet.TestingUDT.NestedStruct> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NestedStruct$ MODULE$ = null;
    public   NestedStruct$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class NestedStructUDT extends org.apache.spark.sql.types.UserDefinedType<org.apache.spark.sql.execution.datasources.parquet.TestingUDT.NestedStruct> {
    // not preceding
    public   NestedStructUDT ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.datasources.parquet.TestingUDT.NestedStruct deserialize (Object datum)  { throw new RuntimeException(); }
    public  Object serialize (org.apache.spark.sql.execution.datasources.parquet.TestingUDT.NestedStruct n)  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.types.DataType sqlType ()  { throw new RuntimeException(); }
    public  java.lang.Class<org.apache.spark.sql.execution.datasources.parquet.TestingUDT.NestedStruct> userClass ()  { throw new RuntimeException(); }
  }
}

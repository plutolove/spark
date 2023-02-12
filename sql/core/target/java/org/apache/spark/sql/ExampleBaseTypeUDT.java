package org.apache.spark.sql;
public  class ExampleBaseTypeUDT extends org.apache.spark.sql.types.UserDefinedType<org.apache.spark.sql.IExampleBaseType> {
  // not preceding
  public   ExampleBaseTypeUDT ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.IExampleBaseType deserialize (Object datum)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow serialize (org.apache.spark.sql.IExampleBaseType obj)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.types.StructType sqlType ()  { throw new RuntimeException(); }
  public  java.lang.Class<org.apache.spark.sql.IExampleBaseType> userClass ()  { throw new RuntimeException(); }
}

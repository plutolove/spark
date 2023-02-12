package org.apache.spark.sql;
  class ExampleSubTypeUDT extends org.apache.spark.sql.types.UserDefinedType<org.apache.spark.sql.IExampleSubType> {
  // not preceding
  public   ExampleSubTypeUDT ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.IExampleSubType deserialize (Object datum)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow serialize (org.apache.spark.sql.IExampleSubType obj)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.types.StructType sqlType ()  { throw new RuntimeException(); }
  public  java.lang.Class<org.apache.spark.sql.IExampleSubType> userClass ()  { throw new RuntimeException(); }
}

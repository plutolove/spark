package org.apache.spark.sql;
  class LocalDateTimeUDT extends org.apache.spark.sql.types.UserDefinedType<java.time.LocalDateTime> {
  // not preceding
  public   LocalDateTimeUDT ()  { throw new RuntimeException(); }
    org.apache.spark.sql.LocalDateTimeUDT asNullable ()  { throw new RuntimeException(); }
  public  java.time.LocalDateTime deserialize (Object datum)  { throw new RuntimeException(); }
  public  long serialize (java.time.LocalDateTime obj)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.types.DataType sqlType ()  { throw new RuntimeException(); }
  public  java.lang.Class<java.time.LocalDateTime> userClass ()  { throw new RuntimeException(); }
}

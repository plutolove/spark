package org.apache.spark.sql.catalyst.expressions.codegen;
// not preceding
public  class AlwaysNonNull {
  static public  int numFields ()  { throw new RuntimeException(); }
  static public  void setNullAt (int i)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.InternalRow copy ()  { throw new RuntimeException(); }
  static public  boolean anyNull ()  { throw new RuntimeException(); }
  static public  boolean isNullAt (int ordinal)  { throw new RuntimeException(); }
  static public  void update (int i, Object value)  { throw new RuntimeException(); }
  static public  boolean getBoolean (int ordinal)  { throw new RuntimeException(); }
  static public  byte getByte (int ordinal)  { throw new RuntimeException(); }
  static public  short getShort (int ordinal)  { throw new RuntimeException(); }
  static public  int getInt (int ordinal)  { throw new RuntimeException(); }
  static public  long getLong (int ordinal)  { throw new RuntimeException(); }
  static public  float getFloat (int ordinal)  { throw new RuntimeException(); }
  static public  double getDouble (int ordinal)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.Decimal getDecimal (int ordinal, int precision, int scale)  { throw new RuntimeException(); }
  static public  org.apache.spark.unsafe.types.UTF8String getUTF8String (int ordinal)  { throw new RuntimeException(); }
  static public  byte[] getBinary (int ordinal)  { throw new RuntimeException(); }
  static public  org.apache.spark.unsafe.types.CalendarInterval getInterval (int ordinal)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.InternalRow getStruct (int ordinal, int numFields)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.util.ArrayData getArray (int ordinal)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.util.ArrayData keyArray ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.util.ArrayData valueArray ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.util.MapData getMap (int ordinal)  { throw new RuntimeException(); }
  static public  java.lang.Object get (int ordinal, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.String getString (int ordinal)  { throw new RuntimeException(); }
  static public  void setBoolean (int i, boolean value)  { throw new RuntimeException(); }
  static public  void setByte (int i, byte value)  { throw new RuntimeException(); }
  static public  void setShort (int i, short value)  { throw new RuntimeException(); }
  static public  void setInt (int i, int value)  { throw new RuntimeException(); }
  static public  void setLong (int i, long value)  { throw new RuntimeException(); }
  static public  void setFloat (int i, float value)  { throw new RuntimeException(); }
  static public  void setDouble (int i, double value)  { throw new RuntimeException(); }
  static public  void setDecimal (int i, org.apache.spark.sql.types.Decimal value, int precision)  { throw new RuntimeException(); }
  static public  void setInterval (int i, org.apache.spark.unsafe.types.CalendarInterval value)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<java.lang.Object> toSeq (scala.collection.Seq<org.apache.spark.sql.types.DataType> fieldTypes)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<java.lang.Object> toSeq (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
}

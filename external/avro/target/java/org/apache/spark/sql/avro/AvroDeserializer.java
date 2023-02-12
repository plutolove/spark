package org.apache.spark.sql.avro;
/**
 * Creates a writer to write avro values to Catalyst values at the given ordinal with the given
 * updater.
 */
  class AvroDeserializer {
  /**
   * A base interface for updating values inside catalyst data structure like <code>InternalRow</code> and
   * <code>ArrayData</code>.
   */
  public  interface CatalystDataUpdater {
    public  void set (int ordinal, Object value)  ;
    public  void setBoolean (int ordinal, boolean value)  ;
    public  void setByte (int ordinal, byte value)  ;
    public  void setDecimal (int ordinal, org.apache.spark.sql.types.Decimal value)  ;
    public  void setDouble (int ordinal, double value)  ;
    public  void setFloat (int ordinal, float value)  ;
    public  void setInt (int ordinal, int value)  ;
    public  void setLong (int ordinal, long value)  ;
    public  void setNullAt (int ordinal)  ;
    public  void setShort (int ordinal, short value)  ;
  }
  // not preceding
  public final class RowUpdater implements org.apache.spark.sql.avro.AvroDeserializer.CatalystDataUpdater {
    // not preceding
    public   RowUpdater (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
    // not preceding
    public  void set (int ordinal, Object value)  { throw new RuntimeException(); }
    public  void setBoolean (int ordinal, boolean value)  { throw new RuntimeException(); }
    public  void setByte (int ordinal, byte value)  { throw new RuntimeException(); }
    public  void setDecimal (int ordinal, org.apache.spark.sql.types.Decimal value)  { throw new RuntimeException(); }
    public  void setDouble (int ordinal, double value)  { throw new RuntimeException(); }
    public  void setFloat (int ordinal, float value)  { throw new RuntimeException(); }
    public  void setInt (int ordinal, int value)  { throw new RuntimeException(); }
    public  void setLong (int ordinal, long value)  { throw new RuntimeException(); }
    public  void setNullAt (int ordinal)  { throw new RuntimeException(); }
    public  void setShort (int ordinal, short value)  { throw new RuntimeException(); }
  }
  // not preceding
  public final class ArrayDataUpdater implements org.apache.spark.sql.avro.AvroDeserializer.CatalystDataUpdater {
    // not preceding
    public   ArrayDataUpdater (org.apache.spark.sql.catalyst.util.ArrayData array)  { throw new RuntimeException(); }
    // not preceding
    public  void set (int ordinal, Object value)  { throw new RuntimeException(); }
    public  void setBoolean (int ordinal, boolean value)  { throw new RuntimeException(); }
    public  void setByte (int ordinal, byte value)  { throw new RuntimeException(); }
    public  void setDecimal (int ordinal, org.apache.spark.sql.types.Decimal value)  { throw new RuntimeException(); }
    public  void setDouble (int ordinal, double value)  { throw new RuntimeException(); }
    public  void setFloat (int ordinal, float value)  { throw new RuntimeException(); }
    public  void setInt (int ordinal, int value)  { throw new RuntimeException(); }
    public  void setLong (int ordinal, long value)  { throw new RuntimeException(); }
    public  void setNullAt (int ordinal)  { throw new RuntimeException(); }
    public  void setShort (int ordinal, short value)  { throw new RuntimeException(); }
  }
  // not preceding
  public   AvroDeserializer (org.apache.avro.Schema rootAvroType, org.apache.spark.sql.types.DataType rootCatalystType, scala.Enumeration.Value datetimeRebaseMode)  { throw new RuntimeException(); }
  // not preceding
  public   AvroDeserializer (org.apache.avro.Schema rootAvroType, org.apache.spark.sql.types.DataType rootCatalystType)  { throw new RuntimeException(); }
  public  Object deserialize (Object data)  { throw new RuntimeException(); }
}

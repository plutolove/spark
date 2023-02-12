package org.apache.spark.sql.catalyst.encoders;
/**
 * Returns the <code>DataType</code> that can be used when generating code that converts input data
 * into the Spark SQL internal format.  Unlike <code>externalDataTypeFor</code>, the <code>DataType</code> returned
 * by this function can be more permissive since multiple external types may map to a single
 * internal type.  For example, for an input with DecimalType in external row, its external types
 * can be <code>scala.math.BigDecimal</code>, <code>java.math.BigDecimal</code>, or
 * <code>org.apache.spark.sql.types.Decimal</code>.
 */
// not preceding
public  class RowEncoder {
  // not preceding
  static public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<org.apache.spark.sql.Row> apply (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Returns the <code>DataType</code> that can be used when generating code that converts input data
   * into the Spark SQL internal format.  Unlike <code>externalDataTypeFor</code>, the <code>DataType</code> returned
   * by this function can be more permissive since multiple external types may map to a single
   * internal type.  For example, for an input with DecimalType in external row, its external types
   * can be <code>scala.math.BigDecimal</code>, <code>java.math.BigDecimal</code>, or
   * <code>org.apache.spark.sql.types.Decimal</code>.
   * @param dt (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.types.DataType externalDataTypeForInput (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DataType externalDataTypeFor (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
}

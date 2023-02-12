package org.apache.spark.sql.avro;
/**
 * Internal wrapper for SQL data type and nullability.
 * <p>
 * @since 2.4.0
 */
// not preceding
public  class SchemaConverters$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SchemaConverters$ MODULE$ = null;
  public   SchemaConverters$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.avro.SchemaConverters.SchemaType toSqlType (org.apache.avro.Schema avroSchema)  { throw new RuntimeException(); }
  /**
   * Converts a Spark SQL schema to a corresponding Avro schema.
   * <p>
   * @since 2.4.0
   * @param catalystType (undocumented)
   * @param nullable (undocumented)
   * @param recordName (undocumented)
   * @param nameSpace (undocumented)
   * @return (undocumented)
   */
  public  org.apache.avro.Schema toAvroType (org.apache.spark.sql.types.DataType catalystType, boolean nullable, java.lang.String recordName, java.lang.String nameSpace)  { throw new RuntimeException(); }
}

package org.apache.spark.sql.avro;
/**
 * A serializer to serialize data in catalyst format to data in avro format.
 */
  class AvroSerializer implements org.apache.spark.internal.Logging {
  // not preceding
  public   AvroSerializer (org.apache.spark.sql.types.DataType rootCatalystType, org.apache.avro.Schema rootAvroType, boolean nullable, scala.Enumeration.Value datetimeRebaseMode)  { throw new RuntimeException(); }
  // not preceding
  public   AvroSerializer (org.apache.spark.sql.types.DataType rootCatalystType, org.apache.avro.Schema rootAvroType, boolean nullable)  { throw new RuntimeException(); }
  public  Object serialize (Object catalystData)  { throw new RuntimeException(); }
}

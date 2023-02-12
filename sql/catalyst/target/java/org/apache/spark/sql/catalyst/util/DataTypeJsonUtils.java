package org.apache.spark.sql.catalyst.util;
/**
 * Jackson serializer for {@link DataType}. Internally this delegates to json4s based serialization.
 */
// not preceding
public  class DataTypeJsonUtils {
  // not preceding
  static public  class DataTypeJsonSerializer extends com.fasterxml.jackson.databind.JsonSerializer<org.apache.spark.sql.types.DataType> {
    // not preceding
    public   DataTypeJsonSerializer ()  { throw new RuntimeException(); }
    public  void serialize (org.apache.spark.sql.types.DataType value, com.fasterxml.jackson.core.JsonGenerator gen, com.fasterxml.jackson.databind.SerializerProvider provider)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class DataTypeJsonDeserializer extends com.fasterxml.jackson.databind.JsonDeserializer<org.apache.spark.sql.types.DataType> {
    // not preceding
    public   DataTypeJsonDeserializer ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.DataType deserialize (com.fasterxml.jackson.core.JsonParser jsonParser, com.fasterxml.jackson.databind.DeserializationContext deserializationContext)  { throw new RuntimeException(); }
  }
}

package org.apache.spark.sql.catalyst.json;
/**
 * Advance the parser until a null or a specific token is found
 */
// not preceding
public  class JacksonUtils {
  // not preceding
  static public  boolean nextUntil (com.fasterxml.jackson.core.JsonParser parser, com.fasterxml.jackson.core.JsonToken stopOn)  { throw new RuntimeException(); }
  static public  void verifyType (java.lang.String name, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  /**
   * Verify if the schema is supported in JSON parsing.
   * @param schema (undocumented)
   */
  static public  void verifySchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
}

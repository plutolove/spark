package org.apache.spark.sql.execution.datasources.orc;
/**
 * Creates a converter to convert Catalyst data at the given ordinal to ORC values.
 */
public  class OrcSerializer {
  // not preceding
  public   OrcSerializer (org.apache.spark.sql.types.StructType dataSchema)  { throw new RuntimeException(); }
  public  org.apache.orc.mapred.OrcStruct serialize (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
}

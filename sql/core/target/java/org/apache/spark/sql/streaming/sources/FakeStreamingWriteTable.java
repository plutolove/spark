package org.apache.spark.sql.streaming.sources;
public  interface FakeStreamingWriteTable extends org.apache.spark.sql.connector.catalog.Table, org.apache.spark.sql.connector.catalog.SupportsWrite {
  public  java.util.Set<org.apache.spark.sql.connector.catalog.TableCapability> capabilities ()  ;
  public  java.lang.String name ()  ;
  public  org.apache.spark.sql.connector.write.WriteBuilder newWriteBuilder (org.apache.spark.sql.connector.write.LogicalWriteInfo info)  ;
  public  org.apache.spark.sql.types.StructType schema ()  ;
}

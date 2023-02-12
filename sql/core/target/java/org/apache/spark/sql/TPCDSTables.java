package org.apache.spark.sql;
public  class TPCDSTables implements org.apache.spark.sql.TPCDSSchema, org.apache.spark.internal.Logging, scala.Serializable {
  // not preceding
  public   TPCDSTables (org.apache.spark.sql.SQLContext sqlContext, java.lang.String dsdgenDir, int scaleFactor)  { throw new RuntimeException(); }
  // not preceding
  public  void genData (java.lang.String location, java.lang.String format, boolean overwrite, boolean clusterByPartitionColumns, boolean filterOutNullPartitionValues, java.lang.String tableFilter, int numPartitions)  { throw new RuntimeException(); }
  // not preceding
  protected  scala.collection.immutable.Map<java.lang.String, java.lang.String> tableColumns ()  { throw new RuntimeException(); }
}

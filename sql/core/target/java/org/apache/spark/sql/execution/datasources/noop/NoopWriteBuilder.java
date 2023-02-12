package org.apache.spark.sql.execution.datasources.noop;
// not preceding
public  class NoopWriteBuilder {
  // not preceding
  static public  org.apache.spark.sql.connector.write.WriteBuilder truncate ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.connector.write.WriteBuilder update ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.connector.write.BatchWrite buildForBatch ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.connector.write.streaming.StreamingWrite buildForStreaming ()  { throw new RuntimeException(); }
}

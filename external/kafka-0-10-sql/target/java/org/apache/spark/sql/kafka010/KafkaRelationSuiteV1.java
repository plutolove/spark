package org.apache.spark.sql.kafka010;
/**
 * The following settings will ensure that all log entries
 * are removed following a call to cleanupLogs
 */
public  class KafkaRelationSuiteV1 extends org.apache.spark.sql.kafka010.KafkaRelationSuiteBase {
  // not preceding
  public   KafkaRelationSuiteV1 ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.SparkConf sparkConf ()  { throw new RuntimeException(); }
}

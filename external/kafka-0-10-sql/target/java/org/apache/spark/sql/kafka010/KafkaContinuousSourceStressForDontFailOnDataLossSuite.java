package org.apache.spark.sql.kafka010;
public  class KafkaContinuousSourceStressForDontFailOnDataLossSuite extends org.apache.spark.sql.kafka010.KafkaSourceStressForDontFailOnDataLossSuite {
  // not preceding
  public   KafkaContinuousSourceStressForDontFailOnDataLossSuite ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.streaming.StreamingQuery startStream (org.apache.spark.sql.Dataset<java.lang.Object> ds)  { throw new RuntimeException(); }
}

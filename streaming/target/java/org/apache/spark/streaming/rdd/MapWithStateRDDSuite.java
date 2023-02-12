package org.apache.spark.streaming.rdd;
/**
 * Assert that applying given data on a prior record generates correct updated record, with
 * correct state map and mapped data
 */
public  class MapWithStateRDDSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.RDDCheckpointTester, org.scalatest.BeforeAndAfterAll {
  // not preceding
  protected  org.apache.spark.HashPartitioner partitioner ()  { throw new RuntimeException(); }
  // not preceding
  public   MapWithStateRDDSuite ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sparkContext ()  { throw new RuntimeException(); }
}

package org.apache.spark.deploy.master.ui;
/**
 * Send an HTTP request to the given URL using the method and the body specified.
 * Return the connection object.
 */
public  class MasterWebUISuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterAll {
  // not preceding
  public   MasterWebUISuite ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.master.Master master ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEndpointRef masterEndpointRef ()  { throw new RuntimeException(); }
  public  org.apache.spark.deploy.master.ui.MasterWebUI masterWebUI ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  public  org.apache.spark.SecurityManager securityMgr ()  { throw new RuntimeException(); }
}

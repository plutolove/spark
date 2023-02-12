package org.apache.spark.deploy.rest;
/**
 * An abstract response sent from the server in the REST application submission protocol.
 */
 abstract class SubmitRestProtocolResponse extends org.apache.spark.deploy.rest.SubmitRestProtocolMessage {
  // not preceding
  public   SubmitRestProtocolResponse ()  { throw new RuntimeException(); }
  protected  void doValidate ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String serverSparkVersion ()  { throw new RuntimeException(); }
  public  java.lang.Boolean success ()  { throw new RuntimeException(); }
  public  java.lang.String[] unknownFields ()  { throw new RuntimeException(); }
}

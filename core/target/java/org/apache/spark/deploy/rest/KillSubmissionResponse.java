package org.apache.spark.deploy.rest;
/**
 * A response to a kill request in the REST application submission protocol.
 */
  class KillSubmissionResponse extends org.apache.spark.deploy.rest.SubmitRestProtocolResponse {
  // not preceding
  public   KillSubmissionResponse ()  { throw new RuntimeException(); }
  protected  void doValidate ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String submissionId ()  { throw new RuntimeException(); }
}

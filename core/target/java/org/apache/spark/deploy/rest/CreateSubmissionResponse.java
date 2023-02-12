package org.apache.spark.deploy.rest;
/**
 * A response to a {@link CreateSubmissionRequest} in the REST application submission protocol.
 */
  class CreateSubmissionResponse extends org.apache.spark.deploy.rest.SubmitRestProtocolResponse {
  // not preceding
  public   CreateSubmissionResponse ()  { throw new RuntimeException(); }
  protected  void doValidate ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String submissionId ()  { throw new RuntimeException(); }
}

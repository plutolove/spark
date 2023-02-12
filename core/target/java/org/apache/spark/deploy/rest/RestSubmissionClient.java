package org.apache.spark.deploy.rest;
/**
 * Submit an application specified by the parameters in the provided request.
 * <p>
 * If the submission was successful, poll the status of the submission and report
 * it to the user. Otherwise, report the error message provided by the server.
 */
  class RestSubmissionClient implements org.apache.spark.internal.Logging {
  // not preceding
  static public  scala.collection.Seq<java.lang.String> supportedMasterPrefixes ()  { throw new RuntimeException(); }
  static public  java.lang.String PROTOCOL_VERSION ()  { throw new RuntimeException(); }
  /**
   * Filter non-spark environment variables from any environment.
   * @param env (undocumented)
   * @return (undocumented)
   */
  static   scala.collection.immutable.Map<java.lang.String, java.lang.String> filterSystemEnvironment (scala.collection.immutable.Map<java.lang.String, java.lang.String> env)  { throw new RuntimeException(); }
  static   boolean supportsRestClient (java.lang.String master)  { throw new RuntimeException(); }
  // not preceding
  public   RestSubmissionClient (java.lang.String master)  { throw new RuntimeException(); }
  /**
   * Submit an application specified by the parameters in the provided request.
   * <p>
   * If the submission was successful, poll the status of the submission and report
   * it to the user. Otherwise, report the error message provided by the server.
   * @param request (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.deploy.rest.SubmitRestProtocolResponse createSubmission (org.apache.spark.deploy.rest.CreateSubmissionRequest request)  { throw new RuntimeException(); }
  /** Request that the server kill the specified submission. */
  public  org.apache.spark.deploy.rest.SubmitRestProtocolResponse killSubmission (java.lang.String submissionId)  { throw new RuntimeException(); }
  /** Request the status of a submission from the server. */
  public  org.apache.spark.deploy.rest.SubmitRestProtocolResponse requestSubmissionStatus (java.lang.String submissionId, boolean quiet)  { throw new RuntimeException(); }
  /** Construct a message that captures the specified parameters for submitting an application. */
  public  org.apache.spark.deploy.rest.CreateSubmissionRequest constructSubmitRequest (java.lang.String appResource, java.lang.String mainClass, java.lang.String[] appArgs, scala.collection.immutable.Map<java.lang.String, java.lang.String> sparkProperties, scala.collection.immutable.Map<java.lang.String, java.lang.String> environmentVariables)  { throw new RuntimeException(); }
  /**
   * Read the response from the server and return it as a validated {@link SubmitRestProtocolResponse}.
   * If the response represents an error, report the embedded message to the user.
   * Exposed for testing.
   * @param connection (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.deploy.rest.SubmitRestProtocolResponse readResponse (java.net.HttpURLConnection connection)  { throw new RuntimeException(); }
}

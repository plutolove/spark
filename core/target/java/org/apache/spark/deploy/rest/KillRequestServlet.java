package org.apache.spark.deploy.rest;
/**
 * If a submission ID is specified in the URL, have the Master kill the corresponding
 * driver and return an appropriate response to the client. Otherwise, return error.
 */
 abstract class KillRequestServlet extends org.apache.spark.deploy.rest.RestServlet {
  // not preceding
  public   KillRequestServlet ()  { throw new RuntimeException(); }
  // not preceding
  protected  void doPost (javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)  { throw new RuntimeException(); }
  protected abstract  org.apache.spark.deploy.rest.KillSubmissionResponse handleKill (java.lang.String submissionId)  ;
}

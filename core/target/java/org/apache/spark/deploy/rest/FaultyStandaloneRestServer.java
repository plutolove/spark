package org.apache.spark.deploy.rest;
/** A faulty servlet that produces malformed responses. */
public  class FaultyStandaloneRestServer extends org.apache.spark.deploy.rest.RestSubmissionServer {
  /** A faulty servlet that produces malformed responses. */
  public  class MalformedSubmitServlet extends org.apache.spark.deploy.rest.StandaloneSubmitRequestServlet {
    // not preceding
    public   MalformedSubmitServlet ()  { throw new RuntimeException(); }
    // not preceding
    protected  void sendResponse (org.apache.spark.deploy.rest.SubmitRestProtocolResponse responseMessage, javax.servlet.http.HttpServletResponse responseServlet)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class InvalidKillServlet extends org.apache.spark.deploy.rest.StandaloneKillRequestServlet {
    // not preceding
    public   InvalidKillServlet ()  { throw new RuntimeException(); }
    // not preceding
    protected  org.apache.spark.deploy.rest.KillSubmissionResponse handleKill (java.lang.String submissionId)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class ExplodingStatusServlet extends org.apache.spark.deploy.rest.StandaloneStatusRequestServlet {
    // not preceding
    public   ExplodingStatusServlet ()  { throw new RuntimeException(); }
    protected  org.apache.spark.deploy.rest.SubmissionStatusResponse handleStatus (java.lang.String submissionId)  { throw new RuntimeException(); }
  }
  // not preceding
  public   FaultyStandaloneRestServer (java.lang.String host, int requestedPort, org.apache.spark.SparkConf masterConf, org.apache.spark.rpc.RpcEndpointRef masterEndpoint, java.lang.String masterUrl)  { throw new RuntimeException(); }
  protected  org.apache.spark.deploy.rest.FaultyStandaloneRestServer.InvalidKillServlet killRequestServlet ()  { throw new RuntimeException(); }
  protected  org.apache.spark.deploy.rest.FaultyStandaloneRestServer.ExplodingStatusServlet statusRequestServlet ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.deploy.rest.FaultyStandaloneRestServer.MalformedSubmitServlet submitRequestServlet ()  { throw new RuntimeException(); }
}

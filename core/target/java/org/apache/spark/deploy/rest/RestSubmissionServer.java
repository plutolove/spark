package org.apache.spark.deploy.rest;
/** Start the server and return the bound port. */
 abstract class RestSubmissionServer implements org.apache.spark.internal.Logging {
  // not preceding
  static public  java.lang.String PROTOCOL_VERSION ()  { throw new RuntimeException(); }
  static public  int SC_UNKNOWN_PROTOCOL_VERSION ()  { throw new RuntimeException(); }
  public  java.lang.String host ()  { throw new RuntimeException(); }
  public  int requestedPort ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf masterConf ()  { throw new RuntimeException(); }
  // not preceding
  public   RestSubmissionServer (java.lang.String host, int requestedPort, org.apache.spark.SparkConf masterConf)  { throw new RuntimeException(); }
  // not preceding
  protected abstract  org.apache.spark.deploy.rest.SubmitRequestServlet submitRequestServlet ()  ;
  protected abstract  org.apache.spark.deploy.rest.KillRequestServlet killRequestServlet ()  ;
  protected abstract  org.apache.spark.deploy.rest.StatusRequestServlet statusRequestServlet ()  ;
  protected  java.lang.String baseContext ()  { throw new RuntimeException(); }
  // not preceding
  protected  scala.collection.immutable.Map<java.lang.String, org.apache.spark.deploy.rest.RestServlet> contextToServlet ()  { throw new RuntimeException(); }
  /** Start the server and return the bound port. */
  public  int start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}

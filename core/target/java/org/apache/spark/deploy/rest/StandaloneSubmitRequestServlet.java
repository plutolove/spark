package org.apache.spark.deploy.rest;
/**
 * Build a driver description from the fields specified in the submit request.
 * <p>
 * This involves constructing a command that takes into account memory, java options,
 * classpath and other settings to launch the driver. This does not currently consider
 * fields used by python applications since python is not supported in standalone
 * cluster mode yet.
 */
  class StandaloneSubmitRequestServlet extends org.apache.spark.deploy.rest.SubmitRequestServlet {
  // not preceding
  public   StandaloneSubmitRequestServlet (org.apache.spark.rpc.RpcEndpointRef masterEndpoint, java.lang.String masterUrl, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Handle the submit request and construct an appropriate response to return to the client.
   * <p>
   * This assumes that the request message is already successfully validated.
   * If the request message is not of the expected type, return error to the client.
   * @param requestMessageJson (undocumented)
   * @param requestMessage (undocumented)
   * @param responseServlet (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.deploy.rest.SubmitRestProtocolResponse handleSubmit (java.lang.String requestMessageJson, org.apache.spark.deploy.rest.SubmitRestProtocolMessage requestMessage, javax.servlet.http.HttpServletResponse responseServlet)  { throw new RuntimeException(); }
}

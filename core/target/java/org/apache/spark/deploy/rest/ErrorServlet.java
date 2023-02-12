package org.apache.spark.deploy.rest;
/** Service a faulty request by returning an appropriate error message to the client. */
public  class ErrorServlet extends org.apache.spark.deploy.rest.RestServlet {
  // not preceding
  public   ErrorServlet ()  { throw new RuntimeException(); }
  /** Service a faulty request by returning an appropriate error message to the client. */
  protected  void service (javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response)  { throw new RuntimeException(); }
}

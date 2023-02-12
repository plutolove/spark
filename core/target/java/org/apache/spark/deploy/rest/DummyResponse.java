package org.apache.spark.deploy.rest;
/** Assert that the contents in the two JSON strings are equal after ignoring whitespace. */
public  class DummyResponse extends org.apache.spark.deploy.rest.SubmitRestProtocolResponse {
  // not preceding
  public   DummyResponse ()  { throw new RuntimeException(); }
}

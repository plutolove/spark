package org.apache.spark.deploy.rest;
/** Submits a request to run the application and return the response. Visible for testing. */
  class RestSubmissionClientApp implements org.apache.spark.deploy.SparkApplication {
  // not preceding
  public   RestSubmissionClientApp ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.deploy.rest.SubmitRestProtocolResponse run (java.lang.String appResource, java.lang.String mainClass, java.lang.String[] appArgs, org.apache.spark.SparkConf conf, scala.collection.immutable.Map<java.lang.String, java.lang.String> env)  { throw new RuntimeException(); }
  public  void start (java.lang.String[] args, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
}
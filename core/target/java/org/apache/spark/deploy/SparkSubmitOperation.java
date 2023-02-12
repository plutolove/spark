package org.apache.spark.deploy;
public  interface SparkSubmitOperation {
  // not preceding
  public  void kill (java.lang.String submissionId, org.apache.spark.SparkConf conf)  ;
  public  void printSubmissionStatus (java.lang.String submissionId, org.apache.spark.SparkConf conf)  ;
  public  boolean supports (java.lang.String master)  ;
}

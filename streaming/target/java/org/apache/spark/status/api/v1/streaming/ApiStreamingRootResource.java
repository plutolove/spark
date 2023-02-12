package org.apache.spark.status.api.v1.streaming;
  class ApiStreamingRootResource implements org.apache.spark.status.api.v1.streaming.BaseStreamingAppResource {
  // not preceding
  public   ApiStreamingRootResource ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String appId ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String attemptId ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.streaming.BatchInfo> batchesList (java.util.List<org.apache.spark.status.api.v1.streaming.BatchStatus> statusParams)  { throw new RuntimeException(); }
  // not preceding
  protected  javax.servlet.http.HttpServletRequest httpRequest ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.streaming.BatchInfo oneBatch (long batchId)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.streaming.OutputOperationInfo oneOperation (long batchId, int opId)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.streaming.ReceiverInfo oneReceiver (int streamId)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.streaming.OutputOperationInfo> operationsList (long batchId)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.streaming.ReceiverInfo> receiversList ()  { throw new RuntimeException(); }
  // not preceding
  protected  javax.servlet.ServletContext servletContext ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.status.api.v1.streaming.StreamingStatistics streamingStatistics ()  { throw new RuntimeException(); }
}

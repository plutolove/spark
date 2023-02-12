package org.apache.spark.deploy.worker;
  class WorkerSource implements org.apache.spark.metrics.source.Source {
  // not preceding
  public   WorkerSource (org.apache.spark.deploy.worker.Worker worker)  { throw new RuntimeException(); }
  public  com.codahale.metrics.MetricRegistry metricRegistry ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String sourceName ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.deploy.worker.Worker worker ()  { throw new RuntimeException(); }
}

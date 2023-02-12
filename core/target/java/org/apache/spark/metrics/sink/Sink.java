package org.apache.spark.metrics.sink;
public  interface Sink {
  public  void report ()  ;
  // not preceding
  public  void start ()  ;
  public  void stop ()  ;
}

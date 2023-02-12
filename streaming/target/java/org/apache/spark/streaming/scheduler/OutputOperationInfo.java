package org.apache.spark.streaming.scheduler;
/**
 * Return the duration of this output operation.
 */
public  class OutputOperationInfo implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.streaming.Time batchTime ()  { throw new RuntimeException(); }
  public  int id ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  java.lang.String description ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> startTime ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Object> endTime ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> failureReason ()  { throw new RuntimeException(); }
  // not preceding
  public   OutputOperationInfo (org.apache.spark.streaming.Time batchTime, int id, java.lang.String name, java.lang.String description, scala.Option<java.lang.Object> startTime, scala.Option<java.lang.Object> endTime, scala.Option<java.lang.String> failureReason)  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<java.lang.Object> duration ()  { throw new RuntimeException(); }
}

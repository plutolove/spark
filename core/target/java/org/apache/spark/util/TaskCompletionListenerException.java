package org.apache.spark.util;
/**
 * Exception thrown when there is an exception in executing the callback in TaskCompletionListener.
 */
  class TaskCompletionListenerException extends java.lang.RuntimeException {
  // not preceding
  public  scala.Option<java.lang.Throwable> previousError ()  { throw new RuntimeException(); }
  // not preceding
  public   TaskCompletionListenerException (scala.collection.Seq<java.lang.String> errorMessages, scala.Option<java.lang.Throwable> previousError)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String getMessage ()  { throw new RuntimeException(); }
}

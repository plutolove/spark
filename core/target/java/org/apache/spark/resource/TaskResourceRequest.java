package org.apache.spark.resource;
/**
 * A task resource request. This is used in conjuntion with the ResourceProfile to
 * programmatically specify the resources needed for an RDD that will be applied at the
 * stage level.
 * <p>
 * Use TaskResourceRequests class as a convenience API.
 * <p>
 * This api is currently private until the rest of the pieces are in place and then it
 * will become public.
 */
  class TaskResourceRequest implements scala.Serializable {
  // not preceding
  public   TaskResourceRequest (java.lang.String resourceName, double amount)  { throw new RuntimeException(); }
  public  double amount ()  { throw new RuntimeException(); }
  public  boolean equals (Object obj)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String resourceName ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}

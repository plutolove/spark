package org.apache.spark.partial;
/**
 * Waits for up to timeout milliseconds since the listener was created and then returns a
 * PartialResult with the result so far. This may be complete if the whole job is done.
 */
  class ApproximateActionListener<T extends java.lang.Object, U extends java.lang.Object, R extends java.lang.Object> implements org.apache.spark.scheduler.JobListener {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   ApproximateActionListener (org.apache.spark.rdd.RDD<T> rdd, scala.Function2<org.apache.spark.TaskContext, scala.collection.Iterator<T>, U> func, org.apache.spark.partial.ApproximateEvaluator<U, R> evaluator, long timeout)  { throw new RuntimeException(); }
  /**
   * Waits for up to timeout milliseconds since the listener was created and then returns a
   * PartialResult with the result so far. This may be complete if the whole job is done.
   * @return (undocumented)
   */
  public  org.apache.spark.partial.PartialResult<R> awaitResult ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Exception> failure ()  { throw new RuntimeException(); }
  public  int finishedTasks ()  { throw new RuntimeException(); }
  public  void jobFailed (java.lang.Exception exception)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.partial.PartialResult<R>> resultObject ()  { throw new RuntimeException(); }
  // not preceding
  public  long startTime ()  { throw new RuntimeException(); }
  public  void taskSucceeded (int index, Object result)  { throw new RuntimeException(); }
  public  int totalTasks ()  { throw new RuntimeException(); }
}

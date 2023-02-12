package org.apache.spark.streaming.scheduler.rate;
/**
 * Computes the number of records the stream attached to this <code>RateEstimator</code>
 * should ingest per second, given an update on the size and completion
 * times of the latest batch.
 * <p>
 * param:  time The timestamp of the current batch interval that just finished
 * param:  elements The number of records that were processed in this batch
 * param:  processingDelay The time in ms that took for the job to complete
 * param:  schedulingDelay The time in ms that the job spent in the scheduling queue
 */
public  interface RateEstimator extends scala.Serializable {
  // not preceding
  public  scala.Option<java.lang.Object> compute (long time, long elements, long processingDelay, long schedulingDelay)  ;
}

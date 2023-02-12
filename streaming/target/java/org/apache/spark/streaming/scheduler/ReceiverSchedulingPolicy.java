package org.apache.spark.streaming.scheduler;
/**
 * Try our best to schedule receivers with evenly distributed. However, if the
 * <code>preferredLocation</code>s of receivers are not even, we may not be able to schedule them evenly
 * because we have to respect them.
 * <p>
 * Here is the approach to schedule executors:
 * <ol>
 *   <li>First, schedule all the receivers with preferred locations (hosts), evenly among the
 *       executors running on those host.</li>
 *   <li>Then, schedule all other receivers evenly among all the executors such that overall
 *       distribution over all the receivers is even.</li>
 * </ol>
 * <p>
 * This method is called when we start to launch receivers at the first time.
 * <p>
 * @return a map for receivers and their scheduled locations
 */
  class ReceiverSchedulingPolicy {
  // not preceding
  public   ReceiverSchedulingPolicy ()  { throw new RuntimeException(); }
  /**
   * Return a list of candidate locations to run the receiver. If the list is empty, the caller can
   * run this receiver in arbitrary executor.
   * <p>
   * This method tries to balance executors' load. Here is the approach to schedule executors
   * for a receiver.
   * <ol>
   *   <li>
   *     If preferredLocation is set, preferredLocation should be one of the candidate locations.
   *   </li>
   *   <li>
   *     Every executor will be assigned to a weight according to the receivers running or
   *     scheduling on it.
   *     <ul>
   *       <li>
   *         If a receiver is running on an executor, it contributes 1.0 to the executor's weight.
   *       </li>
   *       <li>
   *         If a receiver is scheduled to an executor but has not yet run, it contributes
   *         <code>1.0 / #candidate_executors_of_this_receiver</code> to the executor's weight.</li>
   *     </ul>
   *     At last, if there are any idle executors (weight = 0), returns all idle executors.
   *     Otherwise, returns the executors that have the minimum weight.
   *   </li>
   * </ol>
   * <p>
   * This method is called when a receiver is registering with ReceiverTracker or is restarting.
   * @param receiverId (undocumented)
   * @param preferredLocation (undocumented)
   * @param receiverTrackingInfoMap (undocumented)
   * @param executors (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> rescheduleReceiver (int receiverId, scala.Option<java.lang.String> preferredLocation, scala.collection.Map<java.lang.Object, org.apache.spark.streaming.scheduler.ReceiverTrackingInfo> receiverTrackingInfoMap, scala.collection.Seq<org.apache.spark.scheduler.ExecutorCacheTaskLocation> executors)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Map<java.lang.Object, scala.collection.Seq<org.apache.spark.scheduler.TaskLocation>> scheduleReceivers (scala.collection.Seq<org.apache.spark.streaming.receiver.Receiver<?>> receivers, scala.collection.Seq<org.apache.spark.scheduler.ExecutorCacheTaskLocation> executors)  { throw new RuntimeException(); }
}

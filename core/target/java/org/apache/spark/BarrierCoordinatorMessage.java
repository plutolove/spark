package org.apache.spark;
/**
 * Provide the current state of a barrier() call. A state is created when a new stage attempt
 * sends out a barrier() call, and recycled on stage completed.
 * <p>
 * param:  barrierId Identifier of the barrier stage that make a barrier() call.
 * param:  numTasks Number of tasks of the barrier stage, all barrier() calls from the stage shall
 *                 collect <code>numTasks</code> requests to succeed.
 */
public  interface BarrierCoordinatorMessage extends scala.Serializable {
}

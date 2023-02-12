package org.apache.spark.deploy.client;
/** Disconnection may be a temporary state, as we fail over to a new Master. */
public  interface StandaloneAppClientListener {
  // not preceding
  public  void connected (java.lang.String appId)  ;
  /** An application death is an unrecoverable failure condition. */
  public  void dead (java.lang.String reason)  ;
  /** Disconnection may be a temporary state, as we fail over to a new Master. */
  public  void disconnected ()  ;
  public  void executorAdded (java.lang.String fullId, java.lang.String workerId, java.lang.String hostPort, int cores, int memory)  ;
  public  void executorRemoved (java.lang.String fullId, java.lang.String message, scala.Option<java.lang.Object> exitStatus, boolean workerLost)  ;
  public  void workerRemoved (java.lang.String workerId, java.lang.String host, java.lang.String message)  ;
}

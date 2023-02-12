package org.apache.spark.deploy.master;
/**
 * PersistenceEngine defines how the persistent data(Information about worker, driver etc..)
 * is handled for recovery.
 * <p>
 */
public abstract class StandaloneRecoveryModeFactory {
  // not preceding
  public   StandaloneRecoveryModeFactory (org.apache.spark.SparkConf conf, org.apache.spark.serializer.Serializer serializer)  { throw new RuntimeException(); }
  /**
   * Create an instance of LeaderAgent that decides who gets elected as master.
   * @param master (undocumented)
   * @return (undocumented)
   */
  public abstract  org.apache.spark.deploy.master.LeaderElectionAgent createLeaderElectionAgent (org.apache.spark.deploy.master.LeaderElectable master)  ;
  // not preceding
  public abstract  org.apache.spark.deploy.master.PersistenceEngine createPersistenceEngine ()  ;
}

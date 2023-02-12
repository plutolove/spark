package org.apache.spark.deploy.master;
public  interface LeaderElectable {
  // not preceding
  public  void electedLeader ()  ;
  public  void revokedLeadership ()  ;
}

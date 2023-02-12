package org.apache.spark.rdd;
/**
 * Get any environment variables that should be added to the users environment when running pipes
 * @return a Map with the environment variables and corresponding values, it could be empty
 */
  class HadoopPartition implements org.apache.spark.Partition {
  // not preceding
  public   HadoopPartition (int rddId, int index, org.apache.hadoop.mapred.InputSplit s)  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  /**
   * Get any environment variables that should be added to the users environment when running pipes
   * @return a Map with the environment variables and corresponding values, it could be empty
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> getPipeEnvVars ()  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  // not preceding
  public  int index ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SerializableWritable<org.apache.hadoop.mapred.InputSplit> inputSplit ()  { throw new RuntimeException(); }
}

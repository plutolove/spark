package org.apache.spark;
  class GetMapOutputMessage implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  int shuffleId ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcCallContext context ()  { throw new RuntimeException(); }
  // not preceding
  public   GetMapOutputMessage (int shuffleId, org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
}

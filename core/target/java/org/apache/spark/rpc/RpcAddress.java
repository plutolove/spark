package org.apache.spark.rpc;
/** Returns a string in the form of "spark://host:port". */
  class RpcAddress implements scala.Product, scala.Serializable {
  // not preceding
  static public  org.apache.spark.rpc.RpcAddress fromURIString (java.lang.String uri)  { throw new RuntimeException(); }
  /** Returns the {@link RpcAddress} encoded in the form of "spark://host:port" */
  static public  org.apache.spark.rpc.RpcAddress fromSparkURL (java.lang.String sparkUrl)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String host ()  { throw new RuntimeException(); }
  public  int port ()  { throw new RuntimeException(); }
  // not preceding
  public   RpcAddress (java.lang.String host, int port)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String hostPort ()  { throw new RuntimeException(); }
  /** Returns a string in the form of "spark://host:port". */
  public  java.lang.String toSparkURL ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}

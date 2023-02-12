package org.apache.spark.sql.api.python;
/**
 * Helper for making a dataframe from arrow data from data sent from python over a socket.  This is
 * used when encryption is enabled, and we don't want to write data to a file.
 */
  class ArrowRDDServer extends org.apache.spark.api.python.PythonRDDServer {
  // not preceding
  public   ArrowRDDServer (org.apache.spark.sql.SQLContext sqlContext)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<byte[]> streamToRDD (java.io.InputStream input)  { throw new RuntimeException(); }
}

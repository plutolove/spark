package org.apache.spark.ml.util;
/**
 * Returns an <code>MLWriter</code> instance for this ML instance.
 */
public  interface GeneralMLWritable extends org.apache.spark.ml.util.MLWritable {
  // not preceding
  public  org.apache.spark.ml.util.GeneralMLWriter write ()  ;
}

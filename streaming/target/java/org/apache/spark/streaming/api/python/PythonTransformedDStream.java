package org.apache.spark.streaming.api.python;
/**
 * Transformed DStream in Python.
 */
  class PythonTransformedDStream extends org.apache.spark.streaming.api.python.PythonDStream {
  // not preceding
  public   PythonTransformedDStream (org.apache.spark.streaming.dstream.DStream<?> parent, org.apache.spark.streaming.api.python.PythonTransformFunction pfunc)  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<org.apache.spark.rdd.RDD<byte[]>> compute (org.apache.spark.streaming.Time validTime)  { throw new RuntimeException(); }
}

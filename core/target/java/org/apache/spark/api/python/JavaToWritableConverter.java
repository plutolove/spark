package org.apache.spark.api.python;
/**
 * Converts common data types to {@link org.apache.hadoop.io.Writable}. Note that array types are not
 * supported out-of-the-box.
 */
  class JavaToWritableConverter implements org.apache.spark.api.python.Converter<java.lang.Object, org.apache.hadoop.io.Writable> {
  // not preceding
  public   JavaToWritableConverter ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.io.Writable convert (Object obj)  { throw new RuntimeException(); }
}

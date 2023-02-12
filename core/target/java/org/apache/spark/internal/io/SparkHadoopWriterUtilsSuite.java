package org.apache.spark.internal.io;
/**
 * Core test of JobID generation:
 * They are created.
 * The job number is converted to the job ID.
 * They round trip to string and back
 * (which implies that the full string matches the regexp
 * in the JobID class).
 */
public  class SparkHadoopWriterUtilsSuite extends org.apache.spark.SparkFunSuite {
  // not preceding
  public   SparkHadoopWriterUtilsSuite ()  { throw new RuntimeException(); }
}

package org.apache.spark.input;
/**
 * Calculate the path name independently of opening the file
 */
public  class PortableDataStream implements scala.Serializable {
  // not preceding
  public   PortableDataStream (org.apache.hadoop.mapreduce.lib.input.CombineFileSplit isplit, org.apache.hadoop.mapreduce.TaskAttemptContext context, java.lang.Integer index)  { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration getConfiguration ()  { throw new RuntimeException(); }
  public  java.lang.String getPath ()  { throw new RuntimeException(); }
  /**
   * Create a new DataInputStream from the split and context. The user of this method is responsible
   * for closing the stream after usage.
   * @return (undocumented)
   */
  public  java.io.DataInputStream open ()  { throw new RuntimeException(); }
  /**
   * Read the file as a byte array
   * @return (undocumented)
   */
  public  byte[] toArray ()  { throw new RuntimeException(); }
}

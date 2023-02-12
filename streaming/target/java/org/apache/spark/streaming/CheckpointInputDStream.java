package org.apache.spark.streaming;
/**
 * A input stream that records the times of restore() invoked
 */
  class CheckpointInputDStream extends org.apache.spark.streaming.dstream.InputDStream<java.lang.Object> {
    class FileInputDStreamCheckpointData extends org.apache.spark.streaming.dstream.DStreamCheckpointData<java.lang.Object> {
    // not preceding
    public   FileInputDStreamCheckpointData ()  { throw new RuntimeException(); }
    public  void restore ()  { throw new RuntimeException(); }
    // not preceding
    public  int restoredTimes ()  { throw new RuntimeException(); }
  }
  // not preceding
  public   CheckpointInputDStream (org.apache.spark.streaming.StreamingContext _ssc)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.streaming.CheckpointInputDStream.FileInputDStreamCheckpointData checkpointData ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDD<java.lang.Object>> compute (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}

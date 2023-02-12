package org.apache.spark.api.r;
/**
 * Reads next object from the stream.
 * When the stream reaches end of data, needs to process the following sections,
 * and then returns null.
 */
  class RRunner<IN extends java.lang.Object, OUT extends java.lang.Object> extends org.apache.spark.api.r.BaseRRunner<IN, OUT> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   RRunner (byte[] func, java.lang.String deserializer, java.lang.String serializer, byte[] packageNames, org.apache.spark.broadcast.Broadcast<java.lang.Object>[] broadcastVars, int numPartitions, boolean isDataFrame, java.lang.String[] colNames, int mode)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.api.r.BaseRRunner<IN, OUT>.ReaderIterator newReaderIterator (java.io.DataInputStream dataStream, org.apache.spark.api.r.BufferedStreamThread errThread)  { throw new RuntimeException(); }
  /**
   * Writes input data to the stream connected to the R worker.
   * @param output (undocumented)
   * @param iter (undocumented)
   * @param partitionIndex (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.api.r.BaseRRunner<IN, OUT>.WriterThread newWriterThread (java.io.OutputStream output, scala.collection.Iterator<IN> iter, int partitionIndex)  { throw new RuntimeException(); }
}

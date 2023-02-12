package org.apache.spark.sql.execution.r;
/**
 * Writes input data to the stream connected to the R worker.
 */
public  class ArrowRRunner extends org.apache.spark.api.r.BaseRRunner<scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow>, org.apache.spark.sql.vectorized.ColumnarBatch> {
  // not preceding
  public   ArrowRRunner (byte[] func, byte[] packageNames, org.apache.spark.broadcast.Broadcast<java.lang.Object>[] broadcastVars, org.apache.spark.sql.types.StructType schema, java.lang.String timeZoneId, int mode)  { throw new RuntimeException(); }
  // not preceding
  protected  void bufferedWrite (java.io.DataOutputStream dataOut, scala.Function1<java.io.ByteArrayOutputStream, scala.runtime.BoxedUnit> writeFunc)  { throw new RuntimeException(); }
  /**
   * Writes input data to the stream connected to the R worker.
   * @param dataStream (undocumented)
   * @param errThread (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.api.r.BaseRRunner<scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow>, org.apache.spark.sql.vectorized.ColumnarBatch>.ReaderIterator newReaderIterator (java.io.DataInputStream dataStream, org.apache.spark.api.r.BufferedStreamThread errThread)  { throw new RuntimeException(); }
  /**
   * Writes input data to the stream connected to the R worker.
   * @param output (undocumented)
   * @param inputIterator (undocumented)
   * @param partitionIndex (undocumented)
   * @return (undocumented)
   */
  protected  org.apache.spark.api.r.BaseRRunner<scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow>, org.apache.spark.sql.vectorized.ColumnarBatch>.WriterThread newWriterThread (java.io.OutputStream output, scala.collection.Iterator<scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow>> inputIterator, int partitionIndex)  { throw new RuntimeException(); }
}

package org.apache.spark.sql.execution;
/**
 * Serializes a stream of UnsafeRows. Within the stream, each record consists of a record
 * length (stored as a 4-byte integer, written high byte first), followed by the record's bytes.
 */
public  class UnsafeRowSerializerInstance extends org.apache.spark.serializer.SerializerInstance {
  // not preceding
  public   UnsafeRowSerializerInstance (int numFields, org.apache.spark.sql.execution.metric.SQLMetric dataSize)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T deserialize (java.nio.ByteBuffer bytes, scala.reflect.ClassTag<T> evidence$9)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T deserialize (java.nio.ByteBuffer bytes, java.lang.ClassLoader loader, scala.reflect.ClassTag<T> evidence$10)  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.DeserializationStream deserializeStream (java.io.InputStream in)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> java.nio.ByteBuffer serialize (T t, scala.reflect.ClassTag<T> evidence$8)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.serializer.SerializationStream serializeStream (java.io.OutputStream out)  { throw new RuntimeException(); }
}

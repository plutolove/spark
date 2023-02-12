package org.apache.spark.serializer;
/**
 * Calling reset to avoid memory leak:
 * http://stackoverflow.com/questions/1281549/memory-leak-traps-in-the-java-standard-api
 * But only call it every 100th time to avoid bloated serialization streams (when
 * the stream 'resets' object class descriptions have to be re-written)
 */
  class JavaDeserializationStream extends org.apache.spark.serializer.DeserializationStream {
  // not preceding
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.Class<?>> primitiveMappings ()  { throw new RuntimeException(); }
  // not preceding
  public   JavaDeserializationStream (java.io.InputStream in, java.lang.ClassLoader loader)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T readObject (scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
}

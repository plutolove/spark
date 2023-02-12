package org.apache.spark.streaming;
/**
 * Read checkpoint files present in the given checkpoint directory. If there are no checkpoint
 * files, then return None, else try to return the latest valid checkpoint object. If no
 * checkpoint files could be read correctly, then return None (if ignoreReadError = true),
 * or throw exception (if ignoreReadError = false).
 */
  class ObjectInputStreamWithLoader extends java.io.ObjectInputStream {
  // not preceding
  public   ObjectInputStreamWithLoader (java.io.InputStream _inputStream, java.lang.ClassLoader loader)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.Class<?> resolveClass (java.io.ObjectStreamClass desc)  { throw new RuntimeException(); }
}

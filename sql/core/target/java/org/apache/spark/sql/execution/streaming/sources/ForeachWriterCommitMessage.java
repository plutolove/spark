package org.apache.spark.sql.execution.streaming.sources;
/**
 * An empty {@link WriterCommitMessage}. {@link ForeachWriter} implementations have no global coordination.
 */
// not preceding
public  class ForeachWriterCommitMessage {
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
}
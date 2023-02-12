package org.apache.spark.sql;
/**
 * Using ProcessBuilder.lineStream produces a stream, that uses
 * a LinkedBlockingQueue with a default capacity of Integer.MAX_VALUE.
 * <p>
 * This causes OOM if the consumer cannot keep up with the producer.
 * <p>
 * See scala.sys.process.ProcessBuilderImpl.lineStream
 */
// not preceding
public  class BlockingLineStream$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final BlockingLineStream$ MODULE$ = null;
  public   BlockingLineStream$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Stream<java.lang.String> apply (scala.collection.Seq<java.lang.String> command)  { throw new RuntimeException(); }
}

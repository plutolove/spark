package org.apache.spark.sql.execution.streaming.continuous.shuffle;
/**
 * Returns an iterator over the incoming rows in an epoch. Implementations should block waiting
 * for new rows to arrive, and end the iterator once they've received epoch markers from all
 * shuffle writers.
 */
public  interface ContinuousShuffleReader {
  // not preceding
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> read ()  ;
}

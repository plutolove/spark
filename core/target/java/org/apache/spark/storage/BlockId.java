package org.apache.spark.storage;
/** A globally unique identifier for this Block. Can be used for ser/de. */
public abstract class BlockId {
  // not preceding
  static public  scala.util.matching.Regex RDD ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex SHUFFLE ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex SHUFFLE_BATCH ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex SHUFFLE_DATA ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex SHUFFLE_INDEX ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex BROADCAST ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex TASKRESULT ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex STREAM ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex TEMP_LOCAL ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex TEMP_SHUFFLE ()  { throw new RuntimeException(); }
  static public  scala.util.matching.Regex TEST ()  { throw new RuntimeException(); }
  static public  org.apache.spark.storage.BlockId apply (java.lang.String name)  { throw new RuntimeException(); }
  // not preceding
  public   BlockId ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  java.lang.String name ()  ;
  public  scala.Option<org.apache.spark.storage.RDDBlockId> asRDDId ()  { throw new RuntimeException(); }
  public  boolean isRDD ()  { throw new RuntimeException(); }
  public  boolean isShuffle ()  { throw new RuntimeException(); }
  public  boolean isBroadcast ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}

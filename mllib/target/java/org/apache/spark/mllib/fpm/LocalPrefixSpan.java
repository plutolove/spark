package org.apache.spark.mllib.fpm;
/**
 * Generates frequent patterns on the input array of postfixes.
 * param:  postfixes an array of postfixes
 * @return an iterator of (frequent pattern, count)
 */
  class LocalPrefixSpan implements org.apache.spark.internal.Logging, scala.Serializable {
  // not preceding
  static public  class ReversedPrefix implements scala.Serializable {
    // not preceding
    public  scala.collection.immutable.List<java.lang.Object> items ()  { throw new RuntimeException(); }
    public  int length ()  { throw new RuntimeException(); }
    /**
     * Converts this prefix to a sequence.
     * @return (undocumented)
     */
    public  int[] toSequence ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class ReversedPrefix$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ReversedPrefix$ MODULE$ = null;
    public   ReversedPrefix$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.mllib.fpm.LocalPrefixSpan.ReversedPrefix empty ()  { throw new RuntimeException(); }
  }
  public  long minCount ()  { throw new RuntimeException(); }
  public  int maxPatternLength ()  { throw new RuntimeException(); }
  // not preceding
  public   LocalPrefixSpan (long minCount, int maxPatternLength)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Iterator<scala.Tuple2<int[], java.lang.Object>> run (org.apache.spark.mllib.fpm.PrefixSpan.Postfix[] postfixes)  { throw new RuntimeException(); }
}

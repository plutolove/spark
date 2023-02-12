package org.apache.spark.util;
/** No-arg constructor for serialization */
public  class MutablePair<T1 extends java.lang.Object, T2 extends java.lang.Object> implements scala.Product2<T1, T2>, scala.Product, scala.Serializable {
  public  T1 _1 ()  { throw new RuntimeException(); }
  public  T2 _2 ()  { throw new RuntimeException(); }
  // not preceding
  public   MutablePair (T1 _1, T2 _2)  { throw new RuntimeException(); }
  // not preceding
  public   MutablePair ()  { throw new RuntimeException(); }
  /** Updates this pair with new values and returns itself */
  public  org.apache.spark.util.MutablePair<T1, T2> update (T1 n1, T2 n2)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  boolean canEqual (Object that)  { throw new RuntimeException(); }
}

package org.apache.spark;
public  class ImplicitOrderingSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext {
  // not preceding
  static public  class NonOrderedClass {
    // not preceding
    public   NonOrderedClass ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class ComparableClass implements java.lang.Comparable<org.apache.spark.ImplicitOrderingSuite.ComparableClass> {
    // not preceding
    public   ComparableClass ()  { throw new RuntimeException(); }
    // not preceding
    public  int compareTo (org.apache.spark.ImplicitOrderingSuite.ComparableClass o)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class OrderedClass implements scala.math.Ordered<org.apache.spark.ImplicitOrderingSuite.OrderedClass> {
    // not preceding
    public   OrderedClass ()  { throw new RuntimeException(); }
    // not preceding
    public  int compare (org.apache.spark.ImplicitOrderingSuite.OrderedClass o)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  scala.collection.immutable.List<scala.Tuple2<java.lang.Object, java.lang.String>> basicMapExpectations (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.List<scala.Tuple2<java.lang.Object, java.lang.String>> otherRDDMethodExpectations (org.apache.spark.rdd.RDD<java.lang.Object> rdd)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  // not preceding
  public   ImplicitOrderingSuite ()  { throw new RuntimeException(); }
}

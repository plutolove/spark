package org.apache.spark.rdd;
// not preceding
public  class RDDSuiteUtils {
  // not preceding
  static public  class Person implements scala.Product, scala.Serializable {
    // not preceding
    public  java.lang.String first ()  { throw new RuntimeException(); }
    public  java.lang.String last ()  { throw new RuntimeException(); }
    public  int age ()  { throw new RuntimeException(); }
    // not preceding
    public   Person (java.lang.String first, java.lang.String last, int age)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class Person$ extends scala.runtime.AbstractFunction3<java.lang.String, java.lang.String, java.lang.Object, org.apache.spark.rdd.RDDSuiteUtils.Person> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Person$ MODULE$ = null;
    public   Person$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class AgeOrdering$ implements scala.math.Ordering<org.apache.spark.rdd.RDDSuiteUtils.Person> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AgeOrdering$ MODULE$ = null;
    public   AgeOrdering$ ()  { throw new RuntimeException(); }
    // not preceding
    public  int compare (org.apache.spark.rdd.RDDSuiteUtils.Person a, org.apache.spark.rdd.RDDSuiteUtils.Person b)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class NameOrdering$ implements scala.math.Ordering<org.apache.spark.rdd.RDDSuiteUtils.Person> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NameOrdering$ MODULE$ = null;
    public   NameOrdering$ ()  { throw new RuntimeException(); }
    // not preceding
    public  int compare (org.apache.spark.rdd.RDDSuiteUtils.Person a, org.apache.spark.rdd.RDDSuiteUtils.Person b)  { throw new RuntimeException(); }
  }
}

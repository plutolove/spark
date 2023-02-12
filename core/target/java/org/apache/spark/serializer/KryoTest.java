package org.apache.spark.serializer;
// not preceding
public  class KryoTest {
  // not preceding
  static public  class CaseClass implements scala.Product, scala.Serializable {
    // not preceding
    public  int i ()  { throw new RuntimeException(); }
    public  java.lang.String s ()  { throw new RuntimeException(); }
    // not preceding
    public   CaseClass (int i, java.lang.String s)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class CaseClass$ extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.String, org.apache.spark.serializer.KryoTest.CaseClass> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CaseClass$ MODULE$ = null;
    public   CaseClass$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class ClassWithNoArgConstructor {
    // not preceding
    public   ClassWithNoArgConstructor ()  { throw new RuntimeException(); }
    public  boolean equals (Object other)  { throw new RuntimeException(); }
    public  int hashCode ()  { throw new RuntimeException(); }
    // not preceding
    public  int x ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class ClassWithoutNoArgConstructor {
    // not preceding
    public   ClassWithoutNoArgConstructor (int x)  { throw new RuntimeException(); }
    public  boolean equals (Object other)  { throw new RuntimeException(); }
    // not preceding
    public  int hashCode ()  { throw new RuntimeException(); }
    // not preceding
    public  int x ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class MyRegistrator implements org.apache.spark.serializer.KryoRegistrator {
    // not preceding
    public   MyRegistrator ()  { throw new RuntimeException(); }
    // not preceding
    public  void registerClasses (com.esotericsoftware.kryo.Kryo k)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class RegistratorWithoutAutoReset implements org.apache.spark.serializer.KryoRegistrator {
    // not preceding
    public   RegistratorWithoutAutoReset ()  { throw new RuntimeException(); }
    // not preceding
    public  void registerClasses (com.esotericsoftware.kryo.Kryo k)  { throw new RuntimeException(); }
  }
}

package org.apache.spark.sql;
/**
 * A class used to test serialization using encoders. This class throws exceptions when using
 * Java serialization -- so the only way it can be "serialized" is through our encoders.
 */
public  class NonSerializableCaseClass implements java.io.Externalizable, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String value ()  { throw new RuntimeException(); }
  // not preceding
  public   NonSerializableCaseClass (java.lang.String value)  { throw new RuntimeException(); }
  // not preceding
  public  void readExternal (java.io.ObjectInput in)  { throw new RuntimeException(); }
  public  void writeExternal (java.io.ObjectOutput out)  { throw new RuntimeException(); }
}

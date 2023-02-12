package org.apache.spark.sql.types;
/** No-arg constructor for kryo. */
public  class Metadata implements scala.Serializable {
  // not preceding
  static public  org.apache.spark.sql.types.Metadata empty ()  { throw new RuntimeException(); }
  /** Creates a Metadata instance from JSON. */
  static public  org.apache.spark.sql.types.Metadata fromJson (java.lang.String json)  { throw new RuntimeException(); }
  /** Creates a Metadata instance from JSON AST. */
  static   org.apache.spark.sql.types.Metadata fromJObject (org.json4s.JsonAST.JObject jObj)  { throw new RuntimeException(); }
  // not preceding
    scala.collection.immutable.Map<java.lang.String, java.lang.Object> map ()  { throw new RuntimeException(); }
  // not preceding
     Metadata (scala.collection.immutable.Map<java.lang.String, java.lang.Object> map)  { throw new RuntimeException(); }
  // not preceding
  protected   Metadata ()  { throw new RuntimeException(); }
  /** Tests whether this Metadata contains a binding for a key. */
  public  boolean contains (java.lang.String key)  { throw new RuntimeException(); }
  /** Gets a Long. */
  public  long getLong (java.lang.String key)  { throw new RuntimeException(); }
  /** Gets a Double. */
  public  double getDouble (java.lang.String key)  { throw new RuntimeException(); }
  /** Gets a Boolean. */
  public  boolean getBoolean (java.lang.String key)  { throw new RuntimeException(); }
  /** Gets a String. */
  public  java.lang.String getString (java.lang.String key)  { throw new RuntimeException(); }
  /** Gets a Metadata. */
  public  org.apache.spark.sql.types.Metadata getMetadata (java.lang.String key)  { throw new RuntimeException(); }
  /** Gets a Long array. */
  public  long[] getLongArray (java.lang.String key)  { throw new RuntimeException(); }
  /** Gets a Double array. */
  public  double[] getDoubleArray (java.lang.String key)  { throw new RuntimeException(); }
  /** Gets a Boolean array. */
  public  boolean[] getBooleanArray (java.lang.String key)  { throw new RuntimeException(); }
  /** Gets a String array. */
  public  java.lang.String[] getStringArray (java.lang.String key)  { throw new RuntimeException(); }
  /** Gets a Metadata array. */
  public  org.apache.spark.sql.types.Metadata[] getMetadataArray (java.lang.String key)  { throw new RuntimeException(); }
  /** Converts to its JSON representation. */
  public  java.lang.String json ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  public  boolean equals (Object obj)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
    org.json4s.JsonAST.JValue jsonValue ()  { throw new RuntimeException(); }
}

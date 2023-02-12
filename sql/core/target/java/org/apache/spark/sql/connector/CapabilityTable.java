package org.apache.spark.sql.connector;
public  class CapabilityTable implements org.apache.spark.sql.connector.catalog.Table, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.connector.catalog.TableCapability> _capabilities ()  { throw new RuntimeException(); }
  // not preceding
  public   CapabilityTable (scala.collection.Seq<org.apache.spark.sql.connector.catalog.TableCapability> _capabilities)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  public  java.util.Set<org.apache.spark.sql.connector.catalog.TableCapability> capabilities ()  { throw new RuntimeException(); }
}

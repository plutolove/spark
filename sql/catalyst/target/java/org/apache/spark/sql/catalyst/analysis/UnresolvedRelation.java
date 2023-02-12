package org.apache.spark.sql.catalyst.analysis;
/** Returns a `.` separated name for this relation. */
public  class UnresolvedRelation extends org.apache.spark.sql.catalyst.plans.logical.LeafNode implements org.apache.spark.sql.catalyst.analysis.NamedRelation, scala.Product, scala.Serializable {
  // not preceding
  static public  org.apache.spark.sql.catalyst.analysis.UnresolvedRelation apply (org.apache.spark.sql.catalyst.TableIdentifier tableIdentifier)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<java.lang.String> multipartIdentifier ()  { throw new RuntimeException(); }
  // not preceding
  public   UnresolvedRelation (scala.collection.Seq<java.lang.String> multipartIdentifier)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String tableName ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
}

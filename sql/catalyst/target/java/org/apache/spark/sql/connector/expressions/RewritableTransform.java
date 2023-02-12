package org.apache.spark.sql.connector.expressions;
/** Creates a copy of this transform with the new analyzed references. */
public  interface RewritableTransform extends org.apache.spark.sql.connector.expressions.Transform {
  // not preceding
  public  org.apache.spark.sql.connector.expressions.Transform withReferences (scala.collection.Seq<org.apache.spark.sql.connector.expressions.NamedReference> newReferences)  ;
}

package org.apache.spark.sql.catalyst.plans.logical;
// not preceding
public  class CoGroup extends org.apache.spark.sql.catalyst.plans.logical.BinaryNode implements org.apache.spark.sql.catalyst.plans.logical.ObjectProducer, scala.Product, scala.Serializable {
  // not preceding
  static public <K extends java.lang.Object, L extends java.lang.Object, R extends java.lang.Object, OUT extends java.lang.Object> org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (scala.Function3<K, scala.collection.Iterator<L>, scala.collection.Iterator<R>, scala.collection.TraversableOnce<OUT>> func, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> leftGroup, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> rightGroup, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> leftAttr, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> rightAttr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right, org.apache.spark.sql.Encoder<K> evidence$20, org.apache.spark.sql.Encoder<L> evidence$21, org.apache.spark.sql.Encoder<R> evidence$22, org.apache.spark.sql.Encoder<OUT> evidence$23)  { throw new RuntimeException(); }
  // not preceding
  public  scala.Function3<java.lang.Object, scala.collection.Iterator<java.lang.Object>, scala.collection.Iterator<java.lang.Object>, scala.collection.TraversableOnce<java.lang.Object>> func ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression keyDeserializer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression leftDeserializer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression rightDeserializer ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> leftGroup ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> rightGroup ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> leftAttr ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> rightAttr ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Attribute outputObjAttr ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right ()  { throw new RuntimeException(); }
  // not preceding
  public   CoGroup (scala.Function3<java.lang.Object, scala.collection.Iterator<java.lang.Object>, scala.collection.Iterator<java.lang.Object>, scala.collection.TraversableOnce<java.lang.Object>> func, org.apache.spark.sql.catalyst.expressions.Expression keyDeserializer, org.apache.spark.sql.catalyst.expressions.Expression leftDeserializer, org.apache.spark.sql.catalyst.expressions.Expression rightDeserializer, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> leftGroup, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> rightGroup, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> leftAttr, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> rightAttr, org.apache.spark.sql.catalyst.expressions.Attribute outputObjAttr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right)  { throw new RuntimeException(); }
}
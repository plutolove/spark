package org.apache.spark.sql.catalyst.expressions;
/** No-arg constructor for serialization. */
public  class GenericInternalRow extends org.apache.spark.sql.catalyst.InternalRow implements org.apache.spark.sql.catalyst.expressions.BaseGenericInternalRow {
  // not preceding
  public   GenericInternalRow (java.lang.Object[] values)  { throw new RuntimeException(); }
  // not preceding
  protected   GenericInternalRow ()  { throw new RuntimeException(); }
  public   GenericInternalRow (int size)  { throw new RuntimeException(); }
  protected  Object genericGet (int ordinal)  { throw new RuntimeException(); }
  public  int numFields ()  { throw new RuntimeException(); }
  public  void setNullAt (int i)  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> toSeq (scala.collection.Seq<org.apache.spark.sql.types.DataType> fieldTypes)  { throw new RuntimeException(); }
  public  void update (int i, Object value)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.Object[] values ()  { throw new RuntimeException(); }
}

package org.apache.spark.sql;
public  class CloseableColumnBatchIterator implements scala.collection.Iterator<org.apache.spark.sql.vectorized.ColumnarBatch>, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Iterator<org.apache.spark.sql.vectorized.ColumnarBatch> itr ()  { throw new RuntimeException(); }
  public  scala.Function1<org.apache.spark.sql.vectorized.ColumnarBatch, org.apache.spark.sql.vectorized.ColumnarBatch> f ()  { throw new RuntimeException(); }
  // not preceding
  public   CloseableColumnBatchIterator (scala.collection.Iterator<org.apache.spark.sql.vectorized.ColumnarBatch> itr, scala.Function1<org.apache.spark.sql.vectorized.ColumnarBatch, org.apache.spark.sql.vectorized.ColumnarBatch> f)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.vectorized.ColumnarBatch cb ()  { throw new RuntimeException(); }
  public  boolean hasNext ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.vectorized.ColumnarBatch next ()  { throw new RuntimeException(); }
}

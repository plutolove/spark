package org.apache.spark.mllib.linalg;
/**
 * Convert this matrix to the new mllib-local representation.
 * This does NOT copy the data; it copies references.
 */
  class MatrixUDT extends org.apache.spark.sql.types.UserDefinedType<org.apache.spark.mllib.linalg.Matrix> {
  // not preceding
  public   MatrixUDT ()  { throw new RuntimeException(); }
    org.apache.spark.mllib.linalg.MatrixUDT asNullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Matrix deserialize (Object datum)  { throw new RuntimeException(); }
  public  boolean equals (Object o)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  java.lang.String pyUDT ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow serialize (org.apache.spark.mllib.linalg.Matrix obj)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.types.StructType sqlType ()  { throw new RuntimeException(); }
  public  java.lang.String typeName ()  { throw new RuntimeException(); }
  public  java.lang.Class<org.apache.spark.mllib.linalg.Matrix> userClass ()  { throw new RuntimeException(); }
}

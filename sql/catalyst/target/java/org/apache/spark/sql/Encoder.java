package org.apache.spark.sql;
/** Returns the schema of encoding this type of object as a Row. */
public  interface Encoder<T extends java.lang.Object> extends scala.Serializable {
  /**
   * A ClassTag that can be used to construct an Array to contain a collection of <code>T</code>.
   * @return (undocumented)
   */
  public  scala.reflect.ClassTag<T> clsTag ()  ;
  /** Returns the schema of encoding this type of object as a Row. */
  public  org.apache.spark.sql.types.StructType schema ()  ;
}

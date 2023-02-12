package org.apache.spark.sql.catalyst.expressions;
/** The position of an element within the collection should also be returned. */
public  interface CollectionGenerator extends org.apache.spark.sql.catalyst.expressions.Generator {
  /** The type of the returned collection object. */
  public  org.apache.spark.sql.types.DataType collectionType ()  ;
  /** Rows will be inlined during generation. */
  public  boolean inline ()  ;
  /** The position of an element within the collection should also be returned. */
  public  boolean position ()  ;
}

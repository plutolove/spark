package org.apache.spark.sql.catalyst.expressions;
/**
 * The output element schema.
 */
public  interface Generator {
  public  org.apache.spark.sql.types.DataType dataType ()  ;
  /**
   * The output element schema.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType elementSchema ()  ;
  /** Should be implemented by child classes to perform specific Generators. */
  public  scala.collection.TraversableOnce<org.apache.spark.sql.catalyst.InternalRow> eval (org.apache.spark.sql.catalyst.InternalRow input)  ;
  public  boolean foldable ()  ;
  public  boolean nullable ()  ;
  /**
   * Check if this generator supports code generation.
   * @return (undocumented)
   */
  public  boolean supportCodegen ()  ;
  /**
   * Notifies that there are no more rows to process, clean up code, and additional
   * rows can be made here.
   * @return (undocumented)
   */
  public  scala.collection.TraversableOnce<org.apache.spark.sql.catalyst.InternalRow> terminate ()  ;
}

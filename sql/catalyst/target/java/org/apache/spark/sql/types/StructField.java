package org.apache.spark.sql.types;
/** No-arg constructor for kryo. */
public  class StructField implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  // not preceding
  public  java.lang.String name ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.Metadata metadata ()  { throw new RuntimeException(); }
  // not preceding
  public   StructField (java.lang.String name, org.apache.spark.sql.types.DataType dataType, boolean nullable, org.apache.spark.sql.types.Metadata metadata)  { throw new RuntimeException(); }
  // not preceding
  protected   StructField ()  { throw new RuntimeException(); }
    void buildFormattedString (java.lang.String prefix, org.apache.spark.sql.catalyst.util.StringUtils.StringConcat stringConcat, int maxDepth)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
    org.json4s.JsonAST.JValue jsonValue ()  { throw new RuntimeException(); }
  /**
   * Updates the StructField with a new comment value.
   * @param comment (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructField withComment (java.lang.String comment)  { throw new RuntimeException(); }
  /**
   * Return the comment of this StructField.
   * @return (undocumented)
   */
  public  scala.Option<java.lang.String> getComment ()  { throw new RuntimeException(); }
  /**
   * Returns a string containing a schema in DDL format. For example, the following value:
   * <code>StructField("eventId", IntegerType)</code> will be converted to <code>eventId</code> INT.
   * <p>
   * @since 2.4.0
   * @return (undocumented)
   */
  public  java.lang.String toDDL ()  { throw new RuntimeException(); }
}

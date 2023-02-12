package org.apache.spark.sql.execution.datasources.orc;
/**
 * Return true if this is a searchable type in ORC.
 * Both CharType and VarcharType are cleaned at AstBuilder.
 */
public  interface OrcFiltersBase {
  public  class OrcPrimitiveField implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String fieldName ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.DataType fieldType ()  { throw new RuntimeException(); }
    // not preceding
    public   OrcPrimitiveField (java.lang.String fieldName, org.apache.spark.sql.types.DataType fieldType)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class OrcPrimitiveField$ extends scala.runtime.AbstractFunction2<java.lang.String, org.apache.spark.sql.types.DataType, org.apache.spark.sql.execution.datasources.orc.OrcFiltersBase.OrcPrimitiveField> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final OrcPrimitiveField$ MODULE$ = null;
    public   OrcPrimitiveField$ ()  { throw new RuntimeException(); }
  }
    scala.Option<org.apache.spark.sql.sources.Filter> buildTree (scala.collection.Seq<org.apache.spark.sql.sources.Filter> filters)  ;
  // not preceding
    scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.datasources.orc.OrcFiltersBase.OrcPrimitiveField> getDataTypeMap (org.apache.spark.sql.types.StructType schema, boolean caseSensitive)  ;
  /**
   * Return true if this is a searchable type in ORC.
   * Both CharType and VarcharType are cleaned at AstBuilder.
   * @param dataType (undocumented)
   * @return (undocumented)
   */
  public  boolean isSearchableType (org.apache.spark.sql.types.DataType dataType)  ;
}

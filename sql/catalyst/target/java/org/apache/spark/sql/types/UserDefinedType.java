package org.apache.spark.sql.types;
/** Underlying storage type for this UDT */
 abstract class UserDefinedType<UserType extends java.lang.Object> extends org.apache.spark.sql.types.DataType implements scala.Serializable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Ident(scala), scala.Null)), TypeTree()))
  public   UserDefinedType ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  org.apache.spark.sql.types.DataType sqlType ()  ;
  /** Paired Python UDT class, if exists. */
  public  java.lang.String pyUDT ()  { throw new RuntimeException(); }
  /** Serialized Python UDT class, if exists. */
  public  java.lang.String serializedPyClass ()  { throw new RuntimeException(); }
  /**
   * Convert the user type to a SQL datum
   * @param obj (undocumented)
   * @return (undocumented)
   */
  public abstract  Object serialize (UserType obj)  ;
  /** Convert a SQL datum to the user type */
  public abstract  UserType deserialize (Object datum)  ;
    org.json4s.JsonAST.JValue jsonValue ()  { throw new RuntimeException(); }
  /**
   * Class object for the UserType
   * @return (undocumented)
   */
  public abstract  java.lang.Class<UserType> userClass ()  ;
  public  int defaultSize ()  { throw new RuntimeException(); }
  /**
   * For UDT, asNullable will not change the nullability of its internal sqlType and just returns
   * itself.
   * @return (undocumented)
   */
    org.apache.spark.sql.types.UserDefinedType<UserType> asNullable ()  { throw new RuntimeException(); }
    boolean acceptsType (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  public  java.lang.String sql ()  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  public  java.lang.String catalogString ()  { throw new RuntimeException(); }
}

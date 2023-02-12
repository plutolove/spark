package org.apache.spark.sql.execution.datasources.v2;
/**
 * Physical plan node for renaming a table.
 */
public  class RenameTableExec extends org.apache.spark.sql.execution.datasources.v2.V2CommandExec implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.catalog.TableCatalog catalog ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Identifier oldIdent ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Identifier newIdent ()  { throw new RuntimeException(); }
  // not preceding
  public   RenameTableExec (org.apache.spark.sql.connector.catalog.TableCatalog catalog, org.apache.spark.sql.connector.catalog.Identifier oldIdent, org.apache.spark.sql.connector.catalog.Identifier newIdent)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.InternalRow> run ()  { throw new RuntimeException(); }
}

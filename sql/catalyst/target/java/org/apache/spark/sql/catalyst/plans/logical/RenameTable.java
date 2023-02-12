package org.apache.spark.sql.catalyst.plans.logical;
/**
 * The logical plan of the ALTER TABLE RENAME command that works for v2 tables.
 */
public  class RenameTable extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.Command, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.catalog.TableCatalog catalog ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Identifier oldIdent ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Identifier newIdent ()  { throw new RuntimeException(); }
  // not preceding
  public   RenameTable (org.apache.spark.sql.connector.catalog.TableCatalog catalog, org.apache.spark.sql.connector.catalog.Identifier oldIdent, org.apache.spark.sql.connector.catalog.Identifier newIdent)  { throw new RuntimeException(); }
}

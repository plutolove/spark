package org.apache.spark.sql.catalyst.analysis;
/**
 * Resolves catalogs from the multi-part identifiers in SQL statements, and convert the statements
 * to the corresponding v1 or v2 commands if the resolved catalog is the session catalog.
 * <p>
 * We can remove this rule once we implement all the catalog functionality in <code>V2SessionCatalog</code>.
 */
public  class ResolveSessionCatalog extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.connector.catalog.LookupCatalog {
  // not preceding
  public  class SessionCatalogAndTable {
    // not preceding
    static public  scala.Option<scala.Tuple2<org.apache.spark.sql.connector.catalog.CatalogPlugin, scala.collection.Seq<java.lang.String>>> unapply (scala.collection.Seq<java.lang.String> nameParts)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class SessionCatalogAndTable$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SessionCatalogAndTable$ MODULE$ = null;
    public   SessionCatalogAndTable$ ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.Option<scala.Tuple2<org.apache.spark.sql.connector.catalog.CatalogPlugin, scala.collection.Seq<java.lang.String>>> unapply (scala.collection.Seq<java.lang.String> nameParts)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class TempViewOrV1Table {
    // not preceding
    static public  scala.Option<scala.collection.Seq<java.lang.String>> unapply (scala.collection.Seq<java.lang.String> nameParts)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class TempViewOrV1Table$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TempViewOrV1Table$ MODULE$ = null;
    public   TempViewOrV1Table$ ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.Option<scala.collection.Seq<java.lang.String>> unapply (scala.collection.Seq<java.lang.String> nameParts)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class SessionCatalogAndNamespace {
    // not preceding
    static public  scala.Option<scala.Tuple2<org.apache.spark.sql.connector.catalog.CatalogPlugin, scala.collection.Seq<java.lang.String>>> unapply (org.apache.spark.sql.catalyst.analysis.ResolvedNamespace resolved)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class SessionCatalogAndNamespace$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SessionCatalogAndNamespace$ MODULE$ = null;
    public   SessionCatalogAndNamespace$ ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.Option<scala.Tuple2<org.apache.spark.sql.connector.catalog.CatalogPlugin, scala.collection.Seq<java.lang.String>>> unapply (org.apache.spark.sql.catalyst.analysis.ResolvedNamespace resolved)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.AsTableIdentifier$ AsTableIdentifier ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.CatalogAndIdentifier$ CatalogAndIdentifier ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.CatalogAndNamespace$ CatalogAndNamespace ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.NonSessionCatalogAndIdentifier$ NonSessionCatalogAndIdentifier ()  { throw new RuntimeException(); }
  // not preceding
  public   ResolveSessionCatalog (org.apache.spark.sql.connector.catalog.CatalogManager catalogManager, org.apache.spark.sql.internal.SQLConf conf, scala.Function1<scala.collection.Seq<java.lang.String>, java.lang.Object> isTempView, scala.Function1<java.lang.String, java.lang.Object> isTempFunction)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.SessionCatalogAndIdentifier$ SessionCatalogAndIdentifier ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.ResolveSessionCatalog.SessionCatalogAndNamespace$ SessionCatalogAndNamespace ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.ResolveSessionCatalog.SessionCatalogAndTable$ SessionCatalogAndTable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.ResolveSessionCatalog.TempViewOrV1Table$ TempViewOrV1Table ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.catalog.CatalogManager catalogManager ()  { throw new RuntimeException(); }
}

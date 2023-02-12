package org.apache.spark.sql.connector.catalog;
/**
 * Returns the current catalog set.
 */
public  interface LookupCatalog extends org.apache.spark.internal.Logging {
  // not preceding
  // not preceding
  public  class SessionCatalogAndIdentifier {
    // not preceding
    static public  scala.Option<scala.Tuple2<org.apache.spark.sql.connector.catalog.CatalogPlugin, org.apache.spark.sql.connector.catalog.Identifier>> unapply (scala.collection.Seq<java.lang.String> parts)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class SessionCatalogAndIdentifier$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SessionCatalogAndIdentifier$ MODULE$ = null;
    public   SessionCatalogAndIdentifier$ ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.Option<scala.Tuple2<org.apache.spark.sql.connector.catalog.CatalogPlugin, org.apache.spark.sql.connector.catalog.Identifier>> unapply (scala.collection.Seq<java.lang.String> parts)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class NonSessionCatalogAndIdentifier {
    // not preceding
    static public  scala.Option<scala.Tuple2<org.apache.spark.sql.connector.catalog.CatalogPlugin, org.apache.spark.sql.connector.catalog.Identifier>> unapply (scala.collection.Seq<java.lang.String> parts)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class NonSessionCatalogAndIdentifier$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NonSessionCatalogAndIdentifier$ MODULE$ = null;
    public   NonSessionCatalogAndIdentifier$ ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.Option<scala.Tuple2<org.apache.spark.sql.connector.catalog.CatalogPlugin, org.apache.spark.sql.connector.catalog.Identifier>> unapply (scala.collection.Seq<java.lang.String> parts)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class CatalogAndNamespace {
    // not preceding
    static public  scala.Some<scala.Tuple2<org.apache.spark.sql.connector.catalog.CatalogPlugin, scala.collection.Seq<java.lang.String>>> unapply (scala.collection.Seq<java.lang.String> nameParts)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class CatalogAndNamespace$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CatalogAndNamespace$ MODULE$ = null;
    public   CatalogAndNamespace$ ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.Some<scala.Tuple2<org.apache.spark.sql.connector.catalog.CatalogPlugin, scala.collection.Seq<java.lang.String>>> unapply (scala.collection.Seq<java.lang.String> nameParts)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class CatalogAndIdentifier {
    static public  scala.Option<scala.Tuple2<org.apache.spark.sql.connector.catalog.CatalogPlugin, org.apache.spark.sql.connector.catalog.Identifier>> unapply (scala.collection.Seq<java.lang.String> nameParts)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class CatalogAndIdentifier$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CatalogAndIdentifier$ MODULE$ = null;
    public   CatalogAndIdentifier$ ()  { throw new RuntimeException(); }
    public  scala.Option<scala.Tuple2<org.apache.spark.sql.connector.catalog.CatalogPlugin, org.apache.spark.sql.connector.catalog.Identifier>> unapply (scala.collection.Seq<java.lang.String> nameParts)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class AsTableIdentifier {
    // not preceding
    static public  scala.Option<org.apache.spark.sql.catalyst.TableIdentifier> unapply (scala.collection.Seq<java.lang.String> parts)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  public  class AsTableIdentifier$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AsTableIdentifier$ MODULE$ = null;
    public   AsTableIdentifier$ ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.Option<org.apache.spark.sql.catalyst.TableIdentifier> unapply (scala.collection.Seq<java.lang.String> parts)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.AsTableIdentifier$ AsTableIdentifier ()  ;
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.CatalogAndIdentifier$ CatalogAndIdentifier ()  ;
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.CatalogAndMultipartIdentifier$ CatalogAndMultipartIdentifier ()  ;
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.CatalogAndNamespace$ CatalogAndNamespace ()  ;
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.NonSessionCatalogAndIdentifier$ NonSessionCatalogAndIdentifier ()  ;
  public  org.apache.spark.sql.connector.catalog.LookupCatalog.SessionCatalogAndIdentifier$ SessionCatalogAndIdentifier ()  ;
  public  org.apache.spark.sql.connector.catalog.CatalogManager catalogManager ()  ;
  /**
   * Returns the current catalog set.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.connector.catalog.CatalogPlugin currentCatalog ()  ;
}

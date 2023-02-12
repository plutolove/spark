package org.apache.spark.sql.catalyst.parser;
/** Throws error message when exiting a explicitly captured wrong identifier rule */
// not preceding
public  class PostProcessor$ extends org.apache.spark.sql.catalyst.parser.SqlBaseBaseListener implements scala.Product, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PostProcessor$ MODULE$ = null;
  public   PostProcessor$ ()  { throw new RuntimeException(); }
  // not preceding
  public  void exitErrorIdent (org.apache.spark.sql.catalyst.parser.SqlBaseParser.ErrorIdentContext ctx)  { throw new RuntimeException(); }
  /** Remove the back ticks from an Identifier. */
  public  void exitQuotedIdentifier (org.apache.spark.sql.catalyst.parser.SqlBaseParser.QuotedIdentifierContext ctx)  { throw new RuntimeException(); }
  /** Treat non-reserved keywords as Identifiers. */
  public  void exitNonReserved (org.apache.spark.sql.catalyst.parser.SqlBaseParser.NonReservedContext ctx)  { throw new RuntimeException(); }
}

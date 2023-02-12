package org.apache.spark.sql.catalyst.parser;
/**
 * Parse a string to a {@link LogicalPlan}.
 */
public  interface ParserInterface {
  /**
   * Parse a string to a {@link DataType}.
   * @param sqlText (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.DataType parseDataType (java.lang.String sqlText) throws org.apache.spark.sql.catalyst.parser.ParseException ;
  /**
   * Parse a string to an {@link Expression}.
   * @param sqlText (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Expression parseExpression (java.lang.String sqlText) throws org.apache.spark.sql.catalyst.parser.ParseException ;
  /**
   * Parse a string to a {@link FunctionIdentifier}.
   * @param sqlText (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.FunctionIdentifier parseFunctionIdentifier (java.lang.String sqlText) throws org.apache.spark.sql.catalyst.parser.ParseException ;
  /**
   * Parse a string to a multi-part identifier.
   * @param sqlText (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> parseMultipartIdentifier (java.lang.String sqlText) throws org.apache.spark.sql.catalyst.parser.ParseException ;
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan parsePlan (java.lang.String sqlText) throws org.apache.spark.sql.catalyst.parser.ParseException ;
  /**
   * Parse a string to a raw {@link DataType} without CHAR/VARCHAR replacement.
   * @param sqlText (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.DataType parseRawDataType (java.lang.String sqlText) throws org.apache.spark.sql.catalyst.parser.ParseException ;
  /**
   * Parse a string to a {@link TableIdentifier}.
   * @param sqlText (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.TableIdentifier parseTableIdentifier (java.lang.String sqlText) throws org.apache.spark.sql.catalyst.parser.ParseException ;
  /**
   * Parse a string to a {@link StructType}. The passed SQL string should be a comma separated list
   * of field definitions which will preserve the correct Hive metadata.
   * @param sqlText (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType parseTableSchema (java.lang.String sqlText) throws org.apache.spark.sql.catalyst.parser.ParseException ;
}

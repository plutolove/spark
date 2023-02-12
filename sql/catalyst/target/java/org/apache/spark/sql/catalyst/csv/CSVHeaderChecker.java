package org.apache.spark.sql.catalyst.csv;
/**
 * Checks that column names in a CSV header and field names in the schema are the same
 * by taking into account case sensitivity.
 * <p>
 * param:  columnNames names of CSV columns that must be checked against to the schema.
 */
public  class CSVHeaderChecker implements org.apache.spark.internal.Logging {
  // not preceding
  public   CSVHeaderChecker (org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.catalyst.csv.CSVOptions options, java.lang.String source, boolean isStartOfFile)  { throw new RuntimeException(); }
  public  void checkHeaderColumnNames (java.lang.String line)  { throw new RuntimeException(); }
    void checkHeaderColumnNames (com.univocity.parsers.csv.CsvParser tokenizer)  { throw new RuntimeException(); }
    void checkHeaderColumnNames (scala.collection.Iterator<java.lang.String> lines, com.univocity.parsers.csv.CsvParser tokenizer)  { throw new RuntimeException(); }
}

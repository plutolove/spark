package org.apache.spark.sql.catalyst.json;
/**
 * Transforms a single <code>InternalRow</code> to JSON object using Jackson.
 * This api calling will be validated through accessing <code>rootFieldWriters</code>.
 * <p>
 * param:  row The row to convert
 */
  class JacksonGenerator {
  // not preceding
  public   JacksonGenerator (org.apache.spark.sql.types.DataType dataType, java.io.Writer writer, org.apache.spark.sql.catalyst.json.JSONOptions options)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  void flush ()  { throw new RuntimeException(); }
  /**
   * Transforms a single <code>InternalRow</code> to JSON object using Jackson.
   * This api calling will be validated through accessing <code>rootFieldWriters</code>.
   * <p>
   * @param row The row to convert
   */
  public  void write (org.apache.spark.sql.catalyst.InternalRow row)  { throw new RuntimeException(); }
  /**
   * Transforms multiple <code>InternalRow</code>s or <code>MapData</code>s to JSON array using Jackson
   * <p>
   * @param array The array of rows or maps to convert
   */
  public  void write (org.apache.spark.sql.catalyst.util.ArrayData array)  { throw new RuntimeException(); }
  /**
   * Transforms a single <code>MapData</code> to JSON object using Jackson
   * This api calling will will be validated through accessing <code>mapElementWriter</code>.
   * <p>
   * @param map a map to convert
   */
  public  void write (org.apache.spark.sql.catalyst.util.MapData map)  { throw new RuntimeException(); }
  public  void writeLineEnding ()  { throw new RuntimeException(); }
}

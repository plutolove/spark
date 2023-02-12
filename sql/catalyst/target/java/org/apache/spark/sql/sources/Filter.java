package org.apache.spark.sql.sources;
/**
 * List of columns that are referenced by this filter.
 * <p>
 * Note that, each element in <code>references</code> represents a column; <code>dots</code> are used as separators
 * for nested columns. If any part of the names contains <code>dots</code>, it is quoted to avoid confusion.
 * <p>
 * @since 2.1.0
 */
public abstract class Filter {
  // not preceding
  public   Filter ()  { throw new RuntimeException(); }
  /**
   * If any of the references of this filter contains nested column
   * @return (undocumented)
   */
    boolean containsNestedColumn ()  { throw new RuntimeException(); }
  protected  java.lang.String[] findReferences (Object value)  { throw new RuntimeException(); }
  // not preceding
  public abstract  java.lang.String[] references ()  ;
  /**
   * List of columns that are referenced by this filter.
   * <p>
   * @return each element is a column name as an array of string multi-identifier
   * @since 3.0.0
   */
  public  java.lang.String[][] v2references ()  { throw new RuntimeException(); }
}

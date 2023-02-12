package org.apache.spark.ui;
/**
 * Return the size of all data.
 */
 abstract class PagedDataSource<T extends java.lang.Object> {
  // not preceding
  public   PagedDataSource (int pageSize)  { throw new RuntimeException(); }
  // not preceding
  protected abstract  int dataSize ()  ;
  /**
   * Slice the data for this page
   * @param page (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ui.PageData<T> pageData (int page)  { throw new RuntimeException(); }
  public  int pageSize ()  { throw new RuntimeException(); }
  /**
   * Slice a range of data.
   * @param from (undocumented)
   * @param to (undocumented)
   * @return (undocumented)
   */
  protected abstract  scala.collection.Seq<T> sliceData (int from, int to)  ;
}

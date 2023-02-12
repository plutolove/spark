package org.apache.spark.sql;
/** @since 1.6.0 */
public  interface LowPrioritySQLImplicits {
  /** @since 1.6.0 */
  public <T extends scala.Product> org.apache.spark.sql.Encoder<T> newProductEncoder (scala.reflect.api.TypeTags.TypeTag<T> evidence$8)  ;
}

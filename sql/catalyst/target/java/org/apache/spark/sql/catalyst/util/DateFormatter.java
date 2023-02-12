package org.apache.spark.sql.catalyst.util;
public  interface DateFormatter extends scala.Serializable {
  // not preceding
  public  int parse (java.lang.String s)  ;
  public  java.lang.String format (int days)  ;
  public  java.lang.String format (java.util.Date date)  ;
  public  java.lang.String format (java.time.LocalDate localDate)  ;
  public  void validatePatternString ()  ;
}

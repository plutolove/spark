package org.apache.spark.sql.catalyst.util;
/**
 * Helper functions for testing date and time functionality.
 */
// not preceding
public  class DateTimeTestUtils$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DateTimeTestUtils$ MODULE$ = null;
  public   DateTimeTestUtils$ ()  { throw new RuntimeException(); }
  // not preceding
  public  java.time.ZoneId CEST ()  { throw new RuntimeException(); }
  public  java.time.ZoneId CET ()  { throw new RuntimeException(); }
  public  java.time.ZoneId JST ()  { throw new RuntimeException(); }
  public  java.time.ZoneId LA ()  { throw new RuntimeException(); }
  public  java.time.ZoneId MIT ()  { throw new RuntimeException(); }
  public  java.time.ZoneId PST ()  { throw new RuntimeException(); }
  public  java.time.ZoneId UTC ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> UTC_OPT ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.time.ZoneId> ALL_TIMEZONES ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> outstandingTimezonesIds ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.time.ZoneId> outstandingZoneIds ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> T withDefaultTimeZone (java.time.ZoneId newDefaultTimeZone, scala.Function0<T> block)  { throw new RuntimeException(); }
  public  long localDateTimeToMicros (java.time.LocalDateTime localDateTime, java.time.ZoneId zoneId)  { throw new RuntimeException(); }
  public  long date (int year, byte month, byte day, byte hour, byte minute, byte sec, int micros, java.time.ZoneId zid)  { throw new RuntimeException(); }
  public  int days (int year, byte month, byte day)  { throw new RuntimeException(); }
  public  long time (byte hour, byte minute, byte sec, int micros, java.time.ZoneId zid)  { throw new RuntimeException(); }
  public  long secFrac (int seconds, int milliseconds, int microseconds)  { throw new RuntimeException(); }
}

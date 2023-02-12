package org.apache.spark.sql.catalyst.util;
/**
 * Helper functions for testing date and time functionality.
 */
// not preceding
public  class DateTimeTestUtils {
  // not preceding
  static public  java.time.ZoneId CEST ()  { throw new RuntimeException(); }
  static public  java.time.ZoneId CET ()  { throw new RuntimeException(); }
  static public  java.time.ZoneId JST ()  { throw new RuntimeException(); }
  static public  java.time.ZoneId LA ()  { throw new RuntimeException(); }
  static public  java.time.ZoneId MIT ()  { throw new RuntimeException(); }
  static public  java.time.ZoneId PST ()  { throw new RuntimeException(); }
  static public  java.time.ZoneId UTC ()  { throw new RuntimeException(); }
  static public  scala.Option<java.lang.String> UTC_OPT ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<java.time.ZoneId> ALL_TIMEZONES ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<java.lang.String> outstandingTimezonesIds ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<java.time.ZoneId> outstandingZoneIds ()  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T withDefaultTimeZone (java.time.ZoneId newDefaultTimeZone, scala.Function0<T> block)  { throw new RuntimeException(); }
  static public  long localDateTimeToMicros (java.time.LocalDateTime localDateTime, java.time.ZoneId zoneId)  { throw new RuntimeException(); }
  static public  long date (int year, byte month, byte day, byte hour, byte minute, byte sec, int micros, java.time.ZoneId zid)  { throw new RuntimeException(); }
  static public  int days (int year, byte month, byte day)  { throw new RuntimeException(); }
  static public  long time (byte hour, byte minute, byte sec, int micros, java.time.ZoneId zid)  { throw new RuntimeException(); }
  static public  long secFrac (int seconds, int milliseconds, int microseconds)  { throw new RuntimeException(); }
}

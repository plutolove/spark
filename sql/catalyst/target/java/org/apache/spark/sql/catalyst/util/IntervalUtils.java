package org.apache.spark.sql.catalyst.util;
/**
 * Parse YearMonth string in form: [+|-]YYYY-MM
 * <p>
 * adapted from HiveIntervalYearMonth.valueOf
 */
// not preceding
public  class IntervalUtils {
  // not preceding
  // not preceding
  static public  class IntervalUnit$ extends scala.Enumeration {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final IntervalUnit$ MODULE$ = null;
    public   IntervalUnit$ ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value NANOSECOND ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value MICROSECOND ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value MILLISECOND ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value SECOND ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value MINUTE ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value HOUR ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value DAY ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value WEEK ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value MONTH ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value YEAR ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  int getYears (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  static public  byte getMonths (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  static public  int getDays (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  static public  long getHours (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  static public  byte getMinutes (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.Decimal getSeconds (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  /**
   * Parse YearMonth string in form: [+|-]YYYY-MM
   * <p>
   * adapted from HiveIntervalYearMonth.valueOf
   * @param input (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval fromYearMonthString (java.lang.String input)  { throw new RuntimeException(); }
  /**
   * Parse dayTime string in form: [-]d HH:mm:ss.nnnnnnnnn and [-]HH:mm:ss.nnnnnnnnn
   * <p>
   * adapted from HiveIntervalDayTime.valueOf
   * @param s (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval fromDayTimeString (java.lang.String s)  { throw new RuntimeException(); }
  /**
   * Parse dayTime string in form: [-]d HH:mm:ss.nnnnnnnnn and [-]HH:mm:ss.nnnnnnnnn
   * <p>
   * adapted from HiveIntervalDayTime.valueOf.
   * Below interval conversion patterns are supported:
   * - DAY TO (HOUR|MINUTE|SECOND)
   * - HOUR TO (MINUTE|SECOND)
   * - MINUTE TO SECOND
   * @param input (undocumented)
   * @param from (undocumented)
   * @param to (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval fromDayTimeString (java.lang.String input, scala.Enumeration.Value from, scala.Enumeration.Value to)  { throw new RuntimeException(); }
  /**
   * Gets interval duration
   * <p>
   * @param interval The interval to get duration
   * @param targetUnit Time units of the result
   * @param daysPerMonth The number of days per one month. The default value is 31 days
   *                     per month. This value was taken as the default because it is used
   *                     in Structured Streaming for watermark calculations. Having 31 days
   *                     per month, we can guarantee that events are not dropped before
   *                     the end of any month (February with 29 days or January with 31 days).
   * @return Duration in the specified time units
   */
  static public  long getDuration (org.apache.spark.unsafe.types.CalendarInterval interval, java.util.concurrent.TimeUnit targetUnit, int daysPerMonth)  { throw new RuntimeException(); }
  /**
   * Checks the interval is negative
   * <p>
   * @param interval The checked interval
   * @param daysPerMonth The number of days per one month. The default value is 31 days
   *                     per month. This value was taken as the default because it is used
   *                     in Structured Streaming for watermark calculations. Having 31 days
   *                     per month, we can guarantee that events are not dropped before
   *                     the end of any month (February with 29 days or January with 31 days).
   * @return true if duration of the given interval is less than 0 otherwise false
   */
  static public  boolean isNegative (org.apache.spark.unsafe.types.CalendarInterval interval, int daysPerMonth)  { throw new RuntimeException(); }
  /**
   * Unary minus, return the negated the calendar interval value.
   * <p>
   * @throws ArithmeticException if the result overflows any field value
   * @param interval (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval negateExact (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  /**
   * Unary minus, return the negated the calendar interval value.
   * @param interval (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval negate (org.apache.spark.unsafe.types.CalendarInterval interval)  { throw new RuntimeException(); }
  /**
   * Return a new calendar interval instance of the sum of two intervals.
   * <p>
   * @throws ArithmeticException if the result overflows any field value
   * @param left (undocumented)
   * @param right (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval addExact (org.apache.spark.unsafe.types.CalendarInterval left, org.apache.spark.unsafe.types.CalendarInterval right)  { throw new RuntimeException(); }
  /**
   * Return a new calendar interval instance of the sum of two intervals.
   * @param left (undocumented)
   * @param right (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval add (org.apache.spark.unsafe.types.CalendarInterval left, org.apache.spark.unsafe.types.CalendarInterval right)  { throw new RuntimeException(); }
  /**
   * Return a new calendar interval instance of the left interval minus the right one.
   * <p>
   * @throws ArithmeticException if the result overflows any field value
   * @param left (undocumented)
   * @param right (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval subtractExact (org.apache.spark.unsafe.types.CalendarInterval left, org.apache.spark.unsafe.types.CalendarInterval right)  { throw new RuntimeException(); }
  /**
   * Return a new calendar interval instance of the left interval minus the right one.
   * @param left (undocumented)
   * @param right (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval subtract (org.apache.spark.unsafe.types.CalendarInterval left, org.apache.spark.unsafe.types.CalendarInterval right)  { throw new RuntimeException(); }
  /**
   * Return a new calendar interval instance of the left interval times a multiplier.
   * @param interval (undocumented)
   * @param num (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval multiply (org.apache.spark.unsafe.types.CalendarInterval interval, double num)  { throw new RuntimeException(); }
  /**
   * Return a new calendar interval instance of the left interval times a multiplier.
   * <p>
   * @throws ArithmeticException if the result overflows any field value
   * @param interval (undocumented)
   * @param num (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval multiplyExact (org.apache.spark.unsafe.types.CalendarInterval interval, double num)  { throw new RuntimeException(); }
  /**
   * Return a new calendar interval instance of the left interval divides by a dividend.
   * @param interval (undocumented)
   * @param num (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval divide (org.apache.spark.unsafe.types.CalendarInterval interval, double num)  { throw new RuntimeException(); }
  /**
   * Return a new calendar interval instance of the left interval divides by a dividend.
   * <p>
   * @throws ArithmeticException if the result overflows any field value or divided by zero
   * @param interval (undocumented)
   * @param num (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval divideExact (org.apache.spark.unsafe.types.CalendarInterval interval, double num)  { throw new RuntimeException(); }
  /**
   * A safe version of <code>stringToInterval</code>. It returns null for invalid input string.
   * @param input (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval safeStringToInterval (org.apache.spark.unsafe.types.UTF8String input)  { throw new RuntimeException(); }
  /**
   * Converts a string to {@link CalendarInterval} case-insensitively.
   * <p>
   * @throws IllegalArgumentException if the input string is not in valid interval format.
   * @param input (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.unsafe.types.CalendarInterval stringToInterval (org.apache.spark.unsafe.types.UTF8String input)  { throw new RuntimeException(); }
  static public  org.apache.spark.unsafe.types.CalendarInterval makeInterval (int years, int months, int weeks, int days, int hours, int mins, org.apache.spark.sql.types.Decimal secs)  { throw new RuntimeException(); }
}

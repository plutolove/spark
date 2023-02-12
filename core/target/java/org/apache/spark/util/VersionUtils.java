package org.apache.spark.util;
/**
 * Given a Spark version string, return the major version number.
 * E.g., for 2.0.1-SNAPSHOT, return 2.
 */
// not preceding
public  class VersionUtils {
  /**
   * Given a Spark version string, return the major version number.
   * E.g., for 2.0.1-SNAPSHOT, return 2.
   * @param sparkVersion (undocumented)
   * @return (undocumented)
   */
  static public  int majorVersion (java.lang.String sparkVersion)  { throw new RuntimeException(); }
  /**
   * Given a Spark version string, return the minor version number.
   * E.g., for 2.0.1-SNAPSHOT, return 0.
   * @param sparkVersion (undocumented)
   * @return (undocumented)
   */
  static public  int minorVersion (java.lang.String sparkVersion)  { throw new RuntimeException(); }
  /**
   * Given a Spark version string, return the short version string.
   * E.g., for 3.0.0-SNAPSHOT, return '3.0.0'.
   * @param sparkVersion (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String shortVersion (java.lang.String sparkVersion)  { throw new RuntimeException(); }
  /**
   * Given a Spark version string, return the (major version number, minor version number).
   * E.g., for 2.0.1-SNAPSHOT, return (2, 0).
   * @param sparkVersion (undocumented)
   * @return (undocumented)
   */
  static public  scala.Tuple2<java.lang.Object, java.lang.Object> majorMinorVersion (java.lang.String sparkVersion)  { throw new RuntimeException(); }
}

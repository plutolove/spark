package org.apache.spark.streaming.ui;
/** Render the page */
  class StreamingPage extends org.apache.spark.ui.WebUIPage implements org.apache.spark.internal.Logging {
  // not preceding
  static public  java.lang.String BLACK_RIGHT_TRIANGLE_HTML ()  { throw new RuntimeException(); }
  static public  java.lang.String BLACK_DOWN_TRIANGLE_HTML ()  { throw new RuntimeException(); }
  static public  java.lang.String emptyCell ()  { throw new RuntimeException(); }
  /**
   * Returns a human-readable string representing a duration such as "5 second 35 ms"
   * @param msOption (undocumented)
   * @return (undocumented)
   */
  static public  java.lang.String formatDurationOption (scala.Option<java.lang.Object> msOption)  { throw new RuntimeException(); }
  // not preceding
  public   StreamingPage (org.apache.spark.streaming.ui.StreamingTab parent)  { throw new RuntimeException(); }
  /** Render the page */
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
}

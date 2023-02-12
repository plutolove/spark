package org.apache.spark.streaming.ui;
/**
 * Generate a row for a Spark Job. Because duplicated output op infos needs to be collapsed into
 * one cell, we use "rowspan" for the first row of an output op.
 */
  class BatchPage extends org.apache.spark.ui.WebUIPage {
  // not preceding
  public   BatchPage (org.apache.spark.streaming.ui.StreamingTab parent)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> generateInputMetadataRow (scala.Tuple2<java.lang.Object, java.lang.String> inputMetadata)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> generateInputMetadataTable (scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.String>> inputMetadatas)  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
}

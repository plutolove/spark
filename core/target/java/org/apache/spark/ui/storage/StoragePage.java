package org.apache.spark.ui.storage;
/** Header fields for the RDD table */
  class StoragePage extends org.apache.spark.ui.WebUIPage {
  // not preceding
  public   StoragePage (org.apache.spark.ui.SparkUITab parent, org.apache.spark.status.AppStatusStore store)  { throw new RuntimeException(); }
    scala.collection.Seq<scala.xml.Node> rddTable (javax.servlet.http.HttpServletRequest request, scala.collection.Seq<org.apache.spark.status.api.v1.RDDStorageInfo> rdds)  { throw new RuntimeException(); }
    scala.collection.Seq<scala.xml.Node> receiverBlockTables (scala.collection.Seq<org.apache.spark.status.StreamBlockData> blocks)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<scala.xml.Node> render (javax.servlet.http.HttpServletRequest request)  { throw new RuntimeException(); }
    scala.Tuple2<java.lang.String, java.lang.Object> streamBlockStorageLevelDescriptionAndSize (org.apache.spark.status.StreamBlockData block)  { throw new RuntimeException(); }
  /** Tooltips for header fields of the RDD table */
  public  scala.collection.Seq<scala.Option<java.lang.String>> tooltips ()  { throw new RuntimeException(); }
}

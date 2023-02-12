package org.apache.spark.streaming.ui;
/**
 * Return HTML for all rows of this table.
 */
  class ActiveBatchTable extends org.apache.spark.streaming.ui.BatchTableBase {
  // not preceding
  public   ActiveBatchTable (scala.collection.Seq<org.apache.spark.streaming.ui.BatchUIData> runningBatches, scala.collection.Seq<org.apache.spark.streaming.ui.BatchUIData> waitingBatches, long batchInterval)  { throw new RuntimeException(); }
  protected  scala.collection.Seq<scala.xml.Node> columns ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<scala.xml.Node> renderRows ()  { throw new RuntimeException(); }
}

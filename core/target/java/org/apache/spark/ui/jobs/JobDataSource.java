package org.apache.spark.ui.jobs;
/**
 * Return Ordering according to sortColumn and desc
 */
  class JobDataSource extends org.apache.spark.ui.PagedDataSource<org.apache.spark.ui.jobs.JobTableRowData> {
  // not preceding
  public   JobDataSource (org.apache.spark.status.AppStatusStore store, scala.collection.Seq<org.apache.spark.status.api.v1.JobData> jobs, java.lang.String basePath, long currentTime, int pageSize, java.lang.String sortColumn, boolean desc)  { throw new RuntimeException(); }
  public  int dataSize ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.ui.jobs.JobTableRowData> sliceData (int from, int to)  { throw new RuntimeException(); }
}

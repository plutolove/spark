package org.apache.spark.sql.execution.ui;
/** Return Ordering according to sortColumn and desc. */
  class ExecutionDataSource extends org.apache.spark.ui.PagedDataSource<org.apache.spark.sql.execution.ui.ExecutionTableRowData> {
  // not preceding
  public   ExecutionDataSource (javax.servlet.http.HttpServletRequest request, org.apache.spark.sql.execution.ui.SQLTab parent, scala.collection.Seq<org.apache.spark.sql.execution.ui.SQLExecutionUIData> executionData, java.lang.String basePath, long currentTime, int pageSize, java.lang.String sortColumn, boolean desc, boolean showRunningJobs, boolean showSucceededJobs, boolean showFailedJobs)  { throw new RuntimeException(); }
  public  int dataSize ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.ui.ExecutionTableRowData> sliceData (int from, int to)  { throw new RuntimeException(); }
}

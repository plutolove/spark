package org.apache.spark.status.api.v1;
  class StagesResource implements org.apache.spark.status.api.v1.BaseAppResource {
  // not preceding
  public   StagesResource ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String appId ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String attemptId ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.TaskData> doPagination (javax.ws.rs.core.MultivaluedMap<java.lang.String, java.lang.String> queryParameters, int stageId, int stageAttemptId, boolean isSearch, int totalRecords)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.TaskData> filterTaskList (scala.collection.Seq<org.apache.spark.status.api.v1.TaskData> taskDataList, java.lang.String searchValue)  { throw new RuntimeException(); }
  // not preceding
  protected  javax.servlet.http.HttpServletRequest httpRequest ()  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.StageData oneAttemptData (int stageId, int stageAttemptId, boolean details)  { throw new RuntimeException(); }
  // not preceding
  protected  javax.servlet.ServletContext servletContext ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.StageData> stageData (int stageId, boolean details)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.status.api.v1.StageData> stageList (java.util.List<org.apache.spark.status.api.v1.StageStatus> statuses)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.status.api.v1.TaskData> taskList (int stageId, int stageAttemptId, int offset, int length, org.apache.spark.status.api.v1.TaskSorting sortBy)  { throw new RuntimeException(); }
  public  org.apache.spark.status.api.v1.TaskMetricDistributions taskSummary (int stageId, int stageAttemptId, java.lang.String quantileString)  { throw new RuntimeException(); }
  public  java.util.HashMap<java.lang.String, java.lang.Object> taskTable (int stageId, int stageAttemptId, boolean details, javax.ws.rs.core.UriInfo uriInfo)  { throw new RuntimeException(); }
}

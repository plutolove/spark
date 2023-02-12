package org.apache.spark.sql.execution;
/** Returns the list of files that will be read when scanning this relation. */
public  interface FileRelation {
  // not preceding
  public  java.lang.String[] inputFiles ()  ;
}

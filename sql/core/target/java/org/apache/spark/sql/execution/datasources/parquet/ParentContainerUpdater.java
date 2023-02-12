package org.apache.spark.sql.execution.datasources.parquet;
/** Called before a record field is being converted */
public  interface ParentContainerUpdater {
  /** Called after a record field is being converted */
  public  void end ()  ;
  public  void set (Object value)  ;
  public  void setBoolean (boolean value)  ;
  public  void setByte (byte value)  ;
  public  void setDouble (double value)  ;
  public  void setFloat (float value)  ;
  public  void setInt (int value)  ;
  public  void setLong (long value)  ;
  public  void setShort (short value)  ;
  /** Called before a record field is being converted */
  public  void start ()  ;
}

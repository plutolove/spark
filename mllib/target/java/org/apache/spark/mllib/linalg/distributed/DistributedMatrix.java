package org.apache.spark.mllib.linalg.distributed;
/** Gets or computes the number of rows. */
public  interface DistributedMatrix extends scala.Serializable {
  /** Gets or computes the number of columns. */
  public  long numCols ()  ;
  // not preceding
  public  long numRows ()  ;
  /** Collects data and assembles a local dense breeze matrix (for test only). */
    breeze.linalg.DenseMatrix<java.lang.Object> toBreeze ()  ;
}

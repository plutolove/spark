package org.apache.spark.sql.catalyst.encoders;
public  class NonEncodable {
  // not preceding
  public   NonEncodable (int i)  { throw new RuntimeException(); }
}

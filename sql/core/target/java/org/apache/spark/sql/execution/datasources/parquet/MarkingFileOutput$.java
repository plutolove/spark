package org.apache.spark.sql.execution.datasources.parquet;
/**
 * Touch the marker.
 * param:  outputPath destination directory
 * param:  conf configuration to create the FS with
 */
// not preceding
public  class MarkingFileOutput$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MarkingFileOutput$ MODULE$ = null;
  public   MarkingFileOutput$ ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String COMMITTER ()  { throw new RuntimeException(); }
  /**
   * Touch the marker.
   * @param outputPath destination directory
   * @param conf configuration to create the FS with
   */
  public  void touch (org.apache.hadoop.fs.Path outputPath, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  /**
   * Get the file status of the marker
   * <p>
   * @param outputPath destination directory
   * @param conf configuration to create the FS with
   * @return the status of the marker
   * @throws FileNotFoundException if the marker is absent
   */
  public  org.apache.hadoop.fs.FileStatus checkMarker (org.apache.hadoop.fs.Path outputPath, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
}

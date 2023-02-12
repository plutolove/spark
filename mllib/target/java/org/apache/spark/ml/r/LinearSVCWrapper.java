package org.apache.spark.ml.r;
  class LinearSVCWrapper implements org.apache.spark.ml.util.MLWritable {
  static public  class LinearSVCWrapperWriter extends org.apache.spark.ml.util.MLWriter {
    // not preceding
    public   LinearSVCWrapperWriter (org.apache.spark.ml.r.LinearSVCWrapper instance)  { throw new RuntimeException(); }
    // not preceding
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class LinearSVCWrapperReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.LinearSVCWrapper> {
    // not preceding
    public   LinearSVCWrapperReader ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.ml.r.LinearSVCWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  java.lang.String PREDICTED_LABEL_INDEX_COL ()  { throw new RuntimeException(); }
  static public  java.lang.String PREDICTED_LABEL_COL ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.r.LinearSVCWrapper fit (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> data, java.lang.String formula, double regParam, int maxIter, double tol, boolean standardization, double threshold, java.lang.String weightCol, int aggregationDepth, java.lang.String handleInvalid)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.r.LinearSVCWrapper> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.r.LinearSVCWrapper load (java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.PipelineModel pipeline ()  { throw new RuntimeException(); }
  public  java.lang.String[] features ()  { throw new RuntimeException(); }
  public  java.lang.String[] labels ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String[] rFeatures ()  { throw new RuntimeException(); }
  // not preceding
  public  double[] rCoefficients ()  { throw new RuntimeException(); }
  // not preceding
  public  int numClasses ()  { throw new RuntimeException(); }
  // not preceding
  public  int numFeatures ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
}

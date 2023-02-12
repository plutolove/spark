package org.apache.spark.graphx.lib;
/** Configuration parameters for SVDPlusPlus. */
// not preceding
public  class SVDPlusPlus {
  // not preceding
  static public  class Conf implements scala.Serializable {
    // not preceding
    public   Conf (int rank, int maxIters, double minVal, double maxVal, double gamma1, double gamma2, double gamma6, double gamma7)  { throw new RuntimeException(); }
    public  double gamma1 ()  { throw new RuntimeException(); }
    public  double gamma2 ()  { throw new RuntimeException(); }
    public  double gamma6 ()  { throw new RuntimeException(); }
    public  double gamma7 ()  { throw new RuntimeException(); }
    public  int maxIters ()  { throw new RuntimeException(); }
    public  double maxVal ()  { throw new RuntimeException(); }
    public  double minVal ()  { throw new RuntimeException(); }
    // not preceding
    public  int rank ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  scala.Tuple2<org.apache.spark.graphx.Graph<scala.Tuple4<double[], double[], java.lang.Object, java.lang.Object>, java.lang.Object>, java.lang.Object> run (org.apache.spark.rdd.RDD<org.apache.spark.graphx.Edge<java.lang.Object>> edges, org.apache.spark.graphx.lib.SVDPlusPlus.Conf conf)  { throw new RuntimeException(); }
}

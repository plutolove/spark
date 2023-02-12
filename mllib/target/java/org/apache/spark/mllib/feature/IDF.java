package org.apache.spark.mllib.feature;
/**
 * Computes the inverse document frequency.
 * param:  dataset an RDD of term frequency vectors
 */
public  class IDF {
  // not preceding
  static public  class DocumentFrequencyAggregator implements scala.Serializable {
    // not preceding
    public   DocumentFrequencyAggregator (int minDocFreq)  { throw new RuntimeException(); }
    public   DocumentFrequencyAggregator ()  { throw new RuntimeException(); }
    /** Adds a new document. */
    public  org.apache.spark.mllib.feature.IDF.DocumentFrequencyAggregator add (org.apache.spark.mllib.linalg.Vector doc)  { throw new RuntimeException(); }
    /** Returns the current IDF vector, docFreq, number of documents */
    public  scala.Tuple3<org.apache.spark.mllib.linalg.Vector, long[], java.lang.Object> idf ()  { throw new RuntimeException(); }
    /** Merges another. */
    public  org.apache.spark.mllib.feature.IDF.DocumentFrequencyAggregator merge (org.apache.spark.mllib.feature.IDF.DocumentFrequencyAggregator other)  { throw new RuntimeException(); }
    // not preceding
    public  int minDocFreq ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  int minDocFreq ()  { throw new RuntimeException(); }
  // not preceding
  public   IDF (int minDocFreq)  { throw new RuntimeException(); }
  // not preceding
  public   IDF ()  { throw new RuntimeException(); }
  /**
   * Computes the inverse document frequency.
   * @param dataset an RDD of term frequency vectors
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.IDFModel fit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> dataset)  { throw new RuntimeException(); }
  /**
   * Computes the inverse document frequency.
   * @param dataset a JavaRDD of term frequency vectors
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.feature.IDFModel fit (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> dataset)  { throw new RuntimeException(); }
}

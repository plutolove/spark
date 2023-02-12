package org.apache.spark.ml.feature;
/**
 * Returns a dataframe with two fields, "word" and "vector", with "word" being a String and
 * and the vector the DenseVector that it is mapped to.
 */
public  class Word2VecModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.Word2VecModel> implements org.apache.spark.ml.feature.Word2VecBase, org.apache.spark.ml.util.MLWritable {
  // not preceding
  static   class Word2VecModelWriter extends org.apache.spark.ml.util.MLWriter {
    // not preceding
    public   Word2VecModelWriter (org.apache.spark.ml.feature.Word2VecModel instance)  { throw new RuntimeException(); }
    // not preceding
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class Word2VecModelWriter$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Word2VecModelWriter$ MODULE$ = null;
    public   Word2VecModelWriter$ ()  { throw new RuntimeException(); }
    // not preceding
    public  int calculateNumberOfPartitions (long bufferSizeInBytes, int numWords, int vectorSize)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.Word2VecModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.Word2VecModel load (java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam vectorSize ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam windowSize ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam numPartitions ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam minCount ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam maxSentenceLength ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.DoubleParam stepSize ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
     Word2VecModel (java.lang.String uid, org.apache.spark.mllib.feature.Word2VecModel wordVectors)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getVectors ()  { throw new RuntimeException(); }
  /**
   * Find "num" number of words closest in similarity to the given word, not
   * including the word itself.
   * @return a dataframe with columns "word" and "similarity" of the word and the cosine
   * similarities between the synonyms and the given word.
   * @param word (undocumented)
   * @param num (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> findSynonyms (java.lang.String word, int num)  { throw new RuntimeException(); }
  /**
   * Find "num" number of words whose vector representation is most similar to the supplied vector.
   * If the supplied vector is the vector representation of a word in the model's vocabulary,
   * that word will be in the results.
   * @return a dataframe with columns "word" and "similarity" of the word and the cosine
   * similarities between the synonyms and the given word vector.
   * @param vec (undocumented)
   * @param num (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> findSynonyms (org.apache.spark.ml.linalg.Vector vec, int num)  { throw new RuntimeException(); }
  /**
   * Find "num" number of words whose vector representation is most similar to the supplied vector.
   * If the supplied vector is the vector representation of a word in the model's vocabulary,
   * that word will be in the results.
   * @return an array of the words and the cosine similarities between the synonyms given
   * word vector.
   * @param vec (undocumented)
   * @param num (undocumented)
   */
  public  scala.Tuple2<java.lang.String, java.lang.Object>[] findSynonymsArray (org.apache.spark.ml.linalg.Vector vec, int num)  { throw new RuntimeException(); }
  /**
   * Find "num" number of words closest in similarity to the given word, not
   * including the word itself.
   * @return an array of the words and the cosine similarities between the synonyms given
   * word vector.
   * @param word (undocumented)
   * @param num (undocumented)
   */
  public  scala.Tuple2<java.lang.String, java.lang.Object>[] findSynonymsArray (java.lang.String word, int num)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Word2VecModel setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.Word2VecModel setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Transform a sentence column to a vector column to represent the whole sentence. The transform
   * is performed by averaging all word vectors it contains.
   * @param dataset (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.Word2VecModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}

package org.apache.spark.sql.catalyst;
public  interface SQLKeywordUtils extends org.apache.spark.sql.catalyst.plans.SQLHelper {
  public  scala.collection.immutable.Set<java.lang.String> allCandidateKeywords ()  ;
  public  java.lang.String[][] keywordsInDoc ()  ;
  public  scala.collection.immutable.Set<java.lang.String> nonReservedKeywordsInAnsiMode ()  ;
  public  scala.collection.immutable.Set<java.lang.String> nonReservedKeywordsInDefaultMode ()  ;
  public <T extends java.lang.Object> scala.collection.immutable.Set<T> parseAntlrGrammars (java.lang.String startTag, java.lang.String endTag, scala.PartialFunction<java.lang.String, scala.collection.Seq<T>> f)  ;
  public  scala.collection.immutable.Set<java.lang.String> reservedKeywordsInAnsiMode ()  ;
  public  java.lang.String[] sqlSyntaxDefs ()  ;
  public  scala.collection.immutable.Map<java.lang.String, scala.collection.Seq<java.lang.String>> symbolsToExpandIntoDifferentLiterals ()  ;
}

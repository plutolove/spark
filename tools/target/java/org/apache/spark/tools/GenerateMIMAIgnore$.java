package org.apache.spark.tools;
/**
 * For every class checks via scala reflection if the class itself or contained members
 * are package private.
 * Returns the tuple of such classes and members.
 */
// not preceding
public  class GenerateMIMAIgnore$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GenerateMIMAIgnore$ MODULE$ = null;
  public   GenerateMIMAIgnore$ ()  { throw new RuntimeException(); }
  /**
   * Scala reflection does not let us see inner function even if they are upgraded
   * to public for some reason. So had to resort to java reflection to get all inner
   * functions with $$ in there name.
   * @param classSymbol (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> getInnerFunctions (scala.reflect.runtime.universe classSymbol)  { throw new RuntimeException(); }
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
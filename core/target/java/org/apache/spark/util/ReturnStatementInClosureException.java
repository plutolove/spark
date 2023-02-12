package org.apache.spark.util;
/**
 * Scans an indylambda Scala closure, along with its lexically nested closures, and populate
 * the accessed fields info on which fields on the outer object are accessed.
 * <p>
 * This is equivalent to getInnerClosureClasses() + InnerClosureFinder + FieldAccessFinder fused
 * into one for processing indylambda closures. The traversal order along the call graph is the
 * same for all three combined, so they can be fused together easily while maintaining the same
 * ordering as the existing implementation.
 * <p>
 * Precondition: this function expects the <code>accessedFields</code> to be populated with all known
 *               outer classes and their super classes to be in the map as keys, e.g.
 *               initializing via ClosureCleaner.initAccessedFields.
 */
  class ReturnStatementInClosureException extends org.apache.spark.SparkException {
  // not preceding
  public   ReturnStatementInClosureException ()  { throw new RuntimeException(); }
}

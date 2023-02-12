package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * A wrapper for generated class, defines a <code>generate</code> method so that we can pass extra objects
 * into generated class.
 */
public abstract class GeneratedClass {
  // not preceding
  public   GeneratedClass ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  Object generate (java.lang.Object[] references)  ;
}

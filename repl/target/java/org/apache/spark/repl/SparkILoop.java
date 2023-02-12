package org.apache.spark.repl;
/** Print a welcome message */
public  class SparkILoop extends scala.tools.nsc.interpreter.ILoop {
  // not preceding
  static public  java.lang.String run (java.lang.String code, scala.tools.nsc.Settings sets)  { throw new RuntimeException(); }
  static public  java.lang.String run (scala.collection.immutable.List<java.lang.String> lines)  { throw new RuntimeException(); }
  // not preceding
  public   SparkILoop (scala.Option<java.io.BufferedReader> in0, java.io.PrintWriter out)  { throw new RuntimeException(); }
  // not preceding
  public   SparkILoop (java.io.BufferedReader in0, java.io.PrintWriter out)  { throw new RuntimeException(); }
  public   SparkILoop ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> initializationCommands ()  { throw new RuntimeException(); }
  public  void initializeSpark ()  { throw new RuntimeException(); }
  /** Print a welcome message */
  public  void printWelcome ()  { throw new RuntimeException(); }
  /** Available commands */
  public  scala.collection.immutable.List<scala.tools.nsc.interpreter.LoopCommands.LoopCommand> commands ()  { throw new RuntimeException(); }
  public  void resetCommand (java.lang.String line)  { throw new RuntimeException(); }
  public  void replay ()  { throw new RuntimeException(); }
  /** Reader to use before interpreter is online. */
  public  boolean process (scala.tools.nsc.Settings settings)  { throw new RuntimeException(); }
}

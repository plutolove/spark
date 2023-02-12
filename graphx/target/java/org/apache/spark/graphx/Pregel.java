package org.apache.spark.graphx;
/**
 * Execute a Pregel-like iterative vertex-parallel abstraction.  The
 * user-defined vertex-program <code>vprog</code> is executed in parallel on
 * each vertex receiving any inbound messages and computing a new
 * value for the vertex.  The <code>sendMsg</code> function is then invoked on
 * all out-edges and is used to compute an optional message to the
 * destination vertex. The <code>mergeMsg</code> function is a commutative
 * associative function used to combine messages destined to the
 * same vertex.
 * <p>
 * On the first iteration all vertices receive the <code>initialMsg</code> and
 * on subsequent iterations if a vertex does not receive a message
 * then the vertex-program is not invoked.
 * <p>
 * This function iterates until there are no remaining messages, or
 * for <code>maxIterations</code> iterations.
 * <p>
 * @param <VD>  the vertex data type
 * @param <ED>  the edge data type
 * @param <A>  the Pregel message type
 * <p>
 * param:  graph the input graph.
 * <p>
 * param:  initialMsg the message each vertex will receive at the first
 * iteration
 * <p>
 * param:  maxIterations the maximum number of iterations to run for
 * <p>
 * param:  activeDirection the direction of edges incident to a vertex that received a message in
 * the previous round on which to run <code>sendMsg</code>. For example, if this is <code>EdgeDirection.Out</code>, only
 * out-edges of vertices that received a message in the previous round will run. The default is
 * <code>EdgeDirection.Either</code>, which will run <code>sendMsg</code> on edges where either side received a message
 * in the previous round. If this is <code>EdgeDirection.Both</code>, <code>sendMsg</code> will only run on edges where
 * *both* vertices received a message.
 * <p>
 * param:  vprog the user-defined vertex program which runs on each
 * vertex and receives the inbound message and computes a new vertex
 * value.  On the first iteration the vertex program is invoked on
 * all vertices and is passed the default message.  On subsequent
 * iterations the vertex program is only invoked on those vertices
 * that receive messages.
 * <p>
 * param:  sendMsg a user supplied function that is applied to out
 * edges of vertices that received messages in the current
 * iteration
 * <p>
 * param:  mergeMsg a user supplied function that takes two incoming
 * messages of type A and merges them into a single message of type
 * A.  ''This function must be commutative and associative and
 * ideally the size of A should not increase.''
 * <p>
 * @return the resulting graph at the end of the computation
 * <p>
 */
// not preceding
public  class Pregel {
  // not preceding
  static public <VD extends java.lang.Object, ED extends java.lang.Object, A extends java.lang.Object> org.apache.spark.graphx.Graph<VD, ED> apply (org.apache.spark.graphx.Graph<VD, ED> graph, A initialMsg, int maxIterations, org.apache.spark.graphx.EdgeDirection activeDirection, scala.Function3<java.lang.Object, VD, A, VD> vprog, scala.Function1<org.apache.spark.graphx.EdgeTriplet<VD, ED>, scala.collection.Iterator<scala.Tuple2<java.lang.Object, A>>> sendMsg, scala.Function2<A, A, A> mergeMsg, scala.reflect.ClassTag<VD> evidence$1, scala.reflect.ClassTag<ED> evidence$2, scala.reflect.ClassTag<A> evidence$3)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
}

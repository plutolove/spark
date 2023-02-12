package org.apache.spark.sql.catalyst.encoders;
/**
 * Verify the size of scala.reflect.runtime.JavaUniverse.undoLog before and after <code>func</code> to
 * ensure we don't leak Scala reflection garbage.
 * <p>
 * @see org.apache.spark.sql.catalyst.ScalaReflection.cleanUpReflectionObjects
 */
public  class ExpressionEncoderSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.catalyst.plans.CodegenInterpretedPlanTest, org.apache.spark.sql.catalyst.analysis.AnalysisTest {
  public  class InnerClass implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  int i ()  { throw new RuntimeException(); }
    // not preceding
    public   InnerClass (int i)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class InnerClass$ extends scala.runtime.AbstractFunction1<java.lang.Object, org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.InnerClass> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final InnerClass$ MODULE$ = null;
    public   InnerClass$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class MalformedClassObject {
    // not preceding
    static public  class MalformedNameExample implements scala.Product, scala.Serializable {
      // not preceding
      public  int x ()  { throw new RuntimeException(); }
      // not preceding
      public   MalformedNameExample (int x)  { throw new RuntimeException(); }
    }
    // not preceding
    static public  class MalformedNameExample$ extends scala.runtime.AbstractFunction1<java.lang.Object, org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.MalformedClassObject$.MalformedNameExample> implements scala.Serializable {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final MalformedNameExample$ MODULE$ = null;
      public   MalformedNameExample$ ()  { throw new RuntimeException(); }
    }
  }
  // not preceding
  public  class MalformedClassObject$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final MalformedClassObject$ MODULE$ = null;
    public   MalformedClassObject$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class OuterLevelWithVeryVeryVeryLongClassName1 {
    // not preceding
    // not preceding
    static public  class OuterLevelWithVeryVeryVeryLongClassName2$ {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final OuterLevelWithVeryVeryVeryLongClassName2$ MODULE$ = null;
      // not preceding
      // not preceding
      public  class OuterLevelWithVeryVeryVeryLongClassName3 {
        // not preceding
        // not preceding
        static public  class OuterLevelWithVeryVeryVeryLongClassName4$ {
          /**
           * Static reference to the singleton instance of this Scala object.
           */
          public static final OuterLevelWithVeryVeryVeryLongClassName4$ MODULE$ = null;
          // not preceding
          // not preceding
          public  class OuterLevelWithVeryVeryVeryLongClassName5 {
            // not preceding
            // not preceding
            static public  class OuterLevelWithVeryVeryVeryLongClassName6$ {
              /**
               * Static reference to the singleton instance of this Scala object.
               */
              public static final OuterLevelWithVeryVeryVeryLongClassName6$ MODULE$ = null;
              // not preceding
              // not preceding
              public  class OuterLevelWithVeryVeryVeryLongClassName7 {
                // not preceding
                // not preceding
                static public  class OuterLevelWithVeryVeryVeryLongClassName8$ {
                  /**
                   * Static reference to the singleton instance of this Scala object.
                   */
                  public static final OuterLevelWithVeryVeryVeryLongClassName8$ MODULE$ = null;
                  // not preceding
                  // not preceding
                  public  class OuterLevelWithVeryVeryVeryLongClassName9 {
                    // not preceding
                    // not preceding
                    static public  class OuterLevelWithVeryVeryVeryLongClassName10$ {
                      /**
                       * Static reference to the singleton instance of this Scala object.
                       */
                      public static final OuterLevelWithVeryVeryVeryLongClassName10$ MODULE$ = null;
                      // not preceding
                      // not preceding
                      public  class OuterLevelWithVeryVeryVeryLongClassName11 {
                        // not preceding
                        // not preceding
                        static public  class OuterLevelWithVeryVeryVeryLongClassName12$ {
                          /**
                           * Static reference to the singleton instance of this Scala object.
                           */
                          public static final OuterLevelWithVeryVeryVeryLongClassName12$ MODULE$ = null;
                          // not preceding
                          // not preceding
                          public  class OuterLevelWithVeryVeryVeryLongClassName13 {
                            // not preceding
                            // not preceding
                            static public  class OuterLevelWithVeryVeryVeryLongClassName14$ {
                              /**
                               * Static reference to the singleton instance of this Scala object.
                               */
                              public static final OuterLevelWithVeryVeryVeryLongClassName14$ MODULE$ = null;
                              // not preceding
                              // not preceding
                              public  class OuterLevelWithVeryVeryVeryLongClassName15 {
                                // not preceding
                                // not preceding
                                static public  class OuterLevelWithVeryVeryVeryLongClassName16$ {
                                  /**
                                   * Static reference to the singleton instance of this Scala object.
                                   */
                                  public static final OuterLevelWithVeryVeryVeryLongClassName16$ MODULE$ = null;
                                  // not preceding
                                  // not preceding
                                  public  class OuterLevelWithVeryVeryVeryLongClassName17 {
                                    // not preceding
                                    // not preceding
                                    static public  class OuterLevelWithVeryVeryVeryLongClassName18$ {
                                      /**
                                       * Static reference to the singleton instance of this Scala object.
                                       */
                                      public static final OuterLevelWithVeryVeryVeryLongClassName18$ MODULE$ = null;
                                      // not preceding
                                      // not preceding
                                      public  class OuterLevelWithVeryVeryVeryLongClassName19 {
                                        // not preceding
                                        // not preceding
                                        static public  class OuterLevelWithVeryVeryVeryLongClassName20$ {
                                          /**
                                           * Static reference to the singleton instance of this Scala object.
                                           */
                                          public static final OuterLevelWithVeryVeryVeryLongClassName20$ MODULE$ = null;
                                          // not preceding
                                          public  class MalformedNameExample implements scala.Product, scala.Serializable {
                                            static public abstract  R apply (T1 v1)  ;
                                            static public  java.lang.String toString ()  { throw new RuntimeException(); }
                                            // not preceding
                                            public  int x ()  { throw new RuntimeException(); }
                                            // not preceding
                                            public   MalformedNameExample (int x)  { throw new RuntimeException(); }
                                          }
                                          // not preceding
                                          public  class MalformedNameExample$ extends scala.runtime.AbstractFunction1<java.lang.Object, org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$.OuterLevelWithVeryVeryVeryLongClassName6$.OuterLevelWithVeryVeryVeryLongClassName7$.OuterLevelWithVeryVeryVeryLongClassName8$.OuterLevelWithVeryVeryVeryLongClassName9$.OuterLevelWithVeryVeryVeryLongClassName10$.OuterLevelWithVeryVeryVeryLongClassName11$.OuterLevelWithVeryVeryVeryLongClassName12$.OuterLevelWithVeryVeryVeryLongClassName13$.OuterLevelWithVeryVeryVeryLongClassName14$.OuterLevelWithVeryVeryVeryLongClassName15$.OuterLevelWithVeryVeryVeryLongClassName16$.OuterLevelWithVeryVeryVeryLongClassName17$.OuterLevelWithVeryVeryVeryLongClassName18$.OuterLevelWithVeryVeryVeryLongClassName19$.OuterLevelWithVeryVeryVeryLongClassName20$.MalformedNameExample> implements scala.Serializable {
                                            /**
                                             * Static reference to the singleton instance of this Scala object.
                                             */
                                            public static final MalformedNameExample$ MODULE$ = null;
                                            public   MalformedNameExample$ ()  { throw new RuntimeException(); }
                                          }
                                          public   OuterLevelWithVeryVeryVeryLongClassName20$ ()  { throw new RuntimeException(); }
                                        }
                                        static public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$.OuterLevelWithVeryVeryVeryLongClassName6$.OuterLevelWithVeryVeryVeryLongClassName7$.OuterLevelWithVeryVeryVeryLongClassName8$.OuterLevelWithVeryVeryVeryLongClassName9$.OuterLevelWithVeryVeryVeryLongClassName10$.OuterLevelWithVeryVeryVeryLongClassName11$.OuterLevelWithVeryVeryVeryLongClassName12$.OuterLevelWithVeryVeryVeryLongClassName13$.OuterLevelWithVeryVeryVeryLongClassName14$.OuterLevelWithVeryVeryVeryLongClassName15$.OuterLevelWithVeryVeryVeryLongClassName16$.OuterLevelWithVeryVeryVeryLongClassName17$.OuterLevelWithVeryVeryVeryLongClassName18$.OuterLevelWithVeryVeryVeryLongClassName19$.OuterLevelWithVeryVeryVeryLongClassName20$ OuterLevelWithVeryVeryVeryLongClassName20 ()  { throw new RuntimeException(); }
                                      }
                                      // not preceding
                                      // not preceding
                                      public  class OuterLevelWithVeryVeryVeryLongClassName19$ {
                                        /**
                                         * Static reference to the singleton instance of this Scala object.
                                         */
                                        public static final OuterLevelWithVeryVeryVeryLongClassName19$ MODULE$ = null;
                                        public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$.OuterLevelWithVeryVeryVeryLongClassName6$.OuterLevelWithVeryVeryVeryLongClassName7$.OuterLevelWithVeryVeryVeryLongClassName8$.OuterLevelWithVeryVeryVeryLongClassName9$.OuterLevelWithVeryVeryVeryLongClassName10$.OuterLevelWithVeryVeryVeryLongClassName11$.OuterLevelWithVeryVeryVeryLongClassName12$.OuterLevelWithVeryVeryVeryLongClassName13$.OuterLevelWithVeryVeryVeryLongClassName14$.OuterLevelWithVeryVeryVeryLongClassName15$.OuterLevelWithVeryVeryVeryLongClassName16$.OuterLevelWithVeryVeryVeryLongClassName17$.OuterLevelWithVeryVeryVeryLongClassName18$.OuterLevelWithVeryVeryVeryLongClassName19$.OuterLevelWithVeryVeryVeryLongClassName20$ OuterLevelWithVeryVeryVeryLongClassName20 ()  { throw new RuntimeException(); }
                                        public   OuterLevelWithVeryVeryVeryLongClassName19$ ()  { throw new RuntimeException(); }
                                      }
                                      public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$.OuterLevelWithVeryVeryVeryLongClassName6$.OuterLevelWithVeryVeryVeryLongClassName7$.OuterLevelWithVeryVeryVeryLongClassName8$.OuterLevelWithVeryVeryVeryLongClassName9$.OuterLevelWithVeryVeryVeryLongClassName10$.OuterLevelWithVeryVeryVeryLongClassName11$.OuterLevelWithVeryVeryVeryLongClassName12$.OuterLevelWithVeryVeryVeryLongClassName13$.OuterLevelWithVeryVeryVeryLongClassName14$.OuterLevelWithVeryVeryVeryLongClassName15$.OuterLevelWithVeryVeryVeryLongClassName16$.OuterLevelWithVeryVeryVeryLongClassName17$.OuterLevelWithVeryVeryVeryLongClassName18$.OuterLevelWithVeryVeryVeryLongClassName19$ OuterLevelWithVeryVeryVeryLongClassName19 ()  { throw new RuntimeException(); }
                                      public   OuterLevelWithVeryVeryVeryLongClassName18$ ()  { throw new RuntimeException(); }
                                    }
                                    static public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$.OuterLevelWithVeryVeryVeryLongClassName6$.OuterLevelWithVeryVeryVeryLongClassName7$.OuterLevelWithVeryVeryVeryLongClassName8$.OuterLevelWithVeryVeryVeryLongClassName9$.OuterLevelWithVeryVeryVeryLongClassName10$.OuterLevelWithVeryVeryVeryLongClassName11$.OuterLevelWithVeryVeryVeryLongClassName12$.OuterLevelWithVeryVeryVeryLongClassName13$.OuterLevelWithVeryVeryVeryLongClassName14$.OuterLevelWithVeryVeryVeryLongClassName15$.OuterLevelWithVeryVeryVeryLongClassName16$.OuterLevelWithVeryVeryVeryLongClassName17$.OuterLevelWithVeryVeryVeryLongClassName18$ OuterLevelWithVeryVeryVeryLongClassName18 ()  { throw new RuntimeException(); }
                                  }
                                  // not preceding
                                  // not preceding
                                  public  class OuterLevelWithVeryVeryVeryLongClassName17$ {
                                    /**
                                     * Static reference to the singleton instance of this Scala object.
                                     */
                                    public static final OuterLevelWithVeryVeryVeryLongClassName17$ MODULE$ = null;
                                    public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$.OuterLevelWithVeryVeryVeryLongClassName6$.OuterLevelWithVeryVeryVeryLongClassName7$.OuterLevelWithVeryVeryVeryLongClassName8$.OuterLevelWithVeryVeryVeryLongClassName9$.OuterLevelWithVeryVeryVeryLongClassName10$.OuterLevelWithVeryVeryVeryLongClassName11$.OuterLevelWithVeryVeryVeryLongClassName12$.OuterLevelWithVeryVeryVeryLongClassName13$.OuterLevelWithVeryVeryVeryLongClassName14$.OuterLevelWithVeryVeryVeryLongClassName15$.OuterLevelWithVeryVeryVeryLongClassName16$.OuterLevelWithVeryVeryVeryLongClassName17$.OuterLevelWithVeryVeryVeryLongClassName18$ OuterLevelWithVeryVeryVeryLongClassName18 ()  { throw new RuntimeException(); }
                                    public   OuterLevelWithVeryVeryVeryLongClassName17$ ()  { throw new RuntimeException(); }
                                  }
                                  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$.OuterLevelWithVeryVeryVeryLongClassName6$.OuterLevelWithVeryVeryVeryLongClassName7$.OuterLevelWithVeryVeryVeryLongClassName8$.OuterLevelWithVeryVeryVeryLongClassName9$.OuterLevelWithVeryVeryVeryLongClassName10$.OuterLevelWithVeryVeryVeryLongClassName11$.OuterLevelWithVeryVeryVeryLongClassName12$.OuterLevelWithVeryVeryVeryLongClassName13$.OuterLevelWithVeryVeryVeryLongClassName14$.OuterLevelWithVeryVeryVeryLongClassName15$.OuterLevelWithVeryVeryVeryLongClassName16$.OuterLevelWithVeryVeryVeryLongClassName17$ OuterLevelWithVeryVeryVeryLongClassName17 ()  { throw new RuntimeException(); }
                                  public   OuterLevelWithVeryVeryVeryLongClassName16$ ()  { throw new RuntimeException(); }
                                }
                                static public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$.OuterLevelWithVeryVeryVeryLongClassName6$.OuterLevelWithVeryVeryVeryLongClassName7$.OuterLevelWithVeryVeryVeryLongClassName8$.OuterLevelWithVeryVeryVeryLongClassName9$.OuterLevelWithVeryVeryVeryLongClassName10$.OuterLevelWithVeryVeryVeryLongClassName11$.OuterLevelWithVeryVeryVeryLongClassName12$.OuterLevelWithVeryVeryVeryLongClassName13$.OuterLevelWithVeryVeryVeryLongClassName14$.OuterLevelWithVeryVeryVeryLongClassName15$.OuterLevelWithVeryVeryVeryLongClassName16$ OuterLevelWithVeryVeryVeryLongClassName16 ()  { throw new RuntimeException(); }
                              }
                              // not preceding
                              // not preceding
                              public  class OuterLevelWithVeryVeryVeryLongClassName15$ {
                                /**
                                 * Static reference to the singleton instance of this Scala object.
                                 */
                                public static final OuterLevelWithVeryVeryVeryLongClassName15$ MODULE$ = null;
                                public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$.OuterLevelWithVeryVeryVeryLongClassName6$.OuterLevelWithVeryVeryVeryLongClassName7$.OuterLevelWithVeryVeryVeryLongClassName8$.OuterLevelWithVeryVeryVeryLongClassName9$.OuterLevelWithVeryVeryVeryLongClassName10$.OuterLevelWithVeryVeryVeryLongClassName11$.OuterLevelWithVeryVeryVeryLongClassName12$.OuterLevelWithVeryVeryVeryLongClassName13$.OuterLevelWithVeryVeryVeryLongClassName14$.OuterLevelWithVeryVeryVeryLongClassName15$.OuterLevelWithVeryVeryVeryLongClassName16$ OuterLevelWithVeryVeryVeryLongClassName16 ()  { throw new RuntimeException(); }
                                public   OuterLevelWithVeryVeryVeryLongClassName15$ ()  { throw new RuntimeException(); }
                              }
                              public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$.OuterLevelWithVeryVeryVeryLongClassName6$.OuterLevelWithVeryVeryVeryLongClassName7$.OuterLevelWithVeryVeryVeryLongClassName8$.OuterLevelWithVeryVeryVeryLongClassName9$.OuterLevelWithVeryVeryVeryLongClassName10$.OuterLevelWithVeryVeryVeryLongClassName11$.OuterLevelWithVeryVeryVeryLongClassName12$.OuterLevelWithVeryVeryVeryLongClassName13$.OuterLevelWithVeryVeryVeryLongClassName14$.OuterLevelWithVeryVeryVeryLongClassName15$ OuterLevelWithVeryVeryVeryLongClassName15 ()  { throw new RuntimeException(); }
                              public   OuterLevelWithVeryVeryVeryLongClassName14$ ()  { throw new RuntimeException(); }
                            }
                            static public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$.OuterLevelWithVeryVeryVeryLongClassName6$.OuterLevelWithVeryVeryVeryLongClassName7$.OuterLevelWithVeryVeryVeryLongClassName8$.OuterLevelWithVeryVeryVeryLongClassName9$.OuterLevelWithVeryVeryVeryLongClassName10$.OuterLevelWithVeryVeryVeryLongClassName11$.OuterLevelWithVeryVeryVeryLongClassName12$.OuterLevelWithVeryVeryVeryLongClassName13$.OuterLevelWithVeryVeryVeryLongClassName14$ OuterLevelWithVeryVeryVeryLongClassName14 ()  { throw new RuntimeException(); }
                          }
                          // not preceding
                          // not preceding
                          public  class OuterLevelWithVeryVeryVeryLongClassName13$ {
                            /**
                             * Static reference to the singleton instance of this Scala object.
                             */
                            public static final OuterLevelWithVeryVeryVeryLongClassName13$ MODULE$ = null;
                            public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$.OuterLevelWithVeryVeryVeryLongClassName6$.OuterLevelWithVeryVeryVeryLongClassName7$.OuterLevelWithVeryVeryVeryLongClassName8$.OuterLevelWithVeryVeryVeryLongClassName9$.OuterLevelWithVeryVeryVeryLongClassName10$.OuterLevelWithVeryVeryVeryLongClassName11$.OuterLevelWithVeryVeryVeryLongClassName12$.OuterLevelWithVeryVeryVeryLongClassName13$.OuterLevelWithVeryVeryVeryLongClassName14$ OuterLevelWithVeryVeryVeryLongClassName14 ()  { throw new RuntimeException(); }
                            public   OuterLevelWithVeryVeryVeryLongClassName13$ ()  { throw new RuntimeException(); }
                          }
                          public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$.OuterLevelWithVeryVeryVeryLongClassName6$.OuterLevelWithVeryVeryVeryLongClassName7$.OuterLevelWithVeryVeryVeryLongClassName8$.OuterLevelWithVeryVeryVeryLongClassName9$.OuterLevelWithVeryVeryVeryLongClassName10$.OuterLevelWithVeryVeryVeryLongClassName11$.OuterLevelWithVeryVeryVeryLongClassName12$.OuterLevelWithVeryVeryVeryLongClassName13$ OuterLevelWithVeryVeryVeryLongClassName13 ()  { throw new RuntimeException(); }
                          public   OuterLevelWithVeryVeryVeryLongClassName12$ ()  { throw new RuntimeException(); }
                        }
                        static public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$.OuterLevelWithVeryVeryVeryLongClassName6$.OuterLevelWithVeryVeryVeryLongClassName7$.OuterLevelWithVeryVeryVeryLongClassName8$.OuterLevelWithVeryVeryVeryLongClassName9$.OuterLevelWithVeryVeryVeryLongClassName10$.OuterLevelWithVeryVeryVeryLongClassName11$.OuterLevelWithVeryVeryVeryLongClassName12$ OuterLevelWithVeryVeryVeryLongClassName12 ()  { throw new RuntimeException(); }
                      }
                      // not preceding
                      // not preceding
                      public  class OuterLevelWithVeryVeryVeryLongClassName11$ {
                        /**
                         * Static reference to the singleton instance of this Scala object.
                         */
                        public static final OuterLevelWithVeryVeryVeryLongClassName11$ MODULE$ = null;
                        public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$.OuterLevelWithVeryVeryVeryLongClassName6$.OuterLevelWithVeryVeryVeryLongClassName7$.OuterLevelWithVeryVeryVeryLongClassName8$.OuterLevelWithVeryVeryVeryLongClassName9$.OuterLevelWithVeryVeryVeryLongClassName10$.OuterLevelWithVeryVeryVeryLongClassName11$.OuterLevelWithVeryVeryVeryLongClassName12$ OuterLevelWithVeryVeryVeryLongClassName12 ()  { throw new RuntimeException(); }
                        public   OuterLevelWithVeryVeryVeryLongClassName11$ ()  { throw new RuntimeException(); }
                      }
                      public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$.OuterLevelWithVeryVeryVeryLongClassName6$.OuterLevelWithVeryVeryVeryLongClassName7$.OuterLevelWithVeryVeryVeryLongClassName8$.OuterLevelWithVeryVeryVeryLongClassName9$.OuterLevelWithVeryVeryVeryLongClassName10$.OuterLevelWithVeryVeryVeryLongClassName11$ OuterLevelWithVeryVeryVeryLongClassName11 ()  { throw new RuntimeException(); }
                      public   OuterLevelWithVeryVeryVeryLongClassName10$ ()  { throw new RuntimeException(); }
                    }
                    static public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$.OuterLevelWithVeryVeryVeryLongClassName6$.OuterLevelWithVeryVeryVeryLongClassName7$.OuterLevelWithVeryVeryVeryLongClassName8$.OuterLevelWithVeryVeryVeryLongClassName9$.OuterLevelWithVeryVeryVeryLongClassName10$ OuterLevelWithVeryVeryVeryLongClassName10 ()  { throw new RuntimeException(); }
                  }
                  // not preceding
                  // not preceding
                  public  class OuterLevelWithVeryVeryVeryLongClassName9$ {
                    /**
                     * Static reference to the singleton instance of this Scala object.
                     */
                    public static final OuterLevelWithVeryVeryVeryLongClassName9$ MODULE$ = null;
                    public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$.OuterLevelWithVeryVeryVeryLongClassName6$.OuterLevelWithVeryVeryVeryLongClassName7$.OuterLevelWithVeryVeryVeryLongClassName8$.OuterLevelWithVeryVeryVeryLongClassName9$.OuterLevelWithVeryVeryVeryLongClassName10$ OuterLevelWithVeryVeryVeryLongClassName10 ()  { throw new RuntimeException(); }
                    public   OuterLevelWithVeryVeryVeryLongClassName9$ ()  { throw new RuntimeException(); }
                  }
                  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$.OuterLevelWithVeryVeryVeryLongClassName6$.OuterLevelWithVeryVeryVeryLongClassName7$.OuterLevelWithVeryVeryVeryLongClassName8$.OuterLevelWithVeryVeryVeryLongClassName9$ OuterLevelWithVeryVeryVeryLongClassName9 ()  { throw new RuntimeException(); }
                  public   OuterLevelWithVeryVeryVeryLongClassName8$ ()  { throw new RuntimeException(); }
                }
                static public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$.OuterLevelWithVeryVeryVeryLongClassName6$.OuterLevelWithVeryVeryVeryLongClassName7$.OuterLevelWithVeryVeryVeryLongClassName8$ OuterLevelWithVeryVeryVeryLongClassName8 ()  { throw new RuntimeException(); }
              }
              // not preceding
              // not preceding
              public  class OuterLevelWithVeryVeryVeryLongClassName7$ {
                /**
                 * Static reference to the singleton instance of this Scala object.
                 */
                public static final OuterLevelWithVeryVeryVeryLongClassName7$ MODULE$ = null;
                public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$.OuterLevelWithVeryVeryVeryLongClassName6$.OuterLevelWithVeryVeryVeryLongClassName7$.OuterLevelWithVeryVeryVeryLongClassName8$ OuterLevelWithVeryVeryVeryLongClassName8 ()  { throw new RuntimeException(); }
                public   OuterLevelWithVeryVeryVeryLongClassName7$ ()  { throw new RuntimeException(); }
              }
              public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$.OuterLevelWithVeryVeryVeryLongClassName6$.OuterLevelWithVeryVeryVeryLongClassName7$ OuterLevelWithVeryVeryVeryLongClassName7 ()  { throw new RuntimeException(); }
              public   OuterLevelWithVeryVeryVeryLongClassName6$ ()  { throw new RuntimeException(); }
            }
            static public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$.OuterLevelWithVeryVeryVeryLongClassName6$ OuterLevelWithVeryVeryVeryLongClassName6 ()  { throw new RuntimeException(); }
          }
          // not preceding
          // not preceding
          public  class OuterLevelWithVeryVeryVeryLongClassName5$ {
            /**
             * Static reference to the singleton instance of this Scala object.
             */
            public static final OuterLevelWithVeryVeryVeryLongClassName5$ MODULE$ = null;
            public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$.OuterLevelWithVeryVeryVeryLongClassName6$ OuterLevelWithVeryVeryVeryLongClassName6 ()  { throw new RuntimeException(); }
            public   OuterLevelWithVeryVeryVeryLongClassName5$ ()  { throw new RuntimeException(); }
          }
          public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$.OuterLevelWithVeryVeryVeryLongClassName5$ OuterLevelWithVeryVeryVeryLongClassName5 ()  { throw new RuntimeException(); }
          public   OuterLevelWithVeryVeryVeryLongClassName4$ ()  { throw new RuntimeException(); }
        }
        static public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$ OuterLevelWithVeryVeryVeryLongClassName4 ()  { throw new RuntimeException(); }
      }
      // not preceding
      // not preceding
      public  class OuterLevelWithVeryVeryVeryLongClassName3$ {
        /**
         * Static reference to the singleton instance of this Scala object.
         */
        public static final OuterLevelWithVeryVeryVeryLongClassName3$ MODULE$ = null;
        public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$.OuterLevelWithVeryVeryVeryLongClassName4$ OuterLevelWithVeryVeryVeryLongClassName4 ()  { throw new RuntimeException(); }
        public   OuterLevelWithVeryVeryVeryLongClassName3$ ()  { throw new RuntimeException(); }
      }
      public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$.OuterLevelWithVeryVeryVeryLongClassName3$ OuterLevelWithVeryVeryVeryLongClassName3 ()  { throw new RuntimeException(); }
      public   OuterLevelWithVeryVeryVeryLongClassName2$ ()  { throw new RuntimeException(); }
    }
    static public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$ OuterLevelWithVeryVeryVeryLongClassName2 ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class OuterLevelWithVeryVeryVeryLongClassName1$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final OuterLevelWithVeryVeryVeryLongClassName1$ MODULE$ = null;
    public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$.OuterLevelWithVeryVeryVeryLongClassName2$ OuterLevelWithVeryVeryVeryLongClassName2 ()  { throw new RuntimeException(); }
    public   OuterLevelWithVeryVeryVeryLongClassName1$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public   ExpressionEncoderSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.MalformedClassObject$ MalformedClassObject ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.encoders.ExpressionEncoderSuite.OuterLevelWithVeryVeryVeryLongClassName1$ OuterLevelWithVeryVeryVeryLongClassName1 ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.catalyst.analysis.Analyzer caseInsensitiveAnalyzer ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.catalyst.analysis.Analyzer caseSensitiveAnalyzer ()  { throw new RuntimeException(); }
  public <T extends java.lang.Object> org.apache.spark.sql.catalyst.encoders.ExpressionEncoder<T> encoder (scala.reflect.api.TypeTags.TypeTag<T> evidence$1)  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
}

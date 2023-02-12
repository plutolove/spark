package org.apache.spark.sql.catalyst.expressions.codegen;
/** Returns true iff we support this data type. */
// not preceding
public  class GenerateUnsafeProjection$ extends org.apache.spark.sql.catalyst.expressions.codegen.CodeGenerator<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.UnsafeProjection> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GenerateUnsafeProjection$ MODULE$ = null;
  public   GenerateUnsafeProjection$ ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean canSupport (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode createCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, boolean useSubexprElimination)  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> canonicalize (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> in)  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> bind (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> in, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.UnsafeProjection generate (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, boolean subexpressionEliminationEnabled)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.UnsafeProjection create (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> references)  { throw new RuntimeException(); }
}

package org.apache.spark.ml;
/**
 * The parent estimator that produced this model.
 * @note For ensembles' component Models, this value can be null.
 */
public abstract class Model<M extends org.apache.spark.ml.Model<M>> extends org.apache.spark.ml.Transformer {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Ident(org.apache.spark.ml.Model), List(TypeTree().setOriginal(Ident(TypeName("M"))))))))
  public   Model ()  { throw new RuntimeException(); }
  public abstract  M copy (org.apache.spark.ml.param.ParamMap extra)  ;
  /** Indicates whether this {@link Model} has a corresponding parent. */
  public  boolean hasParent ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.Estimator<M> parent ()  { throw new RuntimeException(); }
  /**
   * Sets the parent of this model (Java API).
   * @param parent (undocumented)
   * @return (undocumented)
   */
  public  M setParent (org.apache.spark.ml.Estimator<M> parent)  { throw new RuntimeException(); }
}
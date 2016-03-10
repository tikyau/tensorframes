// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/tensor_shape.proto

package org.tensorflow.framework;

public interface TensorShapeProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.TensorShapeProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .tensorflow.TensorShapeProto.Dim dim = 2;</code>
   *
   * <pre>
   * Dimensions of the tensor, such as {"input", 30}, {"output", 40}
   * for a 30 x 40 2D tensor.  If an entry has size -1, this
   * corresponds to a dimension of unknown size. The names are
   * optional.
   * The order of entries in "dim" matters: It indicates the layout of the
   * values in the tensor in-memory representation.
   * The first entry in "dim" is the outermost dimension used to layout the
   * values, the last entry is the innermost dimension.  This matches the
   * in-memory layout of RowMajor Eigen tensors.
   * If "dim.size()" &gt; 0, "unknown_rank" must be false.
   * </pre>
   */
  java.util.List<org.tensorflow.framework.TensorShapeProto.Dim> 
      getDimList();
  /**
   * <code>repeated .tensorflow.TensorShapeProto.Dim dim = 2;</code>
   *
   * <pre>
   * Dimensions of the tensor, such as {"input", 30}, {"output", 40}
   * for a 30 x 40 2D tensor.  If an entry has size -1, this
   * corresponds to a dimension of unknown size. The names are
   * optional.
   * The order of entries in "dim" matters: It indicates the layout of the
   * values in the tensor in-memory representation.
   * The first entry in "dim" is the outermost dimension used to layout the
   * values, the last entry is the innermost dimension.  This matches the
   * in-memory layout of RowMajor Eigen tensors.
   * If "dim.size()" &gt; 0, "unknown_rank" must be false.
   * </pre>
   */
  org.tensorflow.framework.TensorShapeProto.Dim getDim(int index);
  /**
   * <code>repeated .tensorflow.TensorShapeProto.Dim dim = 2;</code>
   *
   * <pre>
   * Dimensions of the tensor, such as {"input", 30}, {"output", 40}
   * for a 30 x 40 2D tensor.  If an entry has size -1, this
   * corresponds to a dimension of unknown size. The names are
   * optional.
   * The order of entries in "dim" matters: It indicates the layout of the
   * values in the tensor in-memory representation.
   * The first entry in "dim" is the outermost dimension used to layout the
   * values, the last entry is the innermost dimension.  This matches the
   * in-memory layout of RowMajor Eigen tensors.
   * If "dim.size()" &gt; 0, "unknown_rank" must be false.
   * </pre>
   */
  int getDimCount();
  /**
   * <code>repeated .tensorflow.TensorShapeProto.Dim dim = 2;</code>
   *
   * <pre>
   * Dimensions of the tensor, such as {"input", 30}, {"output", 40}
   * for a 30 x 40 2D tensor.  If an entry has size -1, this
   * corresponds to a dimension of unknown size. The names are
   * optional.
   * The order of entries in "dim" matters: It indicates the layout of the
   * values in the tensor in-memory representation.
   * The first entry in "dim" is the outermost dimension used to layout the
   * values, the last entry is the innermost dimension.  This matches the
   * in-memory layout of RowMajor Eigen tensors.
   * If "dim.size()" &gt; 0, "unknown_rank" must be false.
   * </pre>
   */
  java.util.List<? extends org.tensorflow.framework.TensorShapeProto.DimOrBuilder> 
      getDimOrBuilderList();
  /**
   * <code>repeated .tensorflow.TensorShapeProto.Dim dim = 2;</code>
   *
   * <pre>
   * Dimensions of the tensor, such as {"input", 30}, {"output", 40}
   * for a 30 x 40 2D tensor.  If an entry has size -1, this
   * corresponds to a dimension of unknown size. The names are
   * optional.
   * The order of entries in "dim" matters: It indicates the layout of the
   * values in the tensor in-memory representation.
   * The first entry in "dim" is the outermost dimension used to layout the
   * values, the last entry is the innermost dimension.  This matches the
   * in-memory layout of RowMajor Eigen tensors.
   * If "dim.size()" &gt; 0, "unknown_rank" must be false.
   * </pre>
   */
  org.tensorflow.framework.TensorShapeProto.DimOrBuilder getDimOrBuilder(
      int index);

  /**
   * <code>optional bool unknown_rank = 3;</code>
   *
   * <pre>
   * If true, the number of dimensions in the shape is unknown.
   * If true, "dim.size()" must be 0.
   * </pre>
   */
  boolean getUnknownRank();
}

/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package ox.xtext.peweb.graph.graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ox.xtext.peweb.graph.graph.GraphConstant#getVertices <em>Vertices</em>}</li>
 *   <li>{@link ox.xtext.peweb.graph.graph.GraphConstant#getEdges <em>Edges</em>}</li>
 * </ul>
 *
 * @see ox.xtext.peweb.graph.graph.GraphPackage#getGraphConstant()
 * @model
 * @generated
 */
public interface GraphConstant extends Expr
{
  /**
   * Returns the value of the '<em><b>Vertices</b></em>' containment reference list.
   * The list contents are of type {@link ox.xtext.peweb.graph.graph.Vertex}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vertices</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vertices</em>' containment reference list.
   * @see ox.xtext.peweb.graph.graph.GraphPackage#getGraphConstant_Vertices()
   * @model containment="true"
   * @generated
   */
  EList<Vertex> getVertices();

  /**
   * Returns the value of the '<em><b>Edges</b></em>' containment reference list.
   * The list contents are of type {@link ox.xtext.peweb.graph.graph.Edge}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Edges</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Edges</em>' containment reference list.
   * @see ox.xtext.peweb.graph.graph.GraphPackage#getGraphConstant_Edges()
   * @model containment="true"
   * @generated
   */
  EList<Edge> getEdges();

} // GraphConstant
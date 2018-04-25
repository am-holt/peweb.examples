/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package ox.xtext.peweb.graph.graph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ox.xtext.peweb.graph.graph.Edge#getSource <em>Source</em>}</li>
 *   <li>{@link ox.xtext.peweb.graph.graph.Edge#getDest <em>Dest</em>}</li>
 * </ul>
 *
 * @see ox.xtext.peweb.graph.graph.GraphPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(Vertex)
   * @see ox.xtext.peweb.graph.graph.GraphPackage#getEdge_Source()
   * @model
   * @generated
   */
  Vertex getSource();

  /**
   * Sets the value of the '{@link ox.xtext.peweb.graph.graph.Edge#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Vertex value);

  /**
   * Returns the value of the '<em><b>Dest</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dest</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dest</em>' reference.
   * @see #setDest(Vertex)
   * @see ox.xtext.peweb.graph.graph.GraphPackage#getEdge_Dest()
   * @model
   * @generated
   */
  Vertex getDest();

  /**
   * Sets the value of the '{@link ox.xtext.peweb.graph.graph.Edge#getDest <em>Dest</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dest</em>' reference.
   * @see #getDest()
   * @generated
   */
  void setDest(Vertex value);

} // Edge
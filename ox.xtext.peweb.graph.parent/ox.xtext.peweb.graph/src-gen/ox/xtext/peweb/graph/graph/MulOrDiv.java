/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package ox.xtext.peweb.graph.graph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mul Or Div</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ox.xtext.peweb.graph.graph.MulOrDiv#getLeft <em>Left</em>}</li>
 *   <li>{@link ox.xtext.peweb.graph.graph.MulOrDiv#getOp <em>Op</em>}</li>
 *   <li>{@link ox.xtext.peweb.graph.graph.MulOrDiv#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see ox.xtext.peweb.graph.graph.GraphPackage#getMulOrDiv()
 * @model
 * @generated
 */
public interface MulOrDiv extends Expr
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expr)
   * @see ox.xtext.peweb.graph.graph.GraphPackage#getMulOrDiv_Left()
   * @model containment="true"
   * @generated
   */
  Expr getLeft();

  /**
   * Sets the value of the '{@link ox.xtext.peweb.graph.graph.MulOrDiv#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expr value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see ox.xtext.peweb.graph.graph.GraphPackage#getMulOrDiv_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link ox.xtext.peweb.graph.graph.MulOrDiv#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expr)
   * @see ox.xtext.peweb.graph.graph.GraphPackage#getMulOrDiv_Right()
   * @model containment="true"
   * @generated
   */
  Expr getRight();

  /**
   * Sets the value of the '{@link ox.xtext.peweb.graph.graph.MulOrDiv#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expr value);

} // MulOrDiv

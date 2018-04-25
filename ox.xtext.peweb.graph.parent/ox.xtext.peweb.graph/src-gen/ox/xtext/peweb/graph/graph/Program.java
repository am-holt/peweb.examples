/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package ox.xtext.peweb.graph.graph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ox.xtext.peweb.graph.graph.Program#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link ox.xtext.peweb.graph.graph.Program#getStmts <em>Stmts</em>}</li>
 * </ul>
 *
 * @see ox.xtext.peweb.graph.graph.GraphPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link ox.xtext.peweb.graph.graph.Declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see ox.xtext.peweb.graph.graph.GraphPackage#getProgram_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<Declaration> getDeclarations();

  /**
   * Returns the value of the '<em><b>Stmts</b></em>' containment reference list.
   * The list contents are of type {@link ox.xtext.peweb.graph.graph.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stmts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stmts</em>' containment reference list.
   * @see ox.xtext.peweb.graph.graph.GraphPackage#getProgram_Stmts()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStmts();

} // Program
/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package ox.xtext.peweb.arithmetic.arithmetic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ox.xtext.peweb.arithmetic.arithmetic.Import#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @see ox.xtext.peweb.arithmetic.arithmetic.ArithmeticPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject
{
  /**
   * Returns the value of the '<em><b>Module</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module</em>' reference.
   * @see #setModule(ox.xtext.peweb.arithmetic.arithmetic.Module)
   * @see ox.xtext.peweb.arithmetic.arithmetic.ArithmeticPackage#getImport_Module()
   * @model
   * @generated
   */
  ox.xtext.peweb.arithmetic.arithmetic.Module getModule();

  /**
   * Sets the value of the '{@link ox.xtext.peweb.arithmetic.arithmetic.Import#getModule <em>Module</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module</em>' reference.
   * @see #getModule()
   * @generated
   */
  void setModule(ox.xtext.peweb.arithmetic.arithmetic.Module value);

} // Import
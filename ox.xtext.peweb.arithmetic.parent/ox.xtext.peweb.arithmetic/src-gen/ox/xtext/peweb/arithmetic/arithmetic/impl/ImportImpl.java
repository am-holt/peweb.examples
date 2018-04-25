/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package ox.xtext.peweb.arithmetic.arithmetic.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ox.xtext.peweb.arithmetic.arithmetic.ArithmeticPackage;
import ox.xtext.peweb.arithmetic.arithmetic.Import;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ox.xtext.peweb.arithmetic.arithmetic.impl.ImportImpl#getModule <em>Module</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportImpl extends MinimalEObjectImpl.Container implements Import
{
  /**
   * The cached value of the '{@link #getModule() <em>Module</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModule()
   * @generated
   * @ordered
   */
  protected ox.xtext.peweb.arithmetic.arithmetic.Module module;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ArithmeticPackage.Literals.IMPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ox.xtext.peweb.arithmetic.arithmetic.Module getModule()
  {
    if (module != null && module.eIsProxy())
    {
      InternalEObject oldModule = (InternalEObject)module;
      module = (ox.xtext.peweb.arithmetic.arithmetic.Module)eResolveProxy(oldModule);
      if (module != oldModule)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ArithmeticPackage.IMPORT__MODULE, oldModule, module));
      }
    }
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ox.xtext.peweb.arithmetic.arithmetic.Module basicGetModule()
  {
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModule(ox.xtext.peweb.arithmetic.arithmetic.Module newModule)
  {
    ox.xtext.peweb.arithmetic.arithmetic.Module oldModule = module;
    module = newModule;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ArithmeticPackage.IMPORT__MODULE, oldModule, module));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ArithmeticPackage.IMPORT__MODULE:
        if (resolve) return getModule();
        return basicGetModule();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ArithmeticPackage.IMPORT__MODULE:
        setModule((ox.xtext.peweb.arithmetic.arithmetic.Module)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ArithmeticPackage.IMPORT__MODULE:
        setModule((ox.xtext.peweb.arithmetic.arithmetic.Module)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ArithmeticPackage.IMPORT__MODULE:
        return module != null;
    }
    return super.eIsSet(featureID);
  }

} //ImportImpl
/**
 * generated by Xtext 2.14.0-SNAPSHOT
 */
package ox.xtext.peweb.question.q.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ox.xtext.peweb.question.q.MultipleChoiceAnswer;
import ox.xtext.peweb.question.q.QPackage;
import ox.xtext.peweb.question.q.SectionReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Choice Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ox.xtext.peweb.question.q.impl.MultipleChoiceAnswerImpl#getAnswer <em>Answer</em>}</li>
 *   <li>{@link ox.xtext.peweb.question.q.impl.MultipleChoiceAnswerImpl#getGoto <em>Goto</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultipleChoiceAnswerImpl extends MinimalEObjectImpl.Container implements MultipleChoiceAnswer
{
  /**
   * The default value of the '{@link #getAnswer() <em>Answer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnswer()
   * @generated
   * @ordered
   */
  protected static final String ANSWER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAnswer() <em>Answer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnswer()
   * @generated
   * @ordered
   */
  protected String answer = ANSWER_EDEFAULT;

  /**
   * The cached value of the '{@link #getGoto() <em>Goto</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoto()
   * @generated
   * @ordered
   */
  protected SectionReference goto_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultipleChoiceAnswerImpl()
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
    return QPackage.Literals.MULTIPLE_CHOICE_ANSWER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAnswer()
  {
    return answer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnswer(String newAnswer)
  {
    String oldAnswer = answer;
    answer = newAnswer;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QPackage.MULTIPLE_CHOICE_ANSWER__ANSWER, oldAnswer, answer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SectionReference getGoto()
  {
    return goto_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGoto(SectionReference newGoto, NotificationChain msgs)
  {
    SectionReference oldGoto = goto_;
    goto_ = newGoto;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QPackage.MULTIPLE_CHOICE_ANSWER__GOTO, oldGoto, newGoto);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGoto(SectionReference newGoto)
  {
    if (newGoto != goto_)
    {
      NotificationChain msgs = null;
      if (goto_ != null)
        msgs = ((InternalEObject)goto_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QPackage.MULTIPLE_CHOICE_ANSWER__GOTO, null, msgs);
      if (newGoto != null)
        msgs = ((InternalEObject)newGoto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QPackage.MULTIPLE_CHOICE_ANSWER__GOTO, null, msgs);
      msgs = basicSetGoto(newGoto, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QPackage.MULTIPLE_CHOICE_ANSWER__GOTO, newGoto, newGoto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case QPackage.MULTIPLE_CHOICE_ANSWER__GOTO:
        return basicSetGoto(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case QPackage.MULTIPLE_CHOICE_ANSWER__ANSWER:
        return getAnswer();
      case QPackage.MULTIPLE_CHOICE_ANSWER__GOTO:
        return getGoto();
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
      case QPackage.MULTIPLE_CHOICE_ANSWER__ANSWER:
        setAnswer((String)newValue);
        return;
      case QPackage.MULTIPLE_CHOICE_ANSWER__GOTO:
        setGoto((SectionReference)newValue);
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
      case QPackage.MULTIPLE_CHOICE_ANSWER__ANSWER:
        setAnswer(ANSWER_EDEFAULT);
        return;
      case QPackage.MULTIPLE_CHOICE_ANSWER__GOTO:
        setGoto((SectionReference)null);
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
      case QPackage.MULTIPLE_CHOICE_ANSWER__ANSWER:
        return ANSWER_EDEFAULT == null ? answer != null : !ANSWER_EDEFAULT.equals(answer);
      case QPackage.MULTIPLE_CHOICE_ANSWER__GOTO:
        return goto_ != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (answer: ");
    result.append(answer);
    result.append(')');
    return result.toString();
  }

} //MultipleChoiceAnswerImpl
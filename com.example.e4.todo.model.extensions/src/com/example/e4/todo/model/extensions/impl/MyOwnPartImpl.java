/**
 */
package com.example.e4.todo.model.extensions.impl;

import com.example.e4.todo.model.extensions.ExtensionsPackage;
import com.example.e4.todo.model.extensions.MyOwnPart;

import org.eclipse.e4.ui.model.application.ui.basic.impl.PartImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>My Own Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.e4.todo.model.extensions.impl.MyOwnPartImpl#getMyExtendedValue <em>My Extended Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MyOwnPartImpl extends PartImpl implements MyOwnPart {
  /**
   * The default value of the '{@link #getMyExtendedValue() <em>My Extended Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMyExtendedValue()
   * @generated
   * @ordered
   */
  protected static final String MY_EXTENDED_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMyExtendedValue() <em>My Extended Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMyExtendedValue()
   * @generated
   * @ordered
   */
  protected String myExtendedValue = MY_EXTENDED_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MyOwnPartImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return ExtensionsPackage.Literals.MY_OWN_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMyExtendedValue() {
    return myExtendedValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMyExtendedValue(String newMyExtendedValue) {
    String oldMyExtendedValue = myExtendedValue;
    myExtendedValue = newMyExtendedValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.MY_OWN_PART__MY_EXTENDED_VALUE, oldMyExtendedValue, myExtendedValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case ExtensionsPackage.MY_OWN_PART__MY_EXTENDED_VALUE:
        return getMyExtendedValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case ExtensionsPackage.MY_OWN_PART__MY_EXTENDED_VALUE:
        setMyExtendedValue((String)newValue);
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
  public void eUnset(int featureID) {
    switch (featureID) {
      case ExtensionsPackage.MY_OWN_PART__MY_EXTENDED_VALUE:
        setMyExtendedValue(MY_EXTENDED_VALUE_EDEFAULT);
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
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case ExtensionsPackage.MY_OWN_PART__MY_EXTENDED_VALUE:
        return MY_EXTENDED_VALUE_EDEFAULT == null ? myExtendedValue != null : !MY_EXTENDED_VALUE_EDEFAULT.equals(myExtendedValue);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (myExtendedValue: ");
    result.append(myExtendedValue);
    result.append(')');
    return result.toString();
  }

} //MyOwnPartImpl

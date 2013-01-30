/**
 */
package com.example.e4.todo.model.extensions.impl;

import com.example.e4.todo.model.extensions.ExtensionsPackage;
import com.example.e4.todo.model.extensions.MyOwnPartStack;

import org.eclipse.e4.ui.model.application.ui.basic.impl.PartStackImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>My Own Part Stack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.example.e4.todo.model.extensions.impl.MyOwnPartStackImpl#getPartSpecial <em>Part Special</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MyOwnPartStackImpl extends PartStackImpl implements MyOwnPartStack {
  /**
   * The default value of the '{@link #getPartSpecial() <em>Part Special</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartSpecial()
   * @generated
   * @ordered
   */
  protected static final String PART_SPECIAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPartSpecial() <em>Part Special</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartSpecial()
   * @generated
   * @ordered
   */
  protected String partSpecial = PART_SPECIAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MyOwnPartStackImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return ExtensionsPackage.Literals.MY_OWN_PART_STACK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPartSpecial() {
    return partSpecial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartSpecial(String newPartSpecial) {
    String oldPartSpecial = partSpecial;
    partSpecial = newPartSpecial;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExtensionsPackage.MY_OWN_PART_STACK__PART_SPECIAL, oldPartSpecial, partSpecial));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case ExtensionsPackage.MY_OWN_PART_STACK__PART_SPECIAL:
        return getPartSpecial();
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
      case ExtensionsPackage.MY_OWN_PART_STACK__PART_SPECIAL:
        setPartSpecial((String)newValue);
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
      case ExtensionsPackage.MY_OWN_PART_STACK__PART_SPECIAL:
        setPartSpecial(PART_SPECIAL_EDEFAULT);
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
      case ExtensionsPackage.MY_OWN_PART_STACK__PART_SPECIAL:
        return PART_SPECIAL_EDEFAULT == null ? partSpecial != null : !PART_SPECIAL_EDEFAULT.equals(partSpecial);
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
    result.append(" (partSpecial: ");
    result.append(partSpecial);
    result.append(')');
    return result.toString();
  }

} //MyOwnPartStackImpl

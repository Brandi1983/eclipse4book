/**
 */
package com.example.e4.todo.model.extensions;

import org.eclipse.e4.ui.model.application.ui.basic.MPart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Own Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.e4.todo.model.extensions.MyOwnPart#getMyExtendedValue <em>My Extended Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.e4.todo.model.extensions.ExtensionsPackage#getMyOwnPart()
 * @model
 * @generated
 */
public interface MyOwnPart extends EObject, MPart {
  /**
   * Returns the value of the '<em><b>My Extended Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>My Extended Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>My Extended Value</em>' attribute.
   * @see #setMyExtendedValue(String)
   * @see com.example.e4.todo.model.extensions.ExtensionsPackage#getMyOwnPart_MyExtendedValue()
   * @model
   * @generated
   */
  String getMyExtendedValue();

  /**
   * Sets the value of the '{@link com.example.e4.todo.model.extensions.MyOwnPart#getMyExtendedValue <em>My Extended Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>My Extended Value</em>' attribute.
   * @see #getMyExtendedValue()
   * @generated
   */
  void setMyExtendedValue(String value);

} // MyOwnPart

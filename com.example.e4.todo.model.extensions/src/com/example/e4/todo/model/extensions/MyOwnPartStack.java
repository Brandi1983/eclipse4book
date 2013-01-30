/**
 */
package com.example.e4.todo.model.extensions;

import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Own Part Stack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.example.e4.todo.model.extensions.MyOwnPartStack#getPartSpecial <em>Part Special</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.example.e4.todo.model.extensions.ExtensionsPackage#getMyOwnPartStack()
 * @model
 * @generated
 */
public interface MyOwnPartStack extends EObject, MPartStack {
  /**
   * Returns the value of the '<em><b>Part Special</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part Special</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part Special</em>' attribute.
   * @see #setPartSpecial(String)
   * @see com.example.e4.todo.model.extensions.ExtensionsPackage#getMyOwnPartStack_PartSpecial()
   * @model
   * @generated
   */
  String getPartSpecial();

  /**
   * Sets the value of the '{@link com.example.e4.todo.model.extensions.MyOwnPartStack#getPartSpecial <em>Part Special</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Part Special</em>' attribute.
   * @see #getPartSpecial()
   * @generated
   */
  void setPartSpecial(String value);

} // MyOwnPartStack

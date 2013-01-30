/**
 */
package com.example.e4.todo.model.extensions;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.example.e4.todo.model.extensions.ExtensionsPackage
 * @generated
 */
public interface ExtensionsFactory extends EFactory {
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ExtensionsFactory eINSTANCE = com.example.e4.todo.model.extensions.impl.ExtensionsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>My Own Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>My Own Part</em>'.
   * @generated
   */
  MyOwnPart createMyOwnPart();

  /**
   * Returns a new object of class '<em>My Own Part Stack</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>My Own Part Stack</em>'.
   * @generated
   */
  MyOwnPartStack createMyOwnPartStack();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ExtensionsPackage getExtensionsPackage();

} //ExtensionsFactory

/**
 */
package com.example.e4.todo.model.extensions.impl;

import com.example.e4.todo.model.extensions.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExtensionsFactoryImpl extends EFactoryImpl implements ExtensionsFactory {
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ExtensionsFactory init() {
    try {
      ExtensionsFactory theExtensionsFactory = (ExtensionsFactory)EPackage.Registry.INSTANCE.getEFactory("http://todo.e4.example.com/extensions"); 
      if (theExtensionsFactory != null) {
        return theExtensionsFactory;
      }
    }
    catch (Exception exception) {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ExtensionsFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtensionsFactoryImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass) {
    switch (eClass.getClassifierID()) {
      case ExtensionsPackage.MY_OWN_PART: return createMyOwnPart();
      case ExtensionsPackage.MY_OWN_PART_STACK: return createMyOwnPartStack();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyOwnPart createMyOwnPart() {
    MyOwnPartImpl myOwnPart = new MyOwnPartImpl();
    return myOwnPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyOwnPartStack createMyOwnPartStack() {
    MyOwnPartStackImpl myOwnPartStack = new MyOwnPartStackImpl();
    return myOwnPartStack;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtensionsPackage getExtensionsPackage() {
    return (ExtensionsPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ExtensionsPackage getPackage() {
    return ExtensionsPackage.eINSTANCE;
  }

} //ExtensionsFactoryImpl

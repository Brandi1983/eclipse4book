package com.example.e4.todo.model.extension.editor;

import org.eclipse.e4.tools.emf.ui.common.IEditorDescriptor;
import org.eclipse.emf.ecore.EClass;

import com.example.e4.todo.model.extensions.ExtensionsPackage;

public class MyOwnPartEditorDescriptor implements IEditorDescriptor {
  
  // Simple mapping class to describe which editor should be used to edit the specific EClass 

  @Override
  public EClass getEClass() {
    return ExtensionsPackage.Literals.MY_OWN_PART;
  }

  @Override
  public Class<?> getEditorClass() {
    return MyOwnPartEditor.class;
  }

}

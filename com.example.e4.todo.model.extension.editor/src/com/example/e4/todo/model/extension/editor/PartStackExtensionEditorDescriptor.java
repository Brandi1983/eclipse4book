package com.example.e4.todo.model.extension.editor;

import org.eclipse.e4.tools.emf.ui.common.IEditorDescriptor;
import org.eclipse.e4.ui.model.application.ui.basic.impl.BasicPackageImpl;
import org.eclipse.emf.ecore.EClass;

@SuppressWarnings("restriction")
public class PartStackExtensionEditorDescriptor implements IEditorDescriptor {

  @Override
  public EClass getEClass() {
    return BasicPackageImpl.Literals.PART_STACK;
  }

  @Override
  public Class<?> getEditorClass() {
    return ExtendedPartEditor.class;
  }

}

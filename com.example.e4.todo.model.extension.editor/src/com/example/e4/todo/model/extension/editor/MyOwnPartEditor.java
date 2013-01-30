package com.example.e4.todo.model.extension.editor;

import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.e4.tools.emf.ui.internal.common.component.ControlFactory;
import org.eclipse.e4.tools.emf.ui.internal.common.component.PartEditor;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.example.e4.todo.model.extensions.ExtensionsPackage;

@SuppressWarnings("restriction")
public class MyOwnPartEditor extends PartEditor {

  /*
   * Simple implementation which extends the "internal" PartEditor to add a new input field
   * for the new "myExtendedValue" of the MyOwnPart class.
   * 
   * A more complex implementation could be written if required just extend the required AbstractComponentEditor
   * and implement the required methods.
   */
  @Override
  protected void createSubformElements(Composite parent, EMFDataBindingContext context, IObservableValue master) {
    ControlFactory.createTextField(parent, "Extended value:", master, context, WidgetProperties.text(SWT.Modify), EMFEditProperties.value(getEditingDomain(),ExtensionsPackage.Literals.MY_OWN_PART__MY_EXTENDED_VALUE));
  }

}

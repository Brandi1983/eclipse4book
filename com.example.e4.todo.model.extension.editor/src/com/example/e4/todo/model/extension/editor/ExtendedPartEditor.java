package com.example.e4.todo.model.extension.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.e4.tools.emf.ui.internal.common.component.PartStackEditor;
import org.eclipse.jface.action.Action;

import com.example.e4.todo.model.extensions.ExtensionsPackage;

@SuppressWarnings("restriction")
public class ExtendedPartEditor extends PartStackEditor {
  
  Action addOwnPart = new Action("MyOwnPart", null) {
    @Override
    public void run() {
      handleAddChild(ExtensionsPackage.Literals.MY_OWN_PART);
    }
  };
  
  public List<Action> getActions(Object element) {
    // extend the context menu on the PartStack node so you can add a new "MyOwnPart"
    List<Action> back = new ArrayList<>(super.getActions(element));
    back.add(addOwnPart);
    return back;
  };

}

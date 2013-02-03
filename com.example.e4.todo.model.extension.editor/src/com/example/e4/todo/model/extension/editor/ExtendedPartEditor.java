package com.example.e4.todo.model.extension.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.e4.tools.emf.ui.internal.common.component.PartStackEditor;
import org.eclipse.jface.action.Action;

import com.example.e4.todo.model.extension.editor.internal.ResourceProvider;
import com.example.e4.todo.model.extensions.ExtensionsPackage;

@SuppressWarnings("restriction")
public class ExtendedPartEditor extends PartStackEditor {
  
  private Action addOwnPartAction;

  public List<Action> getActions(Object element) {
    // extend the context menu on the PartStack node so you can add a new "MyOwnPart"
    List<Action> back = new ArrayList<>(super.getActions(element));
    back.add(getMyOwnPartAction());
    return back;
  };
  
  /**
   * Creates the action for adding a new "MyOwnPart" lazily.
   * @return the action for adding a new "MyOwnPart"
   */
  private Action getMyOwnPartAction(){
    if( addOwnPartAction == null ){
      // The method with the lazy creation of the action is required because the required resources
      // for creating the image via the ResourcePool isn't possible during the constructor call. The
      // reason for this is the Dependency Injection injects this pool after creating the object.
      addOwnPartAction = new Action("MyOwnPart", createImageDescriptor(ResourceProvider.IMG_MyOwnPart)) {
        @Override
        public void run() {
          handleAddChild(ExtensionsPackage.Literals.MY_OWN_PART);
        }
      };
    }
    
    return addOwnPartAction;
  }

}

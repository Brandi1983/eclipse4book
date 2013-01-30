package com.example.e4.rcp.todo.ui.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import com.example.e4.todo.model.extensions.MyOwnPart;

public class MyOwnPartPlayground {
  private MyOwnPart myOwnPart;
  
  @Inject
  public void setMyOwnPart(MyOwnPart myOwnPart){
    this.myOwnPart = myOwnPart;
  }
  
  @PostConstruct
  public void createControls(Composite parent) {
    Label l = new Label(parent, SWT.WRAP);
    l.setText("The value fresh from the Application.e4xmi:\n\t" + myOwnPart.getMyExtendedValue());
  }
}

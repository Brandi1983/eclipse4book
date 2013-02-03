package com.example.e4.todo.model.extension.editor.internal;

import org.eclipse.e4.tools.services.BasicResourceProvider;

public class ResourceProvider extends BasicResourceProvider {

  // Have a look at OSGI-INF/resource.properties and you will see that this is the
  // property key of an entry inside of this file. The value of this property is
  // a location which will be used to load the image inside of the BasicResourceProvider#getImage()
  // method. The connection between the OSGI-INF/resource.properties and this object
  // is established via the DS component definition (see: resourceProvider.xml).
  public static final String IMG_MyOwnPart = "IMG_com.example.e4.todo.model.extensions.MyOwnPart";
}

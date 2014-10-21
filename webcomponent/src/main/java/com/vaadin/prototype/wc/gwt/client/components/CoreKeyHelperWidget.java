package com.vaadin.prototype.wc.gwt.client.components;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;
import com.vaadin.prototype.wc.gwt.client.*;

public class CoreKeyHelperWidget extends BaseWidget  {
  
    protected String[] events() {
      return new String[]{};
    }
    
    public CoreKeyHelperWidget() {
      super(WC.create(CoreKeyHelper.class));
    }
    
    public CoreKeyHelperWidget(CoreKeyHelper element) {
      super(element);
    }
    
    protected CoreKeyHelper element() {
      return (CoreKeyHelper)super.getElement();
    }


}
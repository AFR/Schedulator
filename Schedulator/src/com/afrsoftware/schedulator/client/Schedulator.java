package com.afrsoftware.schedulator.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
 
public class Schedulator implements EntryPoint {
 
     public void onModuleLoad() {
          LoginWidget loginWidget = new LoginWidget();
          RootPanel.get().add(loginWidget);
     }
}
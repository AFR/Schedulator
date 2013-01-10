package com.afrsoftware.schedulator.client;

import com.afrsoftware.schedulator.client.widget.LoginWidget;
import com.afrsoftware.schedulator.client.widget.SignUpWidget;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class Schedulator implements EntryPoint {

	public void onModuleLoad() {
		LoginWidget loginWidget = new LoginWidget();
		SignUpWidget signUpWidget = new SignUpWidget();
		RootPanel.get().add(loginWidget);
	}
}
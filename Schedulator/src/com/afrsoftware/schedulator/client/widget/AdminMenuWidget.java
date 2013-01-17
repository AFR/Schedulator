package com.afrsoftware.schedulator.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class AdminMenuWidget extends Composite {

	private static AdminMenuWidgetUiBinder uiBinder = GWT
			.create(AdminMenuWidgetUiBinder.class);

	interface AdminMenuWidgetUiBinder extends UiBinder<Widget, AdminMenuWidget> {
	}

	public AdminMenuWidget() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@UiField
	Button search;
	
	@UiField
	Button add;
	
	@UiField
	Button calendar;

}

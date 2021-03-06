package com.afrsoftware.schedulator.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class LoginWidget extends Composite {

	private static LoginPanelUiBinder uiBinder = GWT
			.create(LoginPanelUiBinder.class);

	interface LoginPanelUiBinder extends UiBinder<Widget, LoginWidget> {

	}

	@UiField
	TextBox Username;

	@UiField
	PasswordTextBox Password;

	@UiField
	Button signIn;

	@UiField
	Button createAccount;
	
	@UiField
	Button lostPassword;

	public LoginWidget() {
		initWidget(uiBinder.createAndBindUi(this));

		signIn.addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {
				Window.alert("SIGNED IN AS : " + getUsername() + " , "
						+ getPassword());
				RootPanel.get().remove(0);
				RootPanel.get().add(new AdminMenuWidget());
			}
		});

		createAccount.addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {
				RootPanel.get().remove(0);
				RootPanel.get().add(new SignUpWidget());
			}
		});
		
		lostPassword.addClickHandler(new ClickHandler() {
			
			public void onClick(ClickEvent event) {
				Window.alert("LOST PASSWORD :(");
			}
		});
	}

	public String getUsername() {
		return Username.getText();
	}

	public String getPassword() {
		return Password.getText();
	}

}

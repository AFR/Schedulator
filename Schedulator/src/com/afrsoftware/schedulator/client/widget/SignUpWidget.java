package com.afrsoftware.schedulator.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.LabelElement;
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class SignUpWidget extends Composite {

	private static SignUpWidgetUiBinder uiBinder = GWT
			.create(SignUpWidgetUiBinder.class);

	interface SignUpWidgetUiBinder extends UiBinder<Widget, SignUpWidget> {
	}

	@UiField
	DivElement nameErrorGroup;

	@UiField
	LabelElement nameErrorLabel;

	@UiField
	TextBox firstName;

	@UiField
	TextBox lastName;

	@UiField
	DivElement emailErrorGroup;

	@UiField
	LabelElement emailErrorLabel;

	@UiField
	TextBox email;

	@UiField
	DivElement passwordErrorGroup;

	@UiField
	LabelElement passwordErrorLabel;

	@UiField
	TextBox password;

	@UiField
	DivElement confirmPasswordErrorGroup;

	@UiField
	LabelElement confirmPasswordErrorLabel;

	@UiField
	TextBox confirmPassword;

	@UiField
	DivElement birthDateErrorGroup;

	@UiField
	LabelElement birthDateErrorLabel;

	@UiField
	TextBox year;

	@UiField
	TextBox month;

	@UiField
	TextBox day;

	@UiField
	DivElement sexErrorGroup;

	@UiField
	LabelElement sexErrorLabel;

	@UiField
	ListBox sex;

	@UiField
	DivElement addressErrorGroup;

	@UiField
	LabelElement addressErrorLabel;

	@UiField
	TextBox address;
	
	@UiField
	DivElement cityErrorGroup;

	@UiField
	LabelElement cityErrorLabel;
	
	@UiField
	TextBox city;

	@UiField
	DivElement postalCodeErrorGroup;
	
	@UiField
	LabelElement postalCodeErrorLabel;
	
	@UiField
	TextBox postalCode;
	
	@UiField
	DivElement phoneErrorGroup;
	
	@UiField
	LabelElement phoneErrorLabel;

	@UiField
	TextBox phone;

	@UiField
	Button submit;

	public SignUpWidget() {
		initWidget(uiBinder.createAndBindUi(this));

		submit.addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {
				Window.alert("SUBMITED");
			}
		});

		hideAllErrorLabels();
	}

	private void hideAllErrorLabels() {
		nameErrorLabel.getStyle().setDisplay(Display.NONE);
		emailErrorLabel.getStyle().setDisplay(Display.NONE);
		passwordErrorLabel.getStyle().setDisplay(Display.NONE);
		confirmPasswordErrorLabel.getStyle().setDisplay(Display.NONE);
		birthDateErrorLabel.getStyle().setDisplay(Display.NONE);
		sexErrorLabel.getStyle().setDisplay(Display.NONE);
		addressErrorLabel.getStyle().setDisplay(Display.NONE);
		cityErrorLabel.getStyle().setDisplay(Display.NONE);
		postalCodeErrorLabel.getStyle().setDisplay(Display.NONE);
		phoneErrorLabel.getStyle().setDisplay(Display.NONE);
	}

	@UiHandler("year")
	public void onFocusYear(ClickEvent sender) {
		year.selectAll();
	}

	@UiHandler("month")
	public void onFocusMonth(ClickEvent sender) {
		month.selectAll();
	}

	@UiHandler("day")
	public void onFocusDay(ClickEvent sender) {
		day.selectAll();
	}

	@UiHandler("firstName")
	public void onFocusFirstName(ClickEvent sender) {
		firstName.selectAll();
	}

	@UiHandler("lastName")
	public void onFocusLastName(ClickEvent sender) {
		lastName.selectAll();
	}

	@UiHandler("lastName")
	public void onBlurLastName(BlurEvent sender) {
		if (getFirstName().isEmpty() || getLastName().isEmpty()) {
			showErrorLabel(nameErrorGroup, nameErrorLabel);
		} else {
			hideErrorLabel(nameErrorGroup, nameErrorLabel);
		}
	}

	@UiHandler("email")
	public void onBlurEmail(BlurEvent sender) {
		if (getEmail().isEmpty()) {
			showErrorLabel(emailErrorGroup, emailErrorLabel);
		} else {
			hideErrorLabel(emailErrorGroup, emailErrorLabel);
		}
	}

	@UiHandler("password")
	public void onBlurPassword(BlurEvent sender) {
		if (getPassword().isEmpty()) {
			showErrorLabel(passwordErrorGroup, passwordErrorLabel);
		} else {
			hideErrorLabel(passwordErrorGroup, passwordErrorLabel);
		}
	}

	@UiHandler("confirmPassword")
	public void onBlurConfirmPassword(BlurEvent sender) {
		if (!getConfirmPassword().equals(getPassword())) {
			showErrorLabel(confirmPasswordErrorGroup, confirmPasswordErrorLabel);
		} else {
			hideErrorLabel(confirmPasswordErrorGroup, confirmPasswordErrorLabel);
		}
	}

	@UiHandler("day")
	public void onBlurDay(BlurEvent sender) {
		if (getYear().isEmpty() || getMonth().isEmpty() || getDay().isEmpty()) {
			showErrorLabel(birthDateErrorGroup, birthDateErrorLabel);
		} else {
			hideErrorLabel(birthDateErrorGroup, birthDateErrorLabel);
		}
	}

	@UiHandler("sex")
	public void onBlurSex(BlurEvent sender) {
		if (sex.getSelectedIndex() == 0) {
			showErrorLabel(sexErrorGroup, sexErrorLabel);
		} else {
			hideErrorLabel(sexErrorGroup, sexErrorLabel);
		}
	}

	@UiHandler("address")
	public void onBlurAdress(BlurEvent sender) {
		if (getAddress().isEmpty()) {
			showErrorLabel(addressErrorGroup, addressErrorLabel);
		} else {
			hideErrorLabel(addressErrorGroup, addressErrorLabel);
		}
	}
	
	@UiHandler("city")
	public void onBlurCity(BlurEvent sender) {
		if (getCity().isEmpty()) {
			showErrorLabel(cityErrorGroup, cityErrorLabel);
		} else {
			hideErrorLabel(cityErrorGroup, cityErrorLabel);
		}
	}
	
	@UiHandler("postalCode")
	public void onBlurPostalCode(BlurEvent sender) {
		if (getPostalCode().isEmpty()) {
			showErrorLabel(postalCodeErrorGroup, postalCodeErrorLabel);
		} else {
			hideErrorLabel(postalCodeErrorGroup, postalCodeErrorLabel);
		}
	}
	
	@UiHandler("phone")
	public void onBlurPhone(BlurEvent sender) {
		if (getPostalCode().isEmpty()) {
			showErrorLabel(phoneErrorGroup, phoneErrorLabel);
		} else {
			hideErrorLabel(phoneErrorGroup, phoneErrorLabel);
		}
	}

	private void showErrorLabel(DivElement group, LabelElement label) {
		group.addClassName("error");
		label.getStyle().setDisplay(Display.BLOCK);
	}

	private void hideErrorLabel(DivElement group, LabelElement label) {
		group.removeClassName("error");
		label.getStyle().setDisplay(Display.NONE);
	}

	public String getFirstName() {
		return firstName.getText();
	}

	public String getLastName() {
		return lastName.getText();
	}

	public String getEmail() {
		return email.getText();
	}

	public String getPassword() {
		return password.getText();
	}

	public String getConfirmPassword() {
		return confirmPassword.getText();
	}

	public String getYear() {
		return year.getText();
	}

	public String getMonth() {
		return month.getText();
	}

	public String getDay() {
		return day.getText();
	}

	public String getSex() {
		return sex.getValue(sex.getSelectedIndex());
	}

	public String getAddress() {
		return address.getText();
	}

	public String getCity() {
		return city.getText();
	}

	public String getPostalCode() {
		return postalCode.getText();
	}

	public String getPhone() {
		return phone.getText();
	}

}

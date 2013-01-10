package com.afrsoftware.schedulator.client.widget;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.FocusHandler;
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
	TextBox firstName;
	
	@UiField
	TextBox lastName;
	
	@UiField
	TextBox email;
	
	@UiField
	TextBox password;

	@UiField
	TextBox confirmPassword;
	
	@UiField
	TextBox year;
	
	@UiField
	TextBox month;
	
	@UiField
	TextBox day;
	
	@UiField
	ListBox sex;
	
	@UiField
	TextBox address;
	
	@UiField
	TextBox city;
	
	@UiField
	TextBox postalCode;
	
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
	}

	@UiHandler("year")
	public void onFocusYear(ClickEvent sender) 
    { 
        year.selectAll(); 
    }
	
	@UiHandler("month")
	public void onFocusMonth(ClickEvent sender) 
    { 
        month.selectAll(); 
    } 
	
	@UiHandler("day")
	public void onFocusDay(ClickEvent sender) 
    { 
        day.selectAll(); 
    }
	
	@UiHandler("firstName")
	public void onFocusFirstName(ClickEvent sender) 
    { 
        firstName.selectAll(); 
    } 
	
	@UiHandler("lastName")
	public void onFocusLastName(ClickEvent sender) 
    { 
        lastName.selectAll(); 
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

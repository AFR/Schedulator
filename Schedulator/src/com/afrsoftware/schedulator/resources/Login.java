package com.afrsoftware.schedulator.resources;

import com.google.gwt.resources.client.CssResource;

public interface Login extends CssResource {

	@ClassName("form-signin")
	String formSignin();

	String checkbox();

	@ClassName("form-signin-heading")
	String formSigninHeading();
	
}

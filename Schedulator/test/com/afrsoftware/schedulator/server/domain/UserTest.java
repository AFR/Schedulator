package com.afrsoftware.schedulator.server.domain;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class UserTest {

	@Test
	public void canInstantiateAUser() {
		User user = new User();

		assertNotNull(user);
	}

	@Test
	public void canSetDetailsToAUser() {
		User user = new User();

		user.setName("John Doe");
		user.setAdress("1234 1st Avenue");
		user.setCity("New Town");
		user.setZipCode("G8ND5");
		user.setBirthDate(new Date());
		user.setEmail("myveryown@email.com");
		user.setPassword("youshallnotpass");
		user.setPhone("1-123-123-1234");

		assertEquals("John Doe", user.getName());
		assertEquals("1234 1st Avenue", user.getAdress());
	}

}

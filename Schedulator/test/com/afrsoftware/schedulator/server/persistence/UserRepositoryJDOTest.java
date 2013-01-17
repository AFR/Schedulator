package com.afrsoftware.schedulator.server.persistence;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.afrsoftware.schedulator.server.domain.User;

public class UserRepositoryJDOTest {

	private UserRepositoryJDO repo;

	@Before
	public void setUp() {
		repo = new UserRepositoryJDO();
	}

	@Test
	public void canInstantiateAUserRepository() {

		assertNotNull(repo);
	}

	@Test
	public void canSaveAUser() {
		User aUser = createUser();

		repo.saveUser(aUser);
		User savedUser = repo.findByName(aUser.getName());

		assertEquals(aUser.getName(), savedUser.getName());
	}

	@Test
	public void canDeleteAUser() {
		User aUser = createUser();

		repo.saveUser(aUser);

		repo.removeUser(aUser.getName());

		assertNull(repo.findByName(aUser.getName()));
	}

	private User createUser() {
		User user = new User();

		user.setName("John Doe");
		user.setAdress("1234 1st Avenue");
		user.setCity("New Town");
		user.setZipCode("G8ND5");
		user.setBirthDate(new Date());
		user.setEmail("myveryown@email.com");
		user.setPassword("youshallnotpass");
		user.setPhone("1-123-123-1234");

		return user;
	}

}

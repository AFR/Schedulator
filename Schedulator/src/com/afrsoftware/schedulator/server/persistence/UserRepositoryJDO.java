package com.afrsoftware.schedulator.server.persistence;

import com.afrsoftware.schedulator.server.domain.User;
import com.afrsoftware.schedulator.server.domain.repository.UserRepository;

public class UserRepositoryJDO implements UserRepository {

	@Override
	public User findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeUser(String name) {
		// TODO Auto-generated method stub

	}

	// private PersistenceManager getPersistanceManager() {
	// return PMF.getPersistenceManager();
	// }

}

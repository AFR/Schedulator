package com.afrsoftware.schedulator.server.domain.repository;

import com.afrsoftware.schedulator.server.domain.User;

public interface UserRepository {

	public User findByName(String name);

	public void saveUser(User user);

	public void removeUser(String name);

}

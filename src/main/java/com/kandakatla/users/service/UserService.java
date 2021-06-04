package com.kandakatla.users.service;

import java.util.List;

public interface UserService {

	List<User> findAll();

	User findOne(int id);

	User save(User user);

}

package com.kandakatla.users.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	private List<User> users;

	@Override
	public List<User> findAll() {
		return users;
	}

	@Override
	public User findOne(int id) {
		return users.stream().filter(u -> id == u.getId()).findAny().orElse(null);
	}

	@Override
	public User save(User user) {
		users.add(user);
		return user;
	}

	@PostConstruct
	private void postConstruct() {
		users = new ArrayList<>();
		users.add(new User(1, "Sunil"));
	}

}

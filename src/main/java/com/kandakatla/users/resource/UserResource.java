package com.kandakatla.users.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kandakatla.users.service.User;
import com.kandakatla.users.service.UserService;

@RestController
public class UserResource {
	
	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> retriveAllUsers() {
		return userService.findAll();
	}

	@GetMapping("/users/{id}")
	public User retriveUser(@PathVariable int id) {
		return userService.findOne(id);
	}

	@PostMapping("/users")
	public void createUser(@RequestBody User user) {
		userService.save(user);
	}

}

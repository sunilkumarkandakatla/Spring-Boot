package com.kandakatla.users.service;

import javax.validation.constraints.NotBlank;

public class User {

	private int id;
	@NotBlank(message = "Name is required")
	private String name;
	
	public User() {
		super();
	}

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

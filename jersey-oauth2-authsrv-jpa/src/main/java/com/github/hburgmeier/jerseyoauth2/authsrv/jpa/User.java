package com.github.hburgmeier.jerseyoauth2.authsrv.jpa;

import com.github.hburgmeier.jerseyoauth2.api.user.IUser;

public class User implements IUser {

	private String name;
	
	public User(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

}

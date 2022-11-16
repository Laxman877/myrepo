package com.service;

import com.model.User;

public interface UserService {
	public void register(User user);
	public User validate(User login);
}

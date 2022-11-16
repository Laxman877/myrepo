package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
	@Override
	public void register(User user) {
		userDao.register(user);

	}

	
	@Override
	public User validate(User login) {
		// TODO Auto-generated method stub
		return userDao.validate(login);
	}

}

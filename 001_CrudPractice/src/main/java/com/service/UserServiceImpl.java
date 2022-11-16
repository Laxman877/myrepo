package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.Employee;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
	@Override
	public void addUser(Employee user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
	}

	@Override
	public List<Employee> viewAllUser() {
		// TODO Auto-generated method stub
		return userDao.viewAllUser();
	}

	@Override
	public Employee getUserById(int id) {
		// TODO Auto-generated method stub
		return userDao.getUserById(id);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userDao.deleteUser(id);
	}

	@Override
	public Employee getEmployee(String employee) {
		// TODO Auto-generated method stub
		return userDao.getEmployee(employee);
	}

}

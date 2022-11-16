package com.dao;

import java.util.List;

import com.model.Employee;

public interface UserDao {
	
	public void addUser(Employee user);
	public List<Employee> viewAllUser();
	public Employee getUserById(int id);
	public void deleteUser(int id);
	public Employee getEmployee(String employee);
}

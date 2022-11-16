package com.service;

import java.util.List;

import com.model.Admin;
import com.model.Student;

public interface StudentService {

	public void addOrUpdateStd(Student student);
	public Student getStudent(String student);
	public Student getById(int id);
	public void deleteStd(int id);
	public Admin adminValidate(Admin adlogin);
	public List<Student> getAllUser();
}

package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.model.Admin;
import com.model.Student;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDao studentDao;
	@Override
	public void addOrUpdateStd(Student student) {
		// TODO Auto-generated method stub
		studentDao.addOrUpdateStd(student);
	}

	@Override
	public Student getStudent(String student) {
		// TODO Auto-generated method stub
		return studentDao.getStudent(student);
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return studentDao.getById(id);
	}

	@Override
	public void deleteStd(int id) {
		// TODO Auto-generated method stub
		studentDao.deleteStd(id);
	}
	@Override
	public Admin adminValidate(Admin adlogin) {
		// TODO Auto-generated method stub
		return studentDao.adminValidate(adlogin);
	}

	@Override
	public List<Student> getAllUser() {
		// TODO Auto-generated method stub
		return studentDao.getAllUser();
	}
}

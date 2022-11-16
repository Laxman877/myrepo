package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Admin;
import com.model.Student;
@Transactional
@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void addOrUpdateStd(Student student) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(student);
	}

	@Override
	public Student getStudent(String student) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		return (Student) session.createQuery("from Student s where s.email='"+student+"'").uniqueResult();
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		return session.get(Student.class, id);
	}

	@Override
	public void deleteStd(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Student student=session.get(Student.class, id);
		session.delete(student);
	}

	@Override
	public Admin adminValidate(Admin adlogin) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		return (Admin) session.createQuery("from Admin a where a.username='"+adlogin.getUsername()+"' and a.password='"+adlogin.getPassword()+"'").uniqueResult();
	}

	@Override
	public List<Student> getAllUser() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		return session.createQuery("from Student").list();
	}

}

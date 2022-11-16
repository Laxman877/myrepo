package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.UserDao;
import com.model.Employee;
@Transactional
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void addUser(Employee user) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
	}

	@Override
	public List<Employee> viewAllUser() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		return session.createQuery("from Employee").list();
	}

	@Override
	public Employee getUserById(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		return session.get(Employee.class, id);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Employee u= session.get(Employee.class, id);
		session.delete(u);
	}

	@Override
	public Employee getEmployee(String employee) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		return (Employee) session.createQuery("from Employee e where e.id='"+employee+"'").uniqueResult();
	}

}

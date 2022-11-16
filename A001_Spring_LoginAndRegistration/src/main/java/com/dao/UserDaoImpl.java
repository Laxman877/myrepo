package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;
@Transactional
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void register(User user) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(user);
	}

	@Override
	public User validate(User login) {
		Session session=sessionFactory.getCurrentSession();
		User user= (User) session.createQuery("from User u where u.email='"+login.getEmail()+"' and u.password='"+login.getPassword()+"'").uniqueResult();
		return user;
	}

}

package com.springboot.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.hibernate.bean.User;

@Repository
public class UserDaoImp implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	public void addUser(User user) {
		Session session = sessionFactory.getCurrentSession();
//		session.save(user);
//		session.persist(user);
		session.merge(user);
		//session.saveOrUpdate(user);
	}

	public List<User> getUser() {
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<User> list = session.createCriteria(User.class).list();
		return list;
	}

	public User findById(int id) {
		Session session = sessionFactory.getCurrentSession();
		User user =  session.get(User.class, id);
		return user;
	}

	public User update(User val) {
		Session session = sessionFactory.getCurrentSession();
		//User user = (User) session.get(User.class, id);
		
//		user.setCountry(val.getCountry());
//		user.setName(val.getName());
		
		session.update(val);
		return val;
	}

	public void delete(int id) {
		Session session = sessionFactory.getCurrentSession();
		User user = findById(id);
		session.delete(user);
	}

	@Override
	public User updateCountry(User val, int id) {
		Session session = sessionFactory.getCurrentSession();
		User user = (User) session.load(User.class, id);
		user.setCountry(val.getCountry());
		return user;
	}

}

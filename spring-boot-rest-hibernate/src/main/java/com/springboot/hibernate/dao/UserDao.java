package com.springboot.hibernate.dao;

import java.util.List;

import com.springboot.hibernate.bean.User;

public interface UserDao {
	public void addUser(User user);
	public List<User> getUser();
	public User findById(int id);
	public User update(User user);
	public User updateCountry(User user, int id);
	public void delete(int id);
}

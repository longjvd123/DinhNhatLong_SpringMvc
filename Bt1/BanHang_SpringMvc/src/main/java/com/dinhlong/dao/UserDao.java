package com.dinhlong.dao;

import java.util.List;

import com.dinhlong.model.User;

public interface UserDao {
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(int id);
	public User getUserById(int id);
	public List<User> getAllUsers();
}

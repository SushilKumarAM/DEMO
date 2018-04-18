package com.niit.dao;

import com.niit.model.User;

public interface UserDAO {

	public boolean registerUser(User user);
	public boolean updateUser(User user);
	public User getUser(int userId);
	public boolean approveUser(User user);
}

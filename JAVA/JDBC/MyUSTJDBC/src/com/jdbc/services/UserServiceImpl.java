package com.jdbc.services;

import com.jdbc.beans.User;
import com.jdbc.dao.UserDAOJDBCImpl;
import com.jdbc.dao.UserInfoDAO;

public class UserServiceImpl implements UserServices{

	UserInfoDAO dao = new UserDAOJDBCImpl();

	@Override
	public User getAllInfo() {
		return dao.getAllInfo();
	}

	@Override
	public void createProfile(User user) {
		dao.createProfile(user);
	}
}

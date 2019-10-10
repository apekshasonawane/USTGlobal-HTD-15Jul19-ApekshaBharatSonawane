package com.jdbc.dao;

import com.jdbc.beans.User;

public interface UserInfoDAO {
	public User getAllInfo();
	public void createProfile(User user);
}

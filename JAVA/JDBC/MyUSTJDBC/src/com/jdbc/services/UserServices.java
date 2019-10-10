package com.jdbc.services;

import com.jdbc.beans.User;

public interface UserServices {
	public User getAllInfo();
	public void createProfile(User user);
}

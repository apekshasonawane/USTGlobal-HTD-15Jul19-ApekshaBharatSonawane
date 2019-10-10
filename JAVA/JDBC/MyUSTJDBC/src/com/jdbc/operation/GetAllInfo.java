package com.jdbc.operation;

import com.jdbc.services.UserServiceImpl;
import com.jdbc.services.UserServices;

public class GetAllInfo {
	public static void main(String[] args) {
		UserServices us = new UserServiceImpl();
		us.getAllInfo();
	}

}

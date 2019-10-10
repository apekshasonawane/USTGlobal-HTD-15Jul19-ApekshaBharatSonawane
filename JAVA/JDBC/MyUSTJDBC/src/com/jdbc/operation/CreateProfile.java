package com.jdbc.operation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.jdbc.beans.User;
import com.jdbc.services.UserServiceImpl;
import com.jdbc.services.UserServices;

public class CreateProfile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		UserServices us = new UserServiceImpl();
		
		User user = new User();
		
		System.out.println("Enter the UserId");
		user.setUserid(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter the User Name");
		user.setUsername(sc.nextLine());
		System.out.println("Enter the Email");
		user.setEmail(sc.nextLine());
		System.out.println("Enter the Password");
		user.setPasswd(sc.nextLine());
		
		us.createProfile(user);
	}
}

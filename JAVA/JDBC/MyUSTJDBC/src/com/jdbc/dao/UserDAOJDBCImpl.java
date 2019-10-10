package com.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.jdbc.beans.User;

public class UserDAOJDBCImpl implements UserInfoDAO{
	public UserDAOJDBCImpl() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static final String DBURL="jdbc:mysql://localhost:3306/student"
			+ "?user=root&password=root";
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public User getAllInfo() {
		String query = "SELECT * FROM student_info";
		User u = new User();
		try(Connection conn=DriverManager.getConnection(DBURL);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query)){
			while(rs.next()) {
				u.setUserid(rs.getInt("user_id"));
				u.setUsername(rs.getString("username"));
				u.setEmail(rs.getString("email"));
				System.out.println(u);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return u;
	}
	@Override
	public void createProfile(User user) {
		String query = "Insert into student_info"
				+ " values(?,?,?,?)";
		try(Connection conn = DriverManager.getConnection(DBURL);
				PreparedStatement pstmt = conn.prepareStatement(query)){
				pstmt.setInt(1, user.getUserid());
				pstmt.setString(2, user.getUsername());
				pstmt.setString(3, user.getEmail());
				pstmt.setString(4, user.getPasswd());
			int i = pstmt.executeUpdate();
			
			if(i>0) {
				System.out.println("Profile Created....");
			}else {
				System.out.println("Failed to Create Profile....");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

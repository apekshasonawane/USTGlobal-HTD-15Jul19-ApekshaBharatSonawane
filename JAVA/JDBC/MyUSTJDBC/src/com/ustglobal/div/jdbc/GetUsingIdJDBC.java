package com.ustglobal.div.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GetUsingIdJDBC {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet res = null;
		PreparedStatement pstmt=null;
		Scanner sc=new Scanner(System.in);

		try {
			// Load the driver
			//java.sql.Driver div = new Driver();
			//DriverManager.registerDriver(div);
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}		//Another way to load Driver where forName is method & Class is one class
			System.out.println("Driver loaded.....");
			System.out.println("**************************************");
			// get connection via driver
			String dbUrl = "jdbc:mysql://localhost:3306/ust_ty_db?" + 
			"user=root&password=root";

			con = DriverManager.getConnection(dbUrl);// return type of getConnection is object of connection
			System.out.println("Connection started");
      			System.out.println("*******************************************");

			// Issue SQL query via connection
	
			String query = "select * from users_info where userid=?";
			
			pstmt = con.prepareStatement(query);
			
			System.out.println("Enter userid=>");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			
			
		
			
			res = pstmt.executeQuery();

			// process the results returned by SQL query
			
			while (res.next()) {		//return type of next() is boolean used to check whether any row is present or not in the resultset
				
				int user_id=res.getInt("userid");
				
				System.out.println("User Id=>"+user_id);
				System.out.println("User_name=>"+res.getString("username"));
				System.out.println("Email=>"+res.getString("email"));
				System.out.println("PAssword=>"+res.getString("password"));
				System.out.println("************************************");
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{				//Close the connection
			if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			}
			if(stmt!=null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(res!=null) {
				try {
					res.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}

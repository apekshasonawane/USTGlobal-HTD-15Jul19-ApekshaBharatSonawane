package com.ustglobal.div.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateJDBC {
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);		//we r giving input from system
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet res=null;
		
		try {
		
			Class.forName("com.mysql.jdbc.Driver");  //not present in java.sql pkg
			System.out.println("Driver loaded.....");
			String dbUrl="jdbc:mysql://localhost:3306/ust_ty_db";
			System.out.println("Enter username & password=>");
			String user=sc.nextLine();
			String password=sc.nextLine();
			//DriverManager.getConnection(dbUrl,"root","root");		//username & password we can give here or we can take it from user
		
				con=DriverManager.getConnection(dbUrl,user,password);
				System.out.println("Connection created.....");
				
				//Issue query
				String query="update users_info set email=? where userid=? and password=?";
				pstmt=con.prepareStatement(query);
				System.out.println("Enter email=>");
				pstmt.setString(1, sc.nextLine());	
				System.out.println("Enter the userId=>");
				pstmt.setInt(2, Integer.parseInt(sc.nextLine()));		// parseInt takes String as input & returns integer
				
				System.out.println("Enter username=>");
				pstmt.setString(3, sc.nextLine());
				
			
			
				
				int count=pstmt.executeUpdate();		//return type of execute update is integer
				
				//Process the result
				if(count>0) {
					System.out.println("Query OK , "+count +"row affected");
				}else {
					System.out.println("Something went wronng");
				}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
		finally {		//close the conncetion
			if(con!=null) {
				con.close();
			}
			if(pstmt!=null) {
				pstmt.close();
			}
			System.out.println("Connection closed");
		}
		

	}
}

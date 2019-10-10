package com.ustglobal.div.jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class JDBCDeletion {
	
	public static void main(String[] args) throws SQLException, IOException {
		Scanner sc=new Scanner(System.in);		//we r giving input from system
		Connection con=null;
		PreparedStatement pstmt=null;
	
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");  //not present in java.sql pkg
			System.out.println("Driver loaded.....");
			String dbUrl="jdbc:mysql://localhost:3306/ust_ty_db";
			String filepath="F:\\db.properties";
			
			
			FileReader reader=new FileReader(filepath);
			
			Properties prop=new  Properties();
			prop.load(reader);
			con=DriverManager.getConnection(dbUrl,prop);
				System.out.println("Connection created.....");
			
			
				String query="delete from users_info where userid=? and password=?";

			
				pstmt=con.prepareStatement(query);
				
				System.out.println("Enter userid for deletion=>");
				pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("Enter password for deletion=>");
			pstmt.setString(2, sc.nextLine());
				
				int count=pstmt.executeUpdate();
				if(count>0) {
					System.out.println(count +" deleted..... successfully");
				}else
				{
					System.out.println("something went wrong");
				}
				
			
	}catch (ClassNotFoundException e) {
		e.printStackTrace();
	}	finally{				//Close the connection
		if(con!=null) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
		if(pstmt!=null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	}

}
}

package com.ustglobal.div.jdbc;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class MainClass {

	static Connection con = null;
	static PreparedStatement pstmt = null;

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {

		int ch;
		int ch1;
		int ch2;

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("ok");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded.....");
			String dbUrl = "jdbc:mysql://localhost:3306/MusicPlayer";
			String filepath = "C:\\Users\\APEKSHA\\Desktop\\db.properties";

			FileReader reader = new FileReader(filepath);

			Properties prop = new Properties();
			prop.load(reader);
			con = DriverManager.getConnection(dbUrl, prop);
			System.out.println("Connection created.....");
			System.out.println("Press 1:Play Song/n Press 2:Search song /nPress "
					+ "3:Show all Songs\n4:Operate On Songs Database");
			ch = sc.nextInt();
			switch (ch) {
			case 1: {
				int A = 0, B = 0, C = 0;

				System.out.println("Press A:To Play all Songs/n Press B:Play songs Randomly /nPress "
						+ "C:Play a particular Song");
				ch1 = sc.nextInt();
				switch (ch1) {
				case 1:

					break;

				case 2:
					break;

				case 3:
					break;
				default:
					System.out.println("Wrong Choice");

				}
			}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4: {
				System.out.println("Press A:To insert Song/n Press B:Edit song /nPress "
						+ "C:delete Song");
				ch=sc.nextInt();
				switch(ch)
				{
			
				case 1:{
					String query = "insert into MusicFiles values(?,?,?,?,?,?)";
					pstmt = con.prepareStatement(query);
					System.out.println("Enter song_id:");
					pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
					System.out.println("Enter title:");
					pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
					System.out.println("Enter artist_name:");
					pstmt.setString(3, sc.nextLine());
					System.out.println("Enter album_name:");
					pstmt.setString(4, sc.nextLine());
					System.out.println("Enter song_location:");
					pstmt.setString(5, sc.nextLine());
					System.out.println("Enter description:");
					pstmt.setString(6, sc.nextLine());
					int count = pstmt.executeUpdate();
					if (count > 0) {
						System.out.println("Song added....");
					} else {
						System.out.println("Not added....");
					}
				}
					break;

				case 2:
					break;

				case 3:
					break;
				default:
					System.out.println("Wrong Choice");

				}

			}
				break;
			default:
				System.out.println("Wrong choice");
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

public class Assessment1 {

	static Connection con = null;
	static PreparedStatement pstmt = null;
	static ResultSet res = null;

	public static void main(String[] args) {
		int ch;
		char ch1;
		char ch2;

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
			System.out.println("Press 1:Play Song     Press 2:Search song     Press "
					+ "3:Show all Songs     4:Operate On Songs Database");
			ch = sc.nextInt();

			do {
				switch (ch) {
				case 1: {
					System.out.println("Press A:To Play all Songs/n Press B:Play songs Randomly /nPress "
							+ "C:Play a particular Song");
					ch1 = sc.next().charAt(0);
					switch (ch1) {
					case 'A': {

						String query = prop.getProperty("query4");
						pstmt = con.prepareStatement(query);
						res = pstmt.executeQuery();
						while (res.next()) {
							System.out.println("Song Id=>" + res.getInt("Song_ID"));
							System.out.println("Song title=>" + res.getString("Song_Title"));
							System.out.println("Artist name=>" + res.getString("Artist_Name"));
							System.out.println("album name=>" + res.getString("Album_name"));
							System.out.println("song location=>" + res.getString("Song_Location"));
							System.out.println("Description=>" + res.getString("Description"));
							System.out.println("************************************");

						}

					}
						break;
					case 'B': {

						String query = prop.getProperty("query6");

						pstmt = con.prepareStatement(query);

						res = pstmt.executeQuery();
						while (res.next()) {
							System.out.println("Song Id=>" + res.getInt("Song_ID"));
							System.out.println("Song title=>" + res.getString("Song_Title") + "is playing randomly");

							System.out.println("************************************");
						}

					}
						break;
					case 'C': {
						String query = prop.getProperty("query5");

						pstmt = con.prepareStatement(query);
						System.out.println("Enter  Song_ID to play particular :");

						pstmt.setInt(1, sc.nextInt());

						res = pstmt.executeQuery();
						while (res.next()) {
							System.out.println("Song Id=>" + res.getInt("Song_ID"));
							System.out.println("Song title=>" + res.getString("Song_Title") + "is playing particurly");

							System.out.println("************************************");
						}

					}
						break;
					default:
						System.out.println("Wrong choice");
						break;
					}
				}
					break;
				case 2: {

					String query = prop.getProperty("query5");

					pstmt = con.prepareStatement(query);
					System.out.println("Enter  Song_ID to search :");

					pstmt.setInt(1, sc.nextInt());

					res = pstmt.executeQuery();
					while (res.next()) {
						System.out.println("Song Id=>" + res.getInt("Song_ID"));
						System.out.println("Song title=>" + res.getString("Song_Title"));
						System.out.println("Artist name=>" + res.getString("Artist_Name"));
						System.out.println("album name=>" + res.getString("Album_name"));
						System.out.println("song location=>" + res.getString("Song_Location"));
						System.out.println("Description=>" + res.getString("Description"));
						System.out.println("************************************");
						break;
					}

				}
					break;
				case 3: {

					String query = prop.getProperty("query4");
					pstmt = con.prepareStatement(query);
					res = pstmt.executeQuery();
					while (res.next()) {
						System.out.println("Song Id=>" + res.getInt("Song_ID"));
						System.out.println("Song title=>" + res.getString("Song_Title"));
						System.out.println("Artist name=>" + res.getString("Artist_Name"));
						System.out.println("album name=>" + res.getString("Album_name"));
						System.out.println("song location=>" + res.getString("Song_Location"));
						System.out.println("Description=>" + res.getString("Description"));
						System.out.println("************************************");

					}

				}
					break;
				case 4: {

					System.out.println("Press 1:To insert Song/n Press 2:Edit song /nPress " + "3:delete Song");
					ch2 = sc.next().charAt(0);
					switch (ch2) {

					case 'A': {
						String query = prop.getProperty("query1");
						pstmt = con.prepareStatement(query);
						System.out.println("Enter song_id:");
						pstmt.setInt(1, sc.nextInt());
						System.out.println("Enter title:");
						System.out.println(sc.nextLine());
						pstmt.setString(2, sc.nextLine());
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

					case 'B': {
						String query = prop.getProperty("query2");

						pstmt = con.prepareStatement(query);
						System.out.println("Enter new artist name:");
						pstmt.setString(1, sc.nextLine());
						pstmt.setString(1, sc.nextLine());
						System.out.println("Enter song_id:");
						pstmt.setInt(2, sc.nextInt());

						int count = pstmt.executeUpdate();
						if (count > 0) {
							System.out.println("Song updated....");
						} else {
							System.out.println("Not updated....");
						}
					}
						break;

					case 'C': {
						String query = prop.getProperty("query3");

						pstmt = con.prepareStatement(query);
						System.out.println("Enter song_id to delete :");
						pstmt.setInt(1, sc.nextInt());
						int count = pstmt.executeUpdate();

						if (count > 0) {
							System.out.println("Song deleted....");

						} else {
							System.out.println("Not deleted....");
						}

					}
						break;
					default:
						System.out.println("Wrong Choice");
						break;
					}

				}
					break;
				default:
					System.out.println("Wrong choice");
				}
				// System.out.println("press y");
			} while (ch != 0);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

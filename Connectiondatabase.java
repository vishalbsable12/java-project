package Database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connectiondatabase {
	public static Connection getDBconnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jeet_ads", "root", "Sable@121098");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}

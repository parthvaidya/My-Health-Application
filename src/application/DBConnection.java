package application;
import java.sql.*;
public class DBConnection {
	public static Connection Connector() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:Healthrecord.sqlite");
			return conn;
		} catch (Exception e) {
			return null;
		}
	}
	
}


package dBUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnUtil {
	
	public Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/ankit";
		String user="root";
		String password="root";
		Connection conn=DriverManager.getConnection(url, user, password);
		
		return conn;
	}
	
	
	

}

package jdbcex;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class MyConnection {
	static Connection connection;
	
	public static Connection getMyConnection() throws ClassNotFoundException,SQLException{
		
		if(connection == null) {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Pass@3210");
			return connection;
		}
		else {
			return connection;
		}
		
	}
}

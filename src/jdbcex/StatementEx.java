package jdbcex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementEx {

	Connection connection; // i
	Statement statement; // i
	ResultSet resultSet; // i

	public StatementEx() throws ClassNotFoundException, SQLException {
		connection = MyConnection.getMyConnection();
		System.out.println("Connection Get Open");
	}

	public void getCustomer() throws SQLException {
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select * from customer");
//		resultSet2 = statement2.executeQuery("select * from customer where id=101");

		while (resultSet.next()) {
			System.out.print(resultSet.getInt("id") + "\t");
			System.out.print(resultSet.getString("name") + "\t");
			System.out.print(resultSet.getString("address") + "\t");
			System.out.print(resultSet.getString("phone_no"));
			System.out.println();

		}
	}

	public void getCustomerById(int id) throws SQLException {
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select * from customer where id = " + id);
		while (resultSet.next()) {
			if (id == 101) {
				System.out.print(resultSet.getInt("id") + "\t");
				System.out.print(resultSet.getString("name") + "\t");
				System.out.print(resultSet.getString("address") + "\t");
				System.out.print(resultSet.getString("phone_no"));
				System.out.println();
			} else {
				System.out.println("Id not found");
			}
		}
	}

	public void close() throws SQLException {
		connection.close();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		StatementEx obj = new StatementEx();
		obj.getCustomer();
		obj.getCustomerById(101);
		obj.close();

	}

}

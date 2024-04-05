package jdbcex;
import java.sql.*;
public class CollableStatementEx {
	Connection con;
	CallableStatement cs;
	public CollableStatementEx() throws ClassNotFoundException, SQLException {
		con = MyConnection.getMyConnection();
		System.out.println("Connection Get Open");
	}
	public void callingPrepare(int id,String name,String city,String phone_no) throws SQLException {
		cs=con.prepareCall("{call insertCustomer(?,?,?,?)}");
		cs.setInt(1, id);
		cs.setString(2, name);
		cs.setString(3, city);
		cs.setString(4, phone_no);
		boolean b = cs.execute();
			System.out.println("Record is inserted Successfully");
		
	
	}
	public void close() throws SQLException {
		con.close();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CollableStatementEx obj = new CollableStatementEx();
		obj.callingPrepare(109, "Raj", "Goa","9874563210");
		obj.close();
	}

}

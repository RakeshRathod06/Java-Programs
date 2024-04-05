package jdbcex;
import java.sql.*;
public class PreparedStatementEx {
		Connection con;
		PreparedStatement ps;
		ResultSet rs;
		
		public PreparedStatementEx() throws ClassNotFoundException, SQLException {
			con = MyConnection.getMyConnection();
			System.out.println("Connection Get Open");
		}
		
		public void insertCustomer(int id,String name,String address,String phone_no) throws SQLException{
			ps = con.prepareStatement("insert into customer values (?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3,address);
			ps.setString(4, phone_no);
		}
		public void close() throws SQLException {
			con.close();
		}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		PreparedStatementEx obj = new PreparedStatementEx();
		obj.insertCustomer(105,"Raju","Dhule","9871236540");
		obj.close();
	}

}

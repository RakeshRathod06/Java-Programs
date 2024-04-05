package jdbcex;

import java.sql.*;
import java.util.*;

public class JDBC_Mini_Project {
	Connection con;
	Statement st;
	ResultSet rs;
	PreparedStatement ps;
	CallableStatement cs;

	public JDBC_Mini_Project() throws ClassNotFoundException, SQLException {
		con = MyConnection.getMyConnection();
		System.out.println("Connection Get Opened");
	}

	// 1
	public void insertStudentRecord(int id, String name, String phone_no, String dob, String city, String email,
			int percentage, String address) throws SQLException {
		ps = con.prepareStatement("insert into student1 values(?,?,?,?,?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, phone_no);
		ps.setString(4, dob);
		ps.setString(5, city);
		ps.setString(6, email);
		ps.setInt(7, percentage);
		ps.setString(8, address);
		int n = ps.executeUpdate();// dml command
		System.out.println(n + " record inserted Successfully");
	}

	// 2
	public void viewAllStudentDetails() throws SQLException {
		st = con.createStatement();
		rs = st.executeQuery("select * from student1");
		System.out.println("*****Student Record*****");
		while (rs.next()) {
			System.out.print(rs.getInt("id") + "\t");
			System.out.print(rs.getString("name") + "\t");
			System.out.print(rs.getString("phone_no") + "\t");
			System.out.print(rs.getString("dob") + "\t");
			System.out.print(rs.getString("city") + "\t");
			System.out.print(rs.getString("email") + "\t");
			System.out.print(rs.getInt("percentage") + "\t");
			System.out.print(rs.getString("address") + "\t");
			System.out.println();
		}
	}

	// 3
	public void viewStudentByCityName(String ct) throws SQLException {
		ps = con.prepareStatement("select * from student1 where city = ? ");
		ps.setString(1, ct);
		rs = ps.executeQuery();
		System.out.println("*****Students Whose City is Pune*****");
		while (rs.next()) {
			System.out.print(rs.getInt("id") + "\t");
			System.out.print(rs.getString("name") + "\t");
			System.out.print(rs.getString("phone_no") + "\t");
			System.out.print(rs.getString("dob") + "\t ");
			System.out.print(rs.getString("city") + "\t");
			System.out.print(rs.getString("email") + "\t");
			System.out.print(rs.getInt("percentage") + "\t");
			System.out.print(rs.getString("address") + "\t");
			System.out.println();
		}
	}

	// 4
	public void updateStudentDetailsById(int id) throws SQLException {
		System.out.println("For Id " + id + " city is going to be change......");
		ps = con.prepareStatement("update student1 set city = ? where id = ? ");
		ps.setString(1, "Pune");
		ps.setInt(2, id);
		int n = ps.executeUpdate();
		System.out.println(n + " City Change for Id " + id);
	}

	// 5
	public void deleteStudentById(int id) throws SQLException {
		System.out.println("Deleting student Which has Id " + id);
		ps = con.prepareStatement("delete from student1 where id = ? ");
		ps.setInt(1, id);
		int n = ps.executeUpdate();
		System.out.println(n + " student is deleted whose id is " + id);
	}

	// 6
	public void SearchStudentByPercentage(int a, int b) throws SQLException {
		System.out.println("Searching Student By the percentage in give range i.e from " + a + " to " + b);
		ps = con.prepareStatement("select * from student1 where percentage between ? and ?");
		ps.setInt(1, a);
		ps.setInt(2, b);
		rs = ps.executeQuery();
		int n = 0;
		while (rs.next()) {
			System.out.print("Student Id: " + rs.getInt("id") + "\t");
			System.out.print("Student Name: " + rs.getString("name") + "\t");
			System.out.print("Student Percentage: " + rs.getInt("percentage"));
			System.out.println();
			n++;
		}
		System.out.println(n + " students found who have the percdntage within the given range");
	}

	// 7
	public void displayDetailsOfFirstRanker() throws SQLException {
		System.out.println("First Ranker is: ");
		st = con.createStatement();
		rs = st.executeQuery("select * from student1 where percentage = (select max(percentage) from student1)");
		while (rs.next()) {
			System.out.print("Student Id: " + rs.getInt("id") + "\t");
			System.out.print("Student Name: " + rs.getString("name") + "\t");
			System.out.print("Student Percentage: " + rs.getInt("percentage"));
			System.out.println();
		}

	}

	// 8
	public void searchStudentDetailsById(int id) throws SQLException {
		System.out.println("Student Details whose id is: " + id);
		ps = con.prepareStatement("select * from student1 where id = ?");
		ps.setInt(1, id);
		rs = ps.executeQuery();
		while (rs.next()) {
			System.out.print(rs.getInt("id") + "\t");
			System.out.print(rs.getString("name") + "\t");
			System.out.print(rs.getString("phone_no") + "\t");
			System.out.print(rs.getString("dob") + "\t ");
			System.out.print(rs.getString("city") + "\t");
			System.out.print(rs.getString("email") + "\t");
			System.out.print(rs.getInt("percentage") + "\t");
			System.out.print(rs.getString("address") + "\t");
			System.out.println();
		}
		System.out.println();
	}

	// 9
	public void sortStudentsByPercentage() throws SQLException {
		System.out.println("Student Data By percentage in Ascending order");
		st = con.createStatement();
		rs = st.executeQuery("select * from student1 order by percentage");
		while (rs.next()) {
			System.out.print(rs.getInt("id") + "\t");
			System.out.print(rs.getString("name") + "\t");
			System.out.print(rs.getString("phone_no") + "\t");
			System.out.print(rs.getString("dob") + "\t ");
			System.out.print(rs.getString("city") + "\t");
			System.out.print(rs.getString("email") + "\t");
			System.out.print(rs.getInt("percentage") + "\t");
			System.out.print(rs.getString("address") + "\t");
			System.out.println();
		}
	}

	// 10
	public void sameCityStudent(String city) throws SQLException {
		System.out.println("Students who are living in the same city are: ");
		ps = con.prepareStatement("select * from student1 where city = ?");
		ps.setString(1, city);
		rs = ps.executeQuery();
		int n = 0;
		while (rs.next()) {
			System.out.print(rs.getInt("id") + "\t");
			System.out.print(rs.getString("name") + "\t");
			System.out.print(rs.getString("phone_no") + "\t");
			System.out.print(rs.getString("dob") + "\t ");
			System.out.print(rs.getString("city") + "\t");
			System.out.print(rs.getString("email") + "\t");
			System.out.print(rs.getInt("percentage") + "\t");
			System.out.print(rs.getString("address") + "\t");
			System.out.println();
			n++;
		}
		System.out.println(n + " Students living in the same city");
	}

	public void close() throws SQLException {
		con.close();
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		JDBC_Mini_Project obj = new JDBC_Mini_Project();
		char ch;
		

		do {
			System.out.println("Enter Your Choice");
			System.out.println(
					"1 for Insert\n2 for view\n3 for view student by city name\n4 for update student details\n5 for delete student by roll no\n6 for search student on the basis of percentage enter min range and enter max range\n7 for Display Details of first ranker\n8 for Search Student Details By Id\n9 for sort Student By Percentage\n10 forn Display Students who are living in the same city");
			int c = sc.nextInt();
			switch (c) {
			case 1:

				System.out.print("Enter student id: ");
				int id = sc.nextInt();
				System.out.print("Enter student name: ");
				String name = sc.next();
				System.out.print("Enter student Mobile Number: ");
				String mb = sc.next();
				System.out.print("Enter student Date Of Birth: ");
				String dob = sc.next();
				System.out.print("Enter student City: ");
				String city = sc.next();
				System.out.print("Enter student Email Id: ");
				String email_id = sc.next();
				System.out.print("Enter student Percentage: ");
				int percentage = sc.nextInt();
				System.out.print("Enter student address: ");
				String address = sc.next();

				obj.insertStudentRecord(id, name, mb, dob, city, email_id, percentage, address);
				break;

			case 2:
				obj.viewAllStudentDetails();
				break;

			case 3:
				System.out.print("Enter student City: ");
				String ct = sc.next();
				obj.viewStudentByCityName(ct);
				break;

			case 4:

				System.out.print("Enter student id to update details: ");
				int ids = sc.nextInt();
				obj.updateStudentDetailsById(ids);
				break;

			case 5:
				System.out.print("Enter student id to Delete details: ");
				int delete_Id = sc.nextInt();
				obj.deleteStudentById(delete_Id);
				break;

			case 6:
				System.out.println("Enter the range of percentage to search the student");
				int a = sc.nextInt();
				int b = sc.nextInt();
				obj.SearchStudentByPercentage(a, b);
				break;

			case 7:
				obj.displayDetailsOfFirstRanker();
				break;

			case 8:
				System.out.print("Enter student id to Search details: ");
				int searchById = sc.nextInt();
				obj.searchStudentDetailsById(searchById);
				break;

			case 9:
				obj.sortStudentsByPercentage();
				break;

			case 10:
				System.out.print("Enter student City to see same city students: ");
				String sameCity = sc.next();
				obj.sameCityStudent("sameCity");
				break;

			default:
				System.out.println("Invalid choice Please Enter Again");
				break;
			}

			System.out.println("Enter Y to continue Otherwise press any Key ...");

			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');

		obj.close();

	}
}

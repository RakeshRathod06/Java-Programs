package file_handling;
import java.io.*;
public class DeserializableEx {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Rakesh Rathod\\OneDrive\\Desktop\\pqr.txt"));
		Student student = (Student) ois.readObject();
		System.out.println("Student Roll No: "+student.rollNo);
		System.out.println("Student Name: "+student.name);
		ois.close();
		
	}
	
}

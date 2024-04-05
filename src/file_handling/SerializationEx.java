package file_handling;
import java.io.*;
class Student implements Serializable{

	int rollNo;
	String name;
	public Student(int rollNo,String name) {
		super();
		this.rollNo=rollNo;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	
}
public class SerializationEx{

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Student s1 = new Student(101, "Rina");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Rakesh Rathod\\OneDrive\\Desktop\\pqr.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.flush();
		System.out.println("Converted to byte stream");
		
	}

}

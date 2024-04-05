package file_handling;
import java.io.*;
public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Rakesh Rathod\\OneDrive\\Desktop\\abc.txt",true);
		String str="Welcome to Pune";
		byte bArr[]=str.getBytes();// converting str to byte array
		fos.write(bArr);
		fos.close();
		System.out.println("File Created ");
	}

}

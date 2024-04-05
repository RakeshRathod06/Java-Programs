package file_handling;
import java.io.*;
public class FileReaderEx {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\Users\\Rakesh Rathod\\OneDrive\\Desktop\\xyz.txt");
		int i;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		System.out.println("\nRead Successfully");
	}

}

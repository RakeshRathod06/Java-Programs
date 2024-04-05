package file_handling;
import java.io.*;
public class FileWriterEx {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("C:\\Users\\Rakesh Rathod\\OneDrive\\Desktop\\xyz.txt");
		fw.write("File Writer Example");
		fw.close();
	}

}

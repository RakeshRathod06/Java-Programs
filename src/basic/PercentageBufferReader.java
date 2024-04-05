package basic;
import java.io.*;
public class PercentageBufferReader {

	public static void main(String[] args) throws NumberFormatException,IOException{
		// TODO Auto-generated method stub
		int id;
		String name;
		double phy,chem,maths,total,percentage;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Id: ");
		id=Integer.parseInt(reader.readLine());
		System.out.println("Enter Name: ");
		name=reader.readLine();
		System.out.println("Enter phy , chem and maths marks: ");
		phy=Double.parseDouble(reader.readLine());
		chem=Double.parseDouble(reader.readLine());
		maths=Double.parseDouble(reader.readLine());
		
		total = phy+chem+maths;
		percentage=total/3;
		
		System.out.println("Student id: "+id);
		System.out.println("Student Name: "+name);
		System.out.println("total: "+total);
		System.out.println("percentage: "+percentage);


		
	}

	
}

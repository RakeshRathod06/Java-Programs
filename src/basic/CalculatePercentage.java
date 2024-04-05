package basic;

import java.util.Scanner;

public class CalculatePercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int phy,chem,maths,total,percentage;
		System.out.println("enter three subject Marks: ");
		 phy=sc.nextInt();
		 chem=sc.nextInt();
		 maths=sc.nextInt();
		 total = phy+chem+maths;
		 percentage = total/3;
		 System.out.println("Total: "+total);
		 System.out.println("percentage: "+percentage);
		 if(phy<50 || chem<50 || maths<50) {
			 System.out.println("Fail");
		 }
		 else {
			 if(percentage>=90) {
				 System.out.println("A+");
			 }
			 else if(percentage>=75) {
				 System.out.println("A");
			 }
			 else if(percentage>60) {
				 System.out.println("B+");
			 }
			 else if(percentage>50) {
				 System.out.println("B");
			 }
			 else {
				 System.out.println("Fail");
			 }
		 }
	}

}

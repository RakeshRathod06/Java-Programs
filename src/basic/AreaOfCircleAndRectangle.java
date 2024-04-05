package basic;

import java.util.Scanner;

public class AreaOfCircleAndRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float pi=3.14f;
		float length,weadth,radius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius to calculate the area of circle: ");
		radius=sc.nextFloat();
		float AOC =pi*radius*radius;
		System.out.println("Area of circle is: "+AOC);
		System.out.println("Enter the lenght and weadth: ");
		length = sc.nextFloat();
		weadth = sc.nextFloat();
		float AOR=length*weadth;
		System.out.println("Area of Rectangle:"+AOR);
	
		

	}

}
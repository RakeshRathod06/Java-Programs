package basic;

import java.util.Scanner;

public class AreaUsingSwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Your Choice: \n type 'circle' to calculate area of circle \n type 'rect' to calculate area of rectangle \n type 'tri' to calculate areaf ");
		String shape = sc.next();
		switch(shape) {
		case "circle":
			System.out.println("Enter the Radius to find area of circle:");
			float radius = sc.nextFloat();
			System.out.println("Area of circle is:"+3.14*radius*radius);
			break;
		case "rect":
			System.out.println("Enter the length and weadth to find the area of Rectangle: ");
			float length = sc.nextFloat();
			float weadth = sc.nextFloat();
			System.out.println("Area of Rectangle is: "+length*weadth);
			break;
		case "tri":
			System.out.println("enter the base and height to find the area of Triangle: ");
			float base =sc.nextFloat();
			float height =sc.nextFloat();
			System.out.println("Area of Triangle is:"+(0.5*base*height));
			break;
		default:
			System.out.println("Invalid Choice !");
		}	
       }

}

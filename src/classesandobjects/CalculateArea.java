package classesandobjects;

import java.util.Scanner;

public class CalculateArea {
	Scanner sc = new Scanner(System.in);

	// Method to calculate the area of circle
	public void circle() {
		float radius;
		System.out.println("Enter radius: ");
		radius = sc.nextFloat();
		float areaCircle = 3.14f * radius * radius;
		System.out.println("Area Of Circle: " + areaCircle);
	}

	// Method to calculate area of Triangle
	public void triangle(double base, double height) {
		double areaTriangle = (0.5f * base * height);
		System.out.println("Area of Triangle: " + areaTriangle);
	}

	// Method to calculate the area of Square
	public int square(int side) {

		int areaSquare = side * side;
		return areaSquare;
	}

	// method to calculate area of Rectangle
	public int rectangle(int length, int breadth) {
		int areaRectangle = length * breadth;
		return areaRectangle;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateArea obj1 = new CalculateArea();
//		System.out.println("Enter Your Choice");
		obj1.circle();
		obj1.triangle(15, 52);
		int areaSquare = obj1.square(9);
		System.out.println("Area of Square: "+areaSquare);
		int areaRectangle = obj1.rectangle(12, 15);
		System.out.println("Area of Rectangle: "+areaRectangle);


	}

}

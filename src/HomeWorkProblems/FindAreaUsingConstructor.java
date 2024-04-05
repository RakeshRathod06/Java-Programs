package HomeWorkProblems;

class FindArea {
	int side;
	float radius;
	int l, b;
	float base, height;

	// Constructor to find Area of square
	FindArea(int side) {
		this.side = side;
	}

	// Constructor to find area of circle
	FindArea(float radius) {
		this.radius = radius;
	}

	// constructor to find area of Rectangle
	FindArea(int l, int b) {
		this.l = l;
		this.b = b;
	}

	// constructor to find area of Triangle
	FindArea(float base, float height) {
		this.base = base;
		this.height = height;
	}

	public int squareArea() {
		return side * side;
	}

	public double circleArea() {
		return 3.14f * radius * radius;
	}

	public int rectangleArea() {
		return l * b;
	}

	public float triangleArea() {
		return 0.5f * base * height;
	}
}

public class FindAreaUsingConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindArea sobj = new FindArea(25);
		int squareArea = sobj.squareArea();
		System.out.println("Area of Square: " + squareArea);

		FindArea cobj = new FindArea(8.7f);

		double circleArea = cobj.circleArea();
		System.out.println("Area of circle: " + circleArea);

		FindArea robj = new FindArea(27,39);

		int rectangleArea = robj.rectangleArea();
		System.out.println("Area of Rectangle: " + rectangleArea);

		FindArea tobj = new FindArea(8.3f,6.5f);

		float triangleArea = tobj.triangleArea();
		System.out.println("Area of Triangle: " + triangleArea);

	}

}

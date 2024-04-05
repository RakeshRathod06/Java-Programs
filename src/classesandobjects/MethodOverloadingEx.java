package classesandobjects;

public class MethodOverloadingEx {
	String a;
	public void area(float radius) {
		// TODO Auto-generated constructor stub
		System.out.println("Area of circle: "+3.14f*radius*radius);
		System.out.println(a);
	}
	
	public int area(int l , int b) {
//		System.out.println("Area of Rectangle: "+l*b);
		return l*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b;
		MethodOverloadingEx obj = new MethodOverloadingEx();
		obj.area(26.5f);
//		obj.area(12,14);
		System.out.println("Area of rectangle: "+obj.area(12, 85));
		System.out.println(obj.a);  // Therefore if we not initialize the value of instance variable jvm automatically initializes the values
	}

}

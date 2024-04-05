package abstration_in_java;

public class DrawableImpl implements Drawable, Printable {
	@Override
	public void print() {
		// TODO Auto-generated method stub
		float r = 10;
		System.out.println("Area of Cirlce: " + (PI * r * r));
	}

	public void display() {
		System.out.println("Method from another Pritable interface !");
	}

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawableImpl obj = new DrawableImpl();
		obj.print();
		obj.display();
		obj.cube(5);
		Drawable.square(9);
		
		
		Drawable.show();
		Printable.show();
	}

}

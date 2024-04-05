package abstration_in_java;

abstract class Animal {
	public abstract void cats();

	public abstract void dogs();

}

class Cats extends Animal {
	public void cats() {
		System.out.println("Cats meow");
	}

	@Override
	public void dogs() {
		// TODO Auto-generated method stub
	}
}

class Dogs extends Animal {
	public void dogs() {
		System.out.println("Dogs bark");
	}

	@Override
	public void cats() {
		// TODO Auto-generated method stub

	}
}

public class AnimalTest {
	public static void main(String[] args) {
		Cats c = new Cats();
		c.cats();
		Dogs d = new Dogs();
		d.dogs();
	}
}

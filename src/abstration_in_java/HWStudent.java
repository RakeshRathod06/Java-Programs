package abstration_in_java;

abstract class Marks {
	public abstract float getPercentage();
}

class StudentA extends Marks {
	int physics, chemistry, maths;

	public StudentA(int phy, int chem, int maths) {
		physics = phy;
		chemistry = chem;
		this.maths = maths;
	}

	public float getPercentage() {
		int total = physics + chemistry + maths;
		float per = total / 3;
		return per;
	}

}

class StudentB extends Marks {
	int physics, chemistry, maths, Bio;

	public StudentB(int phy, int chem, int maths, int Bio) {
		physics = phy;
		chemistry = chem;
		this.maths = maths;
		this.Bio = Bio;
	}

	public float getPercentage() {
		int total = physics + chemistry + maths + Bio;
		float per = total / 4;
		return per;

	}

}

public class HWStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentA s1 = new StudentA(80, 80, 90);
		System.out.println("Percentage of Student A: " + s1.getPercentage());

		StudentB s2 = new StudentB(85, 95, 98, 83);
		System.out.println("Percentage of Student B: " + s2.getPercentage());
	}

}

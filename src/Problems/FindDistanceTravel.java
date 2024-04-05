package Problems;

import java.util.Scanner;

public class FindDistanceTravel {
	public void getDistance(int t) {
		int u=10;
		int a=5;
		int d = u*t+((a*t*t)/2);
		System.out.println(d);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Different Time intervals");
		int t1=sc.nextInt();
		int t2=sc.nextInt();

		FindDistanceTravel obj = new FindDistanceTravel();
		obj.getDistance(t1);
		obj.getDistance(t2);

	}

}

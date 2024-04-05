package classesandobjects;

import java.util.Scanner;

public class SimpleInterest {
	double p,r,t;
	public SimpleInterest() {
		p=25000;
		r=6.5;
		t=2;
	}
	public SimpleInterest(double p,double r,double t) {
		this.p=p;
		this.r=r;
		this.t=t;
	}
	public void calculateAndDisplay() {
		double si = p*r*t/100;
		System.out.println("Simple Interest: "+si);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SimpleInterest s1 = new SimpleInterest();
		s1.calculateAndDisplay();
		SimpleInterest s2 = new SimpleInterest(65000,7.2,5);
		s2.calculateAndDisplay();

	}

}

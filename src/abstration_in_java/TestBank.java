package abstration_in_java;

import java.util.Scanner;

abstract class Bank{
	public abstract float getRateOfIntrest();
}


class SBI extends Bank{
	float rate = 6.2f;

		@Override
	public float getRateOfIntrest() {
		// TODO Auto-generated method stub
		
		return rate;
	}
	
}


class Axis extends Bank{
//	Axis axis =  new Axis();
	float rate=8.5f;
	public float getRateOfIntrest() {
		// TODO Auto-generated method stub
		
		return rate;
	}
}

public class TestBank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle Amount: ");
		float p=sc.nextFloat();
		System.out.println("Enter Time: ");
		float time=sc.nextFloat();
		
		Bank bank;// We can't create the object of abstract class but we can create the reference in order to save the memory
		// means we can use this reference to call the methods of both classes rather than creating the seperate 
		// object of the class
		bank =  new Axis();     
		float axisRate=bank.getRateOfIntrest();
		System.out.println("Simple Intrest for Axis Bank: "+(p*axisRate*time)/100);
		
		
		
		bank = new SBI();
		float sbiRate = bank.getRateOfIntrest();
		System.out.println("Simple Intrest for SBI Bank: "+(p*sbiRate*time)/100);
	}

}

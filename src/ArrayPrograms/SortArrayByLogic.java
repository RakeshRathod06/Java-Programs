package ArrayPrograms;

import java.util.Scanner;

public class SortArrayByLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sort Array By Using Function
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the size of array: ");
				int size = sc.nextInt();
				int a[] = new int[size];
				System.out.println("Enter the array Elements: ");
				for (int i = 0; i < a.length; i++) {
					a[i] = sc.nextInt();
				}
				int temp;
				for(int i=0;i<a.length-1;i++) {
					for(int j=i+1;j<a.length;j++) {
						if(a[i]>a[j]) {
							temp=a[i];
							a[i]=a[j];
							a[j]=temp;
						}
					}
				}
				System.out.print("Sorted Array:");
				for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]+" ");
				}
	}

}

package in.co.Array;

import java.util.Scanner;

public class Average {
public static void main(String[] args) {
	int a[] = new int [5];
	int sum = 0;
	int avg;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter element");
	for (int i = 0; i < a.length; i++) {
		a[i] = sc.nextInt();
	}
	System.out.println("Array element");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	for (int i = 0; i < a.length; i++) {
		sum =  a[i] + sum;
	}
	System.out.println("Sum of element"+sum);

	avg = sum/5;
	System.out.println("Average of element "+avg);
}
}

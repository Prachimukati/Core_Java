package in.co.pract;

import java.util.Scanner;

public class Avrage_Array {
public static void main(String[] args) {
	int a[]  = new int[5];
	int avg;
	int sum = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter element in an array");
	for (int i = 0; i < a.length; i++) {
		a[i] = sc.nextInt();
	}
	System.out.println("Array element");

	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
   }	
	for (int i = 0; i < a.length; i++) {
		sum = sum + a[i];
	}
	System.out.println("Sum of an array element"+sum);
	avg = sum/5;
			System.out.println("Average  of an array element"+avg);
}
}

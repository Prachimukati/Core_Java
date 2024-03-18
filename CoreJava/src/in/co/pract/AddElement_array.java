package in.co.pract;

import java.util.Scanner;

public class AddElement_array {
public static void main(String[] args) {
	int a[] = new int [5];
	 int sum = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter element in array");
	for (int i = 0; i < 5; i++) {
		a[i] = sc.nextInt();
	}
	for (int i = 0; i < 5 ; i++) {
		sum = sum + a[i];
		System.out.println(a[i]);
	}
	System.out.println("Sum of an array element = "+sum);
}
}

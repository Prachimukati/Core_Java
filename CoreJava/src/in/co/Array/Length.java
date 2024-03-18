package in.co.Array;

import java.util.Scanner;

public class Length {
public static void main(String[] args) {
	int a[] = new int [5];
	System.out.println("Enter element");
	Scanner sc = new Scanner(System.in);
	for (int i = 0; i < a.length; i++) {
		a[i] = sc.nextInt();
	} 
	System.out.println("Array element");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	System.out.println("Array "+a.length);
}
}

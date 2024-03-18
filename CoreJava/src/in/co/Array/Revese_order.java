package in.co.Array;

import java.util.Scanner;

public class Revese_order {
public static void main(String[] args) {
//	int a[] = new int [5];
//	a[0] = 10;
//	a[1] = 20;
//	a[2] = 30;
//	a[3] = 40;
//	a[4] = 50;
//	
//	for (int i =4; i >=0; i--) {
//		System.out.println(a[i]);
//	}
	             // OR DYNAMIC ARRAY
	int a[] = new int [5];
	System.out.println("Enter element");
	Scanner sc = new Scanner(System.in);
	for (int i = 0; i <a.length; i++) {
		a[i] = sc.nextInt(); 
	}
	System.out.println("Print element");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	System.out.println("Array element");
	for (int i = 4; i >=0; i--) {
		System.out.println(a[i]);
	}
	System.out.println("Reverse array element");
	
}
}

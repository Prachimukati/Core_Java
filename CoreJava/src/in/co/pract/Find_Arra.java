package in.co.pract;

import java.util.Scanner;

public class Find_Arra {
public static void main(String[] args) {
//	int a[] = new int [5];
//	int n;
//	int count = 0;
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter element");
//	for (int i = 0; i < a.length; i++) {
//		a[i] = sc.nextInt();
//	}
//	System.out.println("Array element");
//	for (int i = 0; i < a.length; i++) {
//		System.out.println(a[i]);
//		}
//	n = sc.nextInt();
//	for (int i = 0; i < a.length; i++) {
//		if (a[i]==n) {
//			count++;
//		}
//	}
//	if (count>0) {
//		System.out.println("Element found");
//	} else {
//		System.out.println("Element does not  found");
//
//	}
//	
	
	      // Or
	
	int a[] = new int[5];
	
	a[0] = 10;
	a[1] = 20;
	a[2] = 30;
	a[3] = 40;
	a[4] = 50;
	int count = 0;
	int n = 1 ; 
	for (int i = 0; i < a.length; i++) {
	if (a[i] == n) {
		count++;
	}
	}
	if (count>0) {
		System.out.println("Element found");
	} else {
		System.out.println("Element does not found");

	}
	
}
}

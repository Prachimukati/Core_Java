package in.co.DicisionMaking_Statement;

import java.util.Scanner;

public class If_else_stmt {
public static void main(String[] args) {
//	int a = 10 ;
//	int b =20 ;
//	if (a>b) {
//		System.out.println("A is greater than B");
//	} else {
//        System.out.println("B is greater than A");
//	}
	          // OR 
	int n ;
	System.out.println("Enter any number...");
	Scanner obj = new Scanner(System.in);
	n=obj.nextInt();
	if (n>10) {
		System.out.println("Given number is positive");

	} else {
		System.out.println("Given number is negative");
	}
	}
}

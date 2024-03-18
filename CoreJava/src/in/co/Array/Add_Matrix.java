package in.co.Array;

import java.util.Scanner;

public class Add_Matrix {
public static void main(String[] args) {
	 int a[][] = new int[2][2];
	 int b[][] = new int[2][2];
	 int c[][] = new int[2][2];
	 int i , j = 0 ;
	 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first element");
	for ( i = 0; i < 2; i++) {
		for ( j = 0; j < 2; j++) {
			a[i][j] = sc.nextInt();
		}
	}
	System.out.println("Enter second element");
	for ( i = 0; i < 2; i++) {
		for ( j = 0; j < 2; j++) {
			b[i][j] = sc.nextInt();

		}
	}
	
	System.out.println(" First Matrix : ");
	for ( i = 0; i < 2; i++) {
		for ( j = 0; j < 2; j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.print("\n");
	}
	
	System.out.println(" Second Matrix : ");
	for ( i = 0; i < 2; i++) {
		for ( j = 0; j < 2; j++) {
			System.out.print(b[i][j]+" ");

		}
		System.out.print("\n");
	}
	System.out.println(" Sum of two Matrix : ");
	for ( i = 0; i < 2; i++) {
		for ( j = 0; j < 2; j++) {
			c[i][j] = a[i][j] + b[i][j];
			System.out.print(c[i][j]+" ");
		}
		System.out.println("\n");
	}
}
}

package in.co.Array;

import java.util.Scanner;

public class Matrix_2Darray {
public static void main(String[] args) {
	int a[][] = new int[2][2];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter element");
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 2; j++) {
			a[i][j] = sc.nextInt();
		}
	}
	
	System.out.println("Matrix : ");
	for (int i = 0; i < 2; i++) {
		for (int j = 0; j < 2; j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.print("\n");
	}
}
}
